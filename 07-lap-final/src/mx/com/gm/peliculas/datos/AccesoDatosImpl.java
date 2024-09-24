package mx.com.gm.peliculas.datos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import mx.com.gm.peliculas.domain.Pelicula;
import mx.com.gm.peliculas.excepciones.AccesoDatosEx;
import mx.com.gm.peliculas.excepciones.EscrituraDatosEx;
import mx.com.gm.peliculas.excepciones.LecturaDatosEx;

public class AccesoDatosImpl implements IAccesoDatos {

    @Override
    public boolean existe(String nombreArchivo) throws AccesoDatosEx {
        File archivo = new File(nombreArchivo);
        return archivo.exists();
    }

    @Override
    public List<Pelicula> listar(String nombreArchivo) throws LecturaDatosEx {
        File archivo = new File(nombreArchivo);
        List<Pelicula> peliculas = new ArrayList<>();

        try (BufferedReader entrada = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = entrada.readLine()) != null) {
                Pelicula pelicula = new Pelicula(linea);
                peliculas.add(pelicula);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new LecturaDatosEx("Excepción al listar películas: " + e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
            throw new LecturaDatosEx("Excepción al listar películas: " + e.getMessage());
        }
        return peliculas;
    }

    @Override
    public void escribir(Pelicula pelicula, String nombreArchivo, boolean anexar) throws EscrituraDatosEx {
        File archivo = new File(nombreArchivo);

        try (PrintWriter salida = new PrintWriter(new FileWriter(archivo, anexar))) {
            salida.println(pelicula.toString()); // Corregido el uso de toString()
            System.out.println("Se ha escrito información al archivo: " + pelicula);
        } catch (IOException e) {
            e.printStackTrace();
            throw new EscrituraDatosEx("Excepción al escribir películas: " + e.getMessage());
        }
    }

    @Override
    public void crear(String nombreArchivo) throws AccesoDatosEx {
        File archivo = new File(nombreArchivo);
        try (PrintWriter salida = new PrintWriter(new FileWriter(archivo))) {
            // El archivo se crea con el constructor de FileWriter y PrintWriter
            System.out.println("Se ha creado el archivo.");
        } catch (IOException e) {
            e.printStackTrace();
            throw new AccesoDatosEx("Excepción al crear archivo: " + e.getMessage());
        }
    }

    @Override
    public String buscar(String nombreArchivo, String buscar) throws LecturaDatosEx {
        File archivo = new File(nombreArchivo);
        String result = null;
        try (BufferedReader entrada = new BufferedReader(new FileReader(archivo))) {
            String linea;
            int indice = 1;
            while ((linea = entrada.readLine()) != null) {
                if (buscar != null && buscar.equalsIgnoreCase(linea)) {
                    result = "Pelicula " + linea + " encontrada en el indice: " + indice;
                    break;
                } else {
                    linea = entrada.readLine();
                    indice++;
                }
            }
            entrada.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new LecturaDatosEx("Excepción al listar películas: " + e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
            throw new LecturaDatosEx("Excepción al listar películas: " + e.getMessage());
        }

        return result;
    }

    @Override
    public void borrar(String nombreArchivo) {
        File archivo = new File(nombreArchivo);
        if (archivo.exists()) {
            archivo.delete();
            System.out.println("Se ha borrado el archivo");
        }
    }

}

package mx.com.gm.peliculas.datos;

import java.util.List;

import mx.com.gm.peliculas.domain.Pelicula;
import mx.com.gm.peliculas.excepciones.AccesoDatosEx;
import mx.com.gm.peliculas.excepciones.EscrituraDatosEx;
import mx.com.gm.peliculas.excepciones.LecturaDatosEx;

public interface IAccesoDatos {
    boolean existe(String nombreArchivo) throws AccesoDatosEx;

    List<Pelicula> listar(String nombreArchivo) throws LecturaDatosEx;

    void escribir(Pelicula pelicula, String nombreArchivo, boolean anexar) throws EscrituraDatosEx;

    void crear(String nombreArchivo) throws AccesoDatosEx;

    void borrar(String nombreArchivo) throws AccesoDatosEx;

    String buscar(String nombreArchivo, String buscar) throws LecturaDatosEx;

}

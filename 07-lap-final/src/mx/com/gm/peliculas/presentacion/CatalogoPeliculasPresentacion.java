package mx.com.gm.peliculas.presentacion;

import java.util.Scanner;

import mx.com.gm.peliculas.servicio.CatalogoPeliculaImpl;
import mx.com.gm.peliculas.servicio.ICatalogoPeliculas;

public class CatalogoPeliculasPresentacion {
    public static void main(String[] args) {
        int opcion = -1;
        Scanner scanner = new Scanner(System.in);
        ICatalogoPeliculas catalogo = new CatalogoPeliculaImpl();

        while (opcion != 0) {
            System.out.println(
                    "Elige una opcion: \n"
                            + "1. Iniciar catalogo peliculas: \n"
                            + "2. Agregar peliculas: \n"
                            + "3. Listar peliculas: \n"
                            + "4. Buscar peliculas: \n"
                            + "0. Salir");

            opcion = Integer.parseInt(scanner.nextLine());

            switch (opcion) {
                case 1:
                    catalogo.iniciarCatalogoPeliculas();
                    break;
                case 2:
                    System.out.println("Introducir el nombre de la pelicula");
                    String nombrePelicula = scanner.nextLine();
                    catalogo.agregarPelicula(nombrePelicula);
                case 3:
                    catalogo.listarPeliculas();
                case 4:
                    System.out.println("Introduce una pelicula a buscar");
                    String buscar = scanner.nextLine();
                    catalogo.buscarPelicula(buscar);
                    break;
                case 0:
                    System.out.println("Hasta pronto!!");
                default:
                    break;
            }
        }
    }
}

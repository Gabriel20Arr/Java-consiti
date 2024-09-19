import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Sistema de Calificaciones!!");
        
        int calificacion = 0;

        System.out.println("Ingrese una calificacion!!");
        Scanner consola = new Scanner(System.in);
        calificacion += consola.nextInt(); 

        if(calificacion >= 0 && calificacion < 6) {
            System.out.println("La calificanion es: F");
        } else if (calificacion == 6) {
            System.out.println("La calificanion es: D");
        } else if (calificacion == 7) {
            System.out.println("La calificanion es: C");
        } else if (calificacion == 8) {
            System.out.println("La calificanion es: D");
        } else if (calificacion == 9 || calificacion == 10) {
            System.out.println("La calificanion es: A");
        } else {
            System.out.println("Valor desconocido.");
        }

    }
}

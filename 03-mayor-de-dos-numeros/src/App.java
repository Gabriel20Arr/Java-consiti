import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Rectangulo!!" + "\n");
        //Variables
        int numero1 = 0;
        int numero2 = 0;
        
        System.out.println("Ingresa el primer numero!");
        Scanner consola = new Scanner(System.in);
        numero1 += consola.nextInt();
        
        System.out.println("Ingresa el segundo numero!");
        numero2 += consola.nextInt();

        if(numero1 > numero2) {
            System.out.println("EL primer numero es mayor al segundo");
        } else{
            System.out.println("EL segundo numero es mayor al primero");
        }
    }
}

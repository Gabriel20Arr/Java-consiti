import java.util.Scanner;

public class App {
    public static void main(final String[] args) throws Exception {
        // !! Variables
        String _nombre;
        int _id;
        double _precio;
        boolean _envioGratuito;

        System.out.println("TIENDA LIBRO");

        System.out.println("Proporciona el nombre: ");
        Scanner consola = new Scanner(System.in);
        _nombre = consola.nextLine();

        System.out.println("Proporciona el ID: ");
        _id = consola.nextInt();

        System.out.println("Proporciona el precio: ");
        _precio = consola.nextDouble();

        System.out.println("Proporciona el envio gratuito: ");
        _envioGratuito = consola.nextBoolean();

        System.out.println("Proporciona el nombre: " + _nombre + "\n" + "Proporciona el ID: " + _id + "\n"
                + "Proporciona el precio: " + _precio + "\n" + "Proporciona el envio gratuito: " + _envioGratuito
                + "\n");

        System.out.println(_nombre + " #" + _id + "\n" + "Precio: $" + _precio);
        if (!_envioGratuito) {
            System.out.println("El envio no es gratuito!!");
        } else {
            System.out.println("El envio es gratuito!!");
        }
    }
}

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Ejecicio Rectangulo!!");

        int _alto;
        int _ancho;
        Scanner consola = new Scanner(System.in);

        System.out.println("Ingresar el valor Alto:");
        _alto = consola.nextInt();

        System.out.println("Ingresar el valor Ancho:");
        _ancho = consola.nextInt();

        int _area = _alto * _ancho;
        int _perimetro = (_alto + _ancho) * 2;

        System.out.println(" Resultado Rectangulo");
        System.out.println(
                "Proporciona el alto: " + _alto + "\n" + "Proporciona el ancho: " + _ancho + "\n" + "Area: " + _area
                        + "\n" + "Perimetro: " + _perimetro);
    }
}

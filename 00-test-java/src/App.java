public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("ARGUMENTOS VARIABLES");

        imprimirNumeros(9, 0, 90, 12);
    }

    private static void imprimirNumeros(int... numeros) {
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Elementos: " + numeros[i]);
        }
    }

}

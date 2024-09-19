public class Caja {
    int ancho;
    int alto;
    int profundo;
    String message = "El volumen de la caja es: ";

    // Constructores
    public Caja(int ancho, int alto, int profundo){
        this.ancho = ancho;
        this.alto = alto;
        this.profundo = profundo;
    }

    public Caja(String message){
        this.message = message;
    }

    // Metodos
    public int calcularVolumen() {
        return ancho*alto*profundo;
    }

    public void seandMessage(){
        System.out.println(message + calcularVolumen());
    } 

}
/*
Se solicita crear una clase llamada Caja con las siguientes características:

Debe tener 3 atributos de tipo entero (ancho, alto y profundo)
Debe tener 2 constructores, uno vacío y uno con 3 argumentos, uno por cada atributo de la clase.
Debe tener el método que calcule el volumen de la caja según la formula: vol = ancho x alto x profundo
Crear una clase de prueba para crear un objeto de tipo caja que tenga como valores: ancho=3, alto=2, profundo=6 y que mande a imprimir el volumen de la caja según los valores proporcionados anteriormente
*/ 
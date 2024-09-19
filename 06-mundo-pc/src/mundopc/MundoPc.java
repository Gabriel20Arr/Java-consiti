package mundopc;

import com.gm.mundopc.Computadora;
import com.gm.mundopc.Monitor;
import com.gm.mundopc.Orden;
import com.gm.mundopc.Raton;
import com.gm.mundopc.Teclado;

public class MundoPc {
    public static void main(String[] args) {
        //Primer Computadora
        Monitor monitorHP = new Monitor("HP", 27);
        Teclado tecladoHP = new Teclado("usb", "HP");
        Raton ratonHP = new Raton("usb", "HP");
        Computadora computadoraHP = new Computadora("HP500", monitorHP, tecladoHP, ratonHP);
        
        //Segunda Computadora
        Monitor monitorDell = new Monitor("Dell", 24);
        Teclado tecladoDell = new Teclado("Bluetooth", "Dell");
        Raton ratonDell = new Raton("Bluetooth", "Dell");
        Computadora computadoraDell = new Computadora("Dell XPS", monitorDell, tecladoDell, ratonDell);
        
        //Tercer Computadora
        Monitor monitorAsus = new Monitor("Asus", 28);
        Teclado tecladoAsus = new Teclado("USB", "Asus");
        Raton ratonAsus = new Raton("Inalámbrico", "Asus");
        Computadora computadoraAsus = new Computadora("Asus ROG", monitorAsus, tecladoAsus, ratonAsus);
        
        //Cuarta Computadora
        Monitor monitorLenovo = new Monitor("Lenovo", 21.5);
        Teclado tecladoLenovo = new Teclado("USB", "Lenovo");
        Raton ratonLenovo = new Raton("USB", "Lenovo");
        Computadora computadoraLenovo = new Computadora("Lenovo ThinkPad", monitorLenovo, tecladoLenovo, ratonLenovo);

        // Orden
        Orden orden1 = new Orden();
        orden1.agregarComputadora(computadoraHP);
        orden1.agregarComputadora(computadoraDell);
        orden1.agregarComputadora(computadoraAsus);
        orden1.agregarComputadora(computadoraLenovo);

        orden1.mostrarOrden();
    }
}

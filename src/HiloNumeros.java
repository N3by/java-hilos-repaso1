public class HiloNumeros implements Runnable {
    public void run() {
        System.out.println("Soy el Hilo 4 y voy a imprimir los números del 1 al 20 en un intervalo de medio segundo :):");
        for (int i = 1; i <= 20; i++) {
            System.out.println(i);
            try {
                Thread.sleep(500); // Pausa de medio segundo
            } catch (InterruptedException e) {
                System.out.println("Error en el hilo de números: " + e.getMessage());
            }
        }
    }
}

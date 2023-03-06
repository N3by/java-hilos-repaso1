public class Main {

    public static void main(String[] args) {

        // Creación de las instancias de cada clase de actividad
        HiloPerros hiloPerros = new HiloPerros();
        HiloGatos hiloGatos = new HiloGatos();
        HiloCamellos hiloCamellos = new HiloCamellos();
        HiloNumeros hiloNumeros = new HiloNumeros();

        // Creación de los cuatro hilos
        Thread hilo1 = new Thread(hiloPerros);
        Thread hilo2 = new Thread(hiloGatos);
        Thread hilo3 = new Thread(hiloCamellos);
        Thread hilo4 = new Thread(hiloNumeros);

        // Inicio de los hilos
        hilo1.start();
        hilo2.start();
        hilo3.start();
        hilo4.start();

        // Espera a que los hilos finalicen
        // el .join me garantiza que mis hilos se ejecutaran de manera ordenada, evitando así errores y/o conflictos
        try {
            hilo1.join();
            hilo2.join();
            hilo3.join();
            hilo4.join();
        } catch (InterruptedException e) {
            System.out.println("Error al esperar a los hilos: " + e.getMessage());
        }

        // Fin del programa
        System.out.println("Programa finalizado.");
    }
}

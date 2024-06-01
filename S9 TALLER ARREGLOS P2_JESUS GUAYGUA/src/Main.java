//ANTHONY JESUS GUAYGUA ASIMBAYA, S9 TALLER DE ARREGLOS



import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Parqueadero parqueadero = new Parqueadero();

        // Ingreso de carros de prueba
        parqueadero.entrarCarro("PBX-1234");
        parqueadero.entrarCarro("OBS-5680");
        parqueadero.entrarCarro("PBY-4560");
        parqueadero.entrarCarro("PAA-8710");
        parqueadero.entrarCarro("PBZ-5458");

        // Avanzar algunas horas para simular tiempo en parqueadero
        for (int i = 0; i < 10; i++) {
            parqueadero.avanzarHora();
        }

        // 2.1 Complete el siguiente método que retorna cuánto tiempo llevan en promedio los carros en el parqueadero.
        double tiempoPromedio = parqueadero.darTiempoPromedio();
        System.out.println("Tiempo promedio en parqueadero: " + tiempoPromedio);

        // 2.2 Complete el siguiente método el cual retorna el carro que ha estado durante más horas en el parqueadero.
        Carro carroMasHoras = parqueadero.DevuelveCarroMayorTiempo();
        if (carroMasHoras != null) {
            System.out.println("Carro con más horas: " + carroMasHoras.darPlaca());
        } else {
            System.out.println("No hay carros en el parqueadero.");
        }

        // 2.3 Complete el siguiente método que retorna un valor boolean indicando si hay un carro que lleve más de 8 horas parqueado.
        boolean hayCarroMasDeOchoHoras = parqueadero.hayCarroMasDeOchoHoras();
        System.out.println("¿Hay carro más de ocho horas?: " + (hayCarroMasDeOchoHoras ? "Sí" : "No"));

        // 2.4 Complete el siguiente método que retorna en un ArrayList todos los carros que llevan más de tres horas parqueados.
        ArrayList<Carro> carrosMasDeTresHoras = parqueadero.darCarrosMasDeTresHorasParqueados();
        System.out.println("Carros más de tres horas: ");
        for (Carro carro : carrosMasDeTresHoras) {
            System.out.println(carro.darPlaca());
        }

        // 2.5 Complete el siguiente método que retorna un valor boolean indicando si hay dos carros parqueados con la misma placa.
        boolean hayCarrosPlacaIgual = parqueadero.hayCarrosPlacaIgual();
        System.out.println("¿Hay carros con la misma placa?: " + (hayCarrosPlacaIgual ? "Sí" : "No"));

        // 3.1 y 3.2
        System.out.println(parqueadero.metodo1());

        // 3.4 y 3.5
        System.out.println(parqueadero.metodo2());
    }
}
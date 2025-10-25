package org.granja.creacionales;

public class AlimentadorGlobal {

    private static AlimentadorGlobal instancia;
    private double cantidadAlimento;
    private boolean sistemaActivo;

    private AlimentadorGlobal() {
        this.cantidadAlimento = 1000.0; // kg iniciales de alimento
        this.sistemaActivo = true;
        System.out.println("Sistema de Alimentación Global iniciado.");
    }

    public static synchronized AlimentadorGlobal getInstancia() {
        if (instancia == null) {
            instancia = new AlimentadorGlobal();
        }
        return instancia;
    }

    // Distribuye alimento a una zona específica
    public void distribuirAlimento(String zona, double cantidad) {
        if (!sistemaActivo) {
            System.out.println("Sistema inactivo. No se puede distribuir alimento.");
            return;
        }

        if (cantidad <= 0) {
            System.out.println("Cantidad inválida.");
            return;
        }

        if (cantidadAlimento >= cantidad) {
            cantidadAlimento -= cantidad;
            System.out.println("Distribuyendo " + cantidad + " kg de alimento en " + zona);
        } else {
            System.out.println("No hay suficiente alimento. Quedan " + cantidadAlimento + " kg.");
        }
    }

    // Recarga el sistema con más alimento
    public void recargarAlimento(double cantidad) {
        if (cantidad > 0) {
            cantidadAlimento += cantidad;
            System.out.println("Se recargaron " + cantidad + " kg. Total disponible: " + cantidadAlimento);
        } else {
            System.out.println("Cantidad inválida para recargar.");
        }
    }

    // Muestra el estado actual del sistema
    public void mostrarEstado() {
        System.out.println("Estado del Alimentador Global:");
        System.out.println("   Alimento disponible: " + cantidadAlimento + " kg");
        System.out.println("   Sistema activo: " + sistemaActivo);
        System.out.println("----------------------------------------");
    }
}

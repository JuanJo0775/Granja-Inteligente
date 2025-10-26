package org.granja.estructurales;
//Facade
import org.granja.creacionales.Animal;

class SistemaSensoresFacade {

    private Sensor sensorAdaptado;

    // Constructor: recibe el adaptador de sensor ya configurado
    public SistemaSensoresFacade(Sensor sensor) {
        this.sensorAdaptado = sensor;
    }

    public double obtenerNivelAlimento() {
        double nivel = sensorAdaptado.getLectura();
        System.out.println("📡 Sensor reporta nivel de alimento: " + nivel);
        return nivel;
    }

    public void verificarYAlimentar(Animal animal) {
        double nivel = obtenerNivelAlimento();

        if (nivel < 20) {
            System.out.println(" Nivel bajo detectado, activando alimentador...");
            animal.comer();
        } else {
            System.out.println("Nivel suficiente, no es necesario alimentar.");
        }
    }
}

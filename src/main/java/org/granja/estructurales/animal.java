package org.granja.estructurales;
//decorator
import org.granja.creacionales.Animal;

// Clase abstracta base del patrón Decorator
abstract class AnimalDecorator implements Animal {
    protected Animal animalDecorado;

    public AnimalDecorator(Animal animal) {
        this.animalDecorado = animal;
    }

    @Override
    public void comer() {
        animalDecorado.comer();
    }
}

// Decorador concreto: GPS
class AnimalConGPS extends AnimalDecorator {

    public AnimalConGPS(Animal animal) {
        super(animal);
    }

    @Override
    public void comer() {
        super.comer();
        agregarGPS();
    }

    private void agregarGPS() {
        System.out.println("📍 GPS activado: posición del animal registrada.");
    }
}

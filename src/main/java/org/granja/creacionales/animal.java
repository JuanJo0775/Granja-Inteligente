package org.granja.creacionales;

//Patron factory method
interface Animal {
    void comer();
}

class Vaca implements Animal {
    @Override
    public void comer() {
        System.out.println("La vaca está comiendo.");
    }
}

class Cerdo implements Animal {
    @Override
    public void comer() {
        System.out.println("El Cerdo está comiendo.");
    }
}

class Gallina implements Animal {
    @Override
    public void comer() {
        System.out.println("La gallina está comiendo.");
    }
}

abstract class AnimalFactory {
    public abstract Animal crearAnimal();
}

class VacaFactory extends AnimalFactory {
@Override
    public Animal crearAnimal() {
    return new Vaca();
}
}

class CerdoFactory extends AnimalFactory {
    @Override
    public Animal crearAnimal() {
        return new Cerdo();
    }
}

class GallinaFactory extends AnimalFactory {
    @Override
    public Animal crearAnimal() {
        return new Gallina();
    }
}
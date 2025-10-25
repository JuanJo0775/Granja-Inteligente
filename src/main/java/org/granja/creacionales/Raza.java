package org.granja.creacionales;
//patron abstract factory
interface Raza {
    void mostrarRaza();
}

interface Alimento {
    void mostrarAlimento();
}

interface Entorno {
    void mostrarEntorno();
}

interface GranjaFactory {
    Raza crearRaza();
    Alimento crearAlimento();
    Entorno crearEntorno();
}

class RazaHolstein implements Raza {
    @Override
    public void mostrarRaza() {
        System.out.println("Raza: Holstein.");
    }
}

class AlimentoLechero implements Alimento {
    @Override
    public void mostrarAlimento() {
        System.out.println("Alimento balanceado para producción de leche.");
    }
}

class EntornoPastoreo implements Entorno {
    @Override
    public void mostrarEntorno() {
        System.out.println("Entorno: campo abierto para pastoreo.");
    }
}

class FabricaDeVacas implements GranjaFactory {

    @Override
    public Raza crearRaza() {
        return new RazaHolstein();
    }

    @Override
    public Alimento crearAlimento() {
        return new AlimentoLechero();
    }

    @Override
    public Entorno crearEntorno() {
        return new EntornoPastoreo();
    }
}

class RazaDuroc implements Raza {
    @Override
    public void mostrarRaza() {
        System.out.println("Raza: Duroc.");
    }
}

class AlimentoProteico implements Alimento {
    @Override
    public void mostrarAlimento() {
        System.out.println("Alimento rico en proteínas para engorde.");
    }
}

class EntornoCorral implements Entorno {
    @Override
    public void mostrarEntorno() {
        System.out.println("Entorno: corral cerrado.");
    }
}

class FabricaDeCerdos implements GranjaFactory {
    @Override
    public Raza crearRaza() {
        return new RazaDuroc();
    }

    @Override
    public Alimento crearAlimento() {
        return new AlimentoProteico();
    }

    @Override
    public Entorno crearEntorno() {
        return new EntornoCorral();
    }
}

class RazaIsaBrown implements Raza {
    @Override
    public void mostrarRaza() {
        System.out.println("Raza: Isa Brown.");
    }
}

class AlimentoPonedora implements Alimento {
    @Override
    public void mostrarAlimento() {
        System.out.println("Alimento balanceado para producción de huevos.");
    }
}

class EntornoGallinero implements Entorno {
    @Override
    public void mostrarEntorno() {
        System.out.println("🏚Entorno: gallinero cerradO.");
    }
}

class FabricaDeGallinas implements GranjaFactory {
    @Override
    public Raza crearRaza() {
        return new RazaIsaBrown();
    }

    @Override
    public Alimento crearAlimento() {
        return new AlimentoPonedora();
    }

    @Override
    public Entorno crearEntorno() {
        return new EntornoGallinero();
    }
}

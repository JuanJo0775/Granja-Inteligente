package org.granja.estructurales;
//Adapter
interface Sensor {
    double getLectura(); // Devuelve nivel de alimento, temperatura, etc.
}

class LegacySensor {
    // Ejemplo de respuesta: "Nivel:30"
    public String leerDato() {
        return "Nivel:30";
    }
}

class SensorAdapter implements Sensor {

    private LegacySensor legacySensor;

    public SensorAdapter() {
        this.legacySensor = new LegacySensor();
    }

    @Override
    public double getLectura() {
        String dato = legacySensor.leerDato();   // "Nivel:30"
        dato = dato.replace("Nivel:", "");       // "30"
        return Double.parseDouble(dato);
    }
}

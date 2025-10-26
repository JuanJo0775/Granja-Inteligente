package org.granja.Observer;

/**
 * Interfaz Observer del patrón Observer
 * Define el método que se ejecuta cuando hay cambios en el Subject
 */
public interface Observer {
    void actualizar(Subject subject);
}
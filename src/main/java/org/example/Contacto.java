package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa un contacto dentro de la agenda. Tiene nombre y número/números asociados a él.
 *
 * @author Ginés Conesa Liza
 * @version 1.0 11/03/25
 */

class Contacto {
    /**
     * Nombre del contacto.
     */

    private String name;

    /**
     * Lista de los números de teléfono asociados a un contacto.
     */
    private List<String> phones;

    /**
     * Constructor que inicializa un contacto con un determinado nombre y número.
     * @param name Nombre del contacto.
     * @param phone  Número de teléfono inicial del contacto.
     */
    public Contacto(String name, String phone) {
        this.name = name;
        this.phones = new ArrayList<>(); // guarda los teléfonos en una lista de arrays
        this.phones.add(phone); //añade un teléfono
    }

    /**
     * Obtiene el nombre del contacto.
     * @return Nombre del contacto.
     */

    public String getName() {
        return this.name;
    }

    /**
     * Obtiene la lista de números asociados al contacto.
     * @return Números de teléfono asociados al contacto.
     */
    public List<String> getPhones() {
        return this.phones;
    }
}
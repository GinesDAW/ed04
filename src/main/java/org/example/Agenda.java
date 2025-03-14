package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * Class que representa una agenda de contactos.
 *
 * <p>Permite añadir, eliminar y modificar contactos dentro de una lista.
 * Cada contacto puede tener múltiples números de teléfono asociados.</p>
 *
 * @author Ginés Conesa Liza
 * @version 1.0 11/03/25
 */

public class Agenda implements IAgenda {
    /**
     * Lista de contactos que están almacenados en la acenda.
      */
    private List<Persona> contacts; // Lista de Persona

    /**
     * Constructor que inicializa la lista de contactos.
     */

    public Agenda() {
        this.contacts = new ArrayList<>();
    }

    /**
     * Agrega un contacto a la agenda. Si ya existe, añade el teléfono a su lista.
     * @param name Nombre del contacto.
     * @param phone Número del teléfono del contacto.
     */

    public void addContact(String name, String phone) {
        boolean exists = false;
        for (Persona c : contacts) {
            if (c.getName().equalsIgnoreCase(name)) {
                exists = true;
                c.getPhones().add(phone);
                break;
            }
        }

        if (!exists) {
            Persona newContact = new Persona(name, phone);
            contacts.add(newContact);
        }
    }

    /**
     * Elimina un número de teléfono de un contacto existente.
     *
     * @param name Nombre del contacto
     */

    public void removeContact(String name) {
        Iterator<Persona> it = contacts.iterator();

        while (it.hasNext()) {
            Persona c = it.next();

            if (c.getName().equalsIgnoreCase(name)) {
                it.remove();
            }
        }
    }

    /**
     * Modifica el teléfono de un contacto que ya exista anteriormente.
     *
     * @param name Se refiere al nombre del contacto.
     * @param oldPhone Número de teléfono antiguo.
     * @param newPhone  Número de teléfono nuevo.
     */
    public void modifyPhoneNumber(String name, String oldPhone, String newPhone) {
        for (Persona c : contacts) { //bucle for que usamos para checkear los contactos
            if (c.getName().equalsIgnoreCase(name)) { // compara si el teléfono pertenece a la misma persona
                List<String> phones = c.getPhones(); //llama a la lista de teléfonos de una persona

                int index = phones.indexOf(oldPhone);

                if (index != -1) {
                    phones.set(index, newPhone);
                }
            }
        }
    }

    /**
     * Obtiene la lista de contactos de la agenda.
     *
     * @return Lista de contactos almacenados dentro de la agenda.
     */

    public List<Persona> getContacts() {
        return this.contacts;
    }
}
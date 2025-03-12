package org.example;

/**
 *Clase main para para inicializar la agenda de contactos.
 * <p>la clase crea una nueva agenda a partir de unos contactos dados, y luego la modifica
 * de diferentes maneras, ya sea imprimiendo los contactos, creando nuevos o eliminando
 * ya existentes, o permitiendo modificar los números de los diferentes contactos
 * una vez creados, y viceversa</p>
 * @author Ginés Conesa Liza
 * @version 1.0 11/03/25
 *
 */
public class Main {
    /**
     *
     * Metodo principal para ejecutar la agenda de contactos
     * @param args no tiene ningún uso en este metodo.
     */
    public static void main(String[] args) {

        // Crear una nueva agenda.
        Agenda agenda = new Agenda();

        // Añadir contactos a la agenda.
        agenda.addContact("John Doe", "1234567890");
        agenda.addContact("Jane Doe", "9876543210");
        agenda.addContact("Mary Jane", "1122334455");

        // Imprimir todos los contactos de la agenda.
        System.out.println("Todos los contactos: ");
        for (Contacto c : agenda.getContacts()) { //recorrido del bucle que llama los contactos
            System.out.println(c.getName() + " -> " + c.getPhones()); //imprime el nombre y el contacto de cada persona en la agenda
        }

        // Añadir un nuevo teléfono a un contacto existente.
        agenda.addContact("John Doe", "6543219876");

        // Eliminar un contacto de la agenda.
        agenda.removeContact("Jane Doe");

        // Modificar el teléfono de un contacto existente en la agenda.
        agenda.modifyPhoneNumber("John Doe", "1234567890", "6666666666");

        System.out.println("\nDespués de añadir, eliminar y modificar contactos: ");
        for (Contacto c : agenda.getContacts()) {
            System.out.println(c.getName() + " -> " + c.getPhones());
        }
    }
}
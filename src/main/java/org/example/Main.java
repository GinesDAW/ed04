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
        Agenda agendaContactos = new Agenda();

        // Añadir contactos a la agenda.
        agendaContactos.addContact("John Doe", "1234567890");
        agendaContactos.addContact("Jane Doe", "9876543210");
        agendaContactos.addContact("Mary Jane", "1122334455");

        // Imprimir todos los contactos de la agenda.
        System.out.println("Todos los contactos: ");
        for (Contacto c : agendaContactos.getContacts()) { //recorrido del bucle que llama los contactos
            System.out.println(c.getName() + " -> " + c.getPhones()); //imprime el nombre y el contacto de cada persona en la agenda
        }

        // Añadir un nuevo teléfono a un contacto existente.
        agendaContactos.addContact("John Doe", "6543219876");

        // Eliminar un contacto de la agenda.
        agendaContactos.removeContact("Jane Doe");

        // Modificar el teléfono de un contacto existente en la agenda.
        agendaContactos.modifyPhoneNumber("John Doe", "1234567890", "6666666666");

        System.out.println("\nDespués de añadir, eliminar y modificar contactos: ");
        for (Contacto c : agendaContactos.getContacts()) {
            System.out.println(c.getName() + " -> " + c.getPhones());
        }
    }
}
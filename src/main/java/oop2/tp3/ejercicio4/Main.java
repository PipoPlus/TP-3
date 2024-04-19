package oop2.tp3.ejercicio4;

import org.jdbi.v3.core.Jdbi;

public class Main {

    public static void main(String[] args) {

        Jdbi jdbi = Jdbi.create("jdbc:hsqldb:mem;create=true");

        new SetUpDatabase(jdbi).setUp();

        var repo = new PersonaRepository(jdbi);
        var personas = repo.buscarPorNombre("Vla");

        for (Persona persona : personas) {
            System.out.println(persona.nombre() + " " + persona.apellido());
        }


        var persona = repo.buscarId(1L);
        persona.ifPresent(p -> System.out.println(p.nombre() + " " + p.apellido()));

        /*
        "Define una acción para ejecutar con el valor dentro del "Optional", si existe.
        En este caso, imprime el nombre y apellido de la persona. La expresión lambda recibe un objeto
        "persona" del tipo contenido en el Optional (en este caso, "Persona") y utiliza sus métodos
        "nombre()" y "apellido()" para obtener la información necesaria para imprimir."

        Dejo esta nota para mostrar la razon por la cual use este metodo Lambda.

        FUENTE: ChatGPT
        */

    }
}

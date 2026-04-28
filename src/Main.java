import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    static void main(String[] args) {
        List<String> listaTareas = new ArrayList<>();

        listaTareas.add("Actividad 1");
        listaTareas.add("Actividad 2");
        listaTareas.add("Actividad 3");
        listaTareas.add("Actividad 4");

        for( String toDo : listaTareas){
            System.out.println(toDo);
        }

        //! Marcar como completada.
        listaTareas.remove("Actividad 1");

        //! Tareas pendientes:
        System.out.println("Las cantidad de tareas pendientes son: " + listaTareas.size());

        System.out.println("───────────────────────────────────────────────────");

        Set<String> bibilioteLibros = new HashSet<>();

        bibilioteLibros.add("Libro 1");
        bibilioteLibros.add("Libro 2");
        bibilioteLibros.add("Libro 3");
        bibilioteLibros.add("Libro 4");
        bibilioteLibros.add("Libro 5");
        bibilioteLibros.add("Libro 6");
        bibilioteLibros.add("Libro 7");

        for( String available : bibilioteLibros){
            System.out.println(available);
        }

        System.out.println(bibilioteLibros.contains("Libro 3"));
        System.out.println("Las cantidad de libros disponible es: " +bibilioteLibros.size());
        System.out.println("───────────────────────────────────────────────────");


    }
}

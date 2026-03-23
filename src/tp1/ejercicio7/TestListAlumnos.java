package tp1.ejercicio7;
import tp1.ejercicio3.Estudiante;
import java.util.List;
import java.util.ArrayList;

public class TestListAlumnos {

    public static void main(String[] args){
        Estudiante a1 = new Estudiante("Juan","116 n23", "tgarriz@gmail.com", "3b", "garriz");
        Estudiante a3 = new Estudiante("Pedro","116 n23", "pedrp@gmail.com", "3b", "gonzalez");
        Estudiante a2 = new Estudiante("Jose","22 n23", "jose@gmail.com", "3b", "perez");

        java.util.List<Estudiante> lista = new ArrayList<>();
        lista.add(a1);
        lista.add(a2);
        lista.add(a3);
        
        //copiar lista
        List<Estudiante> listaCopia = new ArrayList<>();
        lista.forEach(a -> listaCopia.add(a));

        //lista.forEach(a -> System.out.println(a.tusDatos()));
        listaCopia.forEach(a -> System.out.println(a.tusDatos()));

        //7.e
        Estudiante a4 = new Estudiante("pepe","22 n23", "peep@gmail.com", "3b", "lamarque");

        if (!lista.contains(a4)) {
            lista.add(a4);
        } else {
            System.out.println("El alumno ya existe en la lista");
        }
        lista.forEach(a -> System.out.println(a.tusDatos()));

        List<Integer>
    }

}

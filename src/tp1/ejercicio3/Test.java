package tp1.ejercicio3;

public class Test {
    public static void main(String[] args){
        Estudiante a1 = new Estudiante("Juan","116 n23", "tgarriz@gmail.com", "3b", "garriz");
        Estudiante a2 = new Estudiante("Jose","22 n23", "jose@gmail.com", "3b", "perez");
        Profesor p1 = new Profesor("Martin", "filip", "mfilip@gmail.com", "ing 1", "Informatica");
        Profesor p2 = new Profesor("Roberto", "filip", "mfilip@gmail.com", "ing 1", "Informatica");
        Profesor p3 = new Profesor("Santa", "filip", "mfilip@gmail.com", "ing 3", "Sociales");

        Estudiante[] alumnos = new Estudiante[2];
        Profesor[] profesores = new Profesor[3];

        alumnos[0] = a1;
        alumnos[1] = a2;
        profesores[0] = p1;
        profesores[1] = p2;
        profesores[2] = p3;

        for (Estudiante a : alumnos){
            System.out.println(a.tusDatos());
        }
        for (Profesor p : profesores){
            System.out.println(p.tusDatos());
        }
    }
}

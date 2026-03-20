package tp1.ejercicio3;

public class Test {
    public static void main(String[] args){
        Estudiante a1 = new Estudiante("Juan","116 n23", "tgarriz@gmail.com", "3b", "garriz");
        Estudiante a2 = new Estudiante("Jose","22 n23", "jose@gmail.com", "3b", "perez");
        Profesor p1 = new Profesor("Martin", "filip", "mfilip@gmail.com", "ing 1", "Informatica");
        Profesor p2 = new Profesor("Roberto", "filip", "mfilip@gmail.com", "ing 1", "Informatica");
        Profesor p3 = new Profesor("Santa", "filip", "mfilip@gmail.com", "ing 3", "Sociales");
        System.out.println(a1.tusDatos());

    }
}

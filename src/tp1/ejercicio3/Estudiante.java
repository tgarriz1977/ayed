package tp1.ejercicio3;

public class Estudiante {
    private String nombre, apellido, comision, email, direccion;
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getComision() {
        return comision;
    }

    public String getEmail() {
        return email;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setComision(String comision) {
        this.comision = comision;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Estudiante(String nombre, String direccion, String email, String comision, String apellido) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.email = email;
        this.comision = comision;
        this.apellido = apellido;
    }

    public String tusDatos(){
        return "nombre: " + this.getNombre() +
                "\n apellido: " + this.getApellido() +
                "\n email: " + this.getEmail() +
                "\n comision:" + this.getComision() +
                "\n direccion:" + this.getDireccion();
    }
}

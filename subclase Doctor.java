public abstract class Persona {
    private String nombre;
    private int edad;

    // Constructor
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Métodos getter y setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    // Método abstracto
    public abstract void realizarTrabajo();
}
public class Doctor extends Persona {
    private String especialidad;

    // Constructor
    public Doctor(String nombre, int edad, String especialidad) {
        super(nombre, edad);
        this.especialidad = especialidad;
    }

    // Getter y setter para especialidad
    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    // Implementación del método abstracto
    @Override
    public void realizarTrabajo() {
        System.out.println("El doctor " + getNombre() + " está atendiendo a un paciente.");
    }
}
public class Hospital {
    public void trabajar(Persona persona) {
        persona.realizarTrabajo();
    }
}

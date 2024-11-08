// Subclase Doctor hecho por Selvin Castellanos

public class Doctor extends Persona {
    private String especialidad;

    public Doctor(String nombre, int edad, String especialidad) {
        super(nombre, edad);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

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

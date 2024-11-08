import java.util.Scanner;

//Persona superclase
abstract class Persona {
    // Atributos privados (encapsulamiento)
    private String nombre;
    private int edad;


    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public abstract void mostrarInformacion();
}

// Subclase Doctor
class Doctor extends Persona {
    private String especialidad;

    public Doctor(String nombre, int edad, String especialidad) {
        super(nombre, edad);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Edad: " + getEdad());
        System.out.println("Especialidad: " + getEspecialidad());
    }
}

// Subclase Deportista
class Deportista extends Persona {
    private String deporte;

    public Deportista(String nombre, int edad, String deporte) {
        super(nombre, edad);
        this.deporte = deporte;
    }

    public String getDeporte() {
        return deporte;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Edad: " + getEdad());
        System.out.println("Deporte: " + getDeporte());
    }
}

// Clase principal main
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Seleccione el tipo de persona:");
        System.out.println("1. Doctor");
        System.out.println("2. Deportista");
        int opcion = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Ingrese el nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese la edad: ");
        int edad = scanner.nextInt();
        scanner.nextLine();

        if (opcion == 1) {
            System.out.print("Ingrese la especialidad del doctor: ");
            String especialidad = scanner.nextLine();
            Doctor doctor = new Doctor(nombre, edad, especialidad);
            System.out.println("\nInformacion del Doctor:");
            doctor.mostrarInformacion();
        } else if (opcion == 2) {
            System.out.print("Ingrese el deporte del deportista: ");
            String deporte = scanner.nextLine();
            Deportista deportista = new Deportista(nombre, edad, deporte);
            System.out.println("\nInformacion del Deportista:");
            deportista.mostrarInformacion();
        } else {
            System.out.println("Opcion no valida.");
        }

        scanner.close();
    }
}

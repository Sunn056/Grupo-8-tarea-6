import java.util.Scanner;

//Superclase Persona
public class Persona {

    private String nombre;
    private int edad;
    private String genero;

    public void capturarDatosPersonales() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre: ");
        this.nombre = scanner.nextLine();

        System.out.print("Ingrese la edad: ");
        this.edad = scanner.nextInt();

        scanner.nextLine(); // Consumir la nueva línea

        System.out.print("Ingrese el género: ");
        this.genero = scanner.nextLine();
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getGenero() {
        return genero;
    }

    public void mostrarOcupacion() {
        System.out.println("Ocupación desconocida");
    }

    // Subclase Doctor
    public static class Doctor extends Persona {
        private String especialidad;

        public void capturarDatosDoctor() {
            Scanner scanner = new Scanner(System.in);

            super.capturarDatosPersonales();

            System.out.print("Ingrese la especialidad del doctor: ");
            this.especialidad = scanner.nextLine();
        }

        public String getEspecialidad() {
            return especialidad;
        }

        @Override
        public void mostrarOcupacion() {
            System.out.println("Soy un doctor especialista en " + especialidad);
        }
    }

    // Subclase Deportista
    public static class Deportista extends Persona {
        private String deporte;

        public void capturarDatosDeportista() {
            Scanner scanner = new Scanner(System.in);

            super.capturarDatosPersonales();

            System.out.print("Ingrese el deporte que practica: ");
            this.deporte = scanner.nextLine();
        }

        public String getDeporte() {
            return deporte;
        }

        @Override
        public void mostrarOcupacion() {
            System.out.println("Soy un deportista y practico " + deporte);
        }
    }

//Main
    public static void main(String[] args) {
        Doctor doctor = new Doctor();
        doctor.capturarDatosDoctor();
        System.out.println("Nombre: " + doctor.getNombre());
        System.out.println("Edad: " + doctor.getEdad());
        System.out.println("Género: " + doctor.getGenero());
        doctor.mostrarOcupacion();

        System.out.println();

        Deportista deportista = new Deportista();
        deportista.capturarDatosDeportista();
        System.out.println("Nombre: " + deportista.getNombre());
        System.out.println("Edad: " + deportista.getEdad());
        System.out.println("Género: " + deportista.getGenero());
        deportista.mostrarOcupacion();
    }
}

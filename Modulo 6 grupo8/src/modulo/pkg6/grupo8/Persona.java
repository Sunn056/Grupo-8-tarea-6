import java.util.Scanner;

public class Persona {

    // Atributos comunes a todas las personas
    private String nombre;
    private int edad;
    private String genero;

    // Método para capturar datos personales
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

    // Métodos getter para obtener los valores de los atributos
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getGenero() {
        return genero;
    }

    // Método para mostrar ocupación
    public void mostrarOcupacion() {
        System.out.println("Ocupación desconocida");
    }

    // Subclase Doctor
    public static class Doctor extends Persona {
        private String especialidad;

        // Método específico para capturar datos del Doctor
        public void capturarDatosDoctor() {
            Scanner scanner = new Scanner(System.in);

            // Capturar datos generales
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

        // Método específico para capturar datos del Deportista
        public void capturarDatosDeportista() {
            Scanner scanner = new Scanner(System.in);

            // Capturar datos generales
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

    // Método main para probar el código
    public static void main(String[] args) {
        // Crear y capturar datos para un Doctor
        Doctor doctor = new Doctor();
        doctor.capturarDatosDoctor();
        System.out.println("Nombre: " + doctor.getNombre());
        System.out.println("Edad: " + doctor.getEdad());
        System.out.println("Género: " + doctor.getGenero());
        doctor.mostrarOcupacion();

        System.out.println();

        // Crear y capturar datos para un Deportista
        Deportista deportista = new Deportista();
        deportista.capturarDatosDeportista();
        System.out.println("Nombre: " + deportista.getNombre());
        System.out.println("Edad: " + deportista.getEdad());
        System.out.println("Género: " + deportista.getGenero());
        deportista.mostrarOcupacion();
    }
}

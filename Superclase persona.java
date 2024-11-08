//Superclase persona, hecho por Edwin Pineda

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

        scanner.nextLine();

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

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

// Subclase Deportista hecho por Yeincon Alvarado

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

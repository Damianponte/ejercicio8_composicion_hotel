public class hotel {
    //Un hotel tiene habitaciones.
    // Cada habitación tiene un número y un precio por noche.
    // El hotel debe poder mostrar todas sus habitaciones
    // y calcular el precio total de una estancia de varias noches.
    // Diseña las clases necesarias y un programa de ejemplo

        private Habitaciones[] habitaciones;

    public hotel(Habitaciones[] habitaciones) {
        this.habitaciones = habitaciones;
    }


    public int precioNoche(int numeroHabitacion, int numeroNoches) {

        for (int i = 0; i < habitaciones.length; i++) {
            if (habitaciones[i].getNumero() == numeroHabitacion) {
                return numeroNoches * habitaciones[i].getPrecioNoche();
            }
        }

        return 0; // si no se encuentra la habitación
    }


        public void mostrarHabitaciones(){
            for(int i=0;i<habitaciones.length;i++){
                System.out.println("la habitacion " + habitaciones[i].getNumero() + " cuesta " + habitaciones[i].getPrecioNoche() );
            }

    }


}

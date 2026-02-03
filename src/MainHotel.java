import java.util.Scanner;

public class MainHotel {
    public static void main(String[] args) {
        //Un hotel tiene habitaciones.
        // Cada habitación tiene un número y un precio por noche.
        // El hotel debe poder mostrar todas sus habitaciones
        // y calcular el precio total de una estancia de varias noches.
        // Diseña las clases necesarias y un programa de ejemplo

            Habitaciones[] Dormitorio=new Habitaciones[5];
            Dormitorio[0]=new Habitaciones(1,52);
            Dormitorio[1]=new Habitaciones(2,62);
            Dormitorio[2]=new Habitaciones(3,72);
            Dormitorio[3]=new Habitaciones(4,45);
            Dormitorio[4]=new Habitaciones(5,145);

            hotel casa=new hotel(Dormitorio);



             System.out.println(" El precio de la habitacion seria " + casa.precioNoche(2,1) + " euros.");

                casa.mostrarHabitaciones();
    }

}


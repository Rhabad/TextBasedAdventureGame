package playing;

import game.Places;
import game.Players;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Util util = new Util();
        Players players = null;
        Places places = new Places();

        do {
            System.out.println("----- MENU -----");
            System.out.println("1. Crear personaje\n" +
                    "2. Mostrar clases");
            int opcion = entrada.nextInt();

            switch (opcion){
                case 1:
                    System.out.print("Nombre: ");
                    String nombre = entrada.next();
                    System.out.print("Raza: ");
                    String raza = entrada.next();

                    //se crea el personaje
                    players = new Players(nombre, raza);
                    players.elegirClase();

                    System.out.println(players);
                    break;
                case 2:
                    util.mostrarClases();
                    break;
                default:
                    System.out.println("ERROR, OPCION ERRONEA");
                    break;
            }

        }while (players == null);

        System.out.println("-----------------------");
        System.out.println("¡EMPIEZA LA AVENTURA!");
        System.out.println("-----------------------");


        String[] zonas = places.getNombreLugar();
        while (true){
            System.out.println("1. Ingresar");
            int opcion = entrada.nextInt();

            int zonaElegida;
            if (opcion == 1){
                places.lugares(players);
                System.out.print("Elegir zona(1-3): ");
                zonaElegida = entrada.nextInt()-1;
                System.out.println("Has entrado en "+zonas[zonaElegida]);
            }

            boolean instance = true;
            while (instance){
                
            }

        }

    }
}
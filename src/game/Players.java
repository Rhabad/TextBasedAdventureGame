package game;

import java.util.Scanner;

public class Players {
    private String name;
    private String race;
    private String specialitation;
    private int level;

    private final int levelForDefect = 1;

    public Players(String name, String race){
        this.name = name;
        this.race = race;
        this.level = levelForDefect;
    }

    public void mostrarClases(){
        Scanner entrada = new Scanner(System.in);

        System.out.println("----------Las Clases-----------");
        System.out.println("1. Guerrero\n" +
                "2. Mago\n" +
                "3. Picaro\n" +
                "4. Sacerdote\n" +
                "5. Cazador");
        System.out.print("Elige(1 al 5): ");
        int eleccion = entrada.nextInt()-1;

        switch (eleccion){
            case 1:
                System.out.println("-----Guerrero-----");
                System.out.println("tipico cuerpo a cuerpo");
                break;
            case 2:
                System.out.println("-----Mago-----");
                System.out.println("lanza magia, no pienses mucho");
                break;
            case 3:
                System.out.println("-----Picaro-----");
                System.out.println("usa dagas... le gusta robar, la muy rata");
                break;
            case 4:
                System.out.println("-----Sacerdote-----");
                System.out.println("un sanador de toda la vida");
                break;
            case 5:
                System.out.println("-----Cazador-----");
                System.out.println("No se... un rastreador y usa un arco, suele caer en trampas");
                break;
            default:
                System.out.println("Por favor escoja un numero acorde a la clase.");
                break;
        }
    }

    public void elegirClase(){
        Scanner entrada = new Scanner(System.in);
        String[] clases = {"Guerrero", "Mago", "Picaro", "Sacerdote", "Cazador"};

        System.out.print("Ahora eliga la clase: ");
        int eleccion = entrada.nextInt();

        String claseElegida = clases[eleccion-1];
        this.specialitation = claseElegida;
    }


    @Override
    public String toString(){
        return "Nombre: "+this.name+"\n" +
                "Raza: "+this.race+"\n" +
                "Clase: "+this.specialitation+"\n" +
                "NIvel: "+this.level;
    }
}

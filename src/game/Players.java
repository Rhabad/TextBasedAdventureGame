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

    public void elegirClase(){
        Scanner entrada = new Scanner(System.in);
        String[] clases = {"Guerrero", "Mago", "Picaro", "Sacerdote", "Cazador"};

        System.out.print("Eliga la clase: ");
        int eleccion = entrada.nextInt();

        String claseElegida = clases[eleccion-1];
        this.specialitation = claseElegida;
    }

    public int getLevet(){
        return level;
    }

    @Override
    public String toString(){
        return "Nombre: "+this.name+"\n" +
                "Raza: "+this.race+"\n" +
                "Clase: "+this.specialitation+"\n" +
                "NIvel: "+this.level;
    }
}

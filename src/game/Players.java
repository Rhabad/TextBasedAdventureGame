package game;

public class Players {
    private String name;
    private String race;
    private String specialitation;
    private int level;

    private final int levelForDefect = 1;

    public Players(String name, String race, String specialitation){
        this.name = name;
        this.race = race;
        this.specialitation = specialitation;
        this.level = levelForDefect;
    }

}

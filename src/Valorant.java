public class Valorant extends Game{
    private int level;

    public Valorant(String genre, boolean hasPlayed, int gameHours, int level){
        super(genre,hasPlayed,gameHours);
        this.level = level;
    }
    public int getLevel(){
        return level;
    }

    public void doQuests(){
        level++;
    }
}

public class Terraria extends Game {
    private int numWorlds;

    public Terraria(String genre, boolean hasPlayed, int gameHours, int numWorlds){
        super(genre,hasPlayed,gameHours);
        this.numWorlds = numWorlds;
    }
    public int getNumWorlds(){
        return numWorlds;
    }

    public void makeWorld(){
        numWorlds++;
    }
}

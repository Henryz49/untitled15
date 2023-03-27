public class Game {
    private String genre;
    private boolean hasPlayed;
    private int gameHours;

    public Game(String genre, boolean hasPlayed, int gameHours){
        this.genre = genre;
        this.gameHours = gameHours;
        this.hasPlayed = hasPlayed;
    }

    public String getGenre(){
        return genre;
    }

    public boolean getHasPlayed(){
        return hasPlayed;
    }

    public int getGameHours(){
        return gameHours;
    }

    public void play(){
        hasPlayed = true;
        System.out.println("Game has been played");
    }


}

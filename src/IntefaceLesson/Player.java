package IntefaceLesson;

import java.util.SortedSet;

public class Player implements Information{

    private String nameOfPlayer;
    private String sportType;
    private int numberPosition;

    public Player(String nameOfPlayer, String sportType, int numberPosition) {
        this.nameOfPlayer = nameOfPlayer;
        this.sportType = sportType;
        this.numberPosition = numberPosition;
    }

    public String getNameOfPlayer() {
        return nameOfPlayer;
    }

    public void setNameOfPlayer(String nameOfPlayer) {
        this.nameOfPlayer = nameOfPlayer;
    }

    public String getSportType() {
        return sportType;
    }

    public void setSportType(String sportType) {
        this.sportType = sportType;
    }

    public int getNumberPosition() {
        return numberPosition;
    }

    public void setNumberPosition(int numberPosition) {
        this.numberPosition = numberPosition;
    }


    @Override
    public void getInfo() {

    }

    @Override
    public void getTeamName(){

    }
}

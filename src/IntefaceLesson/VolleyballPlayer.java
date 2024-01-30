package IntefaceLesson;

public class VolleyballPlayer extends Player{

    private int numberOfPoints;

    public VolleyballPlayer(String nameOfPlayer, String sportType, int numberPosition, int numberOfPoints) {
        super(nameOfPlayer, sportType, numberPosition);
        this.numberOfPoints = numberOfPoints;
    }

    public int getNumberOfPoints() {
        return numberOfPoints;
    }

    public void setNumberOfPoints(int numberOfPoints) {
        this.numberOfPoints = numberOfPoints;
    }
}

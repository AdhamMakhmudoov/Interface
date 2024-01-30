package IntefaceLesson;

public class Setter extends VolleyballPlayer{

    private int countOfSets;

    public Setter(String nameOfPlayer, String sportType, int numberPosition, int numberOfPoints, int countOfSets) {
        super(nameOfPlayer, sportType, numberPosition, numberOfPoints);
        this.countOfSets = countOfSets;
    }

    public int getCountOfSets() {
        return countOfSets;
    }

    public void setCountOfSets(int countOfSets) {
        this.countOfSets = countOfSets;
    }

    @Override
    public void getInfo() {
        System.out.println("Name_Of_Player = "+getNameOfPlayer()+"\n"+
                "Sport_Type = "+getSportType()+"\n"+
                "Numbre_Position = "+getNumberPosition()+"\n"+
                "Number_Of_Points = "+getNumberOfPoints()+"\n"+
                "Count_Of_Sets"+getCountOfSets());
    }

    @Override
    public void getTeamName() {
        System.out.println("Team_Name = "+"Chikago");
    }
}

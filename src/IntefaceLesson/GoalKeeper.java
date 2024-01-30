package IntefaceLesson;

public class GoalKeeper extends FootballPlayer{

    private int countOfSaves;

    public GoalKeeper(String nameOfPlayer, String sportType, int numberPosition, int countOfRedCar, int countOfYellowCard, int countOfGoals, int countOfSaves) {
        super(nameOfPlayer, sportType, numberPosition, countOfRedCar, countOfYellowCard, countOfGoals);
        this.countOfSaves = countOfSaves;
    }

    public int getCountOfSaves() {
        return countOfSaves;
    }

    public void setCountOfSaves(int countOfSaves) {
        this.countOfSaves = countOfSaves;
    }

    @Override
    public void getInfo() {
        System.out.println("Name_Of_Player = "+getNameOfPlayer()+"\n"+
                "Sport_Type = "+getSportType()+"\n"+
                "Numbre_Position = "+getNumberPosition()+"\n"+
                "Count_Of_Red_Car = "+getCountOfRedCar()+"\n"+
                "Count_Of_Yellow_Car = "+getCountOfYellowCard()+"\n"+
                "Count_Of_Goals = "+getCountOfGoals()+"\n"+
                "Count_Of_Saves = "+getCountOfSaves());
    }

    @Override
    public void getTeamName() {
        System.out.println("Team_Name = "+"Real Madrid");
    }
}


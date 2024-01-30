package IntefaceLesson;

public class FootballPlayer extends Player{

    private int countOfRedCar;
    private int countOfYellowCard;
    private int countOfGoals;

    public FootballPlayer(String nameOfPlayer, String sportType, int numberPosition,  int countOfRedCar, int countOfYellowCard, int countOfGoals) {
        super(nameOfPlayer, sportType, numberPosition);
        this.countOfRedCar = countOfRedCar;
        this.countOfYellowCard = countOfYellowCard;
        this.countOfGoals = countOfGoals;
    }

    public int getCountOfRedCar() {
        return countOfRedCar;
    }

    public void setCountOfRedCar(int countOfRedCar) {
        this.countOfRedCar = countOfRedCar;
    }

    public int getCountOfYellowCard() {
        return countOfYellowCard;
    }

    public void setCountOfYellowCard(int countOfYellowCard) {
        this.countOfYellowCard = countOfYellowCard;
    }

    public int getCountOfGoals() {
        return countOfGoals;
    }

    public void setCountOfGoals(int countOfGoals) {
        this.countOfGoals = countOfGoals;
    }



}

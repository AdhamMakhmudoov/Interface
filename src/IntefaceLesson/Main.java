package IntefaceLesson;

public class Main {

    public static void main (String... args){

        System.out.println();

        GoalKeeper goalKeeper = new GoalKeeper("Adham","Football",6,2,6,1,59);
        goalKeeper.getInfo();
        goalKeeper.getTeamName();

        System.out.println();

        Setter setter = new Setter("Bobur","Valeyboll",2,7,3);
        setter.getInfo();
        setter.getTeamName();
    }
}

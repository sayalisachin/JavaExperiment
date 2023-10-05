// Define the Sports interface
interface Sports {
    int getNumberOfGoals(); // Method to get the number of goals
    String dispTeam();        // Method to display team information
}

// Create a Hockey class implementing the Sports interface
class Hockey implements Sports {
    private int goals;
    private String teamName;

    public Hockey(String teamName, int goals) {
        this.teamName = teamName;
        this.goals = goals;
    }

    @Override
    public int getNumberOfGoals() {
        return goals;
    }

    @Override
    public String dispTeam() {
        System.out.println("Hockey Team: " + teamName);
        return teamName;
    }
}

// Create a Football class implementing the Sports interface
class Football implements Sports {
    private int goals;
    private String teamName;

    public Football(String teamName, int goals) {
        this.teamName = teamName;
        this.goals = goals;
    }

    @Override
    public int getNumberOfGoals() {
        return goals;
    }

    @Override
    public String dispTeam() {
        System.out.println("Football Team: " + teamName);
        return teamName;
    }
}

public class SportsDemo {
    public static void main(String[] args) {
        // Create instances of Hockey and Football teams
        Hockey hockeyTeam1 = new Hockey("HockeyStars", 5);
        Hockey hockeyTeam2 = new Hockey("IceHawks", 3);

        Football footballTeam1 = new Football("FootballKings", 2);
        Football footballTeam2 = new Football("SoccerStrikers", 4);

        // Determine the winning criteria for Hockey (most goals win)
        if (hockeyTeam1.getNumberOfGoals() > hockeyTeam2.getNumberOfGoals()) {
            System.out.println(hockeyTeam1.dispTeam()+" wins");
        } else if (hockeyTeam1.getNumberOfGoals() < hockeyTeam2.getNumberOfGoals()) {
            System.out.println(hockeyTeam2.dispTeam()+" wins");
        } else {
            System.out.println("It's a tie in Hockey!");
        }

        // Determine the winning criteria for Football (most goals win)
        if (footballTeam1.getNumberOfGoals() > footballTeam2.getNumberOfGoals()) {
            System.out.println(footballTeam1.dispTeam()+" wins");
        } else if (footballTeam1.getNumberOfGoals() < footballTeam2.getNumberOfGoals()) {
            System.out.println(footballTeam2.dispTeam()+" wins");
        } else {
            System.out.println("It's a tie in Football!");
        }
    }
}

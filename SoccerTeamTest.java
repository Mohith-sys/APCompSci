/*Mohith Nagendra
3/18/2022
Test class for SoccerTeam program*/
public class SoccerTeamTest {
    public static void main(String[] args){
        SoccerTeam a = new SoccerTeam(1,2,3);
        SoccerTeam b = new SoccerTeam(2,2,2);
        SoccerTeam c = new SoccerTeam(3,2,1);
        SoccerTeam d = new SoccerTeam(2,1,3);

        a.reset();
        b.reset();
        c.reset();
        d.reset();

        a.played(b,3,2);
        c.played(d,1,4);
        a.played(c,4,3);
        b.played(d,7,4);
        a.played(d,2,5);
        b.played(c,1,2);

        System.out.println("Points earned by team A: " + a.points());
        System.out.println("Points earned by team B: " + b.points());
        System.out.println("Points earned by team C: " + c.points());
        System.out.println("Points earned by team D: " + d.points());
        System.out.println("Total number of games played: " + SoccerTeam.getTotGames());
        System.out.println("Total number of goals scored: " + SoccerTeam.getTotGoals());

        a.reset();
        b.reset();
        c.reset();
        d.reset();
        SoccerTeam.startTournament();
    }
}

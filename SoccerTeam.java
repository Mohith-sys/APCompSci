/*Mohith Nagendra
3/17/2022
SoccerTeam program*/
public class SoccerTeam {
    private int wins, losses, ties;

    private static int tot_games, tot_goals;

    public SoccerTeam(int w, int l, int t){
        wins = w;
        losses = l;
        ties = t;
    }

    public void played(SoccerTeam other, int myScore, int otherScore){
        if(myScore > otherScore){
            this.wins++;
            other.losses++;
        }
        else if(myScore < otherScore){
            other.wins++;
            this.losses++;
        }
        else{
            other.ties++;
            this.ties++;
        }
        tot_games++;
        tot_goals += myScore + otherScore;
    }

    public static int getTotGames(){
        return tot_games;
    }

    public static int getTotGoals(){
        return tot_goals;
    }

    public static void startTournament(){
        tot_goals = 0;
        tot_games = 0;
    }

    public int points(){
        return (this.wins * 3) + this.ties;
    }

    public void reset(){
        this.wins = 0;
        this.losses = 0;
        this.ties = 0;
    }
}
/**
 * represents a football scoreboard
 * 
 * @author Benson Mugure
 */
public class ScoreBoard {
    private TeamScore home;
    private TeamScore away;
    private int minutesPlayed;
    
    /**
     * constructor for objects of type ScoreBoard
     */
    public ScoreBoard()
    {
        minutesPlayed = 0;
        home = new TeamScore("HOME");
        away = new TeamScore("AWAY");
    }
   
        
    /**
     * set the home team score
     * 
     * @param home  the home team score
     */
    public void setHome(TeamScore home) {
        this.home = home;
    }

    /**
     * set the away team score
     * 
     * @param away  the away team score
     */
    public void setAway(TeamScore away) {
        this.away = away;
    }
   

    /**
     * returns the number of minutes played
     * 
     * @return the number of minutes played
     */
    public int getMinutesPlayed() {
        return minutesPlayed;
    }

    /**
     * sets the number of minutes played
     * 
     * @param minutesPlayed the number of minutes played
     */
    public void setMinutesPlayed(int minutesPlayed) {
        this.minutesPlayed = minutesPlayed;
    }
    
    /**
     * calls other methods depending on input
     * 
     * 
     */
    public void goalScored(String x) {
        if (x.equals("h")) {
                home.updateScore();
            }
        else if (x.equals("a")) {
                away.updateScore();
            }
        
    }
    
    public void display() {
        this.minutesPlayed = this.getMinutesPlayed();
        int x = home.getScore();
        int y = away.getScore();
        System.out.format("%d minutes played %n", minutesPlayed);
      //System.out.format(+this.minutesPlayed+ "minutes played %n", minutesPlayed);  
        System.out.format("HOME %d:%d AWAY %n", x, y);
    }
    
    public void setUpGame(String a, String b) {
        this.minutesPlayed = 0;
        home.setTeamName(a);
        home.resetScore();
        away.setTeamName(b);
        away.resetScore();
    }
  
}
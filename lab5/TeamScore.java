/**
 * represents the score for a team
 * 
 * @author Benson Mugure
 */
public class TeamScore {
    private String teamName;
    private int score;

    /**
     * constructor for objects of type TeamScore
     */
    public TeamScore()
    {
        this.teamName = "";
        this.score = 0;
    }
    
    /**
     * constructor for objects of type TeamScore
     * @param teamName  the team name
     */
    public TeamScore(String teamName)
    {
        this.teamName = teamName;
        this.score = 0;
    }
    
    /**
     * returns the team name
     * 
     * @return the team name
     */
    public String getTeamName() 
    {
        return teamName;
    }
    
    /**
     * sets the team name
     * 
     * @param teamName  the team name
     */
    public void setTeamName(String teamName) 
    {
        this.teamName = teamName;
    }

    /**
     * returns the score for the team
     * 
     * @return  the score
     */
    public int getScore() 
    {
        return score;
    }
    
    /**
     * resets the score to 0
     */
    public void resetScore()
    {
        score = 0;
    }
    
    /**
     * updates score when a goal is scored
     * 
     */
    public void updateScore() 
    {
        score++;
    }
}
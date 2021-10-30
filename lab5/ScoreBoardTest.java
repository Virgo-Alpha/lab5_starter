
/**
 * Write a description of class ScoreBoardTest here.
 *
 * @Beson Mugure (your name)
 * @version1 (a version number or a date)
 */
public class ScoreBoardTest
{
    private ScoreBoard scoreboard;
    
    /**
     * New Method
     */
    
    public void testConstructor() {
        this.scoreboard = new ScoreBoard();
        scoreboard.display();
    }
    
    /**
     * New Method
     */
    
    public void testUpdate() {
           scoreboard.setUpGame("A", "B");
           scoreboard.goalScored("h");
           scoreboard.goalScored("h");
           scoreboard.goalScored("a");
           scoreboard.setMinutesPlayed(45);
           scoreboard.display();
    }
}

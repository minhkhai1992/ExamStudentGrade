
/**
 * The FinalExam class will receive all the input from user and calculate to check
 * how many point each question take and calculate the true score what student will get
 * in the Final Exam.
 * The ideal of the program help all professors easy to calculate score without calculation.
 * The FinalExam will use GradeActivity class to determine what the score student will get.
 *
 * @author (Khai Lim)
 * @version (01/03/2018)
 */
public class FinalExam extends GradeActivity
{
    private int numQuestions;       // number of questions    
    private double pointsEach;      // Points for each question
    private int numMissed;          // Questions missed
    
    /**
     * The constructor sets the number of questions on the
     * exam and the number of questions missed.
     * @param questions - the number of questions.
     * @param missed  - the number of question missed.
     */    
    public FinalExam(int questions, int missed)
    {
        double numericScore;        //to hold a numeric score
        
        numQuestions = questions;   //set the numQuestions field
        numMissed = missed;         //set the numMissed field
        
        pointsEach = 100.0 / questions;                 //calcuate the points for each questions
        numericScore = 100.0 - (missed * pointsEach);   //calcualte the numeric score for this exam
        
        //The numeric score for this exam
        //set the numeric score.        
        setScore(numericScore);
    
    }
    
    /**
     * The getPointEach method returns the number of points
     * each question is worth.
     * @return the valuein the pointsEach field.
     */
    public double getPointsEach()
    {
        return pointsEach;
    
    }
    
    /**
     * The getNumMissed method returns the number of 
     * questions missed.
     * @return the value in the numMissed field.
     */
    public int getNumMissed()
    {
        return numMissed;
    }
}

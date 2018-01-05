import javax.swing.*;
import java.text.DecimalFormat;
import java.util.*;
/** 
 * This program demonstrates the FinalExam class by use the Dialog box.
 * Here is the Driver class will receive all user input which extends the GradeActivity class.
 *
 * @author (Khai Lim)
 * @version (01/03/2018)
 */
public class FinalExamDriver
{
    public static void main(String[] args)
    {
        String input;       //To hold input
        int questions;      //Number of questions
        int missed;         //Number of questions missed
        int count = 0;      //Number of number students in class
        boolean condition = true;   //Condition made the loop run
        char letter;        //Letter pick up the first letter
                
        DecimalFormat dec = new DecimalFormat("###.##");    //Create a DecimalFormat object.
        
        // Get the number of questions on the exam.
        do
        {
            input = JOptionPane.showInputDialog("How many questions are on the final exam? \n(Note: Number can not be negative)");
            questions = Integer.parseInt(input);      
        }while(questions < 1 );
        
        while (condition)
        {                  
            // Get the number of questions the student missed.
            input = JOptionPane.showInputDialog("How many questions did the "+ (count+1)+ " student missed?");
            missed = Integer.parseInt(input);
            
            //Create a FinalExam object.
            FinalExam exam = new FinalExam(questions,missed);
            
            // Display the test results.
            JOptionPane.showMessageDialog(null,"Each question counts " + dec.format(exam.getPointsEach()) +
                                            " points.\nThe exam is " + dec.format(exam.getScore()) + 
                                            "\nThe exam grade is " + exam.getGrade());
            count += 1;
            do
            {
                input = JOptionPane.showInputDialog("Do you have any student ?" + "\t y: yes \t n: no");
                letter = input.charAt(0);
                if (letter == 'n')
                {
                    JOptionPane.showMessageDialog(null,"You graded " + count + " students in your class");
                    condition = false;                
                }
                else
                {
                    condition = true;
                }
            }while (letter != 'y' && letter != 'Y' && letter != 'n' && letter != 'N');           
                        
        }                                
        System.exit(0);
        
    }
    
    
}

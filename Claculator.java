
/**
 * Write a description of class Claculator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Claculator
{
     public static void main(String[] args) 
    {
        int A;
        int B;
         String op;
         double answer1;
         double answer2;
        double answer3;
        double answer4;
        System.out.println("!!!!THIS CODE CAN ONLY SUPORT THE USE OF TWO EVEN WHOLE NUMBERS. EX: 23 * 2, NOT 23 * 2 * 2!!!!") ;
        
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter your first number.");
         A = input.nextInt();
         
        
        
         System.out.println("Enter your next number.");
         B = input.nextInt();
         
         
        
        
        System.out.println("Enter the operation you want to complete.");
        Scanner ope = new Scanner(System.in);
         
        op = ope.next();
        
        answer1 = (A+B);
        answer2 = (A-B);
        answer3 = (A/B);
        answer4 = (A*B);
         
         if (op.equals ("+"))
         {
             System.out.println(A + " + " + B + " = " + answer1);
            }
         else if (op.equals("-"))
         {
             System.out.println(A + " - " + B + " = " + answer2);
            }
         else if (op.equals ("/"))
         {
             System.out.println(A + " / " + B + " = " + answer3);
            }
         else if (op.equals ("*"))
         {
             System.out.println(A + " * " + B + " = " + answer4);
            }
         
            else { System.out.println("!!!Valid function not detected please reset the code and try again!!!!");
         
    }
}
}

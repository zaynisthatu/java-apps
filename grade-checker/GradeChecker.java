/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gradechecker;
import javax.swing.JOptionPane;
/**
 *
 * @author demon
 */
public class GradeChecker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String valtaker = JOptionPane.showInputDialog("Enter a number");
        int marks = Integer.parseInt(valtaker) ;
        if (marks >= 90 ){
           JOptionPane.showMessageDialog(null,marks +  " Grade A+ ");
        }
        else if (marks >= 80 ){
            JOptionPane.showMessageDialog(null,marks +  " Grade A ");
        }
        else if (marks >= 70 ){
            JOptionPane.showMessageDialog(null , marks +  " Grade B ");
        }
        else if (marks >= 60 ){
            JOptionPane.showMessageDialog(null , marks + " Grade C ");
        }
        else {
           JOptionPane.showMessageDialog(null , marks + " Fail");
        }
    }
    
}

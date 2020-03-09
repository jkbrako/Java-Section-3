package input03;

import java.util.Scanner;
import javax.swing.JOptionPane;

class Input03 {

    public static void main(String[] args) {
        //Create a Scanner
        Scanner sc = new Scanner(System.in);
        int     x = sc.nextInt();
        double  y = sc.nextDouble();
        String z = sc.next();
        
        //Find and print the sum of three integers entered by the user
       // int input1 = JOptionPane.showInputDialog("Type an integer please 1 time:");
       // int input2 = JOptionPane.showInputDialog("Type an integer please for the second time:");
       // int input3 = JOptionPane.showInputDialog("Type an integer please (okay one more time):");
        
        int input01 = Integer.parseInt(JOptionPane.showInputDialog("Type an integer please 1 time:")) +1;
        int input02 = Integer.parseInt(JOptionPane.showInputDialog("Type an integer please for the second time:")) +1;
        int input03 = Integer.parseInt(JOptionPane.showInputDialog("Type an integer please (okay one more time):")) +1;
        System.out.println(input01 + input02 + input03);
        //Remember to close the Scanner
        sc.close();
    }
}

package input01;

import javax.swing.JOptionPane;

public class Input01 {
    public static void main(String[] args) {
        //Create a JOptionPane.
        JOptionPane.showInputDialog("Type");
        //Store the input as a String and print it.
        String input = JOptionPane.showInputDialog("Type");
        System.out.println(input);
        
        
        //Parse the input as an int.
        int ParseInt = Integer.parseInt(input);
        System.out.println(input+1);
        //Print its value +1
        
        
        
        //Try creating a dialog, parsing it, and initializing an int in a single line.
        int input2 = Integer.parseInt(JOptionPane.showInputDialog("cheetos") + 1 );
        System.out.println(input2);
        //You should have only one semicolon (;) in this line.

        
    }
}

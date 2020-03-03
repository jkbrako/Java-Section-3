
package casting01;

public class Casting01 {
    public static void main(String[] args) {
       // byte x = 128;
        //Observe NetBeans' complaint
        // incompatible types: possible lossy conversion from int to byte
        
        
        //Declare and initialize a short with a value of 128
        short byteToShort;
        byteToShort = 128;
        byte x;
        x = (byte)byteToShort;
        //Create a print statement that casts this short to a byte
        System.out.println(x);
        
        //Declare and initialize a byte with a value of 127
        byte myFood;
        myFood = 127;

        //Add 1 to this variable and print it
        System.out.println(myFood + 1);
        
        //Add 1 to this variable again and print it again
        int plusUltra;
        plusUltra = (int)myFood;    
        System.out.println(plusUltra + 2);

        
        
        
    }    
}

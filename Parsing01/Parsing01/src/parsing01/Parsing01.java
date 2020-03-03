package parsing01;

public class Parsing01 {
    public static void main(String[] args) {
        //Declare and intitialize 3 Strings: shirtPrice, taxRate, and gibberish
        int shirtPrice = Integer.parseInt("15");
        double taxRate = Double.parseDouble("0.05");
        String gibberish = "887ds7nds87dsfs";
        
        
        
        //Parse shirtPrice and taxRate, and print the total tax
        System.out.println(shirtPrice * taxRate);
        
        //Try to parse taxRate as an int
        
        //Try to parse gibberish as an int
        
    }
    
}

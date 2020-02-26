
package chickens01;

public class Chickens01 {
    public static void main(String[] args) {
        int eggsPerChicken = 4;
        int chickenCount = 8;
        int totalEggs = 0;
        
        totalEggs = totalEggs + eggsPerChicken * chickenCount;
        
        chickenCount = chickenCount + 1;
        
        totalEggs = totalEggs + eggsPerChicken * chickenCount;        
        
        chickenCount = chickenCount / 2;
        
        totalEggs = totalEggs + eggsPerChicken * chickenCount;

        
        System.out.println(totalEggs);
    }   
}

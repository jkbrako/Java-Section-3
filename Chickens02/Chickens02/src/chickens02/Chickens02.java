
package chickens02;

public class Chickens02 {
    public static void main(String[] args) {
        double mondayAverage = 100;
        double tuesdayAverage = 121;
        double wednesdayAverage = 117;
        
        double dailyAverage = 0;
        dailyAverage = (mondayAverage + tuesdayAverage + wednesdayAverage) / 3;
        
        double monthlyAverage = 0;
        monthlyAverage = dailyAverage * 30;
        
        double eggProfit = 0.18;
        double monthlyProfit = 0;
        monthlyProfit =  monthlyAverage * eggProfit;

        System.out.println("Daily Average:   " +dailyAverage);
        System.out.println("Monthly Average: " +monthlyAverage);
        System.out.println("Monthly Profit:  $" +monthlyProfit);
    }
    
}

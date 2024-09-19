
package variables03;

public class Chickens01 {
    public static void main(String[] args) {
        //Put your code here
  int eggsPerChicken = 5;
  int chickenCount = 3;
   int totalEggs = 0;
   
   totalEggs += eggsPerChicken * chickenCount;
  System.out.println(totalEggs);
  
 
  chickenCount =chickenCount +1;
  totalEggs += eggsPerChicken * chickenCount;
  chickenCount = chickenCount / 2;
  totalEggs+= eggsPerChicken * chickenCount;
        System.out.println(totalEggs);
        
    }   
}

public class Chicken02 {
    public static void main(String[] args) {
        //Put yout code here

        System.out.println("Daily Average:   " +dailyAverage);
        System.out.println("Monthly Average: " +monthlyAverage);
        System.out.println("Monthly Profit:  $" +monthlyProfit);
    }
    
}


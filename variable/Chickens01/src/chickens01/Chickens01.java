
package chickens01;

public class Chickens01 {
    public static void main(String[] args) {
        //Put yout code here
        //firsr scenario
        int chickenCount = 3;
        int eggsPerChicken = 5; 
        int totalEggs = chickenCount * eggsPerChicken;
        System.out.println("on mondey farmer brown have " + chickenCount + " and eggs " + totalEggs );
        chickenCount++;
        totalEggs += chickenCount * eggsPerChicken;
        System.out.println("on tuesday farmer brown have " + chickenCount + " and eggs " + totalEggs );
        chickenCount /=2;
        totalEggs += chickenCount * eggsPerChicken;
        System.out.println("on wednesday farmer brown have " + chickenCount + " and eggs " + totalEggs );
        System.out.println("first secanario : " + totalEggs);
        
        //second scenario
        chickenCount = 8;
        eggsPerChicken = 4;
        totalEggs = chickenCount * eggsPerChicken;
        System.out.println("on mondey farmer brown have " + chickenCount + " and eggs " + totalEggs );
        chickenCount++;
        totalEggs += chickenCount * eggsPerChicken;
        System.out.println("on tuesday farmer brown have " + chickenCount + " and eggs " + totalEggs );
        chickenCount /=2;
        totalEggs += chickenCount * eggsPerChicken;
        System.out.println("on wednesday farmer brown have " + chickenCount + " and eggs " + totalEggs );
        System.out.println("second secanario : " + totalEggs);
    }   
}

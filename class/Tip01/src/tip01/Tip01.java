package tip01;

public class Tip01 {
//    Fields
    public double originalPrice =10;
    public double tax = 0.05;
    public double tip = 0.15;
    
//    method
    public void findTotal(){
        double person = originalPrice*(1+tax+tip);
        System.out.println(person);
    }
}

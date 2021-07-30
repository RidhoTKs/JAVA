
package tip03;

public class CalculatorTest {
    public static void main(String[] args) {
        
       Calculator calc = new Calculator();
       
       //Use the Calculator object and arguments supplied to findTotal()
       //to print the total for each person
       calc.findTotal("person1", 10);
       calc.findTotal("person1", 12);
       calc.findTotal("person1", 9);
       calc.findTotal("person1", 8);
       calc.findTotal("person1", 7);
       calc.findTotal("Alex", 15);
       calc.findTotal("person1", 11);
       calc.findTotal("person1", 30);
       /*This is what everyone owes before tax and tip:
       Person 1: $10
       Person 2: $12
       Person 3: $9
       Person 4: $8
       Person 5: $7
       Person 6: $15 (Alex)
       Person 7: $11
       Person 8: $30
       */
    }    
}

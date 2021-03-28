/**
 * @brief Test for Calculator class, with user input
 * 
 */
public class CalculatorTest {
    public static void main(String[] args){
        ReadClass readClass = new ReadClass();
        double a;
        double b;
        int action;
        try {
            System.out.println("1st number : ");
            a = readClass.readDouble();
            System.out.println("2nd number : ");
            b = readClass.readDouble();
            System.out.println("Choose action : ");
            System.out.println("1) - summ");
            System.out.println("1) - substraction");
            System.out.println("3) - multiplication");
            System.out.println("4) - division");
            action = readClass.readAction();
            Calculator c = new Calculator(a,b);
            switch (action) {
                case 1:  System.out.println(c.add()); break;
                case 2:  System.out.println(c.substract()); break;    
                case 3:  System.out.println(c.multiply()); break;
                case 4:  System.out.println(c.divide()); break;
                default: break;
            }
            
        }
        catch (Exception e) {
            System.out.println("Exception thrown : "+ e);
        }
    }
}

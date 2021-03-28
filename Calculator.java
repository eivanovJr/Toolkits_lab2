/**
 * @author eivanov
 * @brief Calculator class with 4 basic actions.
 * 
 */
public class Calculator {
    private double a;
    private double b;
    /**
     * @brief default Constructor, numbers are 0
     */
    public Calculator(){
        this.a = 0;
        this.b = 0;
    }
    
    /**
     * 
     * @param x the first number
     * @param y the second number
     */
    public Calculator(double x, double y){
        
        this.a = x;
        this.b = y;
    }

    /**
     * 
     * @return the result of addition
     */
    public double add(){
        return a + b;
    }
    /**
     * @return Substraction b from a
     */
    public double substract(){
        return a - b;
    }

    /**
     * 
     * @return a divided by b
     * @throws ArithmeticException if b == 0
     */
    public double divide() throws ArithmeticException{
        if (b == 0){
            throw new ArithmeticException("Division by 0");
        }
        return a / b;
    }

    /**
     * 
     * @return multiplication a by b
     */
    public double multiply(){
        return a * b;
    }
}

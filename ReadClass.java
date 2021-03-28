
import java.util.Scanner;
/**
 * @brief class for reading numbers and actions from console in right format
 */
public class ReadClass {
    /**
     * 
     * @return a correct double from console
     * @throws NumberFormatException if input is not number
     */
    public double readDouble() throws NumberFormatException{
        
        Scanner sc = new Scanner(System.in);
        double result = 0;

        if (sc.hasNextDouble() ){
            result = sc.nextDouble();
            return result;
        }
        else {
            throw new NumberFormatException("Wrong number input !");
        }
    }

    /**
     * 
     * @return an int from 1 to 4, meaning the actions for calculator
     * @throws NumberFormatException if input is not number, or number is out of range
     */
    public int readAction() throws  NumberFormatException {
        Scanner sc = new Scanner(System.in);
        int act = sc.nextInt();
        if (act > 4 || act < 1){
            throw new  NumberFormatException("Wrong action choise");
        }
        return act;
    }
}
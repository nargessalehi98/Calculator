import java.security.PublicKey;
import java.util.ArrayList;

/**
 * this class keep data
 * @author Narges Salehi
 */
public class Model {
    //this array list keep numbers
    ArrayList<Double> numbers;
    //this array list keep operations
    ArrayList<Character> operations;
    //result
    double result;
    //index of numbers
    int indexOfNum;
    //index of operations
    int indexOfOpe;
    //keep result as a String
    String text ;
    //keep true for first digit of each number
    boolean firstTime;
    //keep true for new numbers begin
    boolean hasOperation;
    //check if shift has pressed
    int shiftfalg;

    /**
     * creat a new Model - set default values
     */
    public Model(){
        numbers=new ArrayList<Double>();
        operations=new ArrayList<Character>();
        result=0;
        indexOfNum=0;
        indexOfOpe=0;
        text="";
        firstTime=true;
        hasOperation=false;
        shiftfalg=0;
    }
}

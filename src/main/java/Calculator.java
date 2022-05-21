import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculator {

    public static final String ERROR_MESSAGE_IO = "Please, try again";
    public static final String ERROR_FORMAT_NUMBER = "Data is incorrect";
    public static final String FIRST_NUMBER_MESSAGE = "Type first number:";
    public static final String SECOND_NUMBER_MESSAGE = "Type second number";


    public void sumTwoNumbers(){
    try {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(FIRST_NUMBER_MESSAGE);
        Integer one = Integer.parseInt(reader.readLine());
        System.out.println(SECOND_NUMBER_MESSAGE);
        Integer two = Integer.parseInt(reader.readLine());
        System.out.println(one + " " + " + " + two + " = " + getSum(one, two));

    }
    catch (
    IOException e){
        System.out.println(ERROR_MESSAGE_IO);
    }
    catch (NumberFormatException e){
        System.out.println(ERROR_FORMAT_NUMBER);
    }
}


    public int getSum(int one, int two){
        return one + two;
    }
}

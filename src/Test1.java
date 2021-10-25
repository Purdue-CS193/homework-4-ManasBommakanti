import java.util.*;

enum Operation
{
    ADD, SUBTRACT, MULTIPLY, DIVIDE
}
public class Test1 {

    public static double basicCalculator(final Operation operation, final int num1, final int num2){
        double result = 0;
        
	if (operation == Operation.ADD)
		return num1 + num2;
	if (operation == Operation.SUBTRACT)
		return num1 - num2;
	if (operation == Operation.MULTIPLY)
		return num1 * num2;
	if (num2 == 0) {
		System.out.println("Can't divide by 0");
		return 0;
	}
	return ((double) num1) / num2;
   }

    public static void main(final String[] args) {
        System.out.println(basicCalculator(Operation.DIVIDE, 1, 2));
    }
}

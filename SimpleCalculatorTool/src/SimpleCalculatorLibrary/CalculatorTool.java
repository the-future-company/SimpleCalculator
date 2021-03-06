package SimpleCalculatorLibrary;
import java.util.*;

public class CalculatorTool {

	public static void main(String[] args) {
		//Read from user input
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Select an operation:\n1)Addition\n2)Subtraction\n3)Multiplication\n4)Exponential\nYour selection: ");
		int selection = scan.nextInt(); 
		
		if(selection<0 || selection>4) {
			System.out.println("Your selection must be between 1 and 4");
			return;
		}
		
		System.out.print("Enter number 1: ");
		int number1 = scan.nextInt();
		
		System.out.print("Enter number 2: ");
		int number2 = scan.nextInt();
		
		int result;
		switch(selection) {
		case 1: //Addition
			result = SimpleAddition.Add(number1, number2);
			System.out.println("Result = " + result);
			break;
		case 2: //Subtraction
			result = SimpleSubtract.Subtract(number1, number2);
			System.out.println("Result = " + result);
			break;
		case 3: //Multiplication
			result = SimpleMultiplication.Multiply(number1, number2);
			System.out.println("Result = " + result);
			break;
		case 4: //Exponention
			result = ExponentialClass.Exp(number1, number2);
			System.out.println(result);
			break;
		default:
			scan.close();
			throw new IllegalArgumentException("Illegal selection for operation!");
		}
		scan.close();
	}

}

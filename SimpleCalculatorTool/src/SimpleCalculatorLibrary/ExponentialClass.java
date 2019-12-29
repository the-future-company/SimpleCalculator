package SimpleCalculatorLibrary;

public class ExponentialClass {

	public static int Exp(int a, int b) {
		
		int y=1;
		for(int x=0; x<b; x++) {
			y = SimpleMultiplication.Multiply(y, a);
		}
		return y;
	}
}

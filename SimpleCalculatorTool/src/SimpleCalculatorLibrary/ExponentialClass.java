package SimpleCalculatorLibrary;

public class ExponentialClass {

	public static int Exp(int a, int b) {
		//If 0 to 0 throw error
		if (a == 0 && b == 0)
			throw new IllegalArgumentException("Zero to zero-th power is unknown!");
		
		int y=1;
		for(int x=0; x<b; x++) {
			y = SimpleMultiplication.Multiply(y, a);
		}
		return y;
	}
}

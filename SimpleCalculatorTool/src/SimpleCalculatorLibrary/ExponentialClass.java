package SimpleCalculatorLibrary;

public class ExponentialClass {

	public static int Exp(int a, int b){
		
		if(a!=0) {
		int y=1;
		for(int x=0; x<b; x++) {
			y = SimpleMultiplication.Multiply(y, a);
		}
		return y;
		}else {
			throw new IllegalArgumentException("0 to 0th power is illegal");
		}
	}
//naber naptin nasilsin
}

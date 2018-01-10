/**
	Класс для вычисления операций: сложения, вычитания умнажения, деления. Значения берутся из входного масива  
*/
public class Calculate {
	public static void main(String[] arg) {
		System.out.println("Hello word");
		int first = Integer.valueOf(arg[0]);
		int second = Integer.valueOf(arg[1]);
		
		int resultAddition = first + second;
		int resultSubsraction = first - second;
		int resultMultiplicaton = first * second;
		int resultDivision = first / second;
		
		System.out.println("result " + resultAddition );
		System.out.println("result " + resultSubsraction);
		System.out.println("result " + resultMultiplicaton);
		System.out.println("result " + resultDivision);
		
	}
	
}

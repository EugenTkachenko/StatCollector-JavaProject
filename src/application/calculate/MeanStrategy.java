package application.calculate;


public class MeanStrategy implements CalculationStrategy{


	@Override
	public double calculate(int[] numbers) {
		int size = numbers.length;
		int sum = 0;
		for(Integer number: numbers) {
			sum+=number;
		}
		return ((double)sum)/size;
	}


	
	
	
}

package application.collector;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

import application.calculate.CalculationStrategy;

public class StatCollector {
	
	private final List<Integer> numberList = new ArrayList<Integer>();
	private CalculationStrategy calculationStrategy = null;
	private Double value = null;
	
	public StatCollector() {
	}
	public StatCollector(CalculationStrategy calculationStrategy) {
		setCalculationStrategy(calculationStrategy);
	}
	
	public void add(int number) {
		value = null;
		numberList.add(number);
	}

	public void add(int[] numbers) {
		value = null;
		for(Integer number: numbers) {
			numberList.add(number);
		}
	}

	
	public void setCalculationStrategy(CalculationStrategy calculationStrategy) {
		value = null;
		this.calculationStrategy = calculationStrategy;
	}
	
	
	public double getStatParameter() {
		if(numberList.isEmpty()) {
			throw new EmptyStackException();
		}
		
		if(value!=null) {
			return value;
		}
		
		if(calculationStrategy==null) {
			throw new NullPointerException();
		}
		
		int[] numbers = new int[numberList.size()];
		for(int i = 0; i<numbers.length; i++) {
			numbers[i]=numberList.get(i);
		}
		
		value = calculationStrategy.calculate(numbers);
		return value;
	}
	
	
	public boolean isEmpty() {
		return numberList.isEmpty();
	}
}

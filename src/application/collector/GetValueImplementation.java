package application.collector;

import java.util.EmptyStackException;

abstract class GetValueImplementation implements StatCollector{

	private Double value = null;
	
	protected abstract double calculate();
	protected abstract void addSome(int...numbers);

	
	@Override
	public void add(int number) {
		value = null;
		addSome(number);
	}
	
	
	@Override
	public void add(int[] numbers) {
		value = null;
		addSome(numbers);
	}
	
	@Override
	public double getStatParameter() throws EmptyStackException{
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		
		if(value==null) {
			value=calculate();
		}
		return value;
	}
	
	
	

}

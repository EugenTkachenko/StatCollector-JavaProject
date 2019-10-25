package application.collector;

public class MeanCollector extends GetValueImplementation{

	private int size = 0;
	private int sum = 0;


	@Override
	protected void addSome(int... numbers) {
		for(Integer number: numbers) {
			size++;
			sum+=number;
		}
	}


	@Override
	protected double calculate() {
		return ((double)sum)/size;
	}



	@Override
	public boolean isEmpty() {
		return size==0;
	}

	
	
	
}

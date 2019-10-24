package application.collector;

import java.util.EmptyStackException;

public class MeanCollector extends AddSomeImplementation{

	private int size = 0;
	private int sum = 0;
	
	@Override
	public void add(int number) {
		size++;
		sum+=number;
	}


	@Override
	public double getStatParameter() throws EmptyStackException{
		super.getStatParameter();
		
		return ((double)sum)/size;
		
	}


	@Override
	public boolean isEmpty() {
		return size==0;
	}
	
	
}

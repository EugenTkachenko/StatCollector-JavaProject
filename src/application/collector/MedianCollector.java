package application.collector;

import java.util.ArrayList;
import java.util.Collections;
import java.util.EmptyStackException;
import java.util.List;

public class MedianCollector extends AddSomeImplementation{

	private final List<Integer> numberList = new ArrayList<Integer>();
	
	
	@Override
	public void add(int number) {
		numberList.add(number);
	}


	@Override
	public double getStatParameter() throws EmptyStackException{
		super.getStatParameter();
		
		Collections.sort(numberList);
		
		int size = numberList.size();
		if(size%2!=0) {
			return size==1?numberList.get(0):numberList.get(size/2);
		}else {
			int half = size/2;
			int sum = numberList.get(half-1)+numberList.get(half);
			return ((double)sum)/2.0;
		}
		
	}


	@Override
	public boolean isEmpty() {
		return numberList.isEmpty();
	}

	
	
}

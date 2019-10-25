package application.calculate;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MedianStrategy implements CalculationStrategy{


	@Override
	public double calculate(int[] numbers) {
		List<Integer> numberList = new ArrayList<Integer>();
		for(Integer number: numbers) {
			numberList.add(number);
		}
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

	
}

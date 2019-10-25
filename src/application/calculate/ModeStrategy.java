package application.calculate;

import java.util.HashMap;
import java.util.Map;

public class ModeStrategy implements CalculationStrategy{


	@Override
	public double calculate(int[] numbers) {
		Map<Integer, Integer> numberFrequencyMap = new HashMap<Integer, Integer>();
		
		
		for(Integer number: numbers) {
			int frequency = numberFrequencyMap.containsKey(number)?(numberFrequencyMap.get(number)+1):1;
			numberFrequencyMap.put(number, frequency);
		}
		
		int mode = 0;
		int maxFrequency=0;
		for(Map.Entry<Integer, Integer> entrySet: numberFrequencyMap.entrySet()) {
			if(entrySet.getValue()>maxFrequency) {
				maxFrequency=entrySet.getValue();
				mode=entrySet.getKey();
			}
		}
		return mode;
	}

}

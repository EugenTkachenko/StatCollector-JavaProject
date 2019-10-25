package application.collector;

import java.util.HashMap;
import java.util.Map;

public class ModeCollector extends GetValueImplementation{

	private final Map<Integer, Integer> numberFrequencyMap = new HashMap<Integer, Integer>();

	
	@Override
	public void addSome(int...numbers) {
		
		for(Integer number: numbers) {
			int frequency = numberFrequencyMap.containsKey(number)?(numberFrequencyMap.get(number)+1):1;
			numberFrequencyMap.put(number, frequency);
		}
		
	}


	@Override
	protected double calculate() {
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

	
	@Override
	public boolean isEmpty() {
		return numberFrequencyMap.isEmpty();
	}
}

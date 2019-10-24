package application.collector;

import java.util.EmptyStackException;
import java.util.HashMap;
import java.util.Map;

public class ModeCollector extends AddSomeImplementation{

	private final Map<Integer, Integer> numberFrequencyMap = new HashMap<Integer, Integer>();

	
	@Override
	public void add(int number) {
		
		int frequency = numberFrequencyMap.containsKey(number)?(numberFrequencyMap.get(number)+1):1;
		
		numberFrequencyMap.put(number, frequency);
	}


	@Override
	public double getStatParameter() throws EmptyStackException{
		super.getStatParameter();
		
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

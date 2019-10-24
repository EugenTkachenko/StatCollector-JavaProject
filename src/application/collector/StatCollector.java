package application.collector;

public interface StatCollector {
	
	void add(int number);

	void add(int[] numbers);

	double getStatParameter();
	
	boolean isEmpty();
}

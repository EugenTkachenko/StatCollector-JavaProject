package application;

import java.util.Arrays;

import application.collector.MeanCollector;
import application.collector.MedianCollector;
import application.collector.ModeCollector;

public class Main {

	
	public static void main(String args[]) {
		
		MeanCollector meanCollector = new  MeanCollector();
		MedianCollector medianCollector = new MedianCollector();
		ModeCollector modeCollector = new ModeCollector();
		
		int[] numbers = new int[]{-2, 5, 7, 1, -4, 0, 3, 6, 3,-2, 10, 100, 3, 1, 16, 7, 9, 11};
		
		meanCollector.add(numbers);
		medianCollector.add(numbers);
		modeCollector.add(numbers);
		
//		int sum = 0;
//		for (int i = 0; i < numbers.length; i++) {
//			sum+=numbers[i];
//		}
//		double mean = (double)sum/numbers.length;
//		System.out.println("mean: "+mean);
		
		System.out.println("Numbers: "+Arrays.toString(numbers));
		System.out.println();
		System.out.println("Mean : "+meanCollector.getStatParameter());
		System.out.println("Median : "+medianCollector.getStatParameter());
		System.out.println("Mode : "+modeCollector.getStatParameter());
		
		
	}
	
	
	
}

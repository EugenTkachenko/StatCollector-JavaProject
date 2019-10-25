package application;

import java.util.Arrays;

import application.calculate.MeanStrategy;
import application.calculate.MedianStrategy;
import application.calculate.ModeStrategy;
import application.collector.StatCollector;

public class Main {

	
	public static void main(String args[]) {
		
		StatCollector statCollector = new StatCollector();
		
		int[] numbers1 = new int[15];
		for(int i=0; i<numbers1.length; i++) {
			numbers1[i]=random(-5, 50);
		}
		
		
		System.out.println("Numbers: "+Arrays.toString(numbers1));
		System.out.println();
		
		statCollector.add(numbers1);
		printStatParameters(statCollector);
		
		
		int[] numbers2 = new int[16];
		for(int i=0; i<numbers1.length; i++) {
			numbers2[i]=random(-5, 10);
		}
		
		System.out.println();
		System.out.print("Numbers: "+Arrays.toString(numbers1));
		System.out.println(","+Arrays.toString(numbers2));
		System.out.println();
		
		statCollector.add(numbers2);
		printStatParameters(statCollector);
		
		
	}
	
	
	static MeanStrategy meanStrategy = new MeanStrategy();
	static MedianStrategy medianStrategy = new MedianStrategy();
	static ModeStrategy modeStrategy = new ModeStrategy();
	
	static void printStatParameters(StatCollector statCollector) {
		
		statCollector.setCalculationStrategy(meanStrategy);
		System.out.println("Mean : " + statCollector.getStatParameter());
		
		statCollector.setCalculationStrategy(medianStrategy);
		System.out.println("Median : " + statCollector.getStatParameter());
		
		statCollector.setCalculationStrategy(modeStrategy);
		System.out.println("Mode : "+statCollector.getStatParameter());
		
	}
	
	
	static int random(int from, int to) {
		return from+(int)(to*Math.random());
	}
}

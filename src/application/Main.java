package application;

import java.util.Arrays;

import application.collector.MeanCollector;
import application.collector.MedianCollector;
import application.collector.ModeCollector;
import application.collector.StatCollector;

public class Main {

	
	public static void main(String args[]) {
		
		MeanCollector meanCollector = new  MeanCollector();
		MedianCollector medianCollector = new MedianCollector();
		ModeCollector modeCollector = new ModeCollector();
		
		int[] numbers1 = new int[15];
		for(int i=0; i<numbers1.length; i++) {
			numbers1[i]=random(-5, 50);
		}
		
		
		System.out.println("Numbers: "+Arrays.toString(numbers1));
		System.out.println();
		
		meanCollector.add(numbers1);
		printStatParameter(meanCollector);
		
		medianCollector.add(numbers1);
		printStatParameter(medianCollector);
		
		modeCollector.add(numbers1);
		printStatParameter(modeCollector);
		
		
		int[] numbers2 = new int[16];
		for(int i=0; i<numbers1.length; i++) {
			numbers2[i]=random(-5, 10);
		}
		
		System.out.println();
		System.out.print("Numbers: "+Arrays.toString(numbers1));
		System.out.println(","+Arrays.toString(numbers2));
		System.out.println();
		
		meanCollector.add(numbers2);
		printStatParameter(meanCollector);
		
		medianCollector.add(numbers2);
		printStatParameter(medianCollector);
		
		modeCollector.add(numbers2);
		printStatParameter(modeCollector);
		
	}
	
	
	
	static void printStatParameter(StatCollector statCollector) {
		
		if(statCollector instanceof MeanCollector) {
			System.out.println("Mean : "+statCollector.getStatParameter());
		}else if(statCollector instanceof MedianCollector){
			System.out.println("Median : "+statCollector.getStatParameter());
		}else if(statCollector instanceof ModeCollector) {
			System.out.println("Mode : "+statCollector.getStatParameter());
		}
		
	}
	
	
	static int random(int from, int to) {
		return from+(int)(to*Math.random());
	}
}

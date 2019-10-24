package application.collector;

import java.util.EmptyStackException;

abstract class BaseImplementation implements StatCollector{



	@Override
	public double getStatParameter() throws EmptyStackException{
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		return 0.0;
	}
	
	
	

}

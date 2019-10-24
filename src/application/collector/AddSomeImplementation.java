package application.collector;

abstract class AddSomeImplementation extends BaseImplementation{


	@Override
	public void add(int[] numbers) {
		for(Integer number: numbers) {
			add(number);
		}
	}

	
	

}

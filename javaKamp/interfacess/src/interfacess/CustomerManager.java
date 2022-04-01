package interfacess;

public class CustomerManager {
	private Logger[] loggers;
	
	public CustomerManager(Logger[] loggers) {
	
		this.loggers = loggers;
	}

	//loosly- tightly coupled
	public void add(Customer customer) {
		System.out.println("m��teri eklendi"+ customer.getFirstName());
		
		
		Utils.RunLoggers(loggers, customer.getFirstName());

	}
		
	 
	
	public void delete(Customer customer) {
		System.out.println("m��teri silindi"+ customer.getFirstName());
		
		
		
	}

}

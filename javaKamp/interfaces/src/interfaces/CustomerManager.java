package interfaces;

public class CustomerManager {
	
	private Logger logger;
	//loosly - tightly coupled
   
	public CustomerManager(Logger logger) {
		super();
		this.logger = logger;
	}

	public void add(Customer customer) {
	   System.out.println("müþteri eklendi"+ customer.getFirstName());
	   
	   this.logger.log(customer.getFirstName());
   }
	
   public void delete(Customer customer) {
	   System.out.println("müþteri silindi"+ customer.getFirstName());
	   DatabaseLogger logger = new DatabaseLogger();
	    logger.log(customer.getFirstName()+ "veri tabanýna loglandý");
   }
}

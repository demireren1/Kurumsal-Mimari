package interfaces;

public class CustomerManager {
	
	private Logger logger;
	//loosly - tightly coupled
   
	public CustomerManager(Logger logger) {
		super();
		this.logger = logger;
	}

	public void add(Customer customer) {
	   System.out.println("m��teri eklendi"+ customer.getFirstName());
	   
	   this.logger.log(customer.getFirstName());
   }
	
   public void delete(Customer customer) {
	   System.out.println("m��teri silindi"+ customer.getFirstName());
	   DatabaseLogger logger = new DatabaseLogger();
	    logger.log(customer.getFirstName()+ "veri taban�na logland�");
   }
}

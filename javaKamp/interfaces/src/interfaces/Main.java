package interfaces;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CustomerManager customerManager = new CustomerManager(new DatabaseLogger());
		
		Customer engin = new Customer(1," Engin","Demiro�");
		customerManager.add(engin);

	}

}

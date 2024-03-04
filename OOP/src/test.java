import java.util.Date;

public class test {

	public static void main(String[] args) {
		Customer customer = new Customer("John");
		Customer customer1 = new Customer("Peter");
		customer.setMemberType("Gold");
		customer.setMemberType("Premium");
		
		System.out.println(customer.toString());
		
		Visit v1 = new Visit(customer, new Date());
		
		System.out.println(v1.toString());
		
		v1.setProductExpense(5000);
		v1.setServiceExpense(6000);
		
		System.out.println(v1.getProductExpense());
		System.out.println(v1.getServiceExpense());
		System.out.println(v1.getTotalExpense());
		
	}

}

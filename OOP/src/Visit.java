import java.util.Date;

public class Visit{
	Customer customer;
	Date date;
	double serviceExpense;
	double productExpense;
	
	public Visit(Customer customer, Date date) {
		this.customer = customer;
		this.date = date;
	}
	
	public String getName() {
		return customer.getName();
	}

	public double getServiceExpense() {
		return serviceExpense;
	}

	public void setServiceExpense(double ex) {
		this.serviceExpense = ex;
	}

	public double getProductExpense() {
		return productExpense;
	}

	public void setProductExpense(double ex) {
		this.productExpense = ex;
	}
	
	public double getTotalExpense() {
		return serviceExpense + productExpense - 
				(serviceExpense * discountRate.getServiceDiscountRate(customer.getMemberType())
				+ productExpense * discountRate.getProductDiscountRate(customer.getMemberType()));
	}

	@Override
	public String toString() {
		return "Visit [customer=" + customer + ", date=" + date + ", serviceExpense=" + serviceExpense
				+ ", productExpense=" + productExpense + "]";
	}
	
	
}


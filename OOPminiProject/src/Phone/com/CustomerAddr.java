package Phone.com;

public class CustomerAddr extends Addr {
	private String customer;
	private String product;
	private String level;
	
	public CustomerAddr(String name, String phone, String email, String address, String group,
			String customer, String product, String level) {
		super(name, phone, email, address, group);
		this.customer = customer;
		this.product = product;
		this.level = level;
	}
	
	@Override
	public void printInfo() {
		super.printInfo();
		System.out.printf("거래처이름: %s\n", customer);
		System.out.printf("품목이름: %s\n", product);
		System.out.printf("직급: %s\n", level);
	}
	
	public String getCustomer() {
		return customer;
	}
	public void setCustomer(String customer) {
		this.customer = customer;
	}
	
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
}

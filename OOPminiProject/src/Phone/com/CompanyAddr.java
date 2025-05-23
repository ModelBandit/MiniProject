package Phone.com;

public class CompanyAddr extends Addr {
	private String company;
	private String department;
	private String level;
	
	public CompanyAddr(String name, String phone, String email, String address, String group,
			String company, String department, String level) {
		super(name, phone, email, address, group);
		this.company = company;
		this.department = department;
		this.level = level;
	}
	
	@Override
	public void printInfo() {
		super.printInfo();
		System.out.printf("회사이름: %s\n", company);
		System.out.printf("부서이름: %s\n", department);
		System.out.printf("직급: %s\n", level);
	}
	
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
}

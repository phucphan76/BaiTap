
public class Customer {
    private String name;
    private Boolean member=false;
    private String memberType;

    public Customer(String name){
        this.name=name;
    }

	public Customer(String name, Boolean member, String memberType) {
		this.name = name;
		this.member = member;
		this.memberType = memberType;
	}

	public String getName() {
		return name;
	}

	public Boolean isMember() {
		return member;
	}

	public void isMember(Boolean member) {
		this.member = member;
	}

	public String getMemberType() {
		return memberType;
	}

	public void setMemberType(String memberType) {
		this.memberType = memberType;
		this.member = true;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", member=" + member + ", memberType=" + memberType + "]";
	}
	
	
	
    
}

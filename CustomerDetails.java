package map;

public class CustomerDetails {
	
	private String name;
	private int age;
	private String email;
	
	private int accountbalance;
	private long adhaarNo;
	
  CustomerDetails(String name, int age, String email, int accountbalance, long adhaarNo) 
	{
		
		this.name =name;
		this.age =age;
		this.email =email;
		this.accountbalance =accountbalance;
		this.adhaarNo =adhaarNo;
	}
  
  
  public void setName(String name)
  {
		this.name = name;
  }

   public String getName() 
  {
	    return name;
   }
   public void setAge(int age) 
   {
		this.age = age;
   }

   public int getAge() 
   {
	return age;
   }

   public String getEmail() 
   {
	return email;
   }

  public void setEmail(String email) 
  {
	this.email = email;
    }

  public int getAccountbalance() 
   {
	return accountbalance;
   }

   public void setAccountbalance(int accountbalance) 
  {
	this.accountbalance = accountbalance;
  }

    public long getAdhaarNo()
  {
	return adhaarNo;
  }

  public void setAdhaarNo(long adhaarNo) 
  {
	this.adhaarNo = adhaarNo;
  }



public String toString() {
	return "CustomerDetails [name=" + name + ", age=" + age + ", email=" + email + ", accountbalance=" + accountbalance
			+ ", adhaarNo=" + adhaarNo + "]";
}

  
  
  
  
	
	
	

}

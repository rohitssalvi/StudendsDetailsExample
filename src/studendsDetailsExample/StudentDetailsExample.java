package studendsDetailsExample;

public class StudentDetailsExample {
	
	public static void main(String[] args) {
		
		Details d=new Details();
		d.pushStudentsDetails(1, "Rohit", "Q2w3erdr4555");
		d.displayStudentsDetails();
		
	}

}

abstract class Students{
	
	int rollNo;
	String sName;
	String sRegistrationNumber;
	
    public void pushStudentsDetails(int ID,String Name,String RegistrationNumber)
    {
    	rollNo=ID;
    	sName=Name;
    	sRegistrationNumber=RegistrationNumber;
    	
    }
    
    abstract public Void displayStudentsDetails();
    
    
	
	
}

class Details extends Students
{
	

	@Override
	public Void displayStudentsDetails() {
		System.out.println("Student Details is:\n"+rollNo+"\n"+sName+"\n"+sRegistrationNumber);
		return null;
	}
	
}

package org.emp;
//based data type count
public class Empolyee {

	private void empId(String name)
      {
    	  System.out.println("EmpName:"+name);
      }
    	  private void empId(int age ,String Address )
    	  {
			System.out.println("Empphno: "+age );
			System.out.println("EmpAddress:"+Address);
    	  }
    	  
    	  private void empId(float salary,long pfno)
    	  {                       
    	   System.out.println("Empsalary:"+salary);
    	   System.out.println("Emppfno:"+pfno);
    	  }
    	   public static void main(String[]args) {
    	   Empolyee e=new Empolyee();
		   e.empId("naveen");
		   e.empId(25, "London");
		   e.empId(100000f, 12390899);
    	   }
}
      

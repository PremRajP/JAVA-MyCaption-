class Employee{
	  private String name, address;
	  private int year, salary;
	  public Employee(String n, int y, int sal, String add){
	    name = n;
	    year = y;
	    salary = sal;
	    address = add;
	  }
	  public String getName(){
	    return name;
	  }
	  public int getYear(){
	    return year;
	  }
	  public int getSalary(){
	    return salary;
	  }
	  public String getAddress(){
	    return address;
	  }
	}

	public class Main{
	  public static void main(String[] args){
	    Employee e1 = new Employee("Robert", 1994, 500000, "Chennai");
	    System.out.println("Name\tYear of joining\tSalary\tAddress");
	    System.out.println(e1.getName()+"\t"+e1.getYear()+"\t\t"+e1.getSalary()+"\t"+e1.getAddress());   }
	}

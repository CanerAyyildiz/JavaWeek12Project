package constructors;

public class Employee {

 public class Employee {
  public String name,jobTitle;
  public int ID;
  public double salary;             // instance variable, belongs to Object
  public static String companyName; // static field belongs to Class

  static {
   companyName="Microsoft";
  }

  public Employee() {
   salary = 10000;
  }

  public Employee(String n, String jobTitle, int ID, double salary) {
   name = n;
   this.jobTitle = jobTitle;
   this.ID = ID;
   this.salary = salary;
  }}




  /*  Task 1:
    Employee:
    attribute/fields/variables
            name, jobTitle, ID, salary

    add a constructor to initialize all the fields
    add a default constructor with no fields

    toString() method will rint out the fields
 */
 }

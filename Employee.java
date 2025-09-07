import java.util.Scanner;
class Emp {
    String name;
    int age;
    double salary;
    String department;
    Emp(String name,int age,double salary,String department){
        this.name=name;
        this.age=age;
        this.salary=salary;
        this.department=department;
    }
    void display(){
        System.out.println("Name:" +name);
        System.out.println("Age:" +age);
        System.out.println("Salary:" +salary);
        System.out.println("Department:" +department);
        System.out.println("------------------------------");
    }
}
public class Employee{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Emp[] employees=new Emp[5];
        for(int i=0;i<5;i++){
            System.out.println("Enter details for Employee:" +(i+1));

            System.out.println("Enter Name:");
            String name=sc.nextLine();

            System.out.println("Enter Age:");
            int age=sc.nextInt();

            System.out.println("Enter Salary:");
            double salary=sc.nextDouble();
            sc.nextLine();

            System.out.println("Enter Department:");
            String department=sc.nextLine();

            employees[i]=new Emp(name,age,salary,department);
        }
        System.out.println("\n Employee Details:");
        for(Emp emp: employees){
            emp.display();
        }
        sc.close();
    }
} 

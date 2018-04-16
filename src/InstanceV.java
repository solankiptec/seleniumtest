/**
 * Created by Welcome on 24/07/2017.
 */
public class InstanceV {
       public String name;
       private double Salary;
    public InstanceV(String insname){
        name = insname;
    }
    public void setSalary(double inssal){
        Salary = inssal;
    }
    public void printins(){
        System.out.println("name  :" +name);
        System.out.println("Salary :" +Salary);
    }
    public static void main(String[]args){
        InstanceV insone= new InstanceV("radhika");
        insone.setSalary(145667777);
        insone.printins();
    }
}

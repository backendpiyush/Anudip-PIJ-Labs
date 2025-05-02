package lab_1;

public class Employee {
    protected int id;
    protected int age;
    protected boolean isPermanent;

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.age = (int)35.5;
        System.out.println("Successfully started");
    }
}

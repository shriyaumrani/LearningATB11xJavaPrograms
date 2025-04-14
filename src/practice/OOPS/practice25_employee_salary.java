package practice.OOPS;

public class practice25_employee_salary {
    public static void main(String[] args) {
        employee e1 = new employee();
        e1.setSalary(78000.90);
        System.out.println(e1.getSalary());
    }


}


class employee{
    private double salary;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
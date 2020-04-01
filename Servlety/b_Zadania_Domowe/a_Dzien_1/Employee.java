package b_Zadania_Domowe.a_Dzien_1;


public class Employee implements Comparable<Employee> {
    private String name;
    private Double salary;
    private String contract;

    public Employee(String name, Double salary, String contract) {
        this.name = name;
        this.salary = salary;
        this.contract = contract;
    }

    public String getName() {
        return name;
    }

    public Double getSalary() {
        return salary;
    }

    @Override
    public int compareTo(Employee employee) {
        return (int) (this.salary - employee.getSalary());
    }


    @Override
    public String toString() {
        return String.format("%s %s %s", this.name, this.salary, this.contract);
    }
}


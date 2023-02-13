package MapSortingBasedOnValues;

public class Employee {
    int id;
    String name;

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    Employee(int id, String name)
    {
        this.id=id;
        this.name=name;
    }
}

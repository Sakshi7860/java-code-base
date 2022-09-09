package stream;

public class Employee implements Comparable {
    int id;
    String name;
    int age;

    public Employee(int id, String name, int age, String gender, String dept, int year, int salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.dept = dept;
        this.year = year;
        this.salary = salary;
    }

    String gender;

    String dept;
    int year;
    int salary;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", dept='" + dept + '\'' +
                ", year=" + year +
                ", salary=" + salary +
                '}';
    }
    @Override
    public int compareTo(Object o) {
        Employee emp=(Employee) o;
        if(this.age<emp.getAge())
            return -1;
        else
            return 1;
    }
}

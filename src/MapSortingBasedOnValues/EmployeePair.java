package MapSortingBasedOnValues;

public class EmployeePair implements Comparable<EmployeePair> {
    Employee employee;
    Integer value;
    EmployeePair(Employee employee,Integer val)
    {
        this.employee=employee;
        this.value=val;
    }
    public int compareTo(EmployeePair pair){
        return this.value.compareTo(pair.value);
    }

}

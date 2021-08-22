package sortingobjects;

import java.util.Set;
import java.util.TreeSet;

public class Test {

    public static void main(String[] args) {
        Set<Employee> empSet = new TreeSet<>(new EmployeeNameComparator());
        empSet.add(new Employee(123,"raghav"));
        empSet.add(new Employee(100,"aarav"));
        empSet.add(new Employee(300,"shalini"));
        empSet.add(new Employee(223,"shanky"));

        for (Employee emp:empSet) {
            System.out.println("\n ID :\t"+emp.id+"\t Name :\t"+emp.name);

        }

    }
}

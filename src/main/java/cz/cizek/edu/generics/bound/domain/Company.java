package cz.cizek.edu.generics.bound.domain;

import lombok.Builder;
import lombok.Singular;

import java.util.List;
import java.util.stream.Collectors;

@Builder
public class Company {

    @Singular
    private final List<Employee> employees;

    /*
    if it was called with a list which contains only one subtype of Employee
    -> list of that type will be returned. Otherwise a list of Employee will be return
     */
    public <T extends Employee> List<T> findAll(List<T> source) {

        var validEmployee = source.stream()
                                  // all elements in list can be considered as Employee because of `extends`
                                  .filter(this::isValid)
                                  .collect(Collectors.toList());

        return validEmployee.stream()
                     .filter(employees::contains)
                     .collect(Collectors.toList());
    }

    private boolean isValid(Employee employee) {

        System.out.println("check if employee is not a criminal");

        return true;
    }
}

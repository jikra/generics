package cz.cizek.edu.generics.bound.domain;

import cz.cizek.edu.generics.bound.Identity;
import lombok.Getter;

@Getter
public abstract class Employee implements Identity<Employee> {

    private final String id;

    public Employee(String id) {

        this.id = id;
    }

    @Override
    public boolean isIdentically(Employee source) {

        return id.equals(source.id);
    }
}

package cz.cizek.edu.generics.bound.domain;

import lombok.Builder;
import lombok.Getter;

@Getter
public class BadEmployee extends Employee {

    @Builder
    public BadEmployee(String id) {

        super(id);
    }

    void doItSlowly() {

        System.out.println("do it slowly");
    }
}

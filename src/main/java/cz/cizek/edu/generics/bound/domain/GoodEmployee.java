package cz.cizek.edu.generics.bound.domain;

import lombok.Builder;
import lombok.Getter;

@Getter
public class GoodEmployee extends Employee {

    @Builder
    public GoodEmployee(String id) {

        super(id);
    }

    void doItFaster() {

        System.out.println("do it faster");
    }
}

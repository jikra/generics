package cz.cizek.edu.generics.bound;

import cz.cizek.edu.generics.bound.domain.BadEmployee;
import cz.cizek.edu.generics.bound.domain.Company;
import cz.cizek.edu.generics.bound.domain.Employee;
import cz.cizek.edu.generics.bound.domain.GoodEmployee;
import org.junit.jupiter.api.Test;

import java.util.List;

public class CompanyUpperBound {

    @Test
    void findAll_shouldReturnAsSpecificTypeAsPossible() {

        var jikra = new BadEmployee("jikra");
        var david = new GoodEmployee("david");

        var company = Company.builder()
                             .employee(jikra)
                             .employee(david)
                             .build();

        //both return types are possible because of 'extend'
        List<Employee> employees = company.findAll(List.of(jikra));
        List<BadEmployee> badEmployees = company.findAll(List.of(jikra));

        company.findAll(List.of(jikra, david)).forEach(System.out::println);
    }
}

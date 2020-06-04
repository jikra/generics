package cz.cizek.edu.generics.bound;

import cz.cizek.edu.generics.bound.domain.BadEmployee;
import cz.cizek.edu.generics.bound.domain.GoodEmployee;
import org.junit.jupiter.api.Test;

import java.util.List;

public class IdServiceLowerBound {

    @Test
    void test() {

        var jikra = new BadEmployee("jikra");
        var badEmployees = List.of(new BadEmployee("jikra"));
        var goodEmployees = List.of(new GoodEmployee("david"));

        IdService.containsBaseOnIdentity(badEmployees, jikra);
    }
}

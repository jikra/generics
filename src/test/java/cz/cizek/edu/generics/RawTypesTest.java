package cz.cizek.edu.generics;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class RawTypesTest {

    @Test
    void rawType() {

        List rawList = new ArrayList<>();

        /*
        anything can be add
         */
        rawList.add("1");
        rawList.add(1);
        rawList.add(new Object());

        /*
        anything can be add, BUT its typesafe -> see below
         */
        List<Object> objectList = new ArrayList<>();

        objectList.add("1");
        objectList.add(1);
        objectList.add(new Object());


        List<String> stringsList = objectList; // cant assign list of object to list of string
        stringsList = rawList; // raw list can be assign to list of string -> which is quite dangerous
    }
}

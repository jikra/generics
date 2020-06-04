package cz.cizek.edu.generics;

import java.util.ArrayList;
import java.util.List;

public class ErasureDrawbacksTest {

    void cantTestInstance() {

        List<String> list = new ArrayList<>();

        if (list instanceof List<String>) { // Not possible -> List<?> can be used to test if its a list

        }
    }

    interface Overloading {

        String doIt(String input);

        String doIt(int input);

        //cant overload method because after erasure it will be List<Object>
        //which is the same as the other method signature
        String doIt(List<String> in);

        String doIt(List<Integer> in);
    }

    class CantInstantiateGeneric<T> {

        public T doIt() {

            return new T(); //Not possible because after erasure it would be smth like 'new Object()'
        }
    }
}

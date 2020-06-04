package cz.cizek.edu.generics.bound;

import java.util.List;

public class LuckyDip {

    /*
    List of ? can be used here because the functionality does not depend on type of list.
    Functionality only depends on object type and its the same for any generic type which can be used.
     */
    public int drawIndex(List<?> source) {

        //some fancy actions can be there (log etc..)
        var max = source.size() - 1;
        var min = 0;

        return (int) (Math.random() * (max - min) + min);
    }
}

package cz.cizek.edu.generics.base;

import java.util.function.Function;

/**
 * simulate "creation" of T object. E.g deserialization or smth like that
 */
public class Loader<T> {

    public static <T> T load(String source, Function<String, T> map) {

        return map.apply(source);
    }

    public T loadIt(String source, Function<String, T> map) {

        return map.apply(source);
    }
}

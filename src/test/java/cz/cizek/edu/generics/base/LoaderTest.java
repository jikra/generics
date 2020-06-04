package cz.cizek.edu.generics.base;

import org.junit.jupiter.api.Test;

public class LoaderTest {

    @Test
    void loadTest() {

        var userLoader = new Loader<User>();

        var user = userLoader.loadIt("ahoj", User::new);

        System.out.println(user);
    }

    @Test
    void staticLoadTest() {

        User user = Loader.load("ahoj", User::new);
        Car car = Loader.load("ahoj", source -> new Car(source, "def"));

        System.out.println(user);
        System.out.println(car);
    }
}

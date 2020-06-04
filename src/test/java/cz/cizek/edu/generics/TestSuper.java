//package cz.cizek.edu.generics;
//
//import org.junit.jupiter.api.Test;
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;
//
//public class TestSuper {
//
//    @Test
//    void test() {
//
//
//        var b = new B();
//        var b1 = new B();
//        var a = new A();
//        var a1 = new A();
//
//        var stringDecorator = new Decorator<String>();
//        var integerDecorator = new Decorator<Integer>();
//        var aDecorator = new Decorator<A>();
//        var bDecorator = new Decorator<B>();
//
//        testIt(stringDecorator);
//        testIt(integerDecorator);
//        testIt(aDecorator);
//                testIt(bDecorator);
//    }
//
//    public <T extends Comparable<T>> void testIt(Decorator<T> t) {
//
//    }
//
//    @Test
//    public void tt() {
//
////        var aa = new AA();
////        var bb = new BB();
////        var cc = new CC();
////        var serviceId = new ServiceId();
////        var identities = List.of(aa, bb, cc);
////
////        serviceId.contains(identities, aa);
////        serviceId.contains(identities, bb);
////        serviceId.contains(identities, cc);
//    }
//
//    @Test
//    public void t() {
//
//        List<User> users = new ArrayList<>();
//        List<LazyUser> lazyUsers = new ArrayList<>();
//        var aloneUser = new AloneUser();
//
//        var user = new User();
//        var lazyUser = new LazyUser();
//
//        contains(users, user);
//        contains(users, lazyUser);
//
//
////        contains(lazyUsers, aloneUser);
//        contains(lazyUsers, user);
//    }
//
//    ///////////////////////////////////////////////////////////////////////////////////////////
//
//    public <T> boolean contains(List<T> users, Identity<? super T> data) {
//
//        return users.stream()
//                    .anyMatch(user -> data.isId(user));
//    }
//
//    public interface Identity<T> {
//
//        boolean isId(T t);
//    }
//
//    public static class ServiceId {
//
//        //        public boolean contains(Identity<Object> identity) { -> nejde protože to nejsou objecty a "nededi se"
//        //        public boolean contains(Identity<?> identity) { -> nejde protože když je i data ? tak ? v data a ? tady může znamenat uplne neco jineho.. tedy nekompatibilni
//        public <T extends Identity<? super T>> boolean contains(List<T> source, T identity) {
//
//            return source.stream()
//                         .anyMatch(identity1 -> identity1.isId(identity));
//        }
//    }
//
//    //////////////////////////////////////////////////////
//
//    public class Decorator<T> {
//
//    }
//
//    public class B extends A {
////
////        public <TYPE> TYPE test(Class<TYPE> tClass) {
////
////        }
//    }
//
//    public class A implements Comparable<A> {
//
//        @Override
//        public int compareTo(A o) {
//
//            return 0;
//        }
//    }
//
//    public class User implements Identity<User> {
//
//        private String name;
//
//        @Override
//        public boolean isId(User user) {
//
//            return name.equals(user.name);
//        }
//    }
//
//    public class LazyUser extends User {
//
//    }
//
//    public class AloneUser implements Identity<AloneUser> {
//
//        @Override
//        public boolean isId(AloneUser aloneUser) {
//
//            return false;
//        }
//    }
//}
//
//
//
////    c. Unbounded Wildcard in Java
////    It is specified using Java wildcard character (?). This is called the unknown type list.  Main uses are –
////
////    While writing a method whose functionality can be used or provided in an object class.
////    While using a generic code that doesn’t depend on the type parameter.
////    Unbounded Wildcard in Java example-
////
////    import java.util.Arrays;
////    import java.util.List;
////class unboundedwildcardemo
////{
////    public static void main(String[] args)
////    {
////        List<Integer> list1= Arrays.asList(1,2,3);
////        List<Double> list2=Arrays.asList(1.1,2.2,3.3);
////        printlist(list1);
////        printlist(list2);
////    }
////    private static void printlist(List<?> list)
////    {
////        System.out.println(list);
////    }
//

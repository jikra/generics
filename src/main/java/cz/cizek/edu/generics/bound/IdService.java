package cz.cizek.edu.generics.bound;

import java.util.List;

public class IdService {

    // __5__
    public static <T extends Identity<? super T>> boolean containsBaseOnIdentity(List<T> source, T identity) {

        return source.stream()
                     .anyMatch(t -> t.isIdentically(identity));
    }


    /*
    // __4__  - nefunguje když list je child 1 a identity je child 2
    public static <T extends Identity<T>> boolean containsBaseOnIdentity(List<T> source, T identity) {

        return source.stream()
                     .anyMatch(t -> t.isIdentically(identity));
    }
    */

    /*
    // __3__
    public static <T extends Identity<?>> boolean containsBaseOnIdentity(List<T> source, T identity) {

        return source.stream()
                     .anyMatch(t -> t.isIdentically(identity));  <- identity typu unknow tu nevyhovuje
    }
    */


   /*
    //__2__   -  List ve skutečnosti obsahuje ty identity objecty takže je třeba dodefinovat T
    public static <T> boolean containsBaseOnIdentity(List<T> source, Identity<T> identity) {

        return source.stream()
                     .anyMatch(identity::isIdentically);
    }
*/

/* __1__ ? a ? není stejný typ takže to nefunguje
    public boolean containsBaseOnIdentity(List<?> source, Identity<?> identity) {

        return source.stream()
                     .anyMatch(o -> identity.isIdentically(o));
    }
 */
}

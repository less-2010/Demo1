package day18.se03.n1Collection.Generic;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * 鸟类
 * @param <E>
 */
public class Bird<E> implements Act<E> {
    @Override
    public String toString() {
        return "Bird";
    }

    @Override
    public void add(E e) {

    }

}

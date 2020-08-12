package day18.se03.n1Collection.homework;

import java.util.Objects;

public class Count {
    public Count(String string) {
        this.string = string;
        for (char c:string.toCharArray()) {
            System.out.println(c);

        }
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Count count = (Count) o;
        return Objects.equals(string, count.string);
    }

    @Override
    public int hashCode() {
        return Objects.hash(string);
    }

    private String string;



}

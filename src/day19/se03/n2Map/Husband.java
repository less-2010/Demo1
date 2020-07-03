package day19.se03.n2Map;

import java.util.Objects;

public class Husband {
    String name;

    @Override
    public String toString() {
        return name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Husband husband = (Husband) o;
        return name.equals(husband.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public Husband() {
    }

    public Husband(String name) {
        this.name = name;
    }
}

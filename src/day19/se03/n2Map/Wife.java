package day19.se03.n2Map;

public class Wife {
    private String name;

    public Wife() {
        super();
    }

    public Wife(String name) {
        this.name = name;
    }

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
}

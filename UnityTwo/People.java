package UnityTwo;

public class People {
    private String name;
    private int age;
    private String gender;
    private double height;

    // constructor meth
    public void People(String name, int age, String gender, double height) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.height = height;
    }

    // constructor with out params
    public People() {
        // empety
    }

    // just two params;
    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }

}

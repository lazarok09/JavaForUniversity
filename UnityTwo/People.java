package UnityTwo;

public class People {
    protected String name;
    private int age;
    private String gender;
    private double height;
    private boolean authorization;

    // constructor meth

    public void People(String name, int age, String gender, double height) {
        setName(name);
        setAge(age);
        setGender(gender);
        setHeight(height);
    }

    // just two params;
    public void People(String name, int age) {
        setAge(age);
        setName(name);
    }

    // constructor with out params
    public void People() {
        // empety
    }

    public void status() {
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.gender);
        System.out.println(this.height);
    }

    // methds getters and setters
    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String getGender() {
        return this.gender;
    }

    public double getHeight() {
        return this.height;
    }

    public String setName(String name) {
        return this.name = name;
    }

    public String setGender(String gender) {
        return this.gender = gender;
    }

    public double setHeight(double height) {
        return this.height = height;
    }

    public int setAge(int age) {
        return this.age = age;
    }

}

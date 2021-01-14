package Lesson2.Exercices;

public class Phone {
    String color;
    String model;
    float batery = 100;
    boolean on = true;
    String display;

    // methods
    void turnOn() {
        this.on = true;
        this.display = "display is on";
    }

    void turnOff() {
        this.on = false;
        this.display = "display is off";
    }

    void restart() {
        if (this.on == false) {
            System.out.println("cannot restart a off phone | please turn on !");
        } else {
            System.out.println("Restarting phone");
        }
    }

    void phoneStats() {
        System.out.println("You have a " + this.model + " on color " + this.color);
        System.out.println("  You got " + this.batery + " % of batery");
        System.out.println(" is he turn on ? " + this.on);
        System.out.println(" the display is on ? " + this.display);
    }
}

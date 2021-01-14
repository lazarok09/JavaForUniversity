public class Pen {
    String model;
    String color;
    float tip;
    int charge = 90;
    boolean capped;

    void stats() {
        System.out.print("One pen " + this.color);
        System.out.print(" the model is " + this.model);
        System.out.println(" and tip " + this.tip);
        System.out.println(", is that capped? " + this.capped);
        System.out.println("opering with " + this.charge + "% of ink");
    }

    void scribble() {
        if (this.capped == true) {
            System.out.println("ERROR: cannot write with a capped pen");
        } else {
            System.out.println("doodling | rabiscando");
        }
    }

    void cap() {
        this.capped = true;
    }

    void uncap() {
        this.capped = false;
    }
}

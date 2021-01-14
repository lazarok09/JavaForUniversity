package Lesson2;

public class Lesson2 {
    public static void main(String[] args) {
        Pen pen = new Pen();
        pen.model = "Castle Factory from Brazil";
        pen.color = "blue";
        pen.tip = 0.5f;
        pen.capped = true;
        pen.charge = 10;
        pen.uncap();
        pen.stats();
        pen.scribble();
        /* creating a new pen */
        Pen pinkpen = new Pen();
        pinkpen.model = "BIC";
        pinkpen.color = "pink";
        pinkpen.tip = 1f;
        pinkpen.capped = false;
        pinkpen.charge = 20;
        // Show the pink pen :D
        pinkpen.stats();

        /* factory pen, how is our mode of factory? */
        Pen factory = new Pen();
        factory.stats();
    }
}

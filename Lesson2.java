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
        // go to method's
        pinkpen.stats();

        /* factory pen */
        Pen factory = new Pen();
        factory.stats();
    }
}

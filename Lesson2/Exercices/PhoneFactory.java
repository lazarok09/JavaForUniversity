package Lesson2.Exercices;

public class PhoneFactory {
    public static void main(String[] args) {
        Phone iphone = new Phone();
        iphone.model = "Iphone 11";
        iphone.batery = 50;
        iphone.color = "red";

        iphone.turnOff();
        iphone.phoneStats();
        iphone.restart();
        System.out.println("----Turning on the phone and tryng again----");
        iphone.turnOn();
        iphone.phoneStats();
        iphone.restart();
    }
}

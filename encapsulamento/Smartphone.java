
package encapsulamento;

public class Smartphone {
    public static void main(String[] args) {
        Phone iphone = new Phone();
        iphone.turnOn();
        iphone.showState();
        iphone.call();
        iphone.openApp();
        // System.out.println(iphone.getVolume());
        iphone.playMusic();

    }

}

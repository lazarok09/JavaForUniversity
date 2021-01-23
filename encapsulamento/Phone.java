package encapsulamento;

public class Phone implements Components {
    private boolean on;
    private String state;
    private int volume;
    final private String defaultMensage = "Must turn on the phone first";

    // constructor
    public Phone() {
        this.setOn(false);
        this.setState("Waiting instructions");
        this.setVolume(20);
    }
    // getters and setters

    private boolean getOn() {
        return on;
    }

    private void setOn(boolean on) {
        this.on = on;
    }

    public String getState() {
        return this.state;
    }

    private void setState(String state) {
        this.state = state;
    }

    public int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public void turnOn() {
        setOn(true);
    }

    @Override
    public void turnOff() {
        setOn(false);
    }

    @Override
    public void openApp() {
        if (this.getOn()) {
            this.setState("Opening the best chanel on YouTube | Curso em Video");
            System.out.println(this.getState());
        }
    }

    @Override
    public void call() {
        if (this.getOn()) {
            this.setState("Calling to Gustavo Guanabara to donate love!");
            System.out.println(this.getState());

        } else {
            System.out.println(defaultMensage);
        }
    }

    @Override
    public void playMusic() {
        if (this.getOn()) {
            this.setState("Playing Radiohead  on Spotfy");
            System.out.println(this.getState());

        } else {
            System.out.println(defaultMensage);
        }
    }

    @Override
    public void moreVolume() {
        if (this.getOn()) {
            this.setVolume(this.getVolume() + 10);
            System.out.println("Incressead to " + this.getVolume() + " the volume");
        } else {
            System.out.println(defaultMensage);
        }
    }

    @Override
    public void lessVolume() {
        if (this.getOn() && this.getVolume() >= 10) {
            this.setVolume(this.getVolume() - 10);
            System.out.println("decreased to " + this.getVolume() + " the volume");
        } else {
            System.out.println("Already muted");
        }

    }

    @Override
    public void showState() {
        System.out.println(this.getState());
    }
}

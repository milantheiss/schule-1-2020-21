public class Tageszeit {
    private boolean hell;
    private int zahl;

    Tageszeit(boolean bool) {
        this.hell = bool;
    }

    public void setHell(boolean hell) {
        this.hell = hell;
    }

    public int getZahl() {
        return zahl;
    }

    public void setZahl(int zahl) {
        this.zahl = zahl;
    }

    public boolean getHell() {
        return hell;
    }
}

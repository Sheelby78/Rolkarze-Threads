package pakiecik;

abstract public class MojWatek extends Thread {
    protected Ruch m;
    protected int czas;
    protected PokazujacyStan psi;
    static protected boolean koniec=false;

    public static void setKoniec(boolean k) {
        koniec = k;
    }

    public MojWatek(String nazwa, Ruch m)  {
        super(nazwa);
        this.czas = (int) ( Math.random()*200 )+200;
        this.m = m;
    }

    public void setPsi(PokazujacyStan psi) {
        this.psi = psi;
    }


}

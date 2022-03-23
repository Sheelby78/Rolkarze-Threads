package pakiecik;

class Ruch {

    private static int pojemnosc = 1;
    private int[] bufor = null;
    private int dodajW = 0, wezZ = 0;
    private static int licznik = 0;
    private PokazujacyStan psi=null;
    private static int okr =0;

    private static String[] miejsce = new String[18];

    public static int getIle() {
        return ile;
    }

    private static int ile =0;

    public static String getKto() {
        return kto;
    }

    private static String kto=null;

    public static String[] getMiejsce() {
        return miejsce;
    }

    public static int getProdukt() {
        return okr;
    }

    public static void setProdukt(int okr) {
        Ruch.okr = okr;
    }

    public Ruch(int pojemnosc) {
        if (pojemnosc <= 0) throw new IllegalArgumentException("pojemnosc<=0");
        this.pojemnosc = pojemnosc;
        bufor = new int[pojemnosc];
        this.psi = psi;
        for(int i=0;i<18;i++){
            miejsce[i]="_";
        }
    }

    public synchronized void dodaj(int okr) {
        while ( licznik==pojemnosc)
            try {
                wait();
            } catch (InterruptedException e) {
                System.err.println("Przerwano watek");
            }
        bufor[dodajW] = okr;
        licznik++;

        if (licznik == 1) notify();

    }

    public synchronized int wez() {
        int okr;

        while (licznik==0)
            try {
                wait();
            } catch (InterruptedException e) {
                System.err.println("Przerwano watek");
            }
        okr = bufor[wezZ];
        bufor[wezZ] = 0;
        kto = Thread.currentThread().getName();
        licznik--;
        if (licznik == pojemnosc-1) notify();
        return okr;
    }

    public synchronized boolean przmieszcznie(int i,String nazwa,int zadane){

        if(i==17){
            miejsce[17]=nazwa;
            miejsce[15]="_";
            return true;
        }
        if(i==16){
            miejsce[16]=nazwa;
            ile=zadane;
            if(miejsce[17]==nazwa){
                miejsce[17]="_";
            }
            return true;
        }
        if(i==0 && miejsce[15]==nazwa && miejsce[i]=="_"){
            miejsce[15]="_";
            miejsce[i]=nazwa;
            return true;
        }
        if(i==0 && miejsce[i]=="_"){
            miejsce[i]=nazwa;
            if(miejsce[16]==nazwa){
            miejsce[16]="_";}
            return true;
        }

        if(miejsce[i]=="_"){
            miejsce[i]=nazwa;
            miejsce[i-1]="_";
            return true;
        }
            return false;
    }

}

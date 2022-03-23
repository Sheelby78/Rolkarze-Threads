package pakiecik;

public class Rolkarz extends MojWatek {

    public Rolkarz(String nazwa, Ruch m)  {
        super(nazwa,m);
    }

    public  int getZlecenie() {
        return zlecenie;
    }

    private  int zlecenie = 0;


    public void run() {
        while ( !koniec ) {

            Ruch.setProdukt(m.wez());
            zlecenie = Ruch.getProdukt();
            m.przmieszcznie(16, currentThread().getName(),zlecenie);
            psi.pokazStan();
            try{
                sleep(2000);
            } catch(InterruptedException e) {
                System.err.println("Przerwano watek");
            }

            for(int j=0;j<zlecenie;j++) {
                for (int i = 0; i < 16; i++) {
                        try {
                            sleep(czas);
                        } catch (InterruptedException e) {
                            System.err.println("Przerwano watek");
                        }
                        if (m.przmieszcznie(i, currentThread().getName(),0) == true) {
                            psi.pokazStan();
                            continue;
                        }
                        if (m.przmieszcznie(i, currentThread().getName(),0) == false) {
                            i--;
                            psi.pokazStan();
                        }
                }
            }
            m.przmieszcznie(17, currentThread().getName(),0);
            Ruch.setProdukt(0);
            psi.pokazStan();
            try{
                sleep(2000);
            } catch(InterruptedException e) {
                System.err.println("Przerwano watek");
            }
        }
    }
}
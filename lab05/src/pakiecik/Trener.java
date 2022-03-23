package pakiecik;

public class Trener extends MojWatek {

    public Trener(String nazwa, Ruch m)  {
        super(nazwa,m);
    }


    public void run() {
        while (!koniec) {

            try {
                sleep(2000);
            } catch (InterruptedException e) {
                System.err.println("Przerwano watek");
            }
            Ruch.setProdukt((int) (Math.random() * 9) + 1);
            m.dodaj(Ruch.getProdukt());
            try {
                sleep(100);
            } catch (InterruptedException e) {
                System.err.println("Przerwano watek");
            }
            psi.pokazStan();

        }
    }
}

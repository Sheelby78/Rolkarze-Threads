package pakiecik;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public  class MyFrame {

    public JPanel getPanel1() {
        return panel1;
    }

    private JPanel panel1;
    private JPanel MainPanel;
    private JButton stopButton;
    private JLabel rolkarzePole;
    private JLabel trenerPole;
    private JButton startButton;
    private JLabel drugi;
    private JLabel pierwszy;
    private JLabel trzeci;
    private JLabel czwarty;
    private JLabel zejscie;
    private JLabel wejscie;

    private Trener watekTrener;
    private Rolkarz watekRolkarzA, watekRolkarzB, watekRolkarzC, watekRolkarzD, watekRolkarzE;
    private Ruch ruch;

    public void utworzWatki(){
        ruch = new Ruch(1);

        watekTrener = new Trener("Trener",ruch);
        watekTrener.setPsi(
                new PokazujacyStan(){
                    public void pokazStan(){
                        trenerPole.setText("T " + Ruch.getIle() + ruch.getKto() );
                    }
                }
        );


        watekRolkarzA = new Rolkarz("a",ruch);
        watekRolkarzA.setPsi(
                new PokazujacyStan(){
                    public void pokazStan() {
                        String[] kolejnosc = ruch.getMiejsce();
                        wejscie.setText("v"+ kolejnosc[16]);
                        zejscie.setText(kolejnosc[17] + "^");
                        rolkarzePole.setText("a"+ watekRolkarzA.getZlecenie()+" b"+ watekRolkarzB.getZlecenie()+" c"+ watekRolkarzC.getZlecenie()+" d"+ watekRolkarzD.getZlecenie()+" e" + watekRolkarzE.getZlecenie());
                        pierwszy.setText(kolejnosc[0] + " " + kolejnosc[1] + " " + kolejnosc[2] + " " +kolejnosc[3] + " " + kolejnosc[4] + " " +kolejnosc[5]);
                        drugi.setText(kolejnosc[15] + "            " + kolejnosc[6]);
                        trzeci.setText(kolejnosc[14] + "            " + kolejnosc[7]);
                        czwarty.setText(kolejnosc[13] + " " + kolejnosc[12] + " " + kolejnosc[11] + " " +kolejnosc[10] + " " + kolejnosc[9] + " " +kolejnosc[8]);
                    }
                }
        );

        watekRolkarzB = new Rolkarz("b",ruch);
        watekRolkarzB.setPsi(
                new PokazujacyStan(){
                    public void pokazStan() {
                        String[] kolejnosc = ruch.getMiejsce();
                        wejscie.setText("v"+ kolejnosc[16]);
                        zejscie.setText(kolejnosc[17] + "^");
                        rolkarzePole.setText("a"+ watekRolkarzA.getZlecenie()+" b"+ watekRolkarzB.getZlecenie()+" c"+ watekRolkarzC.getZlecenie()+" d"+ watekRolkarzD.getZlecenie()+" e" + watekRolkarzE.getZlecenie());
                        pierwszy.setText(kolejnosc[0] + " " + kolejnosc[1] + " " + kolejnosc[2] + " " +kolejnosc[3] + " " + kolejnosc[4] + " " +kolejnosc[5]);
                        drugi.setText(kolejnosc[15] + "            " + kolejnosc[6]);
                        trzeci.setText(kolejnosc[14] + "            " + kolejnosc[7]);
                        czwarty.setText(kolejnosc[13] + " " + kolejnosc[12] + " " + kolejnosc[11] + " " +kolejnosc[10] + " " + kolejnosc[9] + " " +kolejnosc[8]);
                    }
                }
        );

        watekRolkarzC = new Rolkarz("c",ruch);
        watekRolkarzC.setPsi(
                new PokazujacyStan(){
                    public void pokazStan() {
                        String[] kolejnosc = ruch.getMiejsce();
                        wejscie.setText("v"+ kolejnosc[16]);
                        zejscie.setText(kolejnosc[17] + "^");
                        rolkarzePole.setText("a"+ watekRolkarzA.getZlecenie()+" b"+ watekRolkarzB.getZlecenie()+" c"+ watekRolkarzC.getZlecenie()+" d"+ watekRolkarzD.getZlecenie()+" e" + watekRolkarzE.getZlecenie());
                        pierwszy.setText(kolejnosc[0] + " " + kolejnosc[1] + " " + kolejnosc[2] + " " +kolejnosc[3] + " " + kolejnosc[4] + " " +kolejnosc[5]);
                        drugi.setText(kolejnosc[15] + "            " + kolejnosc[6]);
                        trzeci.setText(kolejnosc[14] + "            " + kolejnosc[7]);
                        czwarty.setText(kolejnosc[13] + " " + kolejnosc[12] + " " + kolejnosc[11] + " " +kolejnosc[10] + " " + kolejnosc[9] + " " +kolejnosc[8]);
                    }
                }
        );

        watekRolkarzD = new Rolkarz("d",ruch);
        watekRolkarzD.setPsi(
                new PokazujacyStan(){
                    public void pokazStan() {
                        String[] kolejnosc = ruch.getMiejsce();
                        wejscie.setText("v"+ kolejnosc[16]);
                        zejscie.setText(kolejnosc[17] + "^");
                        rolkarzePole.setText("a"+ watekRolkarzA.getZlecenie()+" b"+ watekRolkarzB.getZlecenie()+" c"+ watekRolkarzC.getZlecenie()+" d"+ watekRolkarzD.getZlecenie()+" e" + watekRolkarzE.getZlecenie());
                        pierwszy.setText(kolejnosc[0] + " " + kolejnosc[1] + " " + kolejnosc[2] + " " +kolejnosc[3] + " " + kolejnosc[4] + " " +kolejnosc[5]);
                        drugi.setText(kolejnosc[15] + "            " + kolejnosc[6]);
                        trzeci.setText(kolejnosc[14] + "            " + kolejnosc[7]);
                        czwarty.setText(kolejnosc[13] + " " + kolejnosc[12] + " " + kolejnosc[11] + " " +kolejnosc[10] + " " + kolejnosc[9] + " " +kolejnosc[8]);
                    }
                }
        );

        watekRolkarzE = new Rolkarz("e",ruch);
        watekRolkarzE.setPsi(
                new PokazujacyStan(){
                    public void pokazStan() {
                        String[] kolejnosc = ruch.getMiejsce();
                        wejscie.setText("v"+ kolejnosc[16]);
                        zejscie.setText(kolejnosc[17] + "^");
                        rolkarzePole.setText("a"+ watekRolkarzA.getZlecenie()+" b"+ watekRolkarzB.getZlecenie()+" c"+ watekRolkarzC.getZlecenie()+" d"+ watekRolkarzD.getZlecenie()+" e" + watekRolkarzE.getZlecenie());
                        pierwszy.setText(kolejnosc[0] + " " + kolejnosc[1] + " " + kolejnosc[2] + " " +kolejnosc[3] + " " + kolejnosc[4] + " " +kolejnosc[5]);
                        drugi.setText(kolejnosc[15] + "            " + kolejnosc[6]);
                        trzeci.setText(kolejnosc[14] + "            " + kolejnosc[7]);
                        czwarty.setText(kolejnosc[13] + " " + kolejnosc[12] + " " + kolejnosc[11] + " " +kolejnosc[10] + " " + kolejnosc[9] + " " +kolejnosc[8]);
                    }
                }
        );
    }

    public void uruchomWatki(){
        MojWatek.setKoniec(false);
        watekTrener.start();
        watekRolkarzA.start();
        watekRolkarzB.start();
        watekRolkarzC.start();
        watekRolkarzD.start();
        watekRolkarzE.start();
    }

    public void zatrzymajWatki() {
        MojWatek.setKoniec(true);
        watekRolkarzA.stop();
        watekRolkarzB.stop();
        watekRolkarzC.stop();
        watekRolkarzD.stop();
        watekRolkarzE.stop();
    }

    public MyFrame() {
        stopButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                zatrzymajWatki();
            }
        });
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                utworzWatki();
                uruchomWatki();
            }
        });
    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author sirak
 */
public class CurrentData implements Observer, Display {

    private String günlüktest;
    private String vaka;
    private String yogunbakim;
    private String entübe;
    private String ölü;
    private String iyilesen;
    private String Tarih;
    private String bugun_test1;
    private String bugun_vaka1;
    private String bugun_vefat1;
    private String bugun_iyilesen1;

    @Override
    public void update(String günlüktest, String vaka, String yogunbakim, String entübe, String ölü, String iyilesen, String Tarih, String bugun_test1, String bugun_vaka1, String bugun_vefat1, String bugun_iyilesen1) {
        this.günlüktest = günlüktest;
        this.vaka = vaka;
        this.yogunbakim = yogunbakim;
        this.entübe = entübe;
        this.ölü = ölü;
        this.iyilesen = iyilesen;
        this.Tarih = Tarih;
        this.bugun_test1 = bugun_test1;
        this.bugun_vaka1 = bugun_vaka1;
        this.bugun_vefat1 = bugun_vefat1;
        this.bugun_iyilesen1 = bugun_iyilesen1;
        display();
    }

    @Override
    public void display() {
        System.out.println("günlüktest"+günlüktest+"vaka"+vaka+"ypgunbakim"+yogunbakim+"entübe"+entübe+"ölü"+ölü+ "iyilesen"+iyilesen+"Tarih"+Tarih+"bugunkitest"+bugun_test1+"bugunkivaka"+bugun_vaka1+"bugunkivefat"+bugun_vefat1+"bugunkiiyilesen"+bugun_iyilesen1);
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author sirak
 */
public class toplamdeger implements Observer, Display {

    private String topgünlüktest;
    private String topvaka;
    private String topyogunbakim;
    private String topentübe;
    private String topölü;
    private String topiyilesen;
    private String Tarih;
    private String bugun_test1;
    private String bugun_vaka1;
    private String bugun_vefat1;
    private String bugun_iyilesen1;
    private String totaldata;

    public toplamdeger() {
        topgünlüktest = topvaka = topentübe = topölü = topiyilesen = "";

    }

    @Override
    public void update(String günlüktest, String vaka, String yogunbakim, String entübe, String ölü, String iyilesen, String Tarih, String bugun_test1, String bugun_vaka1, String bugun_vefat1, String bugun_iyilesen1) {
        this.topgünlüktest = ""+günlüktest;
        this.topvaka = ""+vaka;
        this.topyogunbakim ="" +yogunbakim;
        this.topentübe = ""+entübe;
        this.topölü = ""+ölü;
        this.topiyilesen = ""+iyilesen;
        display();

    }

    @Override
    public void display() {
        System.out.println("topgünlüktest:" + topgünlüktest + "topvaka:" + topvaka
                + "topyogunbakim:" + topyogunbakim + "topentübe:" + topentübe + "topölü:"
                + topölü + "topiyilesen:" + topiyilesen);

    }

}

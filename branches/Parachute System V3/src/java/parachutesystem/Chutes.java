/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package parachutesystem;

/**
 *
 * @author Dell
 */
public class Chutes {

    private int serialNo;
    private String main;
    private String reserve;
    private String lifeJacket;

    public Chutes(int serialNo, String main, String reserve, String lifeJacket) {
        this.serialNo = serialNo;
        this.main = main;
        this.reserve = reserve;
        this.lifeJacket = lifeJacket;
    }

    public int getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(int serialNo) {
        this.serialNo = serialNo;
    }
    

    public String getMain() {
        return main;
    }

    public void setMain(String main) {
        this.main = main;
    }

    public String getReserve() {
        return reserve;
    }

    public void setReserve(String reserve) {
        this.reserve = reserve;
    }

    public String getLifeJacket() {
        return lifeJacket;
    }

    public void setLifeJacket(String lifeJacket) {
        this.lifeJacket = lifeJacket;
    }
}

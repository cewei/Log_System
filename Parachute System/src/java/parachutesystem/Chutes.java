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

    private String main;
    private String reserve;
    private String lifeJacket;

    public Chutes(String main, String reserve, String lifeJacket) {
        this.main = main;
        this.reserve = reserve;
        this.lifeJacket = lifeJacket;
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

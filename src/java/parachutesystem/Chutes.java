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
    public Chutes(String main, String reserve){
        this.main = main;
        this.reserve = reserve;
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

    
}

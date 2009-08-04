/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package parachutesystem;

/**
 *
 * @author Lancer-Matrix
 */
public class Status {

    private String name;
    private int amount;

    public Status() {
    }

    public Status(String name, int amount) {
        this.name = name;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}

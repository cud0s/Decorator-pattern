/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coffeeHouse;

/**
 *
 * @author slvai_000
 */
public class Decaf extends Beverage {
    @Override
    public double cost() {
        return 1.05;
    }

    public Decaf() {
        description = "Decaf Coffee";
    }
}

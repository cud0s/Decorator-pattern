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
public class HouseBlend extends Beverage {
    @Override
    public double cost() {
        return .89;
    }

    public HouseBlend() {
        description = "House Blend Coffee";
    }
}

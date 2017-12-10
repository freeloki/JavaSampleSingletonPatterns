/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codegenius;

/**
 *
 * @author codegeni.us
 */
public class StaticBlock {

    // define private static instance
    private static StaticBlock instance;

    // avoid create instance of class
    private StaticBlock() {
    }

    //static block that supports exception handling
    static {
        try {
            instance = new StaticBlock();
        } catch (Exception e) {
            // exception occured handle me.
            throw new RuntimeException("Exceptions can be handled here." + e);
        }
    }

    // global accessor method for instance.
    public static StaticBlock getInstance() {
        return instance;
    }
}

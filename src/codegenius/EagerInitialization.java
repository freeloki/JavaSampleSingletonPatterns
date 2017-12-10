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
public class EagerInitialization {

    // define private instance.
    private static final EagerInitialization instance = new EagerInitialization();

    //Restrict to create new instance.
    private EagerInitialization() {
    }

    // use only created instance via public method.
    public static EagerInitialization getInstance() {
        return instance;
    }
}

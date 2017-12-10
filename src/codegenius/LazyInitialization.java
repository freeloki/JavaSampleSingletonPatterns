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
public class LazyInitialization {

    // define private instance but don't create it.
    private static LazyInitialization instance;

    // avoid to create new instance of class
    private LazyInitialization() {
    }

    // global accessor for instance.
    public static LazyInitialization getInstance() {

        /**
         * !!! be aware. This is not thread safe.If two or more threads try to
         * access and creates the instance of the class at the same time. That
         * time the Singleton pattern will be destroyed.
         */
        if (instance == null) {
            instance = new LazyInitialization();
        }
        return instance;
    }
}

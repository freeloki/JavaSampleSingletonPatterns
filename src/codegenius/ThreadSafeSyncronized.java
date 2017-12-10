/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codegenius;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author codegeni.us
 */
public class ThreadSafeSyncronized {

    // define private instance
    private static ThreadSafeSyncronized instance;

    // avoid create instance of class from outside
    private ThreadSafeSyncronized() {
    }

    /**
     * syncronize class method for avoid multiple access
     */
    public synchronized static ThreadSafeSyncronized getInstance() {

        if (instance == null) {
            instance = new ThreadSafeSyncronized();
        }
        return instance;
    }

    public void sampleMethodA() {
        //do awesome stuff here
        System.out.println("Instance MethodA" + instance);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            Logger.getLogger(JavaSingletonPatternSamples.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void sampleMethodB() {
        // do awesome things here.
        System.out.println("Instance MethodB" + instance);
    }
}

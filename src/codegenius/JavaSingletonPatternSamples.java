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
public class JavaSingletonPatternSamples {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Sample Eager call
        System.out.println("Eager Call :" + EagerInitialization.getInstance());

        /**
         * sample for lazy singleton failure.
         */
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException ex) {
                    Logger.getLogger(JavaSingletonPatternSamples.class.getName()).log(Level.SEVERE, null, ex);
                }
                System.out.println("Instance1 HashCode: " + LazyInitialization.getInstance());
            }
        }).start();
        // TODO code application logic here

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Instance2 HashCode: " + LazyInitialization.getInstance());
            }
        }).start();

        /**
         * Thread block sample.
         */
        new Thread(new Runnable() {
            @Override
            public void run() {
                ThreadSafeSyncronized.getInstance().sampleMethodA();
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {

                // this thread will waits for the finish of sampleMethodA()
                ThreadSafeSyncronized.getInstance().sampleMethodB();
            }
        }).start();

    }

}

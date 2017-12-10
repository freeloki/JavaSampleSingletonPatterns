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
public class ThreadSafeDoubleCheck {

    private static ThreadSafeDoubleCheck instance;

    private ThreadSafeDoubleCheck() {
    }

    public static ThreadSafeDoubleCheck getInstance() {

        if (instance == null) {

            synchronized (ThreadSafeDoubleCheck.class) {
                if (instance == null) {
                    instance = new ThreadSafeDoubleCheck();
                }
            }
        }

        return instance;
    }
}

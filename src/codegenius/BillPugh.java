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
public class BillPugh {

    private BillPugh() {
    }

    private static class SingletonHelper {

        private static final BillPugh instance = new BillPugh();
    }

    public static BillPugh getInstance() {
        return SingletonHelper.instance;
    }
}

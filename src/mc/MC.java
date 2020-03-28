/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mc;

/**
 *
 * @author 19301261
 */
import java.io.File;
import java.util.*;

public class MC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Home h1 = new Home();
        /*  h1.mName();                         //      Ishraq
        h1.mNumber();                     //     01534741641
        h1.mCode();                         //       *****                                              
        h1.setBalance(1000);
        h1.check();*/
        Account[] arr = new Account[100];
        try {
            File f = new File("E:\\Study Materials\\Fall2019\\CSE111\\Project\\Marscash (v4)\\project update\\hi.txt");
            Scanner sx = new Scanner(f);
            int i = 0;
            while (sx.hasNext()) {
                String n = sx.next();
                String num = sx.next();
                String pass = sx.next();
                arr[i] = new Account(n, num, pass);
                i++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

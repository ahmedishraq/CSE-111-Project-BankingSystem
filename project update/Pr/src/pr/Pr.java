/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pr;

/**
 *
 * @author DOLPHIN
 */
import java.io.File;
import java.util.*;

public class Pr {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account[] a = new Account[100];
        try {
            File f = new File("C:\\Users\\DOLPHIN\\Desktop\\project update\\hi.txt");
            Scanner sx = new Scanner(f);
            int i = 0;
            while (sx.hasNext()) {
                String n = sx.next();
                String num = sx.next();
                String pass = sx.next();
                a[i] = new Account(n, num, pass);
                i++;
            }
            for (int j = 0; j < i; j++) {
                System.out.println(a[j].name + " " + a[j].number + " " + a[j].pass);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Feladat;

import java.util.Random;

/**
 *
 * @author LajkóGergő(SZOFT_202
 */
public class KockaTobbTomb {
    static Random rnd = new Random();
      public static void main(String[] args) {
         int szam= rnd.nextInt();
         final int DOBAS_DB=50;
         final int KOCKA_OLDAL=6;
         int[][] dobasok =new int [KOCKA_OLDAL+1][KOCKA_OLDAL+1];
         //feltöltés
            for (int oszlop = 0; oszlop < DOBAS_DB; oszlop++) {
                int dobas1 = (int) (Math.random()*KOCKA_OLDAL)+1;
                int dobas2 = (int) (Math.random()*KOCKA_OLDAL)+1;
                dobasok[dobas1] [dobas2]++;
          }
            //megjelenítés
          for (int i = 0; i < KOCKA_OLDAL; i++) {
              for (int j = 0; j < KOCKA_OLDAL; j++) {
                  System.out.printf("%3d", dobasok[i][j]);
              }
              System.out.println("");
          }
          System.out.println("");
      }
    
}

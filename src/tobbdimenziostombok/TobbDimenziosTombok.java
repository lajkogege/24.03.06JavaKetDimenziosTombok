/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tobbdimenziostombok;

/**
 *
 * @author LajkóGergő(SZOFT_202
 */
public class TobbDimenziosTombok {

    public static void main(String[] args) {
        final int SOR_DB=3;
        final int OSZL_DB=5;
        /*léterhozás*/
        int [] [] negyzetes = new int [SOR_DB] [OSZL_DB];
        /*közvetlen ekérés*/
        negyzetes[1][2]=1;
        
        /*megjelenités*/
        System.out.println("négyzetes");
        for (int sor  = 0; sor < SOR_DB; sor++) {
            /*adott tömb meória címei:*/
            //System.out.println(negyzetes[sor]);
            for (int oszl = 0; oszl <OSZL_DB; oszl++) {
                System.out.print(negyzetes[sor] [oszl] + " ");
            }
            System.out.println("");
        }
        System.out.println("");
        /*ador sor hosszaságok*/
        int[][] fureszes= new int [5][];
        
        /*léterhozás*/
        for (int sor = 0; sor < 5; sor++) {
            //System.out.println(fureszes[i]); -->null értéket kapok, mert a tömb sorainak nem adtam méretet
            for (int oszlop = 0; oszlop < 3; oszlop++) {
                //System.out.println(fureszes[i][j]); -->NullPointerExpation
                //fureszes[sor]=new int [3]; //oszlop minden sor
                int db = (int) (Math.random()*5);
                fureszes[sor]=new int [3+sor];//lépcsőzetes
            }
        }
        //közvetlen elérés
        fureszes [1][2]=1;
        fureszes [2][1]=1;
        
         /*megjelenités*/
        System.out.println("fürészes");
        int sorDB=fureszes.length;
        for (int sor = 0; sor < sorDB; sor++) {
            int oszlDB= fureszes[sor].length;
            for (int oszlop = 0; oszlop < 3; oszlop++) {
                System.out.print(fureszes[sor][oszlop] + "");
            }
            System.out.println("");
        }
        System.out.println("");
    }
    
}

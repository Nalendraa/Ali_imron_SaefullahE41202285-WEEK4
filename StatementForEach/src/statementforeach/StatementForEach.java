/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statementforeach;

/**
 *
 * @author Lenovo
 */
public class StatementForEach {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       int angka[] = {3,5,7,9,11};

        // menggunakan perulangan For each untuk menampilkan angka
        for( int x : angka ){
            System.out.print(x + " ");
        }
    
    }
    
}

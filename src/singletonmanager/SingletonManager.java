/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singletonmanager;

/**
 *
 * @author Peter
 */
public class SingletonManager {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    //DBConnSngl S = DBConnSngl.createSngl();
    
    try{
    for(int i = 1; i<9;i++){
    
    DBConnSngl dc = DBConnSngl.connDB(i);
        System.out.println(dc);
    }
    }
    catch(Exception e){
    
        System.out.println(System.err);
    
    }
    }
    
}

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
public class DBConnSngl {
    
    private int dbnr;
    
    private static DBConnSngl dbc;
    
    private static int max = DBConn.values().length;
    
    private DBConnSngl(){}
    
    
    private DBConnSngl(int c){
    
    this.dbnr = c;
    
    }
  /* public static DBConnSngl createSngl(){
   
   if(dbc == null){
       dbc =  new DBConnSngl();
   }
       return dbc;
   
   
   
   }*/ 
    
  public static DBConnSngl connDB(int i){
  
  if(i<=max){
  
  dbc = new DBConnSngl(i);
  
  }
  
  return dbc;
  
  }
   
}

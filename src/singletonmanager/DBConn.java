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
public enum DBConn {
    
    SYS1(1),SYS2(2);
    
    private int dbnr;
    
    private DBConn(int dbnr){

    this.dbnr = dbnr;
}
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provafactorymethod;

/**
 *
 * @author Rafael
 */
public class TenisMaisCaro extends FabricaTenis{
    
     public TenisMaisCaro(String modelo){
        this.modelo = modelo;
        System.out.println("O modelo de tenis mais caro é:" + this.modelo);
        
}
}
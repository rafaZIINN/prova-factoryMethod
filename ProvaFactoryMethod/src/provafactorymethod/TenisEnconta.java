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
public class TenisEnconta extends FabricaTenis{
    
    public TenisEnconta(String modelo){
        this.modelo = modelo;
      
        System.out.println("O Tenis do modelo mais enconta é:" + this.modelo);
        
    }
}

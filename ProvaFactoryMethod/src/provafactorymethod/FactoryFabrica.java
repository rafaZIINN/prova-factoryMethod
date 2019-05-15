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
public class FactoryFabrica {
    
     public FabricaTenis getFabricaTenis(String marca, String modelo){
        if (marca.equals("ADIDAS"))
            return new TenisEnconta(modelo);
        if (marca.equals("MIZUNO"))
            return new TenisMaisCaro(modelo);
        
         return null;
    }
}

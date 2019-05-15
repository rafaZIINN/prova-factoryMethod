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
public class ProvaFactoryMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
      FactoryFabrica factory = new FactoryFabrica();
      String modelo = " SPRINGBLADE PRO ";
      String marca = "ADIDAS";
      factory.getFabricaTenis(marca, modelo);
      
      
      FactoryFabrica factory1 = new FactoryFabrica();
      String modelo1 = "WAVE PROPHECY 7";
      String marca1 = "MIZUNO";
      factory1.getFabricaTenis(marca1, modelo1);
    }
    }
    


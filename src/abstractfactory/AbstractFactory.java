/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory;

import java.util.Scanner;
import model.FactoryArtDeco;
import model.FactoryModerno;
import model.FactoryVitoriano;
import model.IFactory;

/**
 *
 * @author franklin
 */
public class AbstractFactory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Application app =null;
        IFactory factory;

       
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("Escolha o estilo que desejas para sua mobília: 1 - Vitoriano, 2 - moderno, 3 - ArtDeco.");
        System.out.println();
        int estilo = sc.nextInt();
        
        if (estilo == 1){
            factory = new FactoryVitoriano();
            app = new Application(factory);    
        }   else if (estilo == 2){
            factory = new FactoryModerno();
            app = new Application(factory);  
        }else{ 
            factory = new FactoryArtDeco();
            app = new Application(factory);  
        }
        System.out.println();
        app.criar();
        System.out.println();
        System.out.println("Obrigada pela compra, volte sempre!!");
        System.out.println();

        
        
    }
    
}

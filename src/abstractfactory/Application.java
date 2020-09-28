/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory;

import model.ICadeira;
import model.IFactory;
import model.IMesaCentro;
import model.ISofa;

/**
 *
 * @author franklin
 */
public class Application {
    private ICadeira cadeira;
    private IMesaCentro mesaCentro;
    private ISofa sofa;
    
    Application(IFactory factory){
        this.cadeira = factory.criarCadeira();
        this.mesaCentro = factory.criarMesaCentro();
        this.sofa = factory.criarSofa();
        
    }
    void criar(){
        this.cadeira.criarCadeira();
        this.sofa.criarSofa();
        this.mesaCentro.criarMesaCentro();
    }
    
}

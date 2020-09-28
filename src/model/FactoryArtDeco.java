/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author franklin
 */
public class FactoryArtDeco implements IFactory{

    @Override
    public IMesaCentro criarMesaCentro() {
        return new MesaCentroArtDeco();
    }

    @Override
    public ISofa criarSofa() {
        return new SofaArtDeco();
    }

    @Override
    public ICadeira criarCadeira() {
       return new CadeiraArtDeco();
    }
    
}

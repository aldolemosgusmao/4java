/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciolampada;

/**
 *
 * @author Aldo
 */
class Tv {
    String marca;
    String polegadas;
    boolean wifi;
    private String dono;
    
    public String getDono(){
        return dono;
    }
    
    public void setDono (String dono){
        this.dono = dono;
    }
}

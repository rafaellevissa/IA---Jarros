/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jarros;

/**
 *
 * @author levi
 */
public class jarro {
    //atributos do jarro:
    public int capacidade;
    public int agua;
    
    //métodos do jarro:
    
    public void trocar(jarro oJarro){//colocar o máximo possível de água no outro jarro sem derramar
        int maxTrocado;        
        maxTrocado=oJarro.capacidade-oJarro.agua;    
        if (this.agua>0){
            if(maxTrocado>=(this.agua)){
                oJarro.agua=oJarro.agua+this.agua;
                this.agua = 0;                
            }else{
                this.agua=this.agua-maxTrocado;
                oJarro.agua=oJarro.capacidade;
            }
        }
    }
    public  jarro(int cap, int agua){//construtor
        this.capacidade=cap;
        this.agua=agua;
    }
    public void encher(){//enche o jarro com água até a capacidade máxima 
        this.agua=this.capacidade;
    }
    public void esvaziar(){//esvazia o jarro
        this.agua=0;
    }
}

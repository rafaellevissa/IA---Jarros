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
public class estado {
    int x; // quantidade de água no jarro 1
    int y;//quantidade de água no jarro 2 
    int custo;
    public estado(int a, int b, int c){
        this.x=a;
        this.y=b;
        this.custo=c;
    }
    int validaEstado(){
        //while (estado1.x!=4 || estado1.y!=4){
    int c=0;
    if (this.x==0){
        if(this.y==0){
            c= 6;
        }else if(this.y==1){
            c= 3;
        }else if(this.y==2){
            c= 2;
        }else if(this.y==3){
            
        }
    }else if (this.x==1){
        if(this.y==0){
            c= 2;
        }else if(this.y==3){
            c= 1;
        }
    }else if (this.x==2){
        if(this.y==0){
            c= 3;
        }else if(this.y==3){
            c= 4;
        }
    }else if (this.x==3){
        if(this.y==0){
            c= 6;
        }else if(this.y==3){
            c= 5;
        }
    }else if (this.x==4){
        c= 0;
    }else if (this.x==5){
        if(this.y==0){
            c= 5;
        }else if(this.y==1){
            c= 4;
        }else if(this.y==2){
            c= 1;
        }else if(this.y==3){
            c= 6;
        }
    }
            
        return c;
    }
}

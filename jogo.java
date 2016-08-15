/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jarros;

import java.util.Scanner;
/**
 *
 * @author levi
 */
public class Jarros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ler = new Scanner(System.in);
        int qnt= 4; //quantidade que deseja ao final do jogo
        int jarroSel; //jarro selecionado para ação
        String acao; //armazena a acao selecionada
        System.out.println("Bem vindo ao jogo dos jarros");                
        System.out.println("Junte "+ qnt+" litros de agua em um dos jarros");                
        
        jarro jarro1 = new jarro(5,0); //cria o jarro 1 com (volume máximo, volume de água inicial)
        jarro jarro2 = new jarro(3,0);//cria o jarro 2 com (volume máximo, volume de água inicial)
                
        System.out.println("o jarro 1 tem o volume total de:"+ jarro1.capacidade + " Litros");
        System.out.println("o jarro 2 tem o volume total de:"+ jarro2.capacidade+ " Litros");
        
        System.out.println("o jarro 1 tem o volume de água:"+ jarro1.agua+ " Litros");
        System.out.println("o jarro 2 tem o volume de água:"+ jarro2.agua+ " Litros");
        
        
        while (jarro1.agua!=qnt && jarro2.agua!=qnt){ //enquanto não atingir a quantidade de água desejada:
            System.out.println("Qual jarro você deseja selecionar (1/2):");
            jarroSel=ler.nextInt(); //lê o jarro selecionado para a jogada
            //se selecionar jarro 1
            if (jarroSel == 1){ 
                System.out.println("Ação desejada (E)ncher, E(s)vaziar, (T)rocar:");
                acao=ler.next();
                //condições para selecionar a ação desejada:
                if (acao.compareTo("E")==0 ||acao.compareTo("e")==0||acao.compareTo("Encher")==0||acao.compareTo("encher")==0||acao.compareTo("ENCHER")==0){
                    jarro1.encher();
                }else if(acao.compareTo("S")==0 ||acao.compareTo("s")==0||acao.compareTo("Esvaziar")==0||acao.compareTo("esvaziar")==0||acao.compareTo("ESVAZIAR")==0){
                    jarro1.esvaziar();
                }else if(acao.compareTo("T")==0 ||acao.compareTo("t")==0||acao.compareTo("Trocar")==0||acao.compareTo("trocar")==0||acao.compareTo("TROCAR")==0){
                    jarro1.trocar(jarro2);
                }else{ //se digitar algo inválido
                    System.out.println("Ação inválida");                
                }
                //se selecionar jarro 2
            }else if(jarroSel==2){
                System.out.println("Ação desejada (E)ncher, E(s)vaziar, (T)rocar:");
                acao=ler.next();
                //condições para selecionar a ação desejada:
                 if (acao.compareTo("E")==0 ||acao.compareTo("e")==0||acao.compareTo("Encher")==0||acao.compareTo("encher")==0||acao.compareTo("ENCHER")==0){
                    jarro2.encher();
                }else if(acao.compareTo("S")==0 ||acao.compareTo("s")==0||acao.compareTo("Esvaziar")==0||acao.compareTo("esvaziar")==0||acao.compareTo("ESVAZIAR")==0){
                    jarro2.esvaziar();
                }else if(acao.compareTo("T")==0 ||acao.compareTo("t")==0||acao.compareTo("Trocar")==0||acao.compareTo("trocar")==0||acao.compareTo("TROCAR")==0){
                    jarro2.trocar(jarro1);
                }else{//se digitar algo inválido
                    System.out.println("Ação inválida");
                
                }
            }else{//se digitar algo inválido
                System.out.println("Jarro inválido:");
            }
            //mostra na tela o estado atual dos jarros
            System.out.println("o jarro 1 tem o volume de água:"+ jarro1.agua+ " Litros (capacidade: "+jarro1.capacidade+")");
            System.out.println("o jarro 2 tem o volume de água:"+ jarro2.agua+ " Litros (capacidade: "+jarro2.capacidade+")");
            
        }
        //se conseguir a quantidade desejada
        System.out.println("\n\n");
                
        System.out.println("Parabéns!!! você conseguiu!");
        
    }
    
}

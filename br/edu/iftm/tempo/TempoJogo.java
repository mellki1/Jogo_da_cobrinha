// MODIFICADO
package br.edu.iftm.tempo;

import br.edu.iftm.acoes.Colisao;
import br.edu.iftm.jogo.Cobra;

public class TempoJogo extends Thread{
    public static boolean iniciarTempo = true;

    public void run(){
        while(iniciarTempo){
            try {
                sleep(200);
                Cobra.moverCauda();
                Cobra.aguardarParaMover = false;
                Colisao.ColisaoAlimento();
                if(Colisao.ColidirEmSiMesma()){
                    Cobra.filaCauda.limpar();
                    Cobra.pontuacao = 0;
                }
                if(Colisao.ColidirNaParede() && !(Cobra.filaCauda.estaVazio())){
                	Cobra.filaCauda.remover();
                    Cobra.cabeca.setDirecaoX(7);
                    Cobra.cabeca.setDirecaoY(7);
                    Cobra.pontuacao--; 
                }
                if(Colisao.ColidirNaParede() && Cobra.filaCauda.estaVazio()) {
                    Cobra.cabeca.setDirecaoX(7);
                    Cobra.cabeca.setDirecaoY(7);
                    Cobra.pontuacao = 0;
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (Exception e) {
				e.printStackTrace();
			}
        }
    }

}

package br.edu.iftm.acoes;
import java.awt.Color;
import br.edu.iftm.jogo.Cobra;

public class Colisao {

    public static boolean ColidirEmSiMesma() {
        for(int i = 0; i<Cobra.filaCauda.tamanho(); i++){
            if(Cobra.cabeca.getDirecaoX() == Cobra.filaCauda.pegar(i).getCaudaPosicaoX() && Cobra.cabeca.getDirecaoY() == Cobra.filaCauda.pegar(i).getCaudaPosicaoY()
                    && !Cobra.filaCauda.pegar(i).isCaudaAguardar()){
                return true;
            }
        }
        return false;
    }

    public static boolean ColidirNaParede() {

        return (Cobra.cabeca.getDirecaoX() < 0 || Cobra.cabeca.getDirecaoX() > 15 || Cobra.cabeca.getDirecaoY() < 0 || Cobra.cabeca.getDirecaoY() > 15);
    }

    
    public static void ColisaoAlimento() throws Exception {
        if (Cobra.cabeca.getDirecaoX() == Cobra.alimento1.getX() && Cobra.cabeca.getDirecaoY() == Cobra.alimento1.getY()) {
        	if(!Cobra.cabeca.getCabecaCor().equals(Cobra.alimento1.getAlimentoCor())) {
                Cobra.adicionarBlocoCaudaNoFim(Cobra.alimento1.getAlimentoCor());
                Cobra.pontuacao++;
                
        	}else {
        		if(!Cobra.filaCauda.estaVazio()) {
        			Cobra.cabeca.setCabecaCor(Cobra.filaCauda.olharOPrimeiro().getCaudaCor());
            		Cobra.filaCauda.remover();
            		Cobra.pontuacao--;
        		}else {
                    Cobra.cabeca.setDirecaoX(7);
                    Cobra.cabeca.setDirecaoY(7);
        		}
        	}
        	Cobra.alimento1.reset();
        }
        if (Cobra.cabeca.getDirecaoX() == Cobra.alimento2.getX() && Cobra.cabeca.getDirecaoY() == Cobra.alimento2.getY()) {
        	if(!Cobra.cabeca.getCabecaCor().equals(Cobra.alimento2.getAlimentoCor())) {
            	Color cor = new Color (0,204,51);
                Cobra.adicionarBlocoCaudaNoFim(Cobra.alimento2.getAlimentoCor());
                Cobra.pontuacao++;
        	}else {
        		if(!Cobra.filaCauda.estaVazio()) {
            		Cobra.cabeca.setCabecaCor(Cobra.filaCauda.olharOPrimeiro().getCaudaCor());
            		Cobra.filaCauda.remover();
            		Cobra.pontuacao--;
        		}else {
        			Cobra.cabeca.setDirecaoX(7);
                    Cobra.cabeca.setDirecaoY(7);
        		}
        	}
            Cobra.alimento2.reset();
        }
        if (Cobra.cabeca.getDirecaoX() == Cobra.alimento3.getX() && Cobra.cabeca.getDirecaoY() == Cobra.alimento3.getY()) {
        	if(!Cobra.cabeca.getCabecaCor().equals(Cobra.alimento3.getAlimentoCor())) {
            	Color cor = new Color (204,0,51);
                Cobra.adicionarBlocoCaudaNoFim(Cobra.alimento3.getAlimentoCor());
                Cobra.pontuacao++;
        	}else {
        		if(!Cobra.filaCauda.estaVazio()) {
            		Cobra.cabeca.setCabecaCor(Cobra.filaCauda.olharOPrimeiro().getCaudaCor());
            		Cobra.filaCauda.remover();
            		Cobra.pontuacao--;
        		}else {
        			Cobra.cabeca.setDirecaoX(7);
        			Cobra.cabeca.setDirecaoY(7);
        		}
        	}
            Cobra.alimento3.reset();
        }
        if (Cobra.cabeca.getDirecaoX() == Cobra.alimento4.getX() && Cobra.cabeca.getDirecaoY() == Cobra.alimento4.getY()) {
        	if(!Cobra.cabeca.getCabecaCor().equals(Cobra.alimento4.getAlimentoCor())) {
            	Color cor = new Color (104,26,0);
                Cobra.adicionarBlocoCaudaNoFim(Cobra.alimento4.getAlimentoCor());
                Cobra.pontuacao++;
        	}else {
        		if(!Cobra.filaCauda.estaVazio()) {
        			Cobra.cabeca.setCabecaCor(Cobra.filaCauda.olharOPrimeiro().getCaudaCor());
            		Cobra.filaCauda.remover();
            		Cobra.pontuacao--;
        		}else {
        			Cobra.cabeca.setDirecaoX(7);
        			Cobra.cabeca.setDirecaoY(7);
        		}
        	}
            Cobra.alimento4.reset();
        }
        if (Cobra.cabeca.getDirecaoX() == Cobra.alimento5.getX() && Cobra.cabeca.getDirecaoY() == Cobra.alimento5.getY()) {
        	if(!Cobra.cabeca.getCabecaCor().equals(Cobra.alimento5.getAlimentoCor())) {
            	Color cor = new Color (51,0,204);
                Cobra.adicionarBlocoCaudaNoFim(Cobra.alimento5.getAlimentoCor());
                Cobra.pontuacao++;
        	}else {
        		if(!Cobra.filaCauda.estaVazio()) {
            		Cobra.cabeca.setCabecaCor(Cobra.filaCauda.olharOPrimeiro().getCaudaCor());
            		Cobra.filaCauda.remover();
            		Cobra.pontuacao--;
        		}else {
        			Cobra.cabeca.setDirecaoX(7);
        			Cobra.cabeca.setDirecaoY(7);
        		}
        	}
            Cobra.alimento5.reset();
        }
        if(Cobra.pontuacao > Cobra.melhorPontuacao) Cobra.melhorPontuacao = Cobra.pontuacao;
    }

}

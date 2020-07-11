package br.edu.iftm.acoes;

import java.awt.Color;
import br.edu.iftm.jogo.Cobra;

public class Colisao {

	public static boolean ColidirEmSiMesma() {
		for (int i = 0; i < Cobra.filaCauda.tamanho(); i++) {
			if (Cobra.cabeca.getDirecaoX() == Cobra.filaCauda.pegar(i).getCaudaPosicaoX()
					&& Cobra.cabeca.getDirecaoY() == Cobra.filaCauda.pegar(i).getCaudaPosicaoY()
					&& !Cobra.filaCauda.pegar(i).isCaudaAguardar()) {
				return true;
			}
		}
		return false;
	}

	public static boolean ColidirNaParede() {

		return (Cobra.cabeca.getDirecaoX() < 0 || Cobra.cabeca.getDirecaoX() > 15 || Cobra.cabeca.getDirecaoY() < 0
				|| Cobra.cabeca.getDirecaoY() > 15);
	}

	public static void ColisaoAlimento() throws Exception {
		for (int i = 0; i < 5; i++) {
			if (Cobra.cabeca.getDirecaoX() == Cobra.alimentos[i].getX()
					&& Cobra.cabeca.getDirecaoY() == Cobra.alimentos[i].getY()) {
				if (!Cobra.cabeca.getCabecaCor().equals(Cobra.alimentos[i].getAlimentoCor())) {
					Cobra.adicionarBlocoCaudaNoFim(Cobra.alimentos[i].getAlimentoCor());
					Cobra.pontuacao++;

				} else {
					if (!Cobra.filaCauda.estaVazio()) {
						Cobra.cabeca.setCabecaCor(Cobra.filaCauda.olharOPrimeiro().getCaudaCor());
						Cobra.filaCauda.remover();
						Cobra.pontuacao--;
					} else {
						Cobra.cabeca.setDirecaoX(7);
						Cobra.cabeca.setDirecaoY(7);
					}
				}
				Cobra.alimentos[i].reset();
			}
		}
		if (Cobra.pontuacao > Cobra.melhorPontuacao)
			Cobra.melhorPontuacao = Cobra.pontuacao;
	}

}

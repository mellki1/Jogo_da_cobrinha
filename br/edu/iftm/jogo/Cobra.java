package br.edu.iftm.jogo;

import java.awt.*;
import br.edu.iftm.estruturas.Fila;
import br.edu.iftm.gui.Gui;

public class Cobra {

    public static int pontuacao = 0;
    public static int melhorPontuacao = 0;
    public static boolean aguardarParaMover = false;
    public static Cabeca cabeca = new Cabeca(7, 7);
    public static Fila<Cauda> filaCauda = new Fila<>();
    public static BlocoAlimento alimento1 = new BlocoAlimento();
    public static BlocoAlimento alimento2 = new BlocoAlimento();
    public static BlocoAlimento alimento3 = new BlocoAlimento();
    public static BlocoAlimento alimento4 = new BlocoAlimento();
    public static BlocoAlimento alimento5 = new BlocoAlimento();
    public static int r;
    public static int g;
    public static int b;

    public static void adicionarBlocoCaudaNoFim(Color cor) throws Exception {
        if (filaCauda.estaVazio()) {
            filaCauda.adicionar(new Cauda(cabeca.getDirecaoX(), cabeca.getDirecaoY(), cor));
        } else {
            filaCauda.adicionar(new Cauda(filaCauda.pegar(filaCauda.tamanho() - 1).caudaPosicaoX, filaCauda.pegar(filaCauda.tamanho() - 1).caudaPosicaoY, cor));
        }
    }

    public static void moverCauda() {
        if (filaCauda.tamanho() >= 2) {
            for (int i = filaCauda.tamanho() - 1; i >= 1; i--) {
                if (filaCauda.pegar(i).isCaudaAguardar()) {
                    filaCauda.pegar(i).setCaudaAguardar(false);
                } else {
                    filaCauda.pegar(i).setCaudaPosicaoX(filaCauda.pegar(i - 1).getCaudaPosicaoX());
                    filaCauda.pegar(i).setCaudaPosicaoY(filaCauda.pegar(i - 1).getCaudaPosicaoY());
                }
            }
        }

        //Mover o primeiro bloco no sentido da cabeca cabeca
        if (!filaCauda.estaVazio()) {
            if (filaCauda.olharOPrimeiro().isCaudaAguardar()) {
                filaCauda.olharOPrimeiro().setCaudaAguardar(false);
            } else {
                filaCauda.olharOPrimeiro().setCaudaPosicaoX(cabeca.getDirecaoX());
                filaCauda.olharOPrimeiro().setCaudaPosicaoY(cabeca.getDirecaoY());
            }
        }

        //Mover a cabeca
        switch (cabeca.getDirecao()) {
            case RIGHT:
                cabeca.setDirecaoX(cabeca.getDirecaoX() + 1);
                break;
            case UP:
                cabeca.setDirecaoY(cabeca.getDirecaoY() - 1);
                break;
            case LEFT:
                cabeca.setDirecaoX(cabeca.getDirecaoX() - 1);
                break;
            case DOWN:
                cabeca.setDirecaoY(cabeca.getDirecaoY() + 1);
                break;
        }

    }

    //Posicao da Matriz para coordenadas
    public static Point posicaoCoordenada(int x, int y) {
        Point p = new Point(0, 0);
        p.x = x * 32 + Gui.matrizPosicaoX;
        p.y = y * 32 + Gui.matrizPosicaoY;
        

        return p;
    }

}

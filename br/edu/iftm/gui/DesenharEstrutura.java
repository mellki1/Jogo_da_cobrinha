package br.edu.iftm.gui;

import javax.swing.*;
import br.edu.iftm.jogo.Cobra;
import java.awt.*;

public class DesenharEstrutura extends JLabel {

    Point p;
    Color cor1 = new Color(204,51,0);
    Color cor2 = new Color(0,204,51);
    Color cor3 = new Color(204,0,51);
    Color cor4 = new Color(104,26,0);
    Color cor5 = new Color(51,0,204);

    
    @Override
    protected void paintComponent(Graphics estrutura) {
        super.paintComponent(estrutura);
        Graphics2D estrutura2D = (Graphics2D) estrutura;
        //Remover suavizacao das bordas, pois iremos trabalhar com retangulos
        estrutura2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_OFF);

        //Desenhar fundo
        estrutura2D.setColor(Color.LIGHT_GRAY);
        estrutura2D.fillRect(0, 0, Gui.larguraFrame, Gui.alturaFrame);

        //Desenhar Cauda da Cobra        
        for (int i = 0; i < Cobra.filaCauda.tamanho(); i++) {
        	estrutura2D.setColor(Cobra.filaCauda.pegar(i).caudaCor);
            p = Cobra.posicaoCoordenada(Cobra.filaCauda.pegar(i).getCaudaPosicaoX(), Cobra.filaCauda.pegar(i).getCaudaPosicaoY());
            estrutura2D.fillRect(p.x, p.y, 32, 32);
        }

        //Desenhar Cabeca da Cobra              
        estrutura2D.setColor(Cobra.cabeca.getCabecaCor());
        p = Cobra.posicaoCoordenada(Cobra.cabeca.getDirecaoX(),Cobra.cabeca.getDirecaoY());
        estrutura2D.fillRect(p.x,p.y,32,32);
        estrutura2D.setColor(Color.BLACK);

        
        //Desenhar Bloco de Alimento
        
        estrutura2D.setColor(cor1);
        p = Cobra.posicaoCoordenada(Cobra.alimento1.getX(), Cobra.alimento1.getY());
        estrutura2D.fillRect(p.x,p.y, 32,32);
        Cobra.alimento1.setAlimentoCor(cor1);

        
        estrutura2D.setColor(cor2);
        p = Cobra.posicaoCoordenada(Cobra.alimento2.getX(), Cobra.alimento2.getY());
        estrutura2D.fillRect(p.x,p.y, 32,32);
        Cobra.alimento2.setAlimentoCor(cor2);
        
        
        estrutura2D.setColor(cor3);
        p = Cobra.posicaoCoordenada(Cobra.alimento3.getX(), Cobra.alimento3.getY());
        estrutura2D.fillRect(p.x,p.y, 32,32);
        Cobra.alimento3.setAlimentoCor(cor3);
        
        
        estrutura2D.setColor(cor4);
        p = Cobra.posicaoCoordenada(Cobra.alimento4.getX(), Cobra.alimento4.getY());
        estrutura2D.fillRect(p.x,p.y, 32,32);
        Cobra.alimento4.setAlimentoCor(cor4);
        
        estrutura2D.setColor(cor5);
        p = Cobra.posicaoCoordenada(Cobra.alimento5.getX(), Cobra.alimento5.getY());
        estrutura2D.fillRect(p.x,p.y, 32,32);
        Cobra.alimento5.setAlimentoCor(cor5);
        

        //Desenhar Bordas
        estrutura2D.setStroke(new BasicStroke(3));
        estrutura2D.setColor(Color.BLACK);
        estrutura2D.drawRect(Gui.matrizPosicaoX, Gui.matrizPosicaoY, 512, 512);

        //Escrever Legendas
        estrutura2D.setFont(new Font("Verdana", Font.BOLD, 12));
        estrutura2D.drawString("Pontos: "+ Cobra.pontuacao, 605,45);
        estrutura2D.drawString("Melhor Pontuação: "+ Cobra.melhorPontuacao, 605,65);

        repaint();

    }
}

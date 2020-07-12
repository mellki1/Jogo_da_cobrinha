package br.edu.iftm.gui;

import javax.swing.*;

import br.edu.iftm.acoes.MovimentoTeclado;

public class Gui {
    JFrame frame;
    DesenharEstrutura areaMatriz;

    public static int larguraFrame = 890; 
    public static int alturaFrame = 630;
    public static int matrizPosicaoX = 60;
    public static int matrizPosicaoY = 30;

    public void criar(){
        frame = new JFrame("Jogo da Cobrinha");
        frame.setSize(larguraFrame,alturaFrame);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null); //centralizar
        frame.setLayout(null); //retirar o gerenciador de layout
        frame.setResizable(false); // nao deixar maximizar
        frame.addKeyListener(new MovimentoTeclado());

        areaMatriz = new DesenharEstrutura();
        areaMatriz.setBounds(0,0,larguraFrame,alturaFrame);
        areaMatriz.setVisible(true);
        frame.add(areaMatriz);

        frame.requestFocus();
        frame.setVisible(true);

    }
}

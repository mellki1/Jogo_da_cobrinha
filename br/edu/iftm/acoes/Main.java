package br.edu.iftm.acoes;
import br.edu.iftm.gui.Gui;
import br.edu.iftm.tempo.TempoJogo;

public class Main {
    public static void main(String[] args) {
        Gui interfaceJogo = new Gui();
        TempoJogo tempoJogo = new TempoJogo();

        interfaceJogo.criar();
        tempoJogo.start();
    }
}


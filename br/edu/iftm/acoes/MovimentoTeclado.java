package br.edu.iftm.acoes;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import br.edu.iftm.jogo.Direcao;
import br.edu.iftm.jogo.Cobra;

public class MovimentoTeclado implements KeyListener {

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_UP:
                if (!(Cobra.cabeca.getDirecao() == Direcao.DOWN) && !Cobra.aguardarParaMover) {
                    Cobra.cabeca.setDirecao(Direcao.UP);
                    Cobra.aguardarParaMover = true;
                }
                break;
            case KeyEvent.VK_LEFT:
                if (!(Cobra.cabeca.getDirecao() == Direcao.RIGHT) && !Cobra.aguardarParaMover) {
                    Cobra.cabeca.setDirecao(Direcao.LEFT);
                    Cobra.aguardarParaMover = true;
                }
                break;
            case KeyEvent.VK_DOWN:
                if (!(Cobra.cabeca.getDirecao() == Direcao.UP) && !Cobra.aguardarParaMover) {
                    Cobra.cabeca.setDirecao(Direcao.DOWN);
                    Cobra.aguardarParaMover = true;
                }
                break;
            case KeyEvent.VK_RIGHT:
                if (!(Cobra.cabeca.getDirecao() == Direcao.LEFT) && !Cobra.aguardarParaMover) {
                    Cobra.cabeca.setDirecao(Direcao.RIGHT);
                    Cobra.aguardarParaMover = true;
                }
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}

package br.edu.iftm.jogo;
import java.awt.Color;

public class Cabeca {
    public Direcao direcao = Direcao.RIGHT;
    public int direcaoX, direcaoY;
    public Color cabecaCor = new Color(204,51,0);
    

    public Cabeca(int x, int y) {
        this.direcaoX = x;
        this.direcaoY = y;
    }

    public Direcao getDirecao() {
        return direcao;
    }

    public void setDirecao(Direcao direcao) {
        this.direcao = direcao;
    }

    public int getDirecaoX() {
        return direcaoX;
    }

    public void setDirecaoX(int direcaoX) {
        this.direcaoX = direcaoX;
    }

    public int getDirecaoY() {
        return direcaoY;
    }

    public void setDirecaoY(int direcaoY) {
        this.direcaoY = direcaoY;
    }

	public Color getCabecaCor() {
		return cabecaCor;
	}

	public void setCabecaCor(Color cabecaCor) {
		this.cabecaCor = cabecaCor;
	}
}

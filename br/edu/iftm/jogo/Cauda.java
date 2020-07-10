package br.edu.iftm.jogo;

import java.awt.Color;

public class Cauda {
    public int caudaPosicaoX, caudaPosicaoY;
    public boolean caudaAguardar = true;
    public Color caudaCor;
    

    public Cauda(int caudaPosicaoX, int caudaPosicaoY, Color caudaCor) {
        this.caudaPosicaoX = caudaPosicaoX;
        this.caudaPosicaoY = caudaPosicaoY;
        this.caudaCor = caudaCor;
        
    }

    public int getCaudaPosicaoX() {
        return caudaPosicaoX;
    }

    public void setCaudaPosicaoX(int caudaPosicaoY) {
        this.caudaPosicaoX = caudaPosicaoY;
    }

    public int getCaudaPosicaoY() {
        return caudaPosicaoY;
    }

    public void setCaudaPosicaoY(int caudaPosicaoY) {
        this.caudaPosicaoY = caudaPosicaoY;
    }

    public boolean isCaudaAguardar() {
        return caudaAguardar;
    }

    public void setCaudaAguardar(boolean caudaAguardar) {
        this.caudaAguardar = caudaAguardar;
    }

	public Color getCaudaCor() {
		return caudaCor;
	}

	public void setCaudaCor(Color caudaCor) {
		this.caudaCor = caudaCor;
	}


}

package br.edu.iftm.jogo;

import java.awt.Color;
import java.util.concurrent.ThreadLocalRandom;

public class BlocoAlimento {
    public int x, y;
    public Color alimentoCor;


    public BlocoAlimento(){
        this.x = ThreadLocalRandom.current().nextInt(0,15);
        this.y = ThreadLocalRandom.current().nextInt(0,15);

    }

    public void reset(){
        this.x = ThreadLocalRandom.current().nextInt(0,15);
        this.y = ThreadLocalRandom.current().nextInt(0,15);

    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

	public Color getAlimentoCor() {
		return alimentoCor;
	}

	public void setAlimentoCor(Color alimentoCor) {
		this.alimentoCor = alimentoCor;
	}
}

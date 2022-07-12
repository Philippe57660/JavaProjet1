package model.cassebrique;

import java.awt.*;

public class Balle implements Dessinable{

    private int x;
    private int y;
    private int vitesseVertical;
    private int vitesseHorizontal;
    private Color couleur;

    public Balle(int x, int y, int vitesseVertical, int vitesseHorizontal, Color couleur) {
        this.x = x;
        this.y = y;
        this.vitesseVertical = vitesseVertical;
        this.vitesseHorizontal = vitesseHorizontal;
        this.couleur = couleur;
    }

    public Balle(int x, int y, int vitesseVertical, int vitesseHorizontal) {
        this.x = x;
        this.y = y;
        this.vitesseVertical = vitesseVertical;
        this.vitesseHorizontal = vitesseHorizontal;
        this.couleur = Color.RED;
    }

    public void mouvement(int largeur, int hauteur) {
        x += vitesseHorizontal;
        y += vitesseVertical;

        if(x > largeur || x < 0) {
            vitesseHorizontal *= -1;
        }
        if(y > hauteur || y < 0) {
            vitesseVertical *= -1;
        }
    }

    public void dessinner(Graphics2D dessin){
        dessin.setColor(couleur);
        dessin.fillOval(x, y, 15,15);
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

    public int getVitesseVertical() {
        return vitesseVertical;
    }

    public void setVitesseVertical(int vitesseVertical) {
        this.vitesseVertical = vitesseVertical;
    }

    public int getVitesseHorizontal() {
        return vitesseHorizontal;
    }

    public void setVitesseHorizontal(int vitesseHorizontal) {
        this.vitesseHorizontal = vitesseHorizontal;
    }

    public Color getCouleur() {
        return couleur;
    }

    public void setCouleur(Color couleur) {
        this.couleur = couleur;
    }
}

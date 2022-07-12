package model.cassebrique;

import java.awt.*;

public class Rectangle  implements Dessinable{

    private int x;
    private int y;
    private int longueur;
    private int hauteur;
    private Color couleur;



    public Rectangle(int x, int y, int longueur, int hauteur, Color couleur) {
        this.x = x;
        this.y = y;
        this.longueur = longueur;
        this.hauteur = hauteur;
        this.couleur = Color.green;
    }

    public Rectangle(int x, int y, int longueur, int hauteur) {
        this.x = x;
        this.y = y;
        this.longueur = longueur;
        this.hauteur = hauteur;
        this.couleur = Color.blue;
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

    public int getLongueur() {
        return longueur;
    }

    public void setLongueur(int longueur) {
        this.longueur = longueur;
    }

    public int getHauteur() {
        return hauteur;
    }

    public void setHauteur(int hauteur) {
        this.hauteur = hauteur;
    }

    public Color getCouleur() {
        return couleur;
    }

    public void setCouleur(Color couleur) {
        this.couleur = couleur;
    }

    @Override
    public void dessinner(Graphics2D dessin) {
        dessin.setColor(couleur);
        dessin.fillRect(20,20,80,20);
    }
}

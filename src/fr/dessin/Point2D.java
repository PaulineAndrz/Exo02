package fr.dessin;

import java.util.Arrays;

public class Point2D {
    private int x = 2;
    private int y = 3;

    public int getX() {
        return this.x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public int getY() {
        return this.y;
    }

    public void setY(Integer y) {
        this.y = y;
    }

    public void afficher() {
        int[] tab = new int[] {this.x, this.y};
        System.out.println(Arrays.toString(tab));
    }

    public void translater(int dX, int dY) {
        x = x + dX;
        y = y + dY;
        int[] tab = new int[] {this.x, this.y};
        System.out.println(Arrays.toString(tab));
    }
}

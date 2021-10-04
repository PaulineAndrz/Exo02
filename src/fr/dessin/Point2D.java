package fr.dessin;

public class Point2D {
    private Integer x;
    private Integer y;
    public static Integer compteur = 0;

    public Point2D() {
        this.x = 0;
        this.y = 0;
        this.compteur += 1;
    }

    public Point2D(Integer vX, Integer vY) {
        this.x = vX;
        this.y = vY;
        this.compteur += 1;
    }

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }

    public void afficher() {
        System.out.println("["
                .concat(this.getX().toString())
                .concat(",")
                .concat(this.getY().toString())
                .concat("]")
        );
    }

    /**
     *
     * @param dX valeur à ajouter à x
     * @param dY valeur à ajouter à y
     */
    public void translate(Integer dX, Integer dY) {
        this.setX(this.getX() + dX);
        this.setY(this.getY() + dY);
    }

    public static Integer getCompteur() {
        return Point2D.compteur;
    }
}

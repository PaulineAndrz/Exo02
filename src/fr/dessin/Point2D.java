package fr.dessin;

public class Point2D {
    private Integer x;
    private Integer y;
    private static Integer compteur = 0;

    public Point2D() {
        // Mauvaise pratique
        // this.x = 0;
        // this.y = 0;
        // Utiliser les setters à la place :
        this.setX(0);
        this.setY(0);
        this.compteur++;
    }

    public Point2D(Integer vX, Integer vY) {
        // Mauvaise pratique
        // this.x = vX;
        // this.y = vY;
        // Utiliser les setters à la place :
        this.setX(vX);
        this.setY(vY);
        this.compteur++;
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

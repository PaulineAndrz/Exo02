package fr.dessin;

public class Point2DCorrection {

    private Integer x;
    private Integer y;

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
       this.setY(this.getY() +dY);
    }
}

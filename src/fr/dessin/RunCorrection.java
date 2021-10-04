package fr.dessin;

public class RunCorrection {
    public static void main(String[] args) {
        Point2D point2D = new Point2D();
        point2D.setY(2);
        point2D.setX(4);
        point2D.afficher();
        point2D.translate(6, 7);
        point2D.afficher();
    }
}

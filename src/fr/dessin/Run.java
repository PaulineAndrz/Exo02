package fr.dessin;

public class Run {
    public static void main(String[] args) {
        Point2D point2D = new Point2D();
        point2D.afficher();
        System.out.println(point2D.getCompteur());

        Point2D point2DBis = new Point2D(4, 8);
        point2DBis.afficher();

        System.out.println(point2DBis.getCompteur());
    }
}

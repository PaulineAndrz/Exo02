package fr.dessin;

public class Run {
    public static void main(String[] args) {
        Point2D point2D = new Point2D();
        point2D.afficher();

        Point2D point2DBis = new Point2D(4, 8);
        point2DBis.afficher();

        // pas besoin d'instancier
        System.out.println(Point2D.getCompteur());

        Point3D point3D = new Point3D(4, 5, 7);
        point3D.afficher();

        Point3D point3DBis = new Point3D();
        point3DBis.translate(6, 8, 10);
        point3DBis.afficher();

        point3DBis.translate(6, 8);
        point3DBis.afficher();
    }
}

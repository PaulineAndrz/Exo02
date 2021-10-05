package fr.dessin;

public class Point3DCompo {
    private Integer z;
    private Point2D point2D;

    public Point3DCompo() {
        this.point2D.setX(0);
        this.point2D.setY(0);
        this.setZ(0);
    }

    public Point3DCompo(Integer vX, Integer vY, Integer vZ) {
        this.point2D.setX(vX);
        this.point2D.setY(vY);
        this.setZ(vZ);
    }

    public Integer getZ() {
        return z;
    }

    public void setZ(Integer z) {
        this.z = z;
    }

    public void afficher() {
        System.out.println("["
                .concat(this.point2D.getX().toString())
                .concat(",")
                .concat(this.point2D.getY().toString())
                .concat(",")
                .concat(this.getZ().toString())
                .concat("]")
        );
    }

    public void translate(Integer dX, Integer dY, Integer dZ) {
        this.point2D.setX(this.point2D.getX() + dX);
        this.point2D.setY(this.point2D.getY() + dY);
        this.setZ(this.getZ() + dZ);
    }

}

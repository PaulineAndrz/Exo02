package fr.dessin;

public class Point3D extends Point2D {
    private Integer z;

    public Point3D() {
        super(0, 0);
        this.setZ(0);
    }

    public Point3D(Integer vX, Integer vY, Integer vZ) {
        super(vX, vY);
        this.setZ(vZ);
    }

    public Integer getZ() {
        return z;
    }

    public void setZ(Integer z) {
        this.z = z;
    }

    @Override
    public void afficher() {
        System.out.println("["
                .concat(super.getX().toString())
                .concat(",")
                .concat(super.getY().toString())
                .concat(",")
                .concat(this.getZ().toString())
                .concat("]")
        );
    }

    public void translate(Integer dX, Integer dY, Integer dZ) {
        super.setX(super.getX() + dX);
        super.setY(super.getY() + dY);
        this.setZ(this.getZ() + dZ);
    }
}

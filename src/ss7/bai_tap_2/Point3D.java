package ss7.bai_tap_2;

import java.util.Arrays;

public class Point3D extends Point2D {
    private float z = 0.0f;


    public Point3D() {

    }

    public Point3D(float z) {
        this.z = z;
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        super.getXY();
        this.z = z;


    }

    public float[] getXYZ() {
float[] array={super.getX(), super.getY(), z};

        return array;

    }

    public String toString() {
        return "point 3D " + getXYZ();
    }

}

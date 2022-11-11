package ss7.bai_tap_2;

import java.util.Arrays;

public class Point3D extends Point2D {
    private float z = 0.0f;
    float[] array = new float[3];

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

        array[0] = super.getX();
        array[1] = super.getY();
        array[2] = z;
        return array;

    }

    public String toString() {
        return "point 3D " + getXYZ();
    }

}

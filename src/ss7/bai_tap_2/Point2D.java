package ss7.bai_tap_2;

import java.util.Arrays;

public class Point2D {
    private float[] arr = new float[2];
    private float x = 0.0f;
    private float y = 0.0f;

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Point2D() {

    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;

    }

    public float[] getXY() {

        arr[0] = x;
        arr[1] = y;
        return this.arr;
    }

    public String toString() {
        return "point 2D " + Arrays.toString(arr);


    }

}

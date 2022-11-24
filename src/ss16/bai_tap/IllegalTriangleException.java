package ss16.bai_tap;

public class IllegalTriangleException extends Exception {
 private String str;

    public IllegalTriangleException() {
    }

    public IllegalTriangleException(String str) {
        this.str = str;
    }

    @Override
    public String getMessage() {

        return str;
    }



    }



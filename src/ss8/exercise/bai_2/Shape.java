package ss8.exercise.bai_2;

public class Shape {

        private boolean filled=true;
        private String color="red";
        public Shape(){

        }

        public Shape(boolean filled, String color) {
            this.filled = filled;
            this.color = color;
        }

        public boolean isFilled() {
            return filled;
        }

        public void setFilled(boolean filled) {
            this.filled = filled;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        @Override
        public String toString() {
            return " Shape " +
                    "filled= " + filled +
                    ", color=' " + color
                    ;
        }
    }


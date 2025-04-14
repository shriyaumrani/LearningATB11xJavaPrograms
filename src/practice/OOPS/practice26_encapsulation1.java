package practice.OOPS;

public class practice26_encapsulation1 {
    public static void main(String[] args) {
        Square s1 = new Square();
        s1.setLength(0); // Invalid, so it won't set
        System.out.println("Length: " + s1.getLength());
        System.out.println("Area: " + s1.area());
    }

}


class Square {
    private int length;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        if (length > 0) {
            this.length = length;
        } else {
            System.out.println("Length cannot be 0 or less than 0");
        }
    }

    int area() {
        return length * length;

    }
}


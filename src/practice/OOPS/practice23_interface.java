package practice.OOPS;

public class practice23_interface {
    public static void main(String[] args) {
        square s1 = new square(7);
        System.out.println(s1.cal_area());
    }
}


interface polygon1{
    abstract double cal_area();
}

class square implements polygon1{

    double length;

    square(double length){
        this.length = length;
    }

    public double cal_area(){
        return length * length;
    }


}
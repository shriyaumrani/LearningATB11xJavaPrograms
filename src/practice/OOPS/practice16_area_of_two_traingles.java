package practice.OOPS;

public class practice16_area_of_two_traingles {
    public static void main(String[] args) {
        triangle t1 = new triangle(5,14);
        triangle t2 = new triangle(12,32);
        int area_t1 = t1.compute_area();
        int area_t2 = t2.compute_area();

        System.out.println("Area of triangle t1: " + area_t1 + "\nArea of triangle t2: " + area_t2);

    }
}


class triangle{
    Integer base;
    Integer height;

    triangle(Integer base, Integer height){
        this.base = base;
        this.height = height;
    }

    int compute_area(){
        int area = (this.base * this.height)/2;
        return area;
    }
}
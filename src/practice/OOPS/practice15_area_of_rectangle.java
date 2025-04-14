package practice.OOPS;

public class practice15_area_of_rectangle {
    public static void main(String[] args) {
        area_of_rectangle R1 = new area_of_rectangle(9,8);
        int area = R1.compute_area();
        System.out.println("area of rectangle is: " + area);
    }
}


class area_of_rectangle{
    Integer l;
    Integer b;

    area_of_rectangle(Integer l, Integer b){
        this.l = l;
        this.b = b;
    }

    int compute_area(){
        int area = this.l * this. b;
        return area;
    }
}
package ex_05_Typecasting;

public class Lab047_Typecasting_realexample {
    public static void main(String[] args) {
        int price = 700;
        float gst = 10.90f;
//        int total_price = price + gst; narrow-implicit
        int total_price = price + (int)gst; // narrow explicit
        float total_price2 = price + gst; // implicit widening
        float total_price3 = (float)price + gst; // explicit widening
        System.out.println(total_price2);
    }
}

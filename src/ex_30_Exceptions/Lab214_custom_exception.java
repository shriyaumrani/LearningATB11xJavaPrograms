package ex_30_Exceptions;

public class Lab214_custom_exception {
    public static void main(String[] args) {
        Bank SBI = new Bank("INR", 100);
        Bank ICICI = new Bank("INR", 200);
//        int total = SBI.add(ICICI);

        Bank HDFC = new Bank("USD", 300);
        int total = SBI.add(HDFC);
        System.out.println(total); // wrong output as INR and USD cant be added
    }
}

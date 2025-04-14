package practice.OOPS;

import java.util.Scanner;

public class practice18_temperature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Print hot");
        int hot = scanner.nextInt();
        System.out.println("print cold");
        int cold = scanner.nextInt();

        temperature t1 = new temperature(hot,cold);
        t1.icyhot();
    }
}


class temperature{
    int hot;
    int cold;

    temperature(int hot, int cold){
        this.hot = hot;
        this.cold = cold;
    }

    void icyhot(){
        if (hot > 100 && cold<0){
            System.out.println("Icyhot");
        }
    }
}
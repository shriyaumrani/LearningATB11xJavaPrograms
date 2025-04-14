package practice.OOPS;

public class practice24_overloading {
    public static void main(String[] args) {
        addition a1 = new addition();
        System.out.println(a1.add_numbers(9,9));
        System.out.println(a1.add_numbers(9,9,9,9));

    }
}


class addition{

    int n1, n2,n3,n4;

    int add_numbers(int n1, int n2){
        return n1 + n2;
    }

    int add_numbers(int n1, int n2, int n3, int n4){
        return n1+n2+n3+n4;
    }


}


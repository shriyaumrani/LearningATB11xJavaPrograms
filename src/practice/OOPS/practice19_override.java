package practice.OOPS;

public class practice19_override {

    public static void main(String[] args) {
        car c1 = new car();
        c1.display_infor();
    }
}



class vehicle{

    void display_infor(){
        System.out.println("Four wheeler");
    }
}

class car extends vehicle{

    @Override
    void display_infor() {
        System.out.println("Cars are four wheeler");;
    }
}
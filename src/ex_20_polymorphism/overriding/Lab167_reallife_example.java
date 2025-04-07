package ex_20_polymorphism.overriding;

public class Lab167_reallife_example {
    public static void main(String[] args) {
        chromeTc Tc1 = new chromeTc();
        Tc1.openbrowser();

        System.out.println(".....");

        firefox f1 = new firefox();
        f1.openbrowser();

        System.out.println(".....");

        commontoall c1 = new commontoall();
        c1.openbrowser();

        System.out.println(".....");

        commontoall c2 = new firefox();
        c2.openbrowser();

        System.out.println(".....");

        chromeTc Tc2 = new chromeTc();
        int r = Tc2.openbrowser(4);
        System.out.println(r);


    }
}




class commontoall{
    void openbrowser(){
        System.out.println("open IDE browser");
    }
}

class chromeTc extends commontoall{
    @Override
    void openbrowser() {
        System.out.println("Chrome will open now");
    }
    int openbrowser(int a){
        return a;

    }
}

class firefox extends commontoall{
    @Override
    void openbrowser() {
        System.out.println("Firefox will open now");
    }
}
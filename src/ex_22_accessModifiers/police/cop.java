package ex_22_accessModifiers.police;

public class cop {
    private int gun;
    String icard;

    public cop(int bullet){
        this.gun = bullet;

    }
    protected void shoot(){  //can be accessed within same package
        System.out.println("Yes you can shoot");
    }
}

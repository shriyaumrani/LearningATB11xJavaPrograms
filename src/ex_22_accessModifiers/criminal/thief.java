package ex_22_accessModifiers.criminal;

import ex_22_accessModifiers.police.cop;

public class thief {
    public static void main(String[] args) {
        cop thief = new cop(100);
//        thief.shoot();                    since we have protected the cop functions cant be accessed by thief
        // it is in diff folder
//        System.out.println(thief.gun);
    }
}

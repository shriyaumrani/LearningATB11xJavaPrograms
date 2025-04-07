package ex_21_encapsulation;

public class Lab168_demo_encap {
    public static void main(String[] args) {
        vwoLogin vwoLogin = new vwoLogin("abcd", "12354");
        System.out.println(vwoLogin.password); // anyone can access
        System.out.println(vwoLogin.username);
        vwoLogin.password = "1234567"; // anyone can change since public is used
        System.out.println(vwoLogin.password);
    }
}


class vwoLogin{
    public String username;
    public String password;

    vwoLogin(String usr, String pwd){
        this.username = usr;
        this.password = pwd;

    goodvwoLogin goodvwoLogin = new goodvwoLogin("admin", "1234567");
//        System.out.println(goodvwoLogin.username); not possible as private
//        System.out.println(goodvwoLogin.pssword);
    goodvwoLogin.setUsername("Shriya");
        System.out.println(goodvwoLogin.getUsername());
        goodvwoLogin.setUsername("Pranali");
        System.out.println(goodvwoLogin.getUsername());
        System.out.println(goodvwoLogin.getPassword());
        goodvwoLogin.setPassword("shriya123", false);
        System.out.println(goodvwoLogin.getPassword());




    }

}

class goodvwoLogin {
    private String username;
    private String password;

    goodvwoLogin(String usr, String pwd) {
        this.username = usr;
        this.password = pwd;

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }


    public void setPassword(String password, boolean isadmin) {
        if (isadmin) {
            this.password = password;
        }else{
            System.out.println("You are not allowed to change a password");
        }
    }
}
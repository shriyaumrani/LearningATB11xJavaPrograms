package ex_28_Enum;

public enum colors {
    RED("#FF0000"),
    GREEN("#61FF33"),
    BLUE("#3377FF"),
    YELLOW("#4477FF");


    private String Hexcode;
    colors(String Hexcode){
        this.Hexcode = Hexcode;


    }

    public String getHexcode() {
        return Hexcode;
    }
}

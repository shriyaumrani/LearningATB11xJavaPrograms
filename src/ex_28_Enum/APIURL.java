package ex_28_Enum;

public enum APIURL {
    vwo("https://app.vwo.com"),
    katalon("https://katalon.com"),
    google("https://google.com");

    private String url;

    APIURL(String url){
        this.url = url;
    }

    public String getUrl() {
        return url;
    }
}

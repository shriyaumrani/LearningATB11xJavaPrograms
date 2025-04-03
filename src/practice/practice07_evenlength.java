package practice;

public class practice07_evenlength {
    public static void main(String[] args) {
        String intro = "I am a girl";
        String[] words = intro.split(" ");
        for (String word : words) {
            if (word.length() % 2 == 0) {
                System.out.println(word);
            }
        }
    }
}








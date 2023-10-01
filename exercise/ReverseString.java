package exercise;

public class ReverseString {
    public static void main(String[] args) {
        String s1 = "Hello";
        String newsrt = "";

        for(int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            newsrt += ch + newsrt;
        }

        System.out.println(newsrt);
    }
}

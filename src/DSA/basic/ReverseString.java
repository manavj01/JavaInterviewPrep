package DSA.basic;

public class ReverseString {
    public static void main(String[] args) {
        String name = "NIKITA";
        String rname = "";
        for(int i=name.length()-1;i>=0;i--)
        {
            rname+=name.charAt(i);

        }
        System.out.println(rname);
    }
}

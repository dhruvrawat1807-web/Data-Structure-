public class Q13_SorcererSpell {
    static String reverse(String s) {
        if (s.isEmpty()) return s;
        return reverse(s.substring(1)) + s.charAt(0);
    }

    public static void main(String[] args) {
        String str = "abc";
        System.out.println("Reversed: " + reverse(str));
    }
}

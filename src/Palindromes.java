public class Palindromes {
    public static void main(String[] args) {
        for (int i = 10; i <= 200; i++) {
          String j = String.valueOf(i);
            if (j.charAt(0) == j.charAt(j.length()-1)){
                System.out.println(j);
            }
        }
    }
}

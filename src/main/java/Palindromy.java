
public class Palindromy {

    public static boolean jestPalindromem(String napis) {
        return new StringBuilder(napis).reverse().toString().equals(napis);
    }

}

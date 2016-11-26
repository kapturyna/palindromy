import org.junit.Assert;
import org.junit.Test;

public class PalindromyTest {

    @Test
    public void jestPalindromemZwracaTrueDlaNapisuBedacegoPalindromem() {
        Assert.assertTrue(Palindromy.jestPalindromem("kajak"));
        Assert.assertTrue(Palindromy.jestPalindromem("Potop"));
    }

    @Test
    public void jestPalindromemZwracaFalseDlaNapisuNieBedacegoPalindromem() {
        Assert.assertFalse(Palindromy.jestPalindromem("abc"));
    }

    @Test
    public void jestPalindromemZwracaTrueDlaPustegoNapisu() {
        Assert.assertTrue(Palindromy.jestPalindromem(""));
    }

    @Test
    public void jestPalindromemZwracaTrueDlaNapisuSkladajacegoSieZBialychZnakow() {
        Assert.assertTrue(Palindromy.jestPalindromem("             "));
    }

}

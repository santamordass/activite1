package metier;

import org.junit.Assert;
import org.junit.Test;

public class Calcultest {
    private Calcul calcul;
    @Test
    public void TestP(){
        calcul=new Calcul();
        double a=5 ;double b=9;
        double expected=45;
        double res=calcul.produit(a,b);
        Assert.assertTrue(res==expected);
    }
}

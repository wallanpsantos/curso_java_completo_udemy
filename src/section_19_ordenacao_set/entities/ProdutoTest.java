package section_19_ordenacao_set.entities;

import org.junit.Assert;
import org.junit.Test;

public class ProdutoTest {
    Produto produto = new Produto("nome", Double.valueOf(0));

    @Test
    public void testToString() throws Exception {
        String result = produto.toString();
        Assert.assertEquals("Produto{nome='nome', preco=0.0}", result);
    }

    @Test
    public void testCompareTo() throws Exception {
        int result = produto.compareTo(new Produto("nome", null));
        Assert.assertEquals(0, result);
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme
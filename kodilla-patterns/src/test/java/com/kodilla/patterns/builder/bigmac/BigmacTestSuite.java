package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {

    @Test
    public void testBigMacBuilder() {
        //Given
        Bigmac bigmac = new Bigmac.BigMacBuilder()
                .chooseBun(Bigmac.BigMacBuilder.WITHSESAME)
                .choosePattiesNo(1)
                .chooseSauce(Bigmac.BigMacBuilder.BARBECUE)
                .chooseIngredients("salad")
                .build();
        //When
        //Then
        Assert.assertEquals(Bigmac.BigMacBuilder.WITHSESAME, bigmac.getBun());
        Assert.assertEquals(Bigmac.BigMacBuilder.BARBECUE, bigmac.getSauce());
        Assert.assertEquals(1, bigmac.getPattiesNo());
        Assert.assertEquals(1, bigmac.getIngredients().size());
        Assert.assertTrue(bigmac.getIngredients().contains("salad"));
    }
}

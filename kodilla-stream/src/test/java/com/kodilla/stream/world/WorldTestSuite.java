package com.kodilla.stream.world;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.math.BigDecimal;

public class WorldTestSuite {

    @Before
    public void before() {
        System.out.println("Test Case: begin");
    }

    @After
    public void after(){
        System.out.println("Test Case: end");
    }

    @Test
    public void testGetPeopleQuantity() {
        // Given
        Continent europe = new Continent("Europe");
        Continent africa = new Continent("Africa");
        Continent southAmerica = new Continent("South America");

        europe.addCountry(new Country("Latvia", new BigDecimal(2000000)));
        europe.addCountry(new Country("Spain", new BigDecimal(48000000)));
        europe.addCountry(new Country("Serbia", new BigDecimal(7000000)));
        africa.addCountry(new Country("Namibia", new BigDecimal(2500000)));
        africa.addCountry(new Country("Ethiopia", new BigDecimal(92500000)));
        africa.addCountry(new Country("Mali", new BigDecimal(19000000)));
        southAmerica.addCountry(new Country("Chile", new BigDecimal(16500000)));
        southAmerica.addCountry(new Country("Peru", new BigDecimal(30000000)));
        southAmerica.addCountry(new Country("Argentina", new BigDecimal(41000000)));

        World world = new World();
        world.addContinent(europe);
        world.addContinent(africa);
        world.addContinent(southAmerica);

        // When
        BigDecimal actualPopulation = world.getPeopleQuantity();

        // Then
        Assert.assertEquals(new BigDecimal(258500000), actualPopulation);
        world.showPeopleQuantity();
    }
}
package org.example.bmi_withdesignpatterns;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

public class PersonTest {

    @Test
    public void heightTestWhenIn()
    {
        Random random=new Random();
        int height= random.nextInt();
        for(int i=0;i<100;i++) {
            Person builderObject = new Person(BigDecimal.valueOf(height), BigDecimal.valueOf(10), "in", "kg");
            assertTrue(BigDecimal.valueOf(height).multiply( BigDecimal.valueOf(2.54)).equals( builderObject.getHeight()));
        }
    }

    @Test
    public void heightTestWhenCm()
    {
        Random random=new Random();
        int height= random.nextInt();
        for(int i=0;i<100;i++) {
            Person builderObject = new Person(BigDecimal.valueOf(height), BigDecimal.valueOf(10), "cm", "kg");
            assertTrue(BigDecimal.valueOf(height).equals( builderObject.getHeight()));
        }
    }

    @Test
    public void weightTestWhenKg()
    {
        Random random=new Random();
        int weight= random.nextInt();
        for(int i=0;i<100;i++) {
            Person builderObject = new Person(BigDecimal.valueOf(10), BigDecimal.valueOf(weight) , "in", "kg");
            assertTrue(BigDecimal.valueOf(weight).equals( builderObject.getWeight()));
        }
    }
    @Test
    public void weightTestWhenG()
    {
        Random random=new Random();
        int weight= random.nextInt();
        for(int i=0;i<100;i++) {
            Person personObject = new Person(BigDecimal.valueOf(10), BigDecimal.valueOf(weight) , "in", "g");
            assertTrue(BigDecimal.valueOf(weight).divide( BigDecimal.valueOf(1000)).equals( personObject.getWeight()));
        }
    }

}


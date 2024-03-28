package org.example.bmi_withdesignpatterns;

import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

public class BmiBuilderTest {

    @Test
    public void heightTestWhenIn()
    {
        Random random=new Random();
        int height= random.nextInt();
        for(int i=0;i<100;i++) {
            BmiBuilder builderObject = new BmiBuilder(height, 10, "in", "kg");
            assertEquals(height*2.54f,builderObject.getHeight());
        }
    }

    @Test
    public void heightTestWhenCm()
    {
        Random random=new Random();
        int height= random.nextInt();
        for(int i=0;i<100;i++) {
            BmiBuilder builderObject = new BmiBuilder(height, 10, "cm", "kg");
            assertEquals(height,builderObject.getHeight());
        }
    }

    @Test
    public void weightTestWhenKg()
    {
        Random random=new Random();
        int weight= random.nextInt();
        for(int i=0;i<100;i++) {
            BmiBuilder builderObject = new BmiBuilder(10, weight , "in", "kg");
            assertEquals(weight,builderObject.getWeight());
        }
    }
    @Test
    public void weightTestWhenG()
    {
        Random random=new Random();
        int weight= random.nextInt();
        for(int i=0;i<100;i++) {
            BmiBuilder builderObject = new BmiBuilder(10, weight , "in", "g");
            assertEquals((float)weight/1000,builderObject.getWeight());
        }
    }
}
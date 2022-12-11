package org.example;
import Cat.Cat;

import Dog.Dog;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExampleMavenTest {

    @Test
    public void MavenCatTest(){

        Cat MyCat = new Cat();
        MyCat.SayMoew();
        Assertions.assertEquals("Meowww", MyCat.SayMoew(), "ALERT!!!");
    }
    @Test
    public void MavenDogTest(){

        Dog MyDog = new Dog();
        MyDog.SayBark();
        Assertions.assertEquals("Woof, woof, woof", MyDog.SayBark(), "ALERT!!!");
    }
}

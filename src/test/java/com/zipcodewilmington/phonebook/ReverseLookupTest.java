package com.zipcodewilmington.phonebook;

import org.junit.Assert;
import org.junit.Test;

public class ReverseLookupTest {
    @Test
    public void test1() {
        // given
        PhoneBook phoneBook = new PhoneBook();
        String expectedName = "John";
        String phoneNumber = "302-555-4545";
        phoneBook.add(expectedName, phoneNumber);
<<<<<<< HEAD
       // Assert.assertTrue(phoneBook.hasEntry(expectedName, phoneNumber));
=======
        Assert.assertTrue(phoneBook.hasEntry(expectedName));
>>>>>>> c313b91d3e47bb8e4877cf87697e4af294659773

        // when
        String actualName = phoneBook.reverseLookup(phoneNumber);

        // then
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void test2() {
        // given
        PhoneBook phoneBook = new PhoneBook();
        String expectedName = "Joe";
        String phoneNumber = "302-554-4545";
        phoneBook.add(expectedName, phoneNumber);
<<<<<<< HEAD
        //Assert.assertTrue(phoneBook.hasEntry(expectedName, phoneNumber));
=======
        Assert.assertTrue(phoneBook.hasEntry(expectedName));
>>>>>>> c313b91d3e47bb8e4877cf87697e4af294659773

        // when
        String actualName = phoneBook.reverseLookup(phoneNumber);

        // then
        Assert.assertEquals(expectedName, actualName);
    }


    @Test
    public void test3() {
        // given
        PhoneBook phoneBook = new PhoneBook();
        String expectedName = "Smith";
        String phoneNumber = "302-554-4535";
        phoneBook.add(expectedName, phoneNumber);
<<<<<<< HEAD
       // Assert.assertTrue(phoneBook.hasEntry(expectedName, phoneNumber));
=======
        Assert.assertTrue(phoneBook.hasEntry(expectedName));
>>>>>>> c313b91d3e47bb8e4877cf87697e4af294659773

        // when
        String actualName = phoneBook.reverseLookup(phoneNumber);

        // then
        Assert.assertEquals(expectedName, actualName);
    }
}

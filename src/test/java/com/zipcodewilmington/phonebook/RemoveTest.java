package com.zipcodewilmington.phonebook;

import org.junit.Assert;
import org.junit.Test;

public class RemoveTest {
    @Test
    public void test1() {
        // given
        PhoneBook phoneBook = new PhoneBook();
        String name = "John";
        String phoneNumber = "302-555-4545";
        phoneBook.add(name, phoneNumber);
<<<<<<< HEAD
       // Assert.assertTrue(phoneBook.hasEntry(name, phoneNumber));
=======
        Assert.assertTrue(phoneBook.hasEntry(name));
>>>>>>> c313b91d3e47bb8e4877cf87697e4af294659773

        // when
        phoneBook.remove(name);

        // then
        Assert.assertFalse(phoneBook.hasEntry(name));
    }

    @Test
    public void test2() {
        // given
        PhoneBook phoneBook = new PhoneBook();
        String name = "Joe";
        String phoneNumber = "302-554-4545";
        phoneBook.add(name, phoneNumber);
<<<<<<< HEAD
       // Assert.assertTrue(phoneBook.hasEntry(name, phoneNumber));
=======
        Assert.assertTrue(phoneBook.hasEntry(name));
>>>>>>> c313b91d3e47bb8e4877cf87697e4af294659773

        // when
        phoneBook.remove(name);

        // then
        Assert.assertFalse(phoneBook.hasEntry(name));
    }


    @Test
    public void test3() {
        // given
        PhoneBook phoneBook = new PhoneBook();
        String name = "Smith";
        String phoneNumber = "302-554-4535";
        phoneBook.add(name, phoneNumber);
<<<<<<< HEAD
       // Assert.assertTrue(phoneBook.hasEntry(name, phoneNumber));
=======
        Assert.assertTrue(phoneBook.hasEntry(name));
>>>>>>> c313b91d3e47bb8e4877cf87697e4af294659773

        // when
        phoneBook.remove(name);

        // then
        Assert.assertFalse(phoneBook.hasEntry(name));
    }
}

package com.zipcodewilmington.phonebook;

import java.util.*;
//import java.util.HashMap;


/**
 * Created by leon on 1/23/18.
 * Made WAY better by kristofer 6/16/20
 */
public class PhoneBook {

    private Map<String, List<String>> phonebook;

    public PhoneBook(Map<String, List<String>>  map) {

        this.phonebook = map;
    }

    public PhoneBook() {
        //this(null);
        this.phonebook = new HashMap<String, List<String>>();
    }

    public void add(String name, String phoneNumber) {
        ArrayList<String> toAdd = new ArrayList<>();
        toAdd.add(phoneNumber);
        this.phonebook.put(name,   toAdd);
       // this.phonebook.put(name, Collections.singletonList(phoneNumber));

    }

    public void addAll(String name, String... phoneNumbers) {
      //  this.phonebook=new TreeMap<>();

//        List<String> str1=new ArrayList<>();
//        List<String> str2=new ArrayList<>();
//        List<String> str3=new ArrayList<>();
//        str1.add("123 444 9999");
//        str1.add("456 332 3222");
//        str1.add("888 765 3544");
//
//        str2.add("888 765 3564");
//        str2.add("888 765 3264");
//        str2.add("888 765 3540");
//
//        str3.add("837 765 3564");
//        str3.add("878 765 3264");
//        str3.add("188 765 3540");
//
//  phonebook.put("Vandana", str1);
//  phonebook.put("Neha", str2);
//  phonebook.put("Leroy",str3);
        ArrayList<String> toAdd = new ArrayList<>();

        System.out.println("before");
        for(String s:phoneNumbers){
            System.out.println("inside:"+s);
            toAdd.add(s);

            System.out.println(this.phonebook);
        }
        this.phonebook.put(name, toAdd);


    }

    public void remove(String name) {
this.phonebook.remove(name);
    }

    public Boolean hasEntry(String name) {
         return this.phonebook.containsKey(name);

    }

    public List<String> lookup(String name) {
    //  this.phonebook.get(name);

        return this.phonebook.get(name);
    }

    public String reverseLookup(String phoneNumber)  {

        List<String> res = new ArrayList<>();
        for (Map.Entry<String, List<String>> entry : this.phonebook.entrySet()) {
            if (entry.getValue().contains(phoneNumber))
            {
                return entry.getKey();
            }


        }
        return "nothing";
    }

    public List<String> getAllContactNames() {
        List<String> res = new ArrayList<>();
        for (Map.Entry<String, List<String>> entry : this.phonebook.entrySet()) {
            res.add(entry.getKey());

        }

        return res;
    }

    public Map<String, List<String>> getMap() {

        return this.phonebook;
    }
}

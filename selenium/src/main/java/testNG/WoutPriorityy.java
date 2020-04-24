package testNG;

//package com.guru.testngannotations;

import org.testng.annotations.Test;

public class WoutPriorityy {

@Test
public void cmethod(){
System.out.println("I'm in method C");
}
@Test
public void bmethod(){
System.out.println("I'm in method B");
}
@Test
public void amethod(){
System.out.println("I'm in method A");
}
@Test
public void emethod(){
System.out.println("I'm in method E");
}
@Test
public void d_method(){
System.out.println("I'm in method D");
}

}
package com.acme.basic;

import org.junit.Assert;
import org.junit.Test;

public class HelloWorldTest {

  @Test
  public void sayHello() {


    new HelloWorld().sayHello();
    Assert.assertTrue(true);
  }
}

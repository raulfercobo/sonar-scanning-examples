package com.acme.basic;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class HelloWorld {

  private static final Logger LOG = LogManager.getLogger();
  void sayHello() {
    LOG.atInfo().log("Hello World!");
  }

  void notCovered() {
    LOG.atInfo().log("This method is not covered by unit tests");
  }

}

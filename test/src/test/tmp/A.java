package test.tmp;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class A {
  
  @BeforeMethod
  public void before(Object[] parameters) {
    System.out.println("BEFORE, PARAM:");// + parameters.length + " " + parameters[0]);
  }
  
  @DataProvider
  public Object[][] dp() {
    return new Object[][] { 
        new Object[] { "a" },
        new Object[] { "b" },
    };
  }

  @Test(dataProvider = "dp")
  public void f(String a) {
    System.out.println("TEST:" + a);
  }
  
}

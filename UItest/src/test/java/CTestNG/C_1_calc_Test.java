package CTestNG;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class C_1_calc_Test {
  C_1_calc calc= new C_1_calc();
  @Test
  public void Test_add() {
	  Assert.assertEquals(calc.add(13.0, 12.0),25.0);
  }
  @Test
  public void Test_reduce() {
	  Assert.assertEquals(calc.reduce(20.0, 10.0),10.0);
  }
}

import static org.testng.Assert.assertEquals;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExampleExceptionTest {

  /**
   * Test data for positive test.
   *
   * @return test data array
   */
  @DataProvider(name = "data")
  public static Object[][] data() {
    return new Object[][]{
        {2, 2, 4},
        {2, 3, 6},
        // TODO add 2 more test data here
        {12, 0, 0},
        {99, 77, 7623}
    };
  }

  /**
   * Test data for exception test.
   *
   * @return test data array
   */
  @DataProvider(name = "negativeData")
  public static Object[][] negativeData() {
    return new Object[][]{
        {-2, 2},
        {2, -2},
        // TODO add 2 more test data here
        {-98, -89},
        {0, -6}
    };
  }

  @Test(dataProvider = "data")
  public void testRectangleArea(int a, int b, int c) {
    // TODO put your code here
    assertEquals(ExampleException.rectangleArea(a,b),c, "Rectangle area is not correct");
  }


  @Test(dataProvider = "negativeData", expectedExceptions = IllegalArgumentException.class,
          expectedExceptionsMessageRegExp = "input value is below zero!")
  public void testRectangleAreaNegative(int a, int b) {
    // TODO put your code here
    int area = ExampleException.rectangleArea(a,b);
    assertEquals(ExampleException.rectangleArea(a,b),area, "Rectangle area is not correct");

  }
}
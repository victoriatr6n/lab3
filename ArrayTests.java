import static org.junit.Assert.*;

import java.lang.reflect.Array;

import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReverseInPlaceDoesntWork(){
    int [] input = {1, 2, 3};
    ArrayExamples.reverseInPlace(input);
    assertArrayEquals(new int[]{3,2,1}, input); // doesnt work should be 3,2,1
  }

  @Test
  public void testReversedDoesntWork(){
    int [] input = {1, 2, 3};
    int [] output = ArrayExamples.reversed(input);
    assertArrayEquals(new int[]{3,2,1}, output); // doesnt work should be 3,2,1
  }

  @Test
  public void testAverageWithoutLowest(){
    double[] empty = {}; //expect 0.0
    double[] oneElement = {1}; //expect 0.0
    double[] twoElements = {1,2}; //expect 2.0
    double[] threeElements = {1,2,3}; //expect 2.5
    double[] hasRepeatLows = {1,1,2,3}; //expect 2.5 but get 2
    double[] multipleElements = {1,2,3,4,5,6}; //expect 4.0
    
    assertEquals(0.0, ArrayExamples.averageWithoutLowest(empty), 0.0001);
    assertEquals(0.0,ArrayExamples.averageWithoutLowest(oneElement),0.0001);
    assertEquals(2.0,ArrayExamples.averageWithoutLowest(twoElements),0.0001);
    assertEquals(2.5,ArrayExamples.averageWithoutLowest(threeElements),0.0001);
    assertEquals(1.6,ArrayExamples.averageWithoutLowest(hasRepeatLows),0.1);
    assertEquals(4.0,ArrayExamples.averageWithoutLowest(multipleElements),0.0001);
  }
}

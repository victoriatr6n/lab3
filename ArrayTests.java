import static org.junit.Assert.*;
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
}

package MainPackage;

import static org.junit.Assert.*;
import org.junit.Test;

public class MyClassTest {

	@Test
	public void testReturnTrue() {
		assertTrue("Checks if the method returns true", MyClass.ReturnTrue());
	}

	@Test
	public void testAddTwoNumbers() {
		assertEquals(
				"Checks to see if method AddTwoNumbers() adds 2 and 3 which equals 5",
				5, MyClass.AddTwoNumbers(2, 3));
	}

}

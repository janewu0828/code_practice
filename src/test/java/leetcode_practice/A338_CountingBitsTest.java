/**
 * 
 */
package leetcode_practice;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author jane
 *
 */
public class A338_CountingBitsTest {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * {@link leetcode_practice.A338_CountingBits#countBits(int)} 的測試方法。
	 */
	@Test
	public void testCountBits() {
		int[] expected = { 0, 1, 1 };

		// Arrange
		A338_CountingBits m = new A338_CountingBits();

		// Act
		int[] actual = m.countBits(2);

		// Assert
		assertEquals(expected, actual);
	}

}

/**
 * 
 */
package leetcode_practice;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author jane
 *
 */
public class A647_PalindromicSubstringsTest {

	/**
	 * {@link leetcode_practice.A647_PalindromicSubstrings#countSubstrings(java.lang.String)}
	 * 的測試方法。
	 */
	@Test
	public void testCountSubstrings() {
		int expected = 3;

		// Arrange
		A647_PalindromicSubstrings m = new A647_PalindromicSubstrings();

		// Act
		int actual = m.countSubstrings("abc");

		// Assert
		assertEquals(expected, actual);
	}

}

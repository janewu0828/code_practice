/**
 * 
 */
package leetcode_practice;

/**
 * @author jane
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		int[] a338_1 = new A338_CountingBits().countBits(2);
		int[] a338_2 = new A338_CountingBits().countBits(5);
		for (int i = 0; i < a338_1.length; i++)
			System.out.printf("338. num=2, %s\n", a338_1[i]);
		for (int i = 0; i < a338_2.length; i++)
			System.out.printf("338. num=5, %s\n", a338_2[i]);
	}

}

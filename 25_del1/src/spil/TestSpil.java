
package spil;

import org.junit.After;
import org.junit.Before;

import org.junit.Test;

public class TestSpil {
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test

	public void TestSum() {
		Terning hh = new Terning(1, 1);

		int t2 = 0;
		int t3 = 0;
		int t4 = 0;
		int t5 = 0;
		int t6 = 0;
		int t7 = 0;
		int t8 = 0;
		int t9 = 0;
		int t10 = 0;
		int t11 = 0;
		int t12 = 0;

		int i = 0;
		while (i < 100000) {

			hh.random();
			int a = hh.getSum();

			if (a == 2) {
				t2++;
			}
			if (a == 3) {
				t3++;
			}
			if (a == 4) {
				t4++;
			}
			if (a == 5) {
				t5++;
			}
			if (a == 6) {
				t6++;
			}
			if (a == 7) {
				t7++;
			}
			if (a == 8) {
				t8++;
			}
			if (a == 9) {
				t9++;
			}
			if (a == 10) {
				t10++;
			}
			if (a == 11) {
				t11++;
			}
			if (a == 12) {
				t12++;
			}
			i++;
		}
		System.out.println("2: " + t2);
		System.out.println("3: " + t3);
		System.out.println("4: " + t4);
		System.out.println("5: " + t5);
		System.out.println("6: " + t6);
		System.out.println("7: " + t7);
		System.out.println("8: " + t8);
		System.out.println("9: " + t9);
		System.out.println("10: " + t10);
		System.out.println("11: " + t11);
		System.out.println("12: " + t12);

		int ialt = t2 + t3 + t4 + t5 + t6 + t7 + t8 + t9 + t10 + t11 + t12;
		System.out.println("i alt: " + ialt);
		System.out.println("");

	}

	@Test

	public void TestEnsTerninger() {
		Terning hh = new Terning(1, 1);

		int t1 = 0;
		int t2 = 0;
		int t3 = 0;
		int t4 = 0;
		int t5 = 0;
		int t6 = 0;

		int i = 0;
		while (i < 100000) {

			hh.random();
			int a = hh.getTerning1();
			int b = hh.getTerning2();

			if (a == 1 && b == 1) {
				t1++;
			}
			if (a == 2 && b == 2) {
				t2++;
			}
			if (a == 3 && b == 3) {
				t3++;
			}
			if (a == 4 && b == 4) {
				t4++;
			}
			if (a == 5 && b == 5) {
				t5++;
			}
			if (a == 6 && b == 6) {
				t6++;
			}
			i++;
		}
		System.out.println("1 & 1: " + t1);
		System.out.println("2 & 2: " + t2);
		System.out.println("3 & 3: " + t3);
		System.out.println("4 & 4: " + t4);
		System.out.println("5 & 5: " + t5);
		System.out.println("6 & 6: " + t6);

		int ialt = t2 + t3 + t4 + t5 + t6;
		System.out.println("i alt: " + ialt);
		System.out.println("");

	}

}

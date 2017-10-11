
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
	
	
	public void TestgetSum() {
		Terning hh = new Terning(1,1);
	

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
			int a= hh.getSum();
			
			if (a == 2 ) {
				t2++;
			}
			if (a == 3 ) {
				t3++;
			}
			if (a == 4 ) {
				t4++;
			}
			if (a == 5 ) {
				t5++;
			}
			if (a == 6 ) {
				t6++;
			}
			if (a == 7 ) {
				t7++;
			}
			if (a == 8 ) {
				t8++;
			}
			if (a == 9 ) {
				t9++;
			}
			if (a == 10 ) {
				t10++;
			}
			if (a == 11 ) {
				t11++;
			}
			if (a == 12 ) {
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



		int ialt =  t2 + t3 + t4 + t5 + t6+t7+t8+t9+t10+t11+t12;
		System.out.println("i alt: " + ialt); 
		System.out.println("");

	}
	  @Test
		
		
		public void TestgetSum2() {
			Terning hh = new Terning(1,1);
		

			int t1 = 0;
			int t2 = 0;
			int t3 = 0;
			int t4 = 0;
			int t5 = 0;
			int t6 = 0;
			
		
			int i = 0;
			while (i < 100000) {
				 
				hh.random();
				int a= hh.getTerning1();
				int b= hh.getTerning2();

				if (a == 1 && b==1 ) {
					t1++;
				}
				if (a == 2 && b==2 ) {
					t2++;
				}
				if (a == 3 && b==3 ) {
					t3++;
				}
				if (a == 4 && b==4 ) {
					t4++;
				}
				if (a == 5 && b==5 ) {
					t5++;
				}
				if (a == 6 && b==6 ) {
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




			int ialt =  t2 + t3 + t4 + t5 + t6;
			System.out.println("i alt: " + ialt); 
			System.out.println("");

		}
	 /*
		@Test
		public void TestgetSum1() {
			int t1t1 = 0;
			int t1t2 = 0;
			int t1t3 = 0;
			int t1t4 = 0;
			int t1t5 = 0;
			int t1t6 = 0;
			int t2t2 = 0;
			int t2t3 = 0;
			int t2t4 = 0;
			int t2t5 = 0;
			int t2t6 = 0;
			int t3t3 = 0;
			int t3t4 = 0;
			int t3t5 = 0;
			int t3t6 = 0;
			int t4t4 = 0;
			int t4t5 = 0;
			int t4t6 = 0;
			int t5t5 = 0;
			int t5t6 = 0;
			int t6t6 = 0;
			int i = 0;
			while (i < 100000) {
				Terning hh = new Terning(1,1);

				hh.random();
				int a= hh.getTerning1();
				int b = hh.getTerning2();
				
				if (a == 1 && b==1 ) {
					t1t1++;
				}
				if (a == 1 && b==2 || a==2 && b==1) {
					t1t2++;
				}
				if (a == 1 && b==3 || a==3 && b==1) {
					t1t3++;
				}
				if (a == 1 && b==4 || a==4 && b==1) {
					t1t4++;
				}
				if (a == 1 && b==5 || a==5 && b==1) {
					t1t5++;
				}
				if (a == 1 && b==6 || a==6 && b==1) {
					t1t6++;
				}
				if (a == 2 && b==2 ) {
					t2t2++;
				}
				if (a == 2 && b==3 || a==3 && b==2) {
					t2t3++;
				}
				if (a == 2 && b==4 || a==4 && b==2) {
					t2t4++;
				}
				if (a == 2 && b==5 || a==5 && b==2) {
					t2t5++;
				}
				if (a == 2 && b==6 || a==6 && b==2) {
					t2t6++;
				}
				if (a == 3 && b==3 ) {
					t3t3++;
				}
				if (a == 3 && b==4 || a==4 && b==3) {
					t3t4++;
				}
				if (a == 3 && b==5 || a==5 && b==3) {
					t3t5++;
				}
				if (a == 3 && b==6 || a==6 && b==3) {
					t3t6++;
				}
				if (a == 4 && b==4 ) {
					t4t4++;
				}
				if (a == 4 && b==5 || a==5 && b==4) {
					t4t5++;
				}
				if (a == 4 && b==6 || a==6 && b==4) {
					t4t6++;
				}
				if (a == 5 && b==5 ) {
					t5t5++;
				}
				if (a == 5 && b==6 || a==6 && b==5) {
					t5t6++;
				}
				if (a == 6 && b==6 ) {
					t6t6++;
				}
				i++;
			}
			System.out.println("1 & 1: " + t1t1);
			System.out.println("1 & 2: " + t1t2);
			System.out.println("1 & 3: " + t1t3);
			System.out.println("1 & 4: " + t1t4);
			System.out.println("1 & 5: " + t1t5);
			System.out.println("1 & 6: " + t1t6);
			System.out.println("2 & 2: " + t2t2);
			System.out.println("2 & 3: " + t2t3);
			System.out.println("2 & 4: " + t2t4);
			System.out.println("2 & 5: " + t2t5);
			System.out.println("2 & 6: " + t2t6);
			System.out.println("3 & 3: " + t3t3);
			System.out.println("3 & 4: " + t3t4);
			System.out.println("3 & 5: " + t3t5);
			System.out.println("3 & 6: " + t3t6);
			System.out.println("4 & 4: " + t4t4);
			System.out.println("4 & 5: " + t4t5);
			System.out.println("4 & 6: " + t4t6);
			System.out.println("5 & 5: " + t5t5);
			System.out.println("5 & 6: " + t5t6);
			System.out.println("6 & 6: " + t6t6);





			int ialt =  t1t1 + t1t2 + t1t3 + t1t4+ t1t5+ t1t6+ t2t2+ t2t3+ t2t4+ t2t5 + t2t6 + t3t3 + t3t4+ t3t5+ t3t6+ t4t4+ t4t5+ t4t6+ t5t5+ t5t6+ t6t6;
			System.out.println("i alt: " + ialt); 	
			System.out.println("");
 
		}
*/
		
	}






package spil;

import java.util.Random;


public class Terning {

	Random random = new Random();

	private int terning1;
	private int terning2;
	private int sum;
	private int point1;
	private int point2;

	public Terning(int terning1, int terning2) {
		this.terning1 = terning1;
		this.terning2 = terning2;
	}
	
	
	public void random() {
		terning1 = random.nextInt(6) + 1;
		terning2 = random.nextInt(6) + 1;
	}

	public int getSum() {
		sum = terning1 + terning2;
		return sum;
	}

	public int getTerning1() {
		return terning1;
	}

	public int getTerning2() {
		return terning2;
	}

	public int setPoint1(int nyePoint) {
		return point1 = point1 + nyePoint;
	}

	public int getPoint1() {
		return point1;
	}

	public void nulstilPoint1() {
		point1 = 0;
	}
	public int setPoint2(int nyePoint) {
		return point2 = point2 + nyePoint;
	}

	public int getPoint2() {
		return point2;
	}

	public void nulstilPoint2() {
		point2 = 0;
	}
}

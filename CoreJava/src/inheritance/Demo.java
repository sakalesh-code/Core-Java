package inheritance;
import inheritance.tools.Calculator;
import inheritance.tools.AdvCal;
import inheritance.tools.VeryAdvCal;


public class Demo {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		AdvCal ac = new AdvCal();
		VeryAdvCal veryAc = new VeryAdvCal();
		int r1 = cal.add(4, 3);
		int r2 = cal.sub(4, 3);
		int r3= ac.mult(4,3);
		int r4= ac.div(4,3);
		double r5= veryAc.power(4, 3);
		System.out.println(r1 + " " + r2 + " " + r3 + " "+ r4 + " " +r5);

	}
}
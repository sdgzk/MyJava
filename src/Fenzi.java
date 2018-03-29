// 1+1/2+//3...+//99=
public class Fenzi {

	public static void main(String args[]) {
		
		Fenzi fz = new Fenzi();
		fz.add();
	}
	void add() {
		double sum = 0.0;
		for (int i = 1;i < 100;i++) {
			sum+=1.0/i;
		}
		System.out.println("1+1/2+//3...+//99=" + sum);;
	}
}

package practice;

public class Methods {

	public void playMusic() {
		System.out.println("musinc is playing..");
	}

	public String giveMeAPen(int cost) {
		if (cost >= 10) {
			return "Pen";
		}
		return "Nothing";
	}

	public static void main(String[] args) {

		Methods meth = new Methods();
		meth.playMusic();
		String result = meth.giveMeAPen(10);
		System.out.println(result);
	}
}
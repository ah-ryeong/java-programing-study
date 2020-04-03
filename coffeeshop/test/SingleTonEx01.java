package coffeeshop.test;
// 싱글톤 (통장으로!)
class 대통령 {

	public static 대통령 instance = new 대통령();

	public static 대통령 getInstance() {
		return instance;
	}

	private 대통령() {
	}
}

public class SingleTonEx01 {

	public static void main(String[] args) {
		대통령 d1 = 대통령.getInstance();
	}
}
package chat;

interface StarUnit {
	abstract int getHp();
}

abstract class protoss implements StarUnit {
	abstract int getSh();
}

abstract class Zerg implements StarUnit {

}

class Zealot extends protoss {
	int sh = 100;
	int hp = 100;
	
	@Override
	public int getSh() {
		return sh;
	}
	
	@Override
	public int getHp() {
		return hp;
	}
}

class Ultra extends Zerg {
	int hp = 100;

	@Override
	public int getHp() {
		return hp;
	}
}

public class FinallyEx01 {

	// ����üũ (hp, sh)
	static void check(StarUnit unit) {
		try {
			Zealot z = (Zealot) unit;
			System.out.println("���� ����� : " + z.getSh());
			System.out.println("���� ü���� : "+ z.getHp());
		} catch (Exception e) {
			// ����
			Ultra u = (Ultra) unit;
			System.out.println("���״� ���尡 �����ϴ�.");
			System.out.println("���� ü���� : " + u.getHp());
		}finally {
			
		}
	}

	public static void main(String[] args) {
		check(new Zealot());
	}

}
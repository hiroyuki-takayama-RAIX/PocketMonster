package chapter8.chara;

import java.util.Random;

public final class Hero extends Chara {

	int beatCount;

	public Hero(String name){
		this.setHP(100);
		this.setPower(5);
		this.setDefense(5);
		this.setName(name);
		this.setAttackMsg("ローキック");
		this.setEscapeMsg("ひろしは今日までに終わらせないといけない書類を思い出して会社に戻っていった...");
		System.out.println(this.getName() + "のお昼休みが始まった!!!");
	}

	public Hero() {
		this("ひろし");
	}

	public void healing() {
		int gain = new Random().nextInt(1, 16);
		this.setHP(this.getHP() + gain);
		if (this.getHP() > 100) {
			this.setHP(100);
		}
		System.out.println(this.getName() + "は" + gain + "ポイント回復した！");
	}

	public void analysis(Chara target) {
		System.out.println(target.getName() + "の能力を分析した！");
		System.out.printf("体力:%d\t攻撃力:%d\t防御力:%d\t\n", target.getHP(), target.getPower(), target.getDefense());
	}
}

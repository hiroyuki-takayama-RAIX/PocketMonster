package chapter8.chara;

import chapter8.skill.*;

import java.util.Random;

public abstract class Chara implements Skills {
	//各キャラクターのパラメーターを指定
	private int HP;
	private int power;
	private int defense;
	private String name;
	private String attackMsg;
	private String escapeMsg;

	//getter関数を作る
	public int getHP() {
		return this.HP;
	}

	public int getPower() {
		return this.power;
	}

	public int getDefense() {
		return this.defense;
	}

	public String getName() {
		return this.name;
	}

	public String getAttackMsg() {
		return this.attackMsg;
	}

	public String getEscapeMsg() {
		return this.escapeMsg;
	}

	//setter関数を作る
	public void setHP(int gain) {
		this.HP = gain;}

	public void setPower(int gain) {
		this.power = gain;
	}

	public void setDefense(int gain) {
		this.defense = gain;
	}

	public void setName(String str) {
		this.name = str;
	}

	public void setAttackMsg(String attackMsg) {
		this.attackMsg = attackMsg;
	}

	public void setEscapeMsg(String escapeMsg) {
		this.escapeMsg = escapeMsg;
	}

	//Skill インターフェイスで定義した抽象メソッドをオーバーライドする。
	@Override
	public void attack(Chara target) {
		System.out.println(this.name + "の" + this.attackMsg + "!");
		int leverage = new Random().nextInt(6);
		if (leverage == 0) {
			System.out.println(this.name + "は攻撃に失敗した。。。");
		} else {
			int damage = this.power * leverage - target.getDefense();
			if(damage <= 0){
				System.out.println(this.name + "は攻撃に失敗した。。。");
			} else {
				int damagedHP = target.getHP() - damage;
				target.setHP(damagedHP);
				System.out.println(target.getName() + "に" + damage + "ポイントのダメージを与えた！");
			}
		}
	}

	@Override
	public void powerUp() {
		int gain = new Random().nextInt(1, 4);
		this.power += gain;
		System.out.println(this.name + "は魔剤を飲んだ！");
		System.out.println(this.name + "は" + gain + "ポイント攻撃力が上がった！");
	}

	@Override
	public void defenseUp() {
		int gain = new Random().nextInt(1, 3);
		this.defense += gain;
		System.out.println(this.name + "は力んだ！");
		System.out.println(this.name + "は" + gain + "ポイント防御力が上がった！");
	}

	@Override
	public void powerDown(Chara target) {
		System.out.println(this.name + "は" + target.getName() + "に向かって怒号を発した！");
		int damage = new Random().nextInt(1, 3);
		int damagedPower = target.getPower() - damage;
		if (damagedPower >= 0) {
			target.setPower(damagedPower);
			System.out.println(target.getName() + "は" + damage + "ポイント攻撃力が下がった！");
		} else {
			target.setPower(1);
			System.out.println(target.getName() + "の攻撃力はこれ以上下がらない！");
		}
	}

	@Override
	public void defenseDown(Chara target) {
		System.out.println(this.name + "は" + target.getName() + "の足の裏をくすぐった！");
		int damage = new Random().nextInt(1, 3);
		int damagedDefense = target.getDefense() - damage;
		if (damagedDefense > 0) {
			target.setDefense(damagedDefense);
			System.out.println(target.getName() + "は" + damage + "ポイント防御力が下がった！");

		} else {
			target.setDefense(1);
			System.out.println(target.getName() + "の防御力はこれ以上下がらない！");
		}
	}

	@Override
	public void escape(){
		System.out.println(escapeMsg);
		System.out.println();
		this.HP = 0;
	}

}

package chapter8.chara;

import java.util.Random;

public final class AgedMan extends Monster{

	public AgedMan(){
		this.setHP(new Random().nextInt(70, 121));
		this.setPower(this.getRandomParameter(""));
		this.setDefense(this.getRandomParameter(""));
		this.setName("おじいちゃん");
		this.setAttackMsg("杖でぶん殴る攻撃");
		this.setEscapeMsg("おじいちゃんの家族がおじいちゃんを連れていってしまった...");
	}

	public void escape(String msg){
		int fearDegree = new Random().nextInt(10);
		System.out.println(msg);
	}
}

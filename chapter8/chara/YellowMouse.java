package chapter8.chara;

import java.util.Random;

public final class YellowMouse extends Monster{

	public YellowMouse(){
		this.setHP(new Random().nextInt(90, 121));
		this.setPower(this.getRandomParameter("high"));
		this.setDefense(this.getRandomParameter("low"));
		this.setName("黄色いネズミ");
		this.setAttackMsg("静電気攻撃");
		this.setEscapeMsg("白衣の男がネズミをゲージの中に入れ、「君は黄色いネズミなんか見なかった、いいね？」と念押しされた...");
	}

}

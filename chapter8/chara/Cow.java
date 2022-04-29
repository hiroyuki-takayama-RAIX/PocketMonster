package chapter8.chara;

import java.util.*;

public final class Cow extends Monster{

	public Cow(){
		this.setHP(new Random().nextInt(90, 121));
		this.setPower(this.getRandomParameter("low"));
		this.setDefense(this.getRandomParameter("high"));
		this.setName("牛");
		this.setAttackMsg("メタンガス攻撃");
		this.setEscapeMsg("牛は乳搾りの時間なので帰っていった...");
	}

}

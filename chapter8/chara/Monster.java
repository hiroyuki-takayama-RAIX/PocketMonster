package chapter8.chara;

import java.util.*;

public abstract class Monster extends Chara{

	private final int randomParameter = new Random().nextInt(1, 11);
	private final int randomLowParameter = new Random().nextInt(1, 6);
	private final int randomHighParameter = new Random().nextInt(4, 11);

	public int getRandomParameter(String highlow){
		int parameter = 5;
		if (highlow == "high") {
			parameter = randomHighParameter;
		} else if (highlow == "low") {
			parameter = randomLowParameter;
		} else {
			parameter = randomParameter;
		}
		return parameter;
	}

}

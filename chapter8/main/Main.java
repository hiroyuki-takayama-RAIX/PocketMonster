package chapter8.main;

import chapter8.chara.*;
import java.util.*;

public class Main { //メインクラスでオブジェクトを生成し、メソッドを使用することでプログラムを動かすのが主流。
	public static void main(String[] args){
		Hero hiroshi = new Hero();
		Chara monster = null;
		boolean validInput = false;
		int select = 0;
		int count = 0;

		while (hiroshi.getHP() > 0) {
			int encounter = new Random().nextInt(3);
			switch (encounter) {
				case 0 -> monster = new Cow();
				case 1 -> monster = new AgedMan();
				case 2 -> monster = new YellowMouse();
			}

			System.out.println(monster.getName() + "が現れた！");
			while (true){
				System.out.println(hiroshi.getName() + "の次の行動を選択してください。");
				System.out.println("ひろしのパラメーター：HP：" + hiroshi.getHP() + "\t攻撃力：" + hiroshi.getPower() + "\t防御力：" + hiroshi.getDefense());
				System.out.println("１：攻撃\t２：魔剤を飲む\t３：力む\t４：怒号を上げる\n５：くすぐる\t６：弁当食べる\t７：逃げる\t８：敵を分析する");

				while (!validInput) {
					String input = new Scanner(System.in).nextLine();
					try {
						select = Integer.parseInt(input);
					} catch (NumberFormatException e) {
						System.out.println("※1〜８の半角数字を入力してください。");
						continue;
					}
					validInput = true;
				}

				switch (select) {
					case 1 -> hiroshi.attack(monster);
					case 2 -> hiroshi.powerUp();
					case 3 -> hiroshi.defenseUp();
					case 4 -> hiroshi.powerDown(monster);
					case 5 -> hiroshi.defenseDown(monster);
					case 6 -> hiroshi.healing();
					case 7 -> hiroshi.escape();
					case 8 -> hiroshi.analysis(monster);
					default -> System.out.println("ひろしは攻撃に失敗した...\n");
				}
				validInput = false;
				if(monster.getHP() <= 0){
					System.out.println(monster.getName() + "を倒した！");
					System.out.println();
					count ++;
					break;
				}

				int randomSelect = new Random().nextInt(11);
				switch(randomSelect){
					case 1 -> monster.escape();
					case 2 -> monster.powerUp();
					case 3 -> monster.defenseUp();
					case 4 -> monster.powerDown(hiroshi);
					case 5 -> monster.defenseDown(hiroshi);
					default -> monster.attack(hiroshi);
				}
				if(hiroshi.getHP() <= 0 ){
					System.out.println(hiroshi.getName() + "は死んでしまった...");
					break;
				}
				if(monster.getHP() <= 0){
					break;
				}
			}
		}
		System.out.println("敵を倒した数：" + count);
	}

}

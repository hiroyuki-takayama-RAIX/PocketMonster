package chapter8.skill;

import chapter8.chara.Chara; //以下の要件を満たすクラスを特にインターフェイスと言う。

public interface Skills { //1. 抽象クラスである（抽象クラスを使って直接インスタンスを生成することはできない）、コードで書く時はabstract class ではなく左のようにinterfaceと書く。

	void attack(Chara target); //2. 全て抽象メソッドで構成されている。抽象メソッドは子どもクラスで必ずオーバーライドされなければいけない。

	void powerUp(); //interface中のメソッ全てpublic abstractになるので、ここではvoidだけで良い。

	void defenseUp(); //注意点として、インターフェイスで定義したメソッドの引数と、オーバーライドした時のメソッドの引数の形式は一致していないといけない。

	void powerDown(Chara target); //抽象メソッドは用途がわからないくても引数は指定しておく。

	void defenseDown(Chara target); //インターフェイスの機能として、継承先のクラスでインターフェイスのメソッドを全て継承しないとエラーが出る。
									//必要なメソッドの定義し忘れを防止できる。

	void escape();
}



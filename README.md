# PocketMonster
Javaのオブジェクト指向に関する勉強（継承、多態性、抽象クラス、インターフェイス、コンストラクタ、カプセル化など）のアウトプットとして作成。

プログラムの概要
　主人公のひろしを操作してなるべく多くの敵を倒すゲームです。８つの操作をうまく組み合わせてなるべく長く生き残ってください。
<img width="334" alt="スクリーンショット 2022-04-29 17 26 13" src="https://user-images.githubusercontent.com/103112285/165909875-e01f745e-4164-4ac1-b82b-16bd7d4d842b.png">

各ファルダーの説明
・main
 Mainクラス、mainメソッドが記載されているjavaファイルがあり、ひろしの攻撃→敵の攻撃...を双方のいずれかが倒れるまでwhileループで繰り返すためのプログラムが書かれています。
 
・chara
 登場するキャラクターのクラスがまとめられています。Charaクラスはどのキャラクターにも共通するフィールド、メソッドを定義しています。Heroクラスはプレイヤーが操作する主人公ひろし特有のフィールド、メソッドを定義しています。Monsterはプレイヤーの攻撃対象である敵キャラに共通するフィールド、メソッドを定義しています。MonsterクラスをそれぞれYellowMouse、AgedMan、Cowクラスに継承させています。
 
・Skill
　全てのキャラクターに共通するメソッドを抽象メソッドとして定義したSkillインターフェイスがあり、これをCharaクラスに実装させています。
 
添削のほど、よろしくお願いします

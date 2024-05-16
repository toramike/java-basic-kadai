package kadai_018;

abstract public class Kato_Chapter18 {
	//	親クラス 抽象クラス

	//	フィールド
	public String familyName = "加藤";
	public String givenName;
	public String address = "東京都中野区〇×";

	//	メソッド　共通の紹介
	public void commonIntroduce() {
		System.out.println("名前は" + this.familyName + this.givenName + "です");
		System.out.println("住所は" + this.address + "です");
	}

	//	メソッド　個別の紹介　抽象メソッド
	abstract public void eachIntroduce();

	//	メソッド　紹介を実行する
	public void execIntroduce() {
		commonIntroduce();
		eachIntroduce();
	}

}

package kadai_018;

public class KatoHanako_Chapter18 extends Kato_Chapter18 {
	//	名を表すフィールドの値をセットする
	public void setGivenName(String name) {
		this.givenName = name;
	}

	@Override
	public void eachIntroduce() {
		System.out.println("趣味は読書です");
	}

}

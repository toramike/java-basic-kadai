package kadai_018;

public class KatoTaro_Chapter18 extends Kato_Chapter18 {

	//	名を表すフィールドの値をセットする
	public void setGivenName(String name) {
		this.givenName = name;
	}

	@Override
	public void eachIntroduce() {
		System.out.println("私はJavaが得意です");
	}

}

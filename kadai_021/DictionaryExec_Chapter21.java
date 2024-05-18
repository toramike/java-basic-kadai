package kadai_021;

public class DictionaryExec_Chapter21 {

	public static void main(String[] args) {
		//辞書クラスのインスタンスを作成
		Dictionary_Chapter21 dictionary1 = new Dictionary_Chapter21();

		//		調べる英単語のセット
		dictionary1.setWordEn("apple");
		dictionary1.setWordEn("banana");
		dictionary1.setWordEn("grape");
		dictionary1.setWordEn("orange");

		//		辞書を調べる
		dictionary1.wordSearch();

	}

}

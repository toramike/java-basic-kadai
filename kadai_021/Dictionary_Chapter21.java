package kadai_021;

import java.util.ArrayList;
import java.util.HashMap;

public class Dictionary_Chapter21 {

	//フィールド
	private static HashMap<String, String> dictionary = new HashMap<String, String>();
	private static ArrayList<String> wordEn = new ArrayList<String>();

	//	コンストラクタ
	public Dictionary_Chapter21() {
		dictionary.put("apple", "りんご");
		dictionary.put("peach", "桃");
		dictionary.put("banana", "バナナ");
		dictionary.put("lemon", "レモン");
		dictionary.put("pear", "梨");
		dictionary.put("kiwi", "キウィ");
		dictionary.put("strawberry", "いちご");
		dictionary.put("grape", "ぶどう");
		dictionary.put("muscat", "マスカット");
		dictionary.put("cherry", "さくらんぼ");
	}

	//	セッター　調べる英単語を配列に加える
	public static void setWordEn(String word) {
		wordEn.add(word);
	}

	//	辞書を調べて結果を返す
	public static void wordSearch() {

		for (int i = 0; i < wordEn.size(); i++) {
			String e = wordEn.get(i);
			String j = dictionary.get(e);
			if (dictionary.get(e) == null) {
				System.out.println(e + "は辞書に存在しません");
			} else {
				System.out.println(e + "の意味は" + j);
			}

		}

	}

}

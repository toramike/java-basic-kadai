package kadai_011;

public class Prime_Chapter11 {

	public static void main(String[] args) {
		//		素数かどうか判定する配列を作成　trueを素数とする
		Boolean[] judgePrime = new Boolean[101];

		for (int j = 0; j < judgePrime.length; j++) {
			judgePrime[j] = true;
		}

		//		2から100までの整数が素数か判定
		for (int num = 2; num < judgePrime.length; num++) {

			for (int i = 2; i < judgePrime.length; i++) {
				if ((num % i == 0) && (num != i)) {
					judgePrime[num] = false;
					break;
				}
			}
		}

		//		素数と判定された数字を表示
		for (int k = 2; k < judgePrime.length; k++) {
			if (judgePrime[k]) {
				System.out.println(k);
			}
		}

	}

}

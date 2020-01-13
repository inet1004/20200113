
public class sum_1_to_1000 {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 1000; i++) {
			sum += i;
		}
		System.out.println("total=" + sum);

		int choise = 4;
		switch (choise) {
		case 4:
			System.out.println("4번수행");
			break;
		default:
			System.out.println("테스트");
		}

//		for (int i = 1000;; i--) {
//			if (i == 0) {
//				break;
//			} else {
//				System.out.println(i);
//			}
//		}

		int i = 1000;
		while (i > 0) {
			System.out.println(i);
			i--;
		}

	}
}
package Recursion_4;

public class Permutation {

	public static void Print(String ques, String ans) {

		if (ques.length() == 0) {
			System.out.println(ans);
			return;
		}
		for (int i = 0; i < ques.length(); i++) {

			String left_part = ques.substring(0, i);
			String right_part = ques.substring(i + 1);

			String chhota_ques = left_part + right_part;
			char ch = ques.charAt(i);

			Print(chhota_ques, ans + ch);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ques = "aabc";
		Print(ques, "");
	}

}

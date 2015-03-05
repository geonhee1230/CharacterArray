public class CharacterArray {

	public static void main(String[] args) {

		String a = "NVCC Manassas Campus 6901 Sudley Road Manassas VA 20109 ";
		char[] b = a.toCharArray();

		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
			if (Character.isLetter(b[i])) {
				System.out.println("This is a letter");
				if (Character.isUpperCase(b[i]))
					b[i] = Character.toLowerCase(b[i]);
				else
					b[i] = Character.toUpperCase(b[i]);
			} else if (Character.isDigit(b[i])) {
				System.out.println("This is a digit");
				b[i] = '*';
			}
			System.out.println(b[i] + "\n");

		}
		System.out.print(b);
	}
}

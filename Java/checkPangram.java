import java.util.Scanner;

public class checkPangram{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine().toLowerCase();

        boolean isPangram = checkIfPangram(input);

        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }

    public static boolean checkIfPangram(String input) {
        int letters[] = new int[26];
        for (char ch : input.toCharArray()) {
            if (Character.isLetter(ch)) {
                letters[ch-'a']++;
            }
        }
        for(int i=0;i<26;i++){
		if(letters[i]==0)	return false;
	}
	return true;
    }
}

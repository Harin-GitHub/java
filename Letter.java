class Letter {
    static void letter(String word) {
        if (word.length() % 2 == 1) {
            char letter = word.charAt(word.length() / 2);

            System.out.println("Letter in the middle: " + letter);
        } else {
            System.out.println("Not an odd-length word");
        }
    }
}

public class Main {
    public static void main(String[] arg) {
        Letter.letter("magnificent");
        Letter.letter("magnificen");
    }
}
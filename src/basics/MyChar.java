package basics;

public class MyChar {
    private final char ch;

    public MyChar(char ch) {
        this.ch = ch;
    }

    public boolean isVowel() {
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            return true;
        }
        return ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
    }

    public boolean isAlphabet() {
        if (ch >= 97 && ch <= 122) {
            return true;
        }
        return ch >= 65 && ch <= 90;
    }

    public boolean isDigit() {
        return ch >= 48 && ch <= 57;
    }

    public boolean isConsonant() {
        return isAlphabet() && !(isVowel());
    }

    public void printLowerCaseAlphabets() {
        for (char ch = 'a'; ch <= 'z'; ch++) {
            System.out.println(ch);
        }
    }

    public void printUpperCaseAlphabets() {
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.println(ch);
        }
    }

}

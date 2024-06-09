package CefaloQuestion.Mock;

public class Main {
    public static void main(String[] args) {
        inputMethod charc = new inputChar();
        charc.concatCharacters('a');
        charc.concatCharacters('b');
        charc.printBuffer();
        charc.concatCharacters('1');
    }
}

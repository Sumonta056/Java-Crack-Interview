package CefaloQuestion;

interface Input{
    public void add(char c);
    public String print();

}

class TextInput implements Input {

    String answer = "";

    @Override
    public void add(char c) {
        answer += c;
    }

    @Override
    public String print() {
        return answer;
    }
}

class NumericalInput implements Input {

    String answer = "";

    @Override
    public void add(char c) {
        if( c >= '0' && c <='9'){
            answer += c;
        }
    }

    @Override
    public String print() {
        return answer;
    }
}

public class JogaVai {
    public static void main(String[] args) {
        Input tempo = new NumericalInput();
        tempo.add('1');
        tempo.add('c');
        tempo.add('9');
        System.out.println(tempo.print());



        tempo = new TextInput();
        tempo.add('a');
        tempo.add('b');
        tempo.add('1');
        System.out.println(tempo.print());


    }
}

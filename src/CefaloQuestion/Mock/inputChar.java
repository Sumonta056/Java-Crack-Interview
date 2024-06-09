package CefaloQuestion.Mock;

public class inputChar implements inputMethod {
    String value = "";
    @Override
    public void printBuffer() {
        System.out.println(value);
    }

    @Override
    public void concatCharacters(char temp) {

        if(temp >= 'a' && temp <= 'z'){
            value += temp;
        }
        else{
            System.out.println("Please Enter Character Only!");
        }

    }
}

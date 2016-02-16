package dll.dll;
public class App {
    public static void main(String[] args) {
        Text text = new Text();
        Symbol symbol = new Symbol();
        Sentence sentence = new Sentence();
        String textString = text.getText();
        char symbolChar = symbol.getSymbol();
        int index = sentence.getIndex();
        System.out.println(sentence.replace(textString, symbolChar, index));
    }
}
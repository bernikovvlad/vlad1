/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dll.dll;
import java.util.Scanner;
public class Sentence {
    private Scanner scanner;
    private int index;
    public Sentence() {
        scanner = new Scanner(System.in);
        index = -1;
    }
    public int getIndex() {
        System.out.print("Enter number of symbol in the word: ");
        String tempString = scanner.nextLine();
        if (!tempString.isEmpty())
            index = new Integer(tempString);
        else
            getIndex();
        return index;
    }
    public String replace(String text, char symbol, int index) {
        String[] arrayWords = text.trim().split(" "); 
        text = "";
        char[] tempCharArraySymbols;
        for (String word : arrayWords) {
            tempCharArraySymbols = word.toCharArray();
            if (index <= word.length()) {
                tempCharArraySymbols[index] = symbol;
            }
            text += new String(tempCharArraySymbols) + " ";
        }
        return text.trim();
    }
}
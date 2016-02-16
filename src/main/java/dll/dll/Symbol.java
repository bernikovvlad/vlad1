/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dll.dll;
import java.util.Scanner;
public class Symbol {
    private Scanner scanner;
    private String symbolString;
    private char[] masSymbols;
    public Symbol() {
        scanner = new Scanner(System.in);
        symbolString = null;
        masSymbols = new char[0];
    }
    public char getSymbol() {
        System.out.print("Enter symbol: ");
        symbolString = scanner.nextLine();
        if (symbolString.isEmpty() || symbolString.length() > 1)
            getSymbol();
        else
            masSymbols = symbolString.toCharArray();
        return masSymbols[0];
    }
}

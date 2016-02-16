/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dll.dll;
import java.util.Scanner;
public class Text {
    private Scanner scanner;
    private String text;
    public Text() {
        scanner = new Scanner(System.in);
        text = null;
    }
    public String getText() {
        System.out.print("Enter text: ");
        text = scanner.nextLine();
        if (text.isEmpty())
            getText();
        return text;
    }
}
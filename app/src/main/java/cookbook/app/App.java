/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package cookbook.app;

import cookbook.list.LinkedList;

import static cookbook.utilities.StringUtils.join;
import static cookbook.utilities.StringUtils.split;
import static cookbook.app.MessageUtils.getMessage;

import org.apache.commons.text.WordUtils;

public class App {
    public static void main(String[] args) {
        LinkedList tokens;
        tokens = split(getMessage());
        String result = join(tokens);
        System.out.println(WordUtils.capitalize(result));
    }
}

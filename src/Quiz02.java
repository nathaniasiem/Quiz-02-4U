/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author simon7323
 */
public class Quiz02 {

    public String reverseString(String word) {
        //create a base case
        if (word.length() < 1) {
            return word;
        }
        //create a variable to set the first index
        String firstWord = word.substring(0, word.length() - 1);
        //create a variable to set the ending index
        String endWord = word.substring(word.length() - 1);
        //call the method that will return the ending index in front and the beginning index to be at the end
        return (endWord) + reverseString(firstWord);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create variable to test boundaries
        Quiz02 test = new Quiz02();
        //call the method 
        System.out.println(test.reverseString("king"));
        System.out.println("--------------------");
        System.out.println(test.reverseString("car"));
        System.out.println("--------------------");
        System.out.println(test.reverseString("tree"));
    }
}

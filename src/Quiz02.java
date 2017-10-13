/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author simon7323
 */
public class Quiz02 {
    public String reverseString(String word){
     //create a base case
        if(word.length()<=1){
         return word;
     }
     //create a variable to 
     String firstWord=word.substring(0,word.length());
        System.out.println(firstWord);
//     String endWord = word.substring(word.length(),0); 
//        System.out.println(endWord);
    return reverseString(word);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create variable to test boundaries
        Quiz02 test = new Quiz02();
        System.out.println(test.reverseString("king"));
    }
}

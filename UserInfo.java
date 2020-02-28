/*
This project will be graded on:
1. Pseudocode (4 points): Your pseudocode must accurately describe the steps of the program.
2. Documentation and Readability (5 points): Your code must be fully commented and employ
standard Java-style conventions.
3. User-Friendliness / User-Input (8 points): GUI present and prompts are easy to understand.
4. Encapsulation (8 points): A standalone class is present with private instance variables, at least one
constructor, and relevant accessor and mutator methods.
5. Driver Class (2 points): A driver class is present.
6. User-Controlled Exit (2 points): The user is asked if they want to continue or exit the program.
7. Project Requirements (19 points):
a. Ask user for registration info (2 points)
b. Remove leading/trailing whitespace (1 point)
c. Convert all letters to uppercase (1 point)
d. Complete required character substitutions (1 point)
e. Swap the first half of the string with the second (6 points; 3 each for even- and odd-length
strings)
f. Swap the first 2 characters of the string with the last 2 (2 points)
g. Swap the middle characters (6 points; 3 each for even- and odd-length strings)

TOTAL: 48 points
*/

import java.lang.Math;

public class UserInfo {
  //declare
  private String name;
  private String address;
  private String username;
  private String password;
  
  //constructor
  public UserInfo() {
    //initialize
    String name="";
    String address="";
    String username="";
    String password="";
  }  
  
  //combine all the methods
  public String encrypt(String s){
    s = removeWhitespaceAndConvertToUpper(s);
    s = substitute(s);
    s = swapHalfsForEncrypt(s);
    s = swapFirst2WithLast2(s);
    s = swapMiddleChars(s);
    
    return s;
  }  
  
  public String removeWhitespaceAndConvertToUpper(String s) {
    //remove all whitespaces from the password
    s = s.trim();
    s = s.toUpperCase();
    
    return s
  }
  
  public String substitute(String s) {
    s = s.replace ("A", "@");
    s = s.replace ("E", "=");
    s = s.replace ("I", "!");
    s = s.replace ("J", "?");
    s = s.replace ("O", "*" );
    s = s.replace ("P", "#");
    s = s.replace ("R", "&");
    s = s.replace ("S", "$");
    s = s.replace ("T", "+");
    s = s.replace ("V", "^");
    s = s.replace ("X", "%");
    s = s.replace (" ", "_");
    
    return s
  }
  
  public String swapHalfsForEncrypt(String s) {
    int count=0;
    for (int i=0; i<s.length(); i++) {
      if (Character.isDigit(s.charAt(i))) {
        count++;  
        // Even number
        if(count % 2 == 0){
          s.endIndex = count/2-1;
          s_sub = s.substring(0,s.endIndex);
          last_sub = s.substring(s.endIndex+1);
          new_str = last_sub + s_sub;
        } else {
          s.endIndex = count/2;
          s_sub = s.substring(0, s.endIndex);
          last_sub = s.substring(s.endIndex+1);
          new_str = last_sub + s_sub;
        }
      }
    }
    
    return new_str;
  }
  
  // swapFirst2WithLast2
  public String swapFirst2WithLast2(String s) {
    first_sub = new_str.substring(0,2);
    middle_sub = new_str.substring(2,count-2);
    last_sub = new_str.substring(count-2, count);        
    new_str = last_sub + middle_sub + first_sub;
    
    return new_str;
  }
  
  //swapMiddleChars
  public String swapMiddleChars(String s) {
    // even number
    if(count % 2 == 0){
      first_str = s.substring(count/2-2,count/2);
      second_str = s.substring(count/2,count/2+2);
      first_remain = s.substring(0,count/2-2);
      second_remain = s.substring(count/2+2, count);
      new_str = first_remain + second_str + first_str + second_remain;
    }
    // odd number
    if(count % 2 != 0){
      first_str = s.substring(count/2+1-2,count/2+1);
      second_str = s.substring(count/2+1,count/2+3);
      first_remain = s.substring(0,count/2+1-2);
      second_remain = s.substring(count/2+3, count);
      new_str = first_remain + second_str + first_str + second_remain;
    }
    return new_str;
  }
}

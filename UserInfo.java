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
    this.name = "";
    this.address = "";
    this.username = "";
    this.password = "";
  }

  //name
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  //address
  public String getAddress() {
    return address;
  }
  public void setAddress(String address) {
    this.address = address;
  }
  //username
  public String getUsername() {
    return username;
  }
  public void setUsername(String username) {
    this.username = username;
  }
  //password
  public String getPassword() {
    return password;
  }
  public void setPassword(String password) {
    this.password = password;
  }
  
  //combine all the methods
  public String encrypt(String input){
    input = removeWhitespaceAndConvertToUpper(input);
    input = substitute(input);
    input = swapHalfsForEncrypt(input);
    input = swapFirst2WithLast2(input);
    input = swapMiddleChars(input);
    
    return input;
  }  
  
  public String removeWhitespaceAndConvertToUpper(String input) {
    //trims and makes uppercase
    return input.trim().toUpperCase();
  }
  
  public String substitute(String input) {
    return input
    .replaceAll("A", "@")
    .replaceAll("E", "=")
    .replaceAll("I", "!")
    .replaceAll("J", "?")
    .replaceAll("O", "*")
    .replaceAll("P", "#")
    .replaceAll("R", "&")
    .replaceAll("S", "//$") //thx stack overflow
    .replaceAll("T", "+")
    .replaceAll("V", "^")
    .replaceAll("X", "%")
    .replaceAll(" ", "_");
  }
  
  public String swapHalfsForEncrypt(String input) {
    return
    input.substring((int)Math.ceil((float)input.length() / 2), input.length()) +
    input.substring(0, (int)Math.ceil((float)input.length() / 2));
  }
  
  // swapFirst2WithLast2
  public String swapFirst2WithLast2(String input) {
    return
    input.substring(input.length() - 2, input.length()) +
    input.substring(2, input.length() - 2) +
    input.substring(0, 2);
  }
  
  //swapMiddleChars
  public String swapMiddleChars(String input) {
    return
    input.substring(0, (int)Math.ceil((float)input.length() / 2) - 2) +
    input.substring((int)Math.ceil((float)input.length() / 2), (int)Math.ceil((float)input.length() / 2) + 2) +
    input.substring((int)Math.ceil((float)input.length() / 2) - 2, (int)Math.ceil((float)input.length() / 2)) +
    input.substring((int)Math.ceil((float)input.length() / 2) + 2, input.length());
  }
    
    
    
    //toString
    public String toString() {
        return "Name:"+name+"\n"+"Address:"+address+"\n"+"Username:"+username+"\n"+"Encrypted Password:"+ password;
    }
}
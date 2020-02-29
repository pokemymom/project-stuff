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

public class UserInfo
{
// strings, ints, and chars; evenOdd sees if there is an even or odd amount of characters in the string or not
private String name, address, user, encrypt, str1 = "", str2 = "", str3 = "";
private int evenOdd = 0, length, halfLength, halfLength2;
private Character C;
public UserInfo()
{
name = "";
address = "";
user = "";
}
//gets and sets name
public void setName(String Name)
{
name = Name;
}
public String getName()
{
return name;
}
// gets and sets address
public void setAddress(String adr)
{
address = adr;
}
public String getAddress()
{
return address;
}
// gets and sets username
public void setUN(String username)
{
user = username;
}

public String getUN()
{
return user;
}
//returns the encrypted string
public String encrypt(String s)
{
// resets the variables if the user restarts the program
str1 = ""; str2 = ""; str3 = "";
if (s.length() < 4){
s = "4more";
encrypt = s;}
else{
//sees if the string has an even or odd amount of characters and if it has odd, then changes evenOdd to 1
length = s.length();
if (length % 2 != 0){
halfLength = ((length - 1) / 2 + 1);
evenOdd = 1;}
else
halfLength = length / 2;
s =
swapMiddleChars(swapFirst2WithLast2(swapHalfsForEncrypt(substitute(removeWhitespaceAndConvertToUpper(s)))));
encrypt = s;}
return s;
}
//removes the white space and changes string to uppercase
public String removeWhitespaceAndConvertToUpper (String s)
{
// removes the whitespace
s = s.trim();
//changes all string to uppercase
s = s.toUpperCase();
return s;
}
//substitutes specific string with differrent symbols
public String substitute(String s)
{
s = s.replace("A", "@");
s = s.replace("E", "=");
s = s.replace("I", "!");
s = s.replace("J", "?");
s = s.replace("O", "*");
s = s.replace("P", "#");
s = s.replace("R", "&");
s = s.replace("S", "$");
s = s.replace("T", "+");
s = s.replace("V", "^");
s = s.replace("X", "%");
s = s.replace(" ", "_");
return s;
}
//swap the last half with the front

public String swapHalfsForEncrypt(String s)
{
// stores the first half  of the string
for (int count = 0; count < halfLength; count++){
C = s.charAt(count);
str1 = str1 + C.toString();}
// stores the second half of the string
for (int count = halfLength; count < length; count++){
C = s.charAt(count);
str2 = str2 + C.toString();}
// drags the second half in front of the first half
s = str2 + str1;
return s;
}
// swaps the last 2 with the first 2

public String swapFirst2WithLast2(String s)
{
// makes the 2 vairables back to "" instead of last string
str1 = "";
str2 = "";
//gets the first 2 characters and turns it to a strImg
for (int count = 0; count < 2; count++){
C = s.charAt(count);
str1 = str1 + C.toString();}
// gets the last 2 characters and turns it into a string
for (int count = length - 2; count < length; count++){
C = s.charAt(count);
str2 = str2 + C.toString();}
// gets everything except the 1st and last 2 letters
for (int count = 2; count < length - 2; count++){
C = s.charAt(count);
str3 = str3 + C.toString();}
//puts the string in the correct order
s = str2 + str3 + str1;
return s;
}
// takes the center 4 characters and swaps the first half of those 4 to the last half
public String swapMiddleChars(String s)
{
// resets the variable
str3 = "";
// gets the first half and subtract it by 2 and gets it from characters to string
for (int counter = 0; counter < halfLength - 2; counter++){
C = s.charAt(counter);
str3 = str3 + C.toString();}

// gets the characters for the rest of the first half and turns to string and adds on to str3
for (int counter = halfLength; counter < halfLength + 2; counter++){
C = s.charAt(counter);
str3 = str3 + C.toString();}
// gets the next two characters and turns it to string and adds onto str3
for (int counter = halfLength - 2; counter < halfLength; counter++){
C = s.charAt(counter);
str3 = str3 + C.toString();}
// gets the rest of characters and turns it into string and adds it onto str3
for (int counter = halfLength + 2; counter < length; counter++){
C = s.charAt(counter);
str3 = str3 + C.toString();}
return str3;
}
public String getEncrypt()
{
return encrypt;
}
//turns all the info to string and then returns the info
public String toString(){
return "Name: " + name + "\nAddress: " + address + "\nUsername: " + user + "\nEncrypted";
Password:" + encrypt + “\n”";
}
}

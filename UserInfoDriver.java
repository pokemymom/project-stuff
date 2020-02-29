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

import javax.swing.*;

public class UserInfoDriver {
  public static void main(String[] args) {
    // Test methods
    JFrame f = new JFrame();
    UserInfo user = new UserInfo();
    
    do {
      String name = JOptionPane.showInputDialog(f, "Enter a new name");
      user.setName(name);
      
      String address = JOptionPane.showInputDialog(f, "Enter a new address");
      user.setAddress(address);
      
      String username = JOptionPane.showInputDialog(f, "Account Created!\nEnter a new username");
      user.setUsername(username);
      
      String password = user.encrypt(JOptionPane.showInputDialog(f, "Enter a new password"));
      user.setPassword(password);
      
      JOptionPane.showMessageDialog(f, user.getName() + "\n" + user.getAddress() + "\n" + user.getUsername() + "\n" + user.getPassword());
    } while (JOptionPane.showConfirmDialog(f, "do you want to repeat?", "exit", JOptionPane.YES_NO_OPTION) == 0);
  }
}

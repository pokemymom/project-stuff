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
        
      JOptionPane.showMessageDialog(f, user.getName() + "\n" + );
    } while (JOptionPane.showConfirmDialog(f, "do you want to repeat?", "exit", JOptionPane.YES_NO_OPTION) == 0);
  }
}

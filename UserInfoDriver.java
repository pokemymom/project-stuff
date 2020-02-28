import javax.swing.*;

public class UserInfoDriver {
    public static void main(String[] args) {
        // Now you can test my methods as well!
        // This time Karen is the manager. Who's she gonna call, her boss?
        JFrame karen = new JFrame();
        UserInfo ourBelovedUser = new UserInfo();
            
        do {
            ourBelovedUser.setName(JOptionPane.showInputDialog(karen, "Enter a new name"));
            ourBelovedUser.setAddress(JOptionPane.showInputDialog(karen, "Enter a new address"));
            ourBelovedUser.setUsername(JOptionPane.showInputDialog(karen, "Account Created!\nEnter a new username"));
            ourBelovedUser.setPassword(ourBelovedUser.encrypt(JOptionPane.showInputDialog(karen, "Enter a new password")));
        
            // test toString()
            JOptionPane.showMessageDialog(karen, ourBelovedUser);
        } while (JOptionPane.showConfirmDialog(karen, "Do you wish to exit?", "Exit", JOptionPane.YES_NO_OPTION) == 1);
        // yes    = 0
        // no     = 1
        // cancel = 2
        
        
        
        
        System.out.println("\n\n"); 
        
        
        
        
        
        
        
        // MY OWN TESTING METHODS
        // Testing if get/set methods work properly.
        // Putting in the wrong name
        UserInfo kevin = new UserInfo();
        kevin.setName("William"); // William
        kevin.setAddress("Antarctica"); // BRRR very cold
        kevin.setUsername("BadDiscordChatter"); // oh no I'm bad at discord lmao
        kevin.setPassword("password1"); // bad password
        
        System.out.println(kevin.getName()); // William
        System.out.println(kevin.getAddress()); // Antarctica
        System.out.println(kevin.getUsername()); // Antarctica
        System.out.println(kevin.getPassword()); // Antarctica
        
        System.out.println("\n\n");
        
        // Oh no, I put in the wrong name! Let me change it!
        kevin.setName("Kevin"); // Setting the name to the correct name
        kevin.setAddress("69 Nassau Drive"); // ah yes 69 funny funny
        kevin.setUsername("Natsumi");
        kevin.setPassword("correct horse battery staple"); // https://xkcd.com/936/
        
        System.out.println(kevin.getName()); // Kevin
        System.out.println(kevin.getAddress()); // 69 Nassau Drive
        System.out.println(kevin.getUsername()); // Natsumi
        System.out.println(kevin.getPassword()); // correct horse battery staple
        System.out.println("\n\n");
        
        
        // PASSWORD TESTING
        
        
        // RemoveWhitespaceAndConvertToUpper
        // password with trailing whitespace.
        String password = "   abcdefghijkLMNopqrStuvwXyz   ";
        System.out.println("RemoveWhitespaceAndConvertToUpper: " + password);
        System.out.println("RemoveWhitespaceAndConvertToUpper: " + kevin.removeWhitespaceAndConvertToUpper(password));
        
        // Subsitute
        password = "A B C D E F G H I J K L M N O P Q R S T U V W X Y Z";
        System.out.println("Substitute:                        " + password);
        System.out.println("Substitute:                        " + kevin.substitute(password));
        
        System.out.println("");
        
        // SwapHalfsForEncrypt even
        password = "0123456789";
        System.out.println("SwapHalfsForEncrypt:               " + password);
        System.out.println("SwapHalfsForEncrypt:               " + kevin.swapHalfsForEncrypt(password));
        
        System.out.println("");
        
        // SwapHalfsForEncrypt odd
        password = "123456789";
        System.out.println("SwapHalfsForEncrypt:               " + password);
        System.out.println("SwapHalfsForEncrypt:               " + kevin.swapHalfsForEncrypt(password));
        
        System.out.println("");
        
        // SwapFirst2WithLast2 even
        password = "0123456789";
        System.out.println("SwapFirst2WithLast2:               " + password);
        System.out.println("SwapFirst2WithLast2:               " + kevin.swapFirst2WithLast2(password));
        
        System.out.println("");
        
        // SwapFirst2WithLast2 odd
        password = "123456789";
        System.out.println("SwapFirst2WithLast2:               " + password);
        System.out.println("SwapFirst2WithLast2:               " + kevin.swapFirst2WithLast2(password));
        
        System.out.println("");
        
        // SwapMiddleChars even
        password = "0123456789";
        System.out.println("SwapMiddleChars:                   " + password);
        System.out.println("SwapMiddleChars:                   " + kevin.swapMiddleChars(password));
        
        System.out.println("");
        
        // SwapMiddleChars odd
        password = "123456789";
        System.out.println("SwapMiddleChars:                   " + password);
        System.out.println("SwapMiddleChars:                   " + kevin.swapMiddleChars(password));
        
        System.out.println("");
        
        // Encrypt
        password = "   youre G0nnA h7v3 a b7d t1me   ";
        System.out.println("Encrypt:                           " + password);
        System.out.println("Encrypt:                           " + kevin.encrypt(password));
    }
}

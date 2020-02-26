import java.lang.Math;
import javax.swing.*;  

public class UserInfo {
  JFrame f;
UserInfo(){
    f= new JFrame();
    String name=JOptionPane.showInputDialog(f, "Enter Name");
    String address=JOptionPane.showInputDialog(f, "Enter Address");
    String username=JOptionPane.showInputDialog(f, "Enter Username");
    String password=JOptionPane.showInputDialog(f, "Enter Password");
    }  
    
    public String encrypt(String s){
    //remove all whitespaces from the password
    s = s.trim();
    s = s.toUpperCase();
        
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
          }
    // Odd number
        if(count % 2 != 0){
            s.endIndex = count/2;
            s_sub = s.substring(0, s.endIndex);
            last_sub = s.substring(s.endIndex+1);
            new_str = last_sub + s_sub;
          }
          
    // swapFirst2WithLast2
           first_sub = new_str.substring(0,2);
           middle_sub = new_str.substring(2,count-2);
           last_sub = new_str.substring(count-2, count);        
           new_str = last_sub + middle_sub + first_sub;
          
   //swapMiddleChars
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
    public static void main(String[] args) {  
        new UserInfo();
        System.out.println(encrypt(String password){
    }
                           }



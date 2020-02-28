import java.lang.Math;

public class UserInfo {
  private String name;
  private String address;
  private String username;
  private String password;
  
  public UserInfo() {
    String name="";
    String address="";
    String username="";
    String password="";
  }  
    
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
        }
        // Odd number
        if(count % 2 != 0){
          s.endIndex = count/2;
          s_sub = s.substring(0, s.endIndex);
          last_sub = s.substring(s.endIndex+1);
          new_str = last_sub + s_sub;
        }
      }
    }
  }
  
  // swapFirst2WithLast2
  public String swapFirst2WithLast2(String s) {
    first_sub = new_str.substring(0,2);
    middle_sub = new_str.substring(2,count-2);
    last_sub = new_str.substring(count-2, count);        
    new_str = last_sub + middle_sub + first_sub;
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

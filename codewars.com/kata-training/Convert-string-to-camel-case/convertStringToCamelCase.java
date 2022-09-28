import java.lang.StringBuilder;
class Solution{

  static String toCamelCase(String s){
    StringBuilder returnString = new StringBuilder();
    boolean newWord = false;
    for (int i = 0; i < s.length(); i++){
      char checkChar = s.charAt(i);
      if (checkChar == '-' || checkChar == '_'){
        newWord = true;
      }
      else if (newWord){
        newWord = false;
        if (checkChar >= 'a' && checkChar <= 'z'){
          returnString.append((char) (checkChar - 32));
        }
        else {
          returnString.append(checkChar);
        }
      }
      else{
        returnString.append(checkChar);
      }
    }
    return returnString.toString();
  }
}

import java.util.ArrayList;
public class Kata
{
  public static String reverseWords(final String original)
  {
    String reversed = "";
    ArrayList character = new ArrayList<Character>();
    for (int i = 0; i < original.length(); i++){
      if (original.charAt(i) == ' '){
        for (int j = character.size() - 1; j >= 0; j--){
          reversed += (character.get(j));
        }
        character = new ArrayList<Character>();
        reversed += " ";
      }
      else{
        character.add(original.charAt(i));
      }
    }
    for (int i = character.size() - 1; i >= 0; i--){
      reversed += (character.get(i));
    }
    return reversed;
  }
}

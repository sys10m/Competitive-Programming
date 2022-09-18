public class Solution {

  public int solution(int number) {
    if (number >= 0){
      int solution = 0;
      for (int i = 1; i*3 < number; i++){
        solution += (i * 3);
        if (i * 5 < number){
          solution += (i * 5);
          if (i * 15 < number){
            solution -= (i * 15);
          }
        }
      }
      return solution;
    }
    else{
      return 0;
    }
  }
}

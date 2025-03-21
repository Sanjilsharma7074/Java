package Linear_Search;

//To search for a character in a String
public class _01_Search_in_String {
  static boolean search(String str, char target){

    if(str.length() ==0 ) return false;

    // for(int i=0 ; i<str.length() ; i++){
    //   if(target == str.charAt(i)) return true;
    // }
    // return false;

    for(char ch: str.toCharArray()){
      if(ch == target) return true;
    }
    return false;
  }
  public static void main(String[] args) {
    String name = "Sanjil";
    char target = 'a';
    boolean ans = search(name, target);
    System.out.println(ans);
  }
}

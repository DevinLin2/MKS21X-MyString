public class MyString implements CharSequence,Comparable<CharSequence>{
  private char[] data;
  public MyString(CharSequence s){
    data = new char[s.length()];
    for (int i = 0; i < s.length(); i++){
      data[i] = s.chatAt(i);
    }
  }
  public char charAt(int index) throws IndexOutOfBoundsException{ //implement indexOutOfBounds
    return data[index];
  }
  public int length(){
    return data.length;
  }
  public String subSequence(int start, int end) throws IndexOutOfBoundsException{
    String subSequence = "";
    for (int i = start; i < end; i++){
      ans += data.charAt[i];
    }
    return subSequence;
  }
  public String toString(){
    String ans = "";
    for (int i = 0; i < data.length; i++){
      ans += data[i];
    }
    return ans;
  }
  public int compareTo(CharSequence value) throws NullPointerException{
    if (data.length > value.length()){
      return 1;
    }
    if (data.length < value.length()){
      return -1;
    }
    for (int i = 0; i < data.length; i ++){
      if (!(data[i] == value.charAt(i))){
        if (data[i] > value.charAt(i)){
          return 1;
        }
        if (data[i] < value.charAt(i)){
          return -1;
        }
      }
    }
    return 0;
  }
}

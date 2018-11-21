public class MyString implements CharSequence,Comparable<CharSequence>{
  private char[] data;
  public MyString(CharSequence s){
    data = new char[s.length()];
    for (int i = 0; i < s.length(); i++){
      data[i] = s.chatAt(i);
    }
  }
  public char charAt(int index){ //implement indexOutOfBounds
    return data[index];
  }
  public int length(){
    return data.length;
  }
  public String subSequence(int start, int end){
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
}

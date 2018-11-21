public class MyString implements CharSequence,Comparable<CharSequence>{
  private char[] data;
  public MyString(CharSequence s){
    data = new char[s.length()];
  }
  public char charAt(int index){
    return data[index];
  }
  public int length(){
    return data.length;
  }
  public CharSequence subSequence(int start, int end){
  }
  public String toString(){
    ans = "";
    for (int i = 0; i < data.length; i++){
      ans += data[i];
    }
    return ans;
  }
}

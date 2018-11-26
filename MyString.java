public class MyString implements CharSequence,Comparable<CharSequence>{
  private char[] data;
  public MyString(CharSequence s){
    data = new char[s.length()];
    for (int i = 0; i < s.length(); i++){
      data[i] = s.charAt(i);
    }
  }
  public char charAt(int index) throws IndexOutOfBoundsException{ //implement indexOutOfBounds
    if (index < 0 || index >= data.length){
      throw new IndexOutOfBoundsException("index out of bounds");
    }
    return data[index];
  }
  public int length(){
    return data.length;
  }
  public String subSequence(int start, int end) throws IndexOutOfBoundsException{
    if (start < 0 || end < 0 || end > data.length || start > end){
      throw new IndexOutOfBoundsException("index out of bounds");
    }
    String subSequence = "";
    for (int i = start; i < end; i++){
      subSequence += data[i];
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
    if (value == null){
      throw new NullPointerException("enter valid value to compare");
    }
    for (int i = 0; i < data.length && i < value.length(); i ++){
      if (!(data[i] == value.charAt(i))){
        if (data[i] > value.charAt(i)){
          return 1;
        }
        if (data[i] < value.charAt(i)){
          return -1;
        }
      }
    }
    if (data.length > value.length()){
      return 1;
    }
    if (data.length < value.length()){
      return -1;
    }
    return 0;
  }
}

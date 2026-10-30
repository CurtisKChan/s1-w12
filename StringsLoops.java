public class StringsLoops{
    public StringsLoops(){
  
    }
  // sting destroy loop
  // string stays intact
    public int length(String s){
      int count = 0;
      while(!s.equals("")){
        s = s.substring(1);
        count++;
      }
      return count;
    }
  
    // "sean", 3 --> "seanseansean"
    //concatination means + (join)
    public String copy(String s, int num){
      int i = 1;
      String print = "";
      for(i = 1; i <= num; i++){
        print = print + s;
      }
      return print;
    }
  
    public String interweaving(String s1, String s2){
      String word = "";
      for(int i = 1; i <= length(s1); i++){
        word += s1.substring(i-1,i) + s2.substring(i-1,i);
      }
      return word;
    }
  
  
  }
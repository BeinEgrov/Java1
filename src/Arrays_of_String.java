public class Arrays_of_String {
    public static void main(String[] args) {
        String[] strings = new String[3];
        strings[0] = "Привет";
        strings[1] =", я";
        strings[2] =" Влад А4";
       // for(int i=0; i< strings.length; i++){
        //    System.out.print(strings[i]);
      //  }
        for(String string:strings){
            System.out.println(strings);
        }
    }
}

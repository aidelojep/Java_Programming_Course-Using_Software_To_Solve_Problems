public class Functions {
   public static int g(int x){
       if (x < 9)
       {
           return 9;
       }
       if (x < 7)
       {
           return 7;
       }
       if (x < 4)
       {
           return 4;
       }
       return 0;
   }

    public static void main(String[] args) {
        System.out.println(g(5));
    }

}

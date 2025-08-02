// Source code is decompiled from a .class file using FernFlower decompiler.
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class BRRead{
   BRRead(){
   }
   public static void main(String[] var0) throws IOException {
      BufferedReader var2 = new BufferedReader(new InputStreamReader(System.in));
      System.out.println("enter char");
      char var1;
      do{
         var1 = (char)var2.read();
         System.out.println(var1);
      } while(var1 != 'q');
   }
}
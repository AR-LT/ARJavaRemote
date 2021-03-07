package fundamentals.examples;

//import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
     //   Scanner scanner = new Scanner(System.in);
     //   String tekstas = scanner.nextLine();
   //     String [] zodis = tekstas.split("[ ,.?]");
        String [] zodis = {"andrius", "the", "rad" };
       for (int i=0; i< zodis.length; i++){
           if (zodis[i].equals("the") ){
               System.out.println("bebras");
           } else {
               System.out.println("gyvate");
           }
       }


    }

}

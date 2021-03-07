package fundamentals.examples;

public class test5 {
    public static void main(String[] args) {
        String [] zodis = {"andrius", "radziukynas","the!", "rad" };
        for (int i=0; i< zodis.length; i++){
            if (zodis[i].equals("the!") ){
                break;
            } else {
                System.out.print(zodis[i] + " ");
            }
        }


    }
}

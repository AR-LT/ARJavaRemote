package advanced.classes.local_classes;

public class LocalMainExample {
    public static void main(String[] args) {
       for (int i=0; i<50; i++) {
           class Pair {
               String key;
               int value;

               public Pair(String key, int value) {
                   this.key = key;
                   this.value = value;
               }
               public void print (){
                   System.out.println(value);
               }
           }
           Pair pair = new Pair("key", i);
           pair.print();
       }
       // Local class is not visible. Lokali klase matoma siuo atveju tik for cikle, jai noreciau matyti
       // main metode tada turiu i6kelti i main.
       // Pair pair = new Pair ("key", i);
    }
}

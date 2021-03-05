package advanced.classes.anonymous_classes;

public class anonymousMainExample {
    public static void main(String[] args) {

        HttpExecuter executer = new HttpExecuter() {
            public String executeRequest() {
                return "Uz lango sniegas";
            }
        };
        System.out.println(executer.executeRequest());
    }
}

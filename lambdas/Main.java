package lambdas;
public class Main {
    public static void main(String[] args) {
        
        // Call a interface directly
        MyService interfaceTest = (String value) -> {
            System.err.println(value);
        };

        interfaceTest.Execute("One Implementation");

        MyService interfaceTest2 = new MyService() {

            @Override
            public void Execute(String value) {
                System.err.println(value);
            }
            
        };

        interfaceTest2.Execute("Other implementation");
    }
}

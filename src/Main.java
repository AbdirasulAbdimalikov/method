//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int maxNumber = max(5000, 7000);
        System.out.println(maxNumber);
    }
        public static int max ( int a, int b){
            return a >= b ? a : b;
        }
    }
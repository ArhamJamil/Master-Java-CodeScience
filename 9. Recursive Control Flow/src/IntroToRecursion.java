public class IntroToRecursion {

    /**
     This code provides an introduction to recursion using a sequence of method calls,
     but it’s not a true recursive solution because each method calls the next one explicitly
     */

    public static void main(String[] args) {
        print(1);
    }

    public static  void print(int n){
        System.out.println(n);
        print2(n+1);
    }

    public static  void print2(int n){
        System.out.println(n);
        print3(n+1);
    }

    public static  void print3(int n){
        System.out.println(n);
        print4(n+1);
    }

    public static  void print4(int n){
        System.out.println(n);
        print5(n+1);

    }
    public static  void print5(int n){
        System.out.println(n);

    }
}

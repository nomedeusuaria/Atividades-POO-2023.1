public class Main {
    public static void main(String[] args) {
//       for (int i = 0; i <= 20; i++) System.out.println(fib1(i));
//
//       fib2(20);
//
//       fib3(20);

        Pessoa sarah = new Pessoa("eu", 50, "A");
//        System.out.println(sarah.getNome() + ", " + sarah.getSexo());
        sarah.falar("oi ");
    }
    public static int fib1(int n){
        if(n == 1 || n <= 0)
            return (0);
        else if(n == 2)
            return (1);

        return fib1(n - 1) + fib1(n - 2);
    }

    public static void fib2(int i){
        int n1 = 0, n2 = 1, n3;
        for (int n = 1; n <= i; n++){

            if(n == 1) System.out.println(0);
            if(n == 2) System.out.println(1);

            n3 = n2 + n1; //somando o ultimo e penultimo elementos
            n1 = n2;
            n2 = n3;

            System.out.println(n3);
        }
    }

    public static void fib3(int i){
        int n = 1, n1 = 0, n2 = 1, n3;
        while(n <= i){
            if(n == 1) System.out.println(0);
            if(n == 2) System.out.println(1);

            n3 = n2 + n1; //somando o ultimo e penultimo elementos
            n1 = n2;
            n2 = n3;

            System.out.println(n3);

            n++;
        }
    }
}

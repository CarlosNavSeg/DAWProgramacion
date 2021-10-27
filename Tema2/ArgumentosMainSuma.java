public class ArgumentosMainSuma {
    public static void main(String[] args) {

        System.out.println("Argumentos:" + args.length);

        int suma = 0;

        for(int i = 0; i<args.length ; i++) {
            int temp = Integer.parseInt(args[i]);
            suma = temp + suma;
        }
        System.out.println(suma);
    }
}

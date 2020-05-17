public class Main {
    public static void main(String[] args) {
        int a=1200000;
        int b=0;
        for(int i=2;i<=1200000;i++ ){
            if (a%i==0)
               b++;
        }
        System.out.println(b);
    }
}

package CH06.random1;

public class DieTester {
    public static void main(String[] args){
        Die d = new Die(6);
        final int TRIES = 10;
        for(int i = 1; i <= TRIES; i++){
            int n = d.cast();
            System.out.print(n+" ");
        }
        System.out.println();
    }
}

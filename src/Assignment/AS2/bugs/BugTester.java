package Assignment.AS2.bugs;

public class BugTester{
    public static void main(String[] args){
        Bug bugsy = new Bug(10);
        bugsy.move();
        System.out.println("Position: " + Bug.getPosition());
        System.out.println("Expected: 11");

        bugsy.turn();
        bugsy.move();
        System.out.println("Position: " + Bug.getPosition());
        System.out.println("Expected: 10");
    }
}
package Assignment.AS2.bugs;

public class Bug {
    /**
     a bug moving along a horizontal line
     initially the bug moves to the right, but it can turn to change its direction.
     */

    private static int position;
    private static boolean direction;

    //constructor
    public Bug(int initialPosition){
        position = initialPosition;
        direction = true;
    }

    public void turn(){
        if(direction == true) direction = false;
        else direction = true;
    };

    public void move(){
        if(direction == true) position += 1;
        else position -= 1;
    };
    public static int getPosition(){
        return position;
    };
}

package CH06.random2;
import java.util.Random;

/**
 This class simulates a needle in the Buffon needle experiment
 */

public class Needle {
    private Random generator;
    private int hits, tries;

    public Needle(){
        hits = 0;
        tries = 0;
        generator = new Random();
    }

    public void drop(){
        double ylow = 2 * generator.nextDouble();
        double angle = 100 * generator.nextDouble();

        double yhigh= ylow + Math.sin(Math.toRadians(angle));
        if(yhigh >= 2) hits++;
        tries++;
    }

    public int getHits(){return hits;}
    public int getTries(){return tries;}
}

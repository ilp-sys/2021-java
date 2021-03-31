package Assignment.AS2.roach;

public class RoachPopulation {
    private static int population;

    //constructor
    public RoachPopulation(int initial_population){ population = initial_population; }

    //methods
    public void breed(){ population *= 2; }

    public void spray(double percent){ population *= ((100 - percent)/100); }

    public int getRoaches(){ return population; }
}

package Assignment.AS2.roach;

public class RoachSimulation{
    public static void main(String[] args){
        RoachPopulation rp = new RoachPopulation(10);
        System.out.println("Initial Population: " + rp.getRoaches());

        rp.breed();
        rp.spray(10);
        System.out.println("Population: " + rp.getRoaches());

        rp.breed();
        rp.spray(10);
        System.out.println("Population: " + rp.getRoaches());

        rp.breed();
        rp.spray(10);
        System.out.println("Population: " + rp.getRoaches());

        rp.breed();
        rp.spray(10);
        System.out.println("Population: " + rp.getRoaches());
    }
}
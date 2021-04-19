package Assignment.AS3.spectrum;
import java.util.Scanner;
import static java.lang.Math.pow;

public class Spectrum {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.printf("wave length(0) or frequency(1)?: ");
        double bln = Double.parseDouble(in.next());

        if(bln == 0){
            System.out.printf("Wavelength: ");
            double wl = Double.parseDouble(in.next());
            if (wl > 0.1) System.out.printf("Radio Waves, Frequency < 3 * 10^9");
            else if(wl <= 0.1 && wl > 0.001) System.out.printf("Microwaves, Frequency 3 * 10^9 to 3 * 10^11");
            else if(wl <= 0.001 && wl > 0.0000007) System.out.printf("Infrared, Frequency 3 * 10^11 to 4 * 10^14");
            else if(wl <= 0.0000007 && wl > 0.0000004) System.out.printf("Visible lights, Frequency 4 * 10^14 to 7.5 * 10^14");
            else if(wl <= 0.0000004 && wl > 0.00000001) System.out.printf("Ultraviolet, Frequency 7.5 * 10^14 to 3 * 10^16");
            else if(wl <= 0.00000001 && wl > 0.00000000001) System.out.printf("X-rays, Frequency 3 * 10^16 to 3 * 10^19");
            else System.out.printf("Gamma rays, Frequency > 3*10^19");
        }
        else{
            System.out.printf("Frequency: ");
            double fr = Double.parseDouble(in.next());
            if(fr < 3*pow(10,9)) System.out.println("Radio Waves, Wavelength > 10^-1");
            else if(fr >= 3*pow(10,9) && fr < 3*pow(10,11)) System.out.println("Microwaves, Wavelength > 10^-1");
            else if(fr >= 3*pow(10,11) && fr < 4*pow(10,14)) System.out.println("Infrared, Wavelength > 10^-1");
            else if(fr >= 4*pow(10,14) && fr < 7.5*pow(10,14)) System.out.println("Visible lights, Wavelength > 10^-1");
            else if(fr >= 7.5*pow(10,14) && fr < 3*pow(10,16)) System.out.println("Ultraviolet, Wavelength > 10^-1");
            else if(fr >= 3*pow(10,16) && fr < 3*pow(10,19)) System.out.println("X-rays, Wavelength > 10^-1");
            else System.out.println("Gamma rays, Wavelength < 10^-11");
        }
    }
}

package CH06.triangle1;

public class Triangle {
    public int width;
    public Triangle(int aWidth){ width = aWidth;}
    public String toString(){
        String r = "";
        for(int i = 0; i < width; i++){
            for(int j = 0; j < i; j++)
                r += '*';
            r += "\n";
        }
        return r;
    }
}

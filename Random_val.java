import java.util.Random;

public class Random_val{
    Random r = new Random();
    public Random_val(){
    }

    public int generate_randomVal(double proba){
        if(r.nextDouble()<proba){
            return 0;
        }else{
            return 1;
        }
    }
}
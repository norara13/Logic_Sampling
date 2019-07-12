import java.util.ArrayList;

public class LS{
    public LS(){
    }
    public static void main(String[] args) {
        node A = new node("A");
        node B = new node("B");
        node C = new node("C");
        node D = new node("D");
        ArrayList<node> Bayesian_Network = new ArrayList<node>();
        Bayesian_Network.add(A);
        Bayesian_Network.add(B);
        Bayesian_Network.add(C);
        Bayesian_Network.add(D);
        A.set_output(C);
        B.set_output(C);
        C.set_input(A);
        C.set_input(B);
        C.set_output(D);
        D.set_input(C);
    }
}
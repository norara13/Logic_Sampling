import java.util.ArrayList;

public class Condition{
    private ArrayList<node> node_names = new ArrayList<node>();
    private ArrayList<Integer> node_vals = new ArrayList<Integer>();
    public Condition(){
    }
    public void set_Condition(node name,int val){
        this.node_names.add(name);
        this.node_vals.add(val);
    }
    public int get_val(int i){
        return this.node_vals.get(i);
    }
    public String get_name(int i){
        return this.node_names.get(i).get_name();
    }
    public int get_num(){
        return this.node_names.size();
    }
}
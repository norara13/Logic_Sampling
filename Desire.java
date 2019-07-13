public class Desire{
    private node node_name = new node();
    private int node_val;
    public Desire(){
    }
    public void set_Desire(node name,int val){
        this.node_name = name;
        this.node_val = val;
    }
    public int get_val(){
        return this.node_val;
    }
    public String get_name(){
        return this.node_name.get_name();
    }

}
public class Desire{
    private node node_name = new node();
    private int node_val;
    private int node_num;
    public Desire(){
    }
    public void set_Desire(node name,int num,int val){
        this.node_name = name;
        this.node_val = val;
        set_num(num);
    }
    public int get_val(){
        return this.node_val;
    }
    public String get_name(){
        return this.node_name.get_name();
    }

    public void set_num(int i){
        this.node_num = i;
    }

    public int get_num(){
        return this.node_num;
    }
}
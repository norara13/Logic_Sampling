import java.util.ArrayList;

public class node{
    private ArrayList<node> input_num = new ArrayList<node>();// 入力元
    private ArrayList<node> output_num = new ArrayList<node>();// 出力先
    private int node_name;// node名
    private ArrayList<Integer> node_value = new ArrayList<Integer>(); // nodeの取り得る値の数
    private ArrayList<Double> proba = new ArrayList<Double>();

    public node(String name){
        this.node_name = name;
    }

    public void set_input(node name){
        this.input_num.add(name);
    }

    public void set_output(node name){
        this.output_num.add(name);
    }

    public void set_nodeValue(int val){
        this.node_value.add(val);
    }

    public String get_nodeName(){
        return this.node_name;
    }

    public void set_probability(double proba){
        this.proba.add(proba);
    }
}
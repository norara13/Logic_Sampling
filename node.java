public class node{
    private String name;
    private int val;
    public node(){
    }
    public node(String name){
        this.name = name;
    }

    public void set_name(String name){
        this.name = name;
    }
    public String get_name(){
        return this.name;
    }
    public void set_val(int val){
        this.val = val;
    }
    public int get_val(){
        return this.val;
    }
}
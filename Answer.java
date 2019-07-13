import java.util.ArrayList;

public class Answer{
    ArrayList<String> names = new ArrayList<String>();
    ArrayList<Integer> vals = new ArrayList<Integer>();
    public Answer(){
    }
    
    public void add_Answer(String name,int val){
        this.names.add(name);
        this.vals.add(val);
    }

    public int get_num(){
        return this.names.size();
    }

    public String get_name(int i){
        return this.names.get(i);
    }

    public int get_val(int i){
        return this.vals.get(i);
    }
}
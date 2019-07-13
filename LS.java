import java.util.ArrayList;

public class LS{
    private int trails = 10000000;// 試行回数
    private ArrayList<node> net = new ArrayList<node>();
    private Desire desire = new Desire();
    private Condition condition = new Condition();
    private Answer ans;
    private int count;
    private int hoge;
    private int set;
    private boolean s;
    private boolean a;
    public LS(ArrayList<node> net,Desire d,Condition c){
        this.net = net;
        this.desire = d;
        this.condition = c;
    }

    public void run(){
        this.count = 0;
        this.hoge = 0;
        Random_val r = new Random_val();
        for(int i=0;i<trails;i++){
            this.ans = new Answer();
            this.set = this.condition.get_num();
            this.s = false;
            this.a = false;
            // A
            this.net.get(0).set_val(r.generate_randomVal(0.20));
            ans.add_Answer(this.net.get(0).get_name(), this.net.get(0).get_val());
            if(this.net.get(0).get_name()==this.desire.get_name()){
                this.s = true;
                if(set==0){
                    if(this.net.get(0).get_val()==this.desire.get_val()){
                        count++;
                    }else{
                        hoge++;
                    }
                    continue;
                }
                if(this.net.get(0).get_val()==this.desire.get_val()){
                    this.a = true;
                }
            }else{
                if(search_condition(this.net.get(0))==true){
                    continue;
                }else if(search_condition2(this.net.get(0))==true){
                    set--;
                    if(set==0&&this.s==true){
                        if(this.a==true){
                            count++;
                        }else{
                            hoge++;
                        }
                        break;
                    }
                }
            }

            // B
            this.net.get(1).set_val(r.generate_randomVal(0.85));
            ans.add_Answer(this.net.get(1).get_name(), this.net.get(1).get_val());
            if(this.net.get(1).get_name()==this.desire.get_name()){
                this.s = true;
                if(set==0){
                    if(this.net.get(1).get_val()==this.desire.get_val()){
                        count++;
                    }else{
                        hoge++;
                    }
                    continue;
                }
                if(this.net.get(1).get_val()==this.desire.get_val()){
                    this.a = true;
                }
            }else{
                if(search_condition(this.net.get(1))==true){
                    continue;
                }else if(search_condition2(this.net.get(1))==true){
                    set--;
                    if(set==0&&this.s==true){
                        if(this.a==true){
                            count++;
                        }else{
                            hoge++;
                        }
                        break;
                    }
                }
            }

            // C
            if(this.net.get(0).get_val()==0&&this.net.get(1).get_val()==0){
                this.net.get(2).set_val(r.generate_randomVal(0.10));
            }else if(this.net.get(0).get_val()==0&&this.net.get(1).get_val()==1){
                this.net.get(2).set_val(r.generate_randomVal(0.75));
            }else if(this.net.get(0).get_val()==1&&this.net.get(1).get_val()==0){
                this.net.get(2).set_val(r.generate_randomVal(0.30));
            }else{
                this.net.get(2).set_val(r.generate_randomVal(0.95));
            }
            this.ans.add_Answer(this.net.get(2).get_name(), this.net.get(2).get_val());
            if(this.net.get(2).get_name()==this.desire.get_name()){
                this.s = true;
                if(set==0){
                    if(this.net.get(2).get_val()==this.desire.get_val()){
                        count++;
                    }else{
                        hoge++;
                    }
                    continue;
                } 
                if(this.net.get(2).get_val()==this.desire.get_val()){
                    this.a = true;
                }
            }else{
                if(search_condition(this.net.get(2))==true){
                    continue;
                }else if(search_condition2(this.net.get(2))==true){
                    set--;
                    if(set==0&&this.s==true){
                        if(this.a==true){
                            count++;
                        }else{
                            hoge++;
                        }
                        break;
                    }
                }
            }

            // D
            if(this.net.get(2).get_val()==0){
                this.net.get(3).set_val(r.generate_randomVal(0.95));
            }else{
                this.net.get(3).set_val(r.generate_randomVal(0.80));
            }
            ans.add_Answer(this.net.get(3).get_name(), this.net.get(3).get_val());
            if(this.net.get(3).get_name()==this.desire.get_name()){
                this.s = true;
                if(set==0){
                    if(this.net.get(3).get_val()==this.desire.get_val()){
                        count++;
                    }else{
                        hoge++;
                    }
                    continue;
                }
                if(this.net.get(3).get_val()==this.desire.get_val()){
                    this.a = true;
                }
            }else{
                if(search_condition(this.net.get(3))==true){
                    continue;
                }else if(search_condition2(this.net.get(3))==true){
                    set--;
                    if(set==0&&this.s==true){
                        if(this.a==true){
                            count++;
                        }else{
                            hoge++;
                        }
                        continue;
                    }
                }
            }
        }
        System.out.println("試行回数: "+this.trails+", サンプル数"+(this.count+this.hoge));
        result_view();
    }

    public boolean search_condition(node now){
        boolean found = false;
        for(int i=0;i<this.condition.get_num();i++){
            if(now.get_name()==this.condition.get_name(i)){
                if(now.get_val()!=this.condition.get_val(i)){
                    found = true;
                }
            }
        }
        return found;
    }

    public boolean search_condition2(node now){
        boolean found = false;
        for(int i=0;i<this.condition.get_num();i++){
            if(now.get_name()==this.condition.get_name(i)){
                if(now.get_val()==this.condition.get_val(i)){
                    found = true;
                }
            }
        }
        return found;
    }

    public void result_view(){
        System.out.print("P("+this.desire.get_name()+" = "+this.desire.get_val()+"|");
        for(int i=0;i<this.condition.get_num();i++){
            System.out.print(this.condition.get_name(i)+" = "+this.condition.get_val(i));
            if(i+1!=this.condition.get_num()){
                System.out.print(", ");
            }
        }
        System.out.println(") = "+((double)this.count/(double)(this.hoge+this.count)+"\n"));
    }

    public static void main(String[] args) {
        node A = new node("A");
        node B = new node("B");
        node C = new node("C");
        node D = new node("D");
        ArrayList<node> Bayesian_Network = new ArrayList<node>();
        Desire d_0 = new Desire();
        Desire d_1 = new Desire();
        Desire d_2 = new Desire();
        Condition c_0 = new Condition();
        Condition c_1 = new Condition();
        Condition c_2 = new Condition();

        Bayesian_Network.add(A);
        Bayesian_Network.add(B);
        Bayesian_Network.add(C);
        Bayesian_Network.add(D);
        d_0.set_Desire(D, 3, 1);
        c_0.set_Condition(B, 1);
        d_1.set_Desire(C, 2, 0);
        c_1.set_Condition(A, 0);
        c_1.set_Condition(D, 1);
        d_2.set_Desire(D, 3, 0);
        c_2.set_Condition(A, 1);
        LS test_0 = new LS(Bayesian_Network,d_0,c_0);
        test_0.run();
        LS test_1 = new LS(Bayesian_Network,d_1,c_1);
        test_1.run();
        LS test_2 = new LS(Bayesian_Network,d_2,c_2);
        test_2.run();

    }
}
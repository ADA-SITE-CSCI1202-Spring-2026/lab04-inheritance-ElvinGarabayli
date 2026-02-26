package ada.student;

public class MathDemo {
    public int min(int a, int b){
        if(a<b){
            return a;
        }
        
        return b;
           
    }

    public int max(int a, int b){
        if(a > b){
            return a;
        }
        return b;
    }

public int sum(int[] args){
        int total = 0;

        for(int i = 0; i < args.length; i++){
            total = total + args[i];
        }

        return total;
    }

    public float mean(int[] args){
        int total = 0;

        for(int i = 0; i < args.length; i++){
            total = total + args[i];
        }

        return (float) total / args.length;
    }
}
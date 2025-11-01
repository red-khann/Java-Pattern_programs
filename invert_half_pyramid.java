package pattern;
// pyramid pattern print 
public class invert_half_pyramid {
    public static void main(String[] args){
        int m=5;
        for (int i=1;i<=m;i++){
            for (int k=1;k<=m-i;k++){
                System.out.print("  ");
            }
            for (int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }    
}


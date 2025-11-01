package pattern;
// floyds pattern print
public class floyds_pattern_print {
    public static void main(String[] args){
        int m=5;
        int num=1;
        for (int i=1;i<=m;i++){
            for (int j=1;j<=i;j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.print("\n");
        }
    }    
}

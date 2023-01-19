package geeksforGeeks;

public class CompeteTheSkills {
    public static void scores(long a[], long b[]) {
        int n1=0 ,n2 =0;
        for (int i=0 ; i<3 ;i++){
            if (a[i]>b[i]){
                n1++;
            }else if (a[i]<b[i]){
                n2++;
            }
        }
        System.out.print(n1 + " " + n2);
    }
    public static void main(String[] args) {

    }
}

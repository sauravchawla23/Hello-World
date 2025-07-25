public class arr_print_non_common {
    public static void main(String[] args) {
        //arr_print_non_common of arr b
        int a[] = {2,4,6,9,11,13};
        int b[] = {1,2,3,5,8,10,11,13,14};
        for(int i=0;i<b.length;i++){
            int j;
            for(j=0;j<a.length;j++){
                if(b[i]==a[j]) {
                    break;
                }
            }
            if(j==a.length) {
                System.out.print(b[i] + " ");
            }
        }
    }
}

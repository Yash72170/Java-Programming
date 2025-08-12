public class array6 {
    public static void main(String[] args) {
        int [][]a = new int[3][3];   //rows=3 and columns =2
        a[0][0]=1;
        a[0][1]=2;
        a[0][2]=7;
        a[1][0]=3;
        a[1][1]=4;
        a[1][2]=8;
        a[2][0]=5;
        a[2][1]=6;
        a[2][2]=9;
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}

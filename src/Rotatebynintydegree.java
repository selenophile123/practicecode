import java.util.Arrays;

public class Rotatebynintydegree {
    public static void rotateArray(int[][]a){
        int m=a.length;
        int n=a[0].length;
        //Step first transpose array
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int temp=a[i][j];
                a[i][j]=a[j][i];
                a[j][i]=temp;

            }
        }
        //step 2 swapping
        for(int i=0;i<m;i++){
            int li=0;
            int ri=n-1;
            while(li<ri){
                int temp=a[i][li];             //doubt???/
                a[i][li]=a[i][ri];
                a[i][ri]=temp;
                li++;
                ri--;

            }
        }

    }
    public static void main(String[]args){
        int[][]a={
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        rotateArray(a);
        for(var mat:a){
            System.out.println(Arrays.toString(mat));
    }
}
}

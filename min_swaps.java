import java.lang.Math;
public class GFG{

    static int min_maxLimits(int[] arr,int n,int k){

        int max=-1,left=-1,right=-1;  //left and right are the bounds
        for(int i=0;i<n;i++){
            if(arr[i]<=k){
                
                int L=i,R,local=0;
                //System.out.println("index "+i);
                while(i<n && arr[i]<=k){
                    arr[i]=1;
                    local++;
                    i++;
                }
                i--;
                R=i;
                if(local>max){
                    max=local;
                    left=L;
                    right=R;
                    //System.out.println("left "+left+" right "+right+" "+local);
                }
            }
            else{
                arr[i]=0;
            }
        }
        
        int L=left-1,R=right+1,swaps=0;
        for(int i=0;i<L;i++){
            if(arr[i]==1){
                arr[L]=1;
                swaps++;
                arr[i]=0;
                while(arr[L]==1)
                    L--;
            }
        }
        
        for(int i=n-1;i>R;i--){
            if(arr[i]==1){

                arr[R]=1;

                swaps++;

                arr[i]=0;

                while(arr[R]==1)

                    R++;

            }

        }

        return swaps;

    }

    
public static void main(String args[]){

       int arr[]={2, 7, 9, 5, 8, 7, 4};//{2,3,4,3,6,6,7,2,3,6,7,2,3,4,5,3,7,7,2,3,8,8,2,3};

       System.out.println(min_maxLimits(arr,arr.length,6));
    }

}
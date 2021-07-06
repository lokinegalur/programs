class ThreeSortedCommon
{
    ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3) 
    {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int i=0,j=0,k=0;
        while(i<n1 && j<n2 && k<n3){
            int a=A[i],b=B[j],c=C[k];
            if(a<b && a<c)
                i++;
            else if(b<a && b<c)
                j++;
            else if(c<a && c<b)
                k++;
            else if(a==b && b==c)
                {   
                    if(!list.contains(a))
                        list.add(a);
                    i++;
                    j++;
                    k++;
                }
            else if(a==b){
                i++;
                j++;
            }
            else if(b==c){
                j++;
                k++;
            }
            else{
                i++;
                k++;
            }
                
        }
        return list;
    }
}

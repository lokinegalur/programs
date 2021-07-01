class IsomorphicStrings
{
    //Function to check if two strings are isomorphic.
    public static boolean areIsomorphic(String str1,String str2)
    {
        int m=str1.length();
        int n=str2.length();
        if(m!=n)
            return false;
        int arr1[]=new int[26];
        int arr2[]=new int[26];
        for(int i=0;i<m;i++){
            arr1[(int)str1.charAt(i)%97]++;
        }
        for(int i=0;i<n;i++){
            arr2[(int)str2.charAt(i)%97]++;
        }
        for(int i=0;i<n;i++){
            if(arr1[(int)str1.charAt(i)%97]!=arr2[(int)str2.charAt(i)%97])
                return false;
        }
        return true;
    }
}

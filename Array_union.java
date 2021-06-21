/* Binary search tree based solution */
class Solution{

    public static int doUnion(int a[], int n, int b[], int m) 
    {

        btree bin = new btree();

        for(int x:a)

            bin.root=bin.insert(bin.root,x);

        for(int x:b)

            bin.root=bin.insert(bin.root,x);

        int no_of_eles=bin.no_of_nodes(bin.root);

        //bin.inorder(bin.root);

            return no_of_eles;

    }

}


class btree{

    node root;

    btree(){

        root=null;

    }

    
    
public  node insert(node root,int data){

        if(root==null){

            root=new node(data);

            return root;

        }

        if(data<root.data){

            root.left=insert(root.left,data);

            //System.out.println("left");

        }

        else if(data>root.data){

            root.right=insert(root.right,data);

            //System.out.println("right");

        }

        return root;

    }

    
    public  int no_of_nodes(node root){

        if(root==null) return 0;

        return no_of_nodes(root.left)+no_of_nodes(root.right)+1;

    }

}


class node{

    int data;

    node left;

    node right;

    node(int data){

        this.data=data;

        left=null;
        right=null;

    }

}

/* Hashmap based solution */
class Solution{

    public static int doUnion(int a[], int n, int b[], int m) 
    {

       HashMap<Integer,Integer> mp = new HashMap<>();

       for(int x:a){

           if(mp.getOrDefault(x,-1)==-1)

               mp.put(x,1);

       }
       
       for(int x:b){

           if(mp.getOrDefault(x,-1)==-1)

            mp.put(x,1);

       }
       
   return mp.size();
    
  }

}
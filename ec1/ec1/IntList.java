public class IntList {
    public int first;
    public IntList rest;

    public IntList(int f, IntList r) {
        first = f;
        rest = r;
    }
    /** Returns an IntList identical to L, but with
      * each element incremented by x. L is not allowed
      * to change. */
    //不知道有多長//
    
    //public static IntList incrList(IntList L, int x) {
      //  if(L == null) {
        //    return null;
       // }
       // else{
       //     return new IntList(L.first+x, incrList(L.rest,x));
        //}
        
    //}
    /** Returns an IntList identical to L, but with
      * each element incremented by x. Not allowed to use
      * the 'new' keyword. */
    public static IntList dincrList(IntList L, int x) {
        if(L==null){
            return null;
        }
        else{
            L.first += x;
            L.rest = dincrList(L.rest, x);
        }
        return L;
        //需要破壞L所以不能用new 所以改變L中的item
        
    }
    
public static void main(String[] args) {
    // TODO Auto-generated method stub
    IntList L = new IntList(5, null);
    L.rest = new IntList(7, null);
    L.rest.rest = new IntList(9, null);
    // System.out.println(incrList(L, 3));
    System.out.println(dincrList(L, 3));     
     
    

    }

}

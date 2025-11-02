public class Cache<T>{
    public int n;
    public ArrayList<T> cache;
    //public  int flug = 0;
   public Cache(int n){
    if(n >= 1){ 
        this.n = n;
    }else{ 
        throw new IllegalArgumentException("n <= 0");}
          this.cache = new ArrayList <T> (n);
   }
  
   
    public void addelement(T element){
        if (cache.size() >= n){
            cache.remove(0); 
        }
        cache.add(element);
    }

}
 //public int getN(int n)
    //return n;
      /*  if(flug == getN - 1 ){
            flug = 0;
        }
        this.Cache.set(flug, element);
        flug++;
    }*/


    //for(int i = 0; i < n; i++ ){
   //     Cache.add((i + 1) + i);
    //}

public class Cache<T>{
    public int n;
    public ArrayList<T> cache;
    //public  int flug = 0;
   public Cache(int n){
    if(n >= 1){ 
        this.n = n;
    }else{ 
        throw new IllegalArgumentException("n <= 0");}
        this.cache = new ArrayList<> (n);
   }
  
   
    private void addelement(T element){
        if (cache.size() >= n){
            cache.remove(0); 
        }
        cache.add(element);
    }
public void add(T item){
    addelement(item);
}

public boolean remove(T item){
  boolean removeItem = cache.remove(item);
  return removeItem;
}
public boolean exists(T item){
    return cache.contains(item);
}

public T getFirst(){
    if(cache.isEmpty() == true ){
        return null;
    }
    return cache.get(0);
}
public T getLast(){
    if(cache.isEmpty() == true ){
        return null;
    }
    return cache.get(cache.size() - 1);
}
public T getItemByIndex(int i){
    if (cache.contains(cache.get(i)) == true){
        return cache.get(i);
    }
    return null;
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

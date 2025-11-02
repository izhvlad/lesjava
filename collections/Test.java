public class Test{
    public static void main( String[] args ){
    Cache<String> cache = new Cache<>(3);
        cache.add("A");
        cache.add("B");
         System.out.println("getFirst " + cache.getFirst());
        cache.add("C");
        cache.add("D");
        System.out.println("getLast " + cache.getLast());
        System.out.println("exists " + cache.exists("B"));
        System.out.println("getItemByIndex " + cache.getItemByIndex(0));
        System.out.println("remove " + cache.remove("B"));
        System.out.println("getFirst " + cache.getFirst());
    }
}



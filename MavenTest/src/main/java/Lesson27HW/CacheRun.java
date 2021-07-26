package Lesson27HW;

public class CacheRun {
    public static void main(String[] args) {
        TryCache tryCache = new TryCache();
        tryCache.getCache("name","key");
        tryCache.putCache("name","key","value");
        tryCache.clear("name");
        tryCache.getSize();
        tryCache.clearAll();


    }
}

package Lesson27HW;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.HashMap;
import java.util.Map;

/**
 * Homework27 designed for practice in creating
 * custom cache using default libraries.
 *
 * @author  Kodzhebash Vlad
 * @version 1.0
 */
public class TryCache implements ICache{

    /** static field for logger: waring, info, error */
    private static final Logger loggerInfo = LoggerFactory.getLogger("logger.info");

    /** definition for cache storage */
    private Map<String, HashMap<String, Object>> cacheMap;

    /**
     * Class constructor
     * Initializing cacheMap
     */
    public TryCache() {
        cacheMap = new HashMap<>();
        loggerInfo.info("Initializing cache variable.");
    }

    /**
     * putCache method - adding a value into the cache
     * @param cacheName - name of cache
     * @param key - personal key for cache value
     * @param o - cache value
     * @return <code>true</code> if value successfully added in a cache
     */
    @Override
    public boolean putCache(String cacheName, String key, Object o) {
        HashMap<String, Object> temp = new HashMap<>(){{
            put(key, o);
        }};
        if(cacheMap.containsKey(cacheName)){
            loggerInfo.info("Cache " + cacheName + " is already exist. Rewriting...");
        }
        else
        {
            loggerInfo.info("Creating new cache " + cacheName + ".");
        }
        cacheMap.put(cacheName, temp);
        return cacheMap.containsKey(cacheName)&&cacheMap.containsValue(temp);
    }

    /**
     * getCache - getting a value from cache
     * @param cacheName - name of cache
     * @param key - personal key for cache value
     * @return  <code>Object</code> if there is one
     */
    @Override
    public Object getCache(String cacheName, String key) {
        HashMap<String, Object> cacheM;
        Object cacheObj = null;

        if(cacheMap.containsKey(cacheName)) {
            cacheM = cacheMap.get(cacheName);
            if(cacheM.containsKey(key)) {
                cacheObj = cacheM.get(key);
                if (cacheObj != null) {
                    loggerInfo.info("Getting value using name: " + cacheName + " and key: " + key);
                } else
                    loggerInfo.warn("Value with name: " + cacheName + " and key: " + key + " doesn't exist.");
            }
            else
            {
                loggerInfo.error("Can't get a value. Reason: Cache with key " + key + " doesn't exist.");
            }
        }
        else{
            loggerInfo.error("Can't get a value. Reason: Cache with name " + cacheName + " doesn't exist.");
        }
        return cacheObj;
    }

    /**
     * clear - deleting one value from the cache
     * @param cacheName  - name of cache
     */
    @Override
    public void clear(String cacheName) {
        if(cacheMap.containsKey(cacheName)){
            cacheMap.remove(cacheName);
            if(!cacheMap.containsKey(cacheName)){
                loggerInfo.info("Successfully deleted cache with name: " + cacheName);
            }
            else{
                loggerInfo.error("Cache deleting error.");
            }
        }
        else {
            loggerInfo.warn("Can't delete value. Reason: cache " + cacheName + " doesn't exist.");
        }
    }

    /**
     * clearAll - deleting all values from the cache
     */
    @Override
    public void clearAll() {
        cacheMap = new HashMap<>();
        if(cacheMap.size() == 0){
            loggerInfo.info("Successfully cleared cache.");
        }
        else{
            loggerInfo.error("Cache clearing error.");
        }
    }

    /**
     * getSize - getting amount objects in cache
     * @return <code>int</code> amount
     */
    public int getSize(){
        return cacheMap.size();
    }
}

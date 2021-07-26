package Lesson27HW;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TryCacheTest {

    @Test
    void putCacheTest() {
        TryCache custC = new TryCache();
        assertTrue(custC.putCache("name","key", "value"));

        custC.putCache("name","key2", "value2");
        custC.putCache("name","key3", "value3");
        assertEquals(1, custC.getSize());
    }

    @Test
    void getCacheTest() {
        TryCache custC = new TryCache();
        String name = "name";
        String key = "key";
        String key1 = "key1";
        Object value = "value";

        custC.putCache(name, key, value);
        Object result = custC.getCache(name,key);
        Object resultNull = custC.getCache(name,key1);

        assertEquals(value, result);
        assertNull(resultNull);
    }

    @Test
    void clearTest() {
        TryCache custC = new TryCache();
        String name = "name";
        String name1 = "name1";
        String key = "key";
        String key1 = "key1";
        Object value = "value";
        Object value1 = "value1";

        custC.putCache(name,key, value);
        custC.putCache(name1,key1, value1);
        custC.clear(name);
        Object result = custC.getCache(name, key);

        assertNull(result);
        assertEquals(value1, custC.getCache(name1,key1));
    }

    @Test
    void clearAllTest() {
        TryCache custC = new TryCache();
        custC.putCache("name","key", "value");
        custC.clearAll();
        assertEquals(0, custC.getSize());
    }

    @Test
    void getSizeTest(){
        TryCache custC = new TryCache();
        custC.putCache("name","key", "value");
        assertEquals(1, custC.getSize());
    }
}
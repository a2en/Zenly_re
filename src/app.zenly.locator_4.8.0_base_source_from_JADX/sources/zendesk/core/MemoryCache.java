package zendesk.core;

public interface MemoryCache {
    void clear();

    boolean contains(String str);

    <T> T get(String str);

    <T> T getOrDefault(String str, T t);

    void put(String str, Object obj);

    void remove(String str);
}

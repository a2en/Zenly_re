package zendesk.core;

public interface BaseStorage {
    void clear();

    <E> E get(String str, Class<E> cls);

    String get(String str);

    void put(String str, Object obj);

    void put(String str, String str2);

    void remove(String str);
}

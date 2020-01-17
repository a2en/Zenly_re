package zendesk.core;

interface Serializer {
    <E> E deserialize(Object obj, Class<E> cls);

    String serialize(Object obj);
}

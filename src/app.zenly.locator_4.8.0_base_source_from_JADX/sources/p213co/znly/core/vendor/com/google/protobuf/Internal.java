package p213co.znly.core.vendor.com.google.protobuf;

import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.RandomAccess;
import java.util.Set;

/* renamed from: co.znly.core.vendor.com.google.protobuf.Internal */
public final class Internal {
    private static final int DEFAULT_BUFFER_SIZE = 4096;
    public static final byte[] EMPTY_BYTE_ARRAY = new byte[0];
    public static final ByteBuffer EMPTY_BYTE_BUFFER = ByteBuffer.wrap(EMPTY_BYTE_ARRAY);
    public static final CodedInputStream EMPTY_CODED_INPUT_STREAM = CodedInputStream.newInstance(EMPTY_BYTE_ARRAY);
    static final Charset ISO_8859_1 = Charset.forName("ISO-8859-1");
    static final Charset UTF_8 = Charset.forName("UTF-8");

    /* renamed from: co.znly.core.vendor.com.google.protobuf.Internal$BooleanList */
    public interface BooleanList extends ProtobufList<Boolean> {
        void addBoolean(boolean z);

        boolean getBoolean(int i);

        BooleanList mutableCopyWithCapacity(int i);

        /* bridge */ /* synthetic */ ProtobufList mutableCopyWithCapacity(int i);

        boolean setBoolean(int i, boolean z);
    }

    /* renamed from: co.znly.core.vendor.com.google.protobuf.Internal$DoubleList */
    public interface DoubleList extends ProtobufList<Double> {
        void addDouble(double d);

        double getDouble(int i);

        DoubleList mutableCopyWithCapacity(int i);

        /* bridge */ /* synthetic */ ProtobufList mutableCopyWithCapacity(int i);

        double setDouble(int i, double d);
    }

    /* renamed from: co.znly.core.vendor.com.google.protobuf.Internal$EnumLite */
    public interface EnumLite {
        int getNumber();
    }

    /* renamed from: co.znly.core.vendor.com.google.protobuf.Internal$EnumLiteMap */
    public interface EnumLiteMap<T extends EnumLite> {
        T findValueByNumber(int i);
    }

    /* renamed from: co.znly.core.vendor.com.google.protobuf.Internal$FloatList */
    public interface FloatList extends ProtobufList<Float> {
        void addFloat(float f);

        float getFloat(int i);

        FloatList mutableCopyWithCapacity(int i);

        /* bridge */ /* synthetic */ ProtobufList mutableCopyWithCapacity(int i);

        float setFloat(int i, float f);
    }

    /* renamed from: co.znly.core.vendor.com.google.protobuf.Internal$IntList */
    public interface IntList extends ProtobufList<Integer> {
        void addInt(int i);

        int getInt(int i);

        IntList mutableCopyWithCapacity(int i);

        /* bridge */ /* synthetic */ ProtobufList mutableCopyWithCapacity(int i);

        int setInt(int i, int i2);
    }

    /* renamed from: co.znly.core.vendor.com.google.protobuf.Internal$ListAdapter */
    public static class ListAdapter<F, T> extends AbstractList<T> {
        private final Converter<F, T> converter;
        private final List<F> fromList;

        /* renamed from: co.znly.core.vendor.com.google.protobuf.Internal$ListAdapter$Converter */
        public interface Converter<F, T> {
            T convert(F f);
        }

        public ListAdapter(List<F> list, Converter<F, T> converter2) {
            this.fromList = list;
            this.converter = converter2;
        }

        public T get(int i) {
            return this.converter.convert(this.fromList.get(i));
        }

        public int size() {
            return this.fromList.size();
        }
    }

    /* renamed from: co.znly.core.vendor.com.google.protobuf.Internal$LongList */
    public interface LongList extends ProtobufList<Long> {
        void addLong(long j);

        long getLong(int i);

        LongList mutableCopyWithCapacity(int i);

        /* bridge */ /* synthetic */ ProtobufList mutableCopyWithCapacity(int i);

        long setLong(int i, long j);
    }

    /* renamed from: co.znly.core.vendor.com.google.protobuf.Internal$MapAdapter */
    public static class MapAdapter<K, V, RealValue> extends AbstractMap<K, V> {
        private final Map<K, RealValue> realMap;
        /* access modifiers changed from: private */
        public final Converter<RealValue, V> valueConverter;

        /* renamed from: co.znly.core.vendor.com.google.protobuf.Internal$MapAdapter$Converter */
        public interface Converter<A, B> {
            A doBackward(B b);

            B doForward(A a);
        }

        /* renamed from: co.znly.core.vendor.com.google.protobuf.Internal$MapAdapter$EntryAdapter */
        private class EntryAdapter implements Entry<K, V> {
            private final Entry<K, RealValue> realEntry;

            public EntryAdapter(Entry<K, RealValue> entry) {
                this.realEntry = entry;
            }

            public K getKey() {
                return this.realEntry.getKey();
            }

            public V getValue() {
                return MapAdapter.this.valueConverter.doForward(this.realEntry.getValue());
            }

            public V setValue(V v) {
                Object value = this.realEntry.setValue(MapAdapter.this.valueConverter.doBackward(v));
                if (value == null) {
                    return null;
                }
                return MapAdapter.this.valueConverter.doForward(value);
            }
        }

        /* renamed from: co.znly.core.vendor.com.google.protobuf.Internal$MapAdapter$IteratorAdapter */
        private class IteratorAdapter implements Iterator<Entry<K, V>> {
            private final Iterator<Entry<K, RealValue>> realIterator;

            public IteratorAdapter(Iterator<Entry<K, RealValue>> it) {
                this.realIterator = it;
            }

            public boolean hasNext() {
                return this.realIterator.hasNext();
            }

            public void remove() {
                this.realIterator.remove();
            }

            public Entry<K, V> next() {
                return new EntryAdapter((Entry) this.realIterator.next());
            }
        }

        /* renamed from: co.znly.core.vendor.com.google.protobuf.Internal$MapAdapter$SetAdapter */
        private class SetAdapter extends AbstractSet<Entry<K, V>> {
            private final Set<Entry<K, RealValue>> realSet;

            public SetAdapter(Set<Entry<K, RealValue>> set) {
                this.realSet = set;
            }

            public Iterator<Entry<K, V>> iterator() {
                return new IteratorAdapter(this.realSet.iterator());
            }

            public int size() {
                return this.realSet.size();
            }
        }

        public MapAdapter(Map<K, RealValue> map, Converter<RealValue, V> converter) {
            this.realMap = map;
            this.valueConverter = converter;
        }

        public static <T extends EnumLite> Converter<Integer, T> newEnumConverter(final EnumLiteMap<T> enumLiteMap, final T t) {
            return new Converter<Integer, T>() {
                public Integer doBackward(T t) {
                    return Integer.valueOf(t.getNumber());
                }

                public T doForward(Integer num) {
                    T findValueByNumber = EnumLiteMap.this.findValueByNumber(num.intValue());
                    return findValueByNumber == null ? t : findValueByNumber;
                }
            };
        }

        public Set<Entry<K, V>> entrySet() {
            return new SetAdapter(this.realMap.entrySet());
        }

        public V get(Object obj) {
            Object obj2 = this.realMap.get(obj);
            if (obj2 == null) {
                return null;
            }
            return this.valueConverter.doForward(obj2);
        }

        public V put(K k, V v) {
            Object put = this.realMap.put(k, this.valueConverter.doBackward(v));
            if (put == null) {
                return null;
            }
            return this.valueConverter.doForward(put);
        }
    }

    /* renamed from: co.znly.core.vendor.com.google.protobuf.Internal$ProtobufList */
    public interface ProtobufList<E> extends List<E>, RandomAccess {
        boolean isModifiable();

        void makeImmutable();

        ProtobufList<E> mutableCopyWithCapacity(int i);
    }

    private Internal() {
    }

    public static byte[] byteArrayDefaultValue(String str) {
        return str.getBytes(ISO_8859_1);
    }

    public static ByteBuffer byteBufferDefaultValue(String str) {
        return ByteBuffer.wrap(byteArrayDefaultValue(str));
    }

    public static ByteString bytesDefaultValue(String str) {
        return ByteString.copyFrom(str.getBytes(ISO_8859_1));
    }

    public static ByteBuffer copyByteBuffer(ByteBuffer byteBuffer) {
        ByteBuffer duplicate = byteBuffer.duplicate();
        duplicate.clear();
        ByteBuffer allocate = ByteBuffer.allocate(duplicate.capacity());
        allocate.put(duplicate);
        allocate.clear();
        return allocate;
    }

    public static boolean equals(List<byte[]> list, List<byte[]> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!Arrays.equals((byte[]) list.get(i), (byte[]) list2.get(i))) {
                return false;
            }
        }
        return true;
    }

    public static boolean equalsByteBuffer(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        if (byteBuffer.capacity() != byteBuffer2.capacity()) {
            return false;
        }
        return byteBuffer.duplicate().clear().equals(byteBuffer2.duplicate().clear());
    }

    public static <T extends MessageLite> T getDefaultInstance(Class<T> cls) {
        try {
            Method method = cls.getMethod("getDefaultInstance", new Class[0]);
            return (MessageLite) method.invoke(method, new Object[0]);
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to get default instance for ");
            sb.append(cls);
            throw new RuntimeException(sb.toString(), e);
        }
    }

    public static int hashBoolean(boolean z) {
        return z ? 1231 : 1237;
    }

    public static int hashCode(List<byte[]> list) {
        int i = 1;
        for (byte[] hashCode : list) {
            i = (i * 31) + hashCode(hashCode);
        }
        return i;
    }

    public static int hashCodeByteBuffer(List<ByteBuffer> list) {
        int i = 1;
        for (ByteBuffer hashCodeByteBuffer : list) {
            i = (i * 31) + hashCodeByteBuffer(hashCodeByteBuffer);
        }
        return i;
    }

    public static int hashEnum(EnumLite enumLite) {
        return enumLite.getNumber();
    }

    public static int hashEnumList(List<? extends EnumLite> list) {
        int i = 1;
        for (EnumLite hashEnum : list) {
            i = (i * 31) + hashEnum(hashEnum);
        }
        return i;
    }

    public static int hashLong(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static boolean isValidUtf8(ByteString byteString) {
        return byteString.isValidUtf8();
    }

    static int partialHash(int i, byte[] bArr, int i2, int i3) {
        int i4 = i;
        for (int i5 = i2; i5 < i2 + i3; i5++) {
            i4 = (i4 * 31) + bArr[i5];
        }
        return i4;
    }

    public static String stringDefaultValue(String str) {
        return new String(str.getBytes(ISO_8859_1), UTF_8);
    }

    public static byte[] toByteArray(String str) {
        return str.getBytes(UTF_8);
    }

    public static String toStringUtf8(byte[] bArr) {
        return new String(bArr, UTF_8);
    }

    public static boolean isValidUtf8(byte[] bArr) {
        return Utf8.isValidUtf8(bArr);
    }

    public static boolean equalsByteBuffer(List<ByteBuffer> list, List<ByteBuffer> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!equalsByteBuffer((ByteBuffer) list.get(i), (ByteBuffer) list2.get(i))) {
                return false;
            }
        }
        return true;
    }

    public static int hashCode(byte[] bArr) {
        return hashCode(bArr, 0, bArr.length);
    }

    public static int hashCodeByteBuffer(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            int partialHash = partialHash(byteBuffer.capacity(), byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
            if (partialHash == 0) {
                partialHash = 1;
            }
            return partialHash;
        }
        int i = 4096;
        if (byteBuffer.capacity() <= 4096) {
            i = byteBuffer.capacity();
        }
        byte[] bArr = new byte[i];
        ByteBuffer duplicate = byteBuffer.duplicate();
        duplicate.clear();
        int capacity = byteBuffer.capacity();
        while (duplicate.remaining() > 0) {
            int remaining = duplicate.remaining() <= i ? duplicate.remaining() : i;
            duplicate.get(bArr, 0, remaining);
            capacity = partialHash(capacity, bArr, 0, remaining);
        }
        if (capacity == 0) {
            capacity = 1;
        }
        return capacity;
    }

    static int hashCode(byte[] bArr, int i, int i2) {
        int partialHash = partialHash(i2, bArr, i, i2);
        if (partialHash == 0) {
            return 1;
        }
        return partialHash;
    }
}

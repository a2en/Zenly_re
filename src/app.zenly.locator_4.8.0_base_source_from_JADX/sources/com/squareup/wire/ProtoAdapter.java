package com.squareup.wire;

import com.squareup.wire.Message.Builder;
import com.squareup.wire.WireField.Label;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.C13342c;
import okio.C13346d;
import okio.C13354l;

public abstract class ProtoAdapter<E> {
    public static final ProtoAdapter<Boolean> BOOL = new ProtoAdapter<Boolean>(FieldEncoding.VARINT, Boolean.class) {
        public int encodedSize(Boolean bool) {
            return 1;
        }

        public Boolean decode(ProtoReader protoReader) throws IOException {
            int readVarint32 = protoReader.readVarint32();
            if (readVarint32 == 0) {
                return Boolean.FALSE;
            }
            if (readVarint32 == 1) {
                return Boolean.TRUE;
            }
            throw new IOException(String.format("Invalid boolean value 0x%02x", new Object[]{Integer.valueOf(readVarint32)}));
        }

        public void encode(ProtoWriter protoWriter, Boolean bool) throws IOException {
            protoWriter.writeVarint32(bool.booleanValue() ? 1 : 0);
        }
    };
    public static final ProtoAdapter<C13346d> BYTES = new ProtoAdapter<C13346d>(FieldEncoding.LENGTH_DELIMITED, C13346d.class) {
        public C13346d decode(ProtoReader protoReader) throws IOException {
            return protoReader.readBytes();
        }

        public void encode(ProtoWriter protoWriter, C13346d dVar) throws IOException {
            protoWriter.writeBytes(dVar);
        }

        public int encodedSize(C13346d dVar) {
            return dVar.mo38528g();
        }
    };
    public static final ProtoAdapter<Double> DOUBLE = new ProtoAdapter<Double>(FieldEncoding.FIXED64, Double.class) {
        public int encodedSize(Double d) {
            return 8;
        }

        public Double decode(ProtoReader protoReader) throws IOException {
            return Double.valueOf(Double.longBitsToDouble(protoReader.readFixed64()));
        }

        public void encode(ProtoWriter protoWriter, Double d) throws IOException {
            protoWriter.writeFixed64(Double.doubleToLongBits(d.doubleValue()));
        }
    };
    public static final ProtoAdapter<Integer> FIXED32 = new ProtoAdapter<Integer>(FieldEncoding.FIXED32, Integer.class) {
        public int encodedSize(Integer num) {
            return 4;
        }

        public Integer decode(ProtoReader protoReader) throws IOException {
            return Integer.valueOf(protoReader.readFixed32());
        }

        public void encode(ProtoWriter protoWriter, Integer num) throws IOException {
            protoWriter.writeFixed32(num.intValue());
        }
    };
    public static final ProtoAdapter<Long> FIXED64 = new ProtoAdapter<Long>(FieldEncoding.FIXED64, Long.class) {
        public int encodedSize(Long l) {
            return 8;
        }

        public Long decode(ProtoReader protoReader) throws IOException {
            return Long.valueOf(protoReader.readFixed64());
        }

        public void encode(ProtoWriter protoWriter, Long l) throws IOException {
            protoWriter.writeFixed64(l.longValue());
        }
    };
    private static final int FIXED_32_SIZE = 4;
    private static final int FIXED_64_SIZE = 8;
    private static final int FIXED_BOOL_SIZE = 1;
    public static final ProtoAdapter<Float> FLOAT = new ProtoAdapter<Float>(FieldEncoding.FIXED32, Float.class) {
        public int encodedSize(Float f) {
            return 4;
        }

        public Float decode(ProtoReader protoReader) throws IOException {
            return Float.valueOf(Float.intBitsToFloat(protoReader.readFixed32()));
        }

        public void encode(ProtoWriter protoWriter, Float f) throws IOException {
            protoWriter.writeFixed32(Float.floatToIntBits(f.floatValue()));
        }
    };
    public static final ProtoAdapter<Integer> INT32 = new ProtoAdapter<Integer>(FieldEncoding.VARINT, Integer.class) {
        public Integer decode(ProtoReader protoReader) throws IOException {
            return Integer.valueOf(protoReader.readVarint32());
        }

        public void encode(ProtoWriter protoWriter, Integer num) throws IOException {
            protoWriter.writeSignedVarint32(num.intValue());
        }

        public int encodedSize(Integer num) {
            return ProtoWriter.int32Size(num.intValue());
        }
    };
    public static final ProtoAdapter<Long> INT64 = new ProtoAdapter<Long>(FieldEncoding.VARINT, Long.class) {
        public Long decode(ProtoReader protoReader) throws IOException {
            return Long.valueOf(protoReader.readVarint64());
        }

        public void encode(ProtoWriter protoWriter, Long l) throws IOException {
            protoWriter.writeVarint64(l.longValue());
        }

        public int encodedSize(Long l) {
            return ProtoWriter.varint64Size(l.longValue());
        }
    };
    public static final ProtoAdapter<Integer> SFIXED32 = FIXED32;
    public static final ProtoAdapter<Long> SFIXED64 = FIXED64;
    public static final ProtoAdapter<Integer> SINT32 = new ProtoAdapter<Integer>(FieldEncoding.VARINT, Integer.class) {
        public Integer decode(ProtoReader protoReader) throws IOException {
            return Integer.valueOf(ProtoWriter.decodeZigZag32(protoReader.readVarint32()));
        }

        public void encode(ProtoWriter protoWriter, Integer num) throws IOException {
            protoWriter.writeVarint32(ProtoWriter.encodeZigZag32(num.intValue()));
        }

        public int encodedSize(Integer num) {
            return ProtoWriter.varint32Size(ProtoWriter.encodeZigZag32(num.intValue()));
        }
    };
    public static final ProtoAdapter<Long> SINT64 = new ProtoAdapter<Long>(FieldEncoding.VARINT, Long.class) {
        public Long decode(ProtoReader protoReader) throws IOException {
            return Long.valueOf(ProtoWriter.decodeZigZag64(protoReader.readVarint64()));
        }

        public void encode(ProtoWriter protoWriter, Long l) throws IOException {
            protoWriter.writeVarint64(ProtoWriter.encodeZigZag64(l.longValue()));
        }

        public int encodedSize(Long l) {
            return ProtoWriter.varint64Size(ProtoWriter.encodeZigZag64(l.longValue()));
        }
    };
    public static final ProtoAdapter<String> STRING = new ProtoAdapter<String>(FieldEncoding.LENGTH_DELIMITED, String.class) {
        public String decode(ProtoReader protoReader) throws IOException {
            return protoReader.readString();
        }

        public void encode(ProtoWriter protoWriter, String str) throws IOException {
            protoWriter.writeString(str);
        }

        public int encodedSize(String str) {
            return ProtoWriter.utf8Length(str);
        }
    };
    public static final ProtoAdapter<Integer> UINT32 = new ProtoAdapter<Integer>(FieldEncoding.VARINT, Integer.class) {
        public Integer decode(ProtoReader protoReader) throws IOException {
            return Integer.valueOf(protoReader.readVarint32());
        }

        public void encode(ProtoWriter protoWriter, Integer num) throws IOException {
            protoWriter.writeVarint32(num.intValue());
        }

        public int encodedSize(Integer num) {
            return ProtoWriter.varint32Size(num.intValue());
        }
    };
    public static final ProtoAdapter<Long> UINT64 = new ProtoAdapter<Long>(FieldEncoding.VARINT, Long.class) {
        public Long decode(ProtoReader protoReader) throws IOException {
            return Long.valueOf(protoReader.readVarint64());
        }

        public void encode(ProtoWriter protoWriter, Long l) throws IOException {
            protoWriter.writeVarint64(l.longValue());
        }

        public int encodedSize(Long l) {
            return ProtoWriter.varint64Size(l.longValue());
        }
    };
    private final FieldEncoding fieldEncoding;
    final Class<?> javaType;
    ProtoAdapter<List<E>> packedAdapter;
    ProtoAdapter<List<E>> repeatedAdapter;

    public static final class EnumConstantNotFoundException extends IllegalArgumentException {
        public final int value;

        EnumConstantNotFoundException(int i, Class<?> cls) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unknown enum tag ");
            sb.append(i);
            sb.append(" for ");
            sb.append(cls.getCanonicalName());
            super(sb.toString());
            this.value = i;
        }
    }

    private static final class MapEntryProtoAdapter<K, V> extends ProtoAdapter<Entry<K, V>> {
        final ProtoAdapter<K> keyAdapter;
        final ProtoAdapter<V> valueAdapter;

        MapEntryProtoAdapter(ProtoAdapter<K> protoAdapter, ProtoAdapter<V> protoAdapter2) {
            super(FieldEncoding.LENGTH_DELIMITED, null);
            this.keyAdapter = protoAdapter;
            this.valueAdapter = protoAdapter2;
        }

        public Entry<K, V> decode(ProtoReader protoReader) {
            throw new UnsupportedOperationException();
        }

        public void encode(ProtoWriter protoWriter, Entry<K, V> entry) throws IOException {
            this.keyAdapter.encodeWithTag(protoWriter, 1, entry.getKey());
            this.valueAdapter.encodeWithTag(protoWriter, 2, entry.getValue());
        }

        public int encodedSize(Entry<K, V> entry) {
            return this.keyAdapter.encodedSizeWithTag(1, entry.getKey()) + this.valueAdapter.encodedSizeWithTag(2, entry.getValue());
        }
    }

    private static final class MapProtoAdapter<K, V> extends ProtoAdapter<Map<K, V>> {
        private final MapEntryProtoAdapter<K, V> entryAdapter;

        MapProtoAdapter(ProtoAdapter<K> protoAdapter, ProtoAdapter<V> protoAdapter2) {
            super(FieldEncoding.LENGTH_DELIMITED, null);
            this.entryAdapter = new MapEntryProtoAdapter<>(protoAdapter, protoAdapter2);
        }

        public Map<K, V> decode(ProtoReader protoReader) throws IOException {
            long beginMessage = protoReader.beginMessage();
            Object obj = null;
            Object obj2 = null;
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    break;
                } else if (nextTag == 1) {
                    obj = this.entryAdapter.keyAdapter.decode(protoReader);
                } else if (nextTag == 2) {
                    obj2 = this.entryAdapter.valueAdapter.decode(protoReader);
                }
            }
            protoReader.endMessage(beginMessage);
            if (obj == null) {
                throw new IllegalStateException("Map entry with null key");
            } else if (obj2 != null) {
                return Collections.singletonMap(obj, obj2);
            } else {
                throw new IllegalStateException("Map entry with null value");
            }
        }

        public void encode(ProtoWriter protoWriter, Map<K, V> map) {
            throw new UnsupportedOperationException("Repeated values can only be encoded with a tag.");
        }

        public void encodeWithTag(ProtoWriter protoWriter, int i, Map<K, V> map) throws IOException {
            for (Entry encodeWithTag : map.entrySet()) {
                this.entryAdapter.encodeWithTag(protoWriter, i, encodeWithTag);
            }
        }

        public int encodedSize(Map<K, V> map) {
            throw new UnsupportedOperationException("Repeated values can only be sized with a tag.");
        }

        public int encodedSizeWithTag(int i, Map<K, V> map) {
            int i2 = 0;
            for (Entry encodedSizeWithTag : map.entrySet()) {
                i2 += this.entryAdapter.encodedSizeWithTag(i, encodedSizeWithTag);
            }
            return i2;
        }

        public Map<K, V> redact(Map<K, V> map) {
            return Collections.emptyMap();
        }
    }

    public ProtoAdapter(FieldEncoding fieldEncoding2, Class<?> cls) {
        this.fieldEncoding = fieldEncoding2;
        this.javaType = cls;
    }

    private ProtoAdapter<List<E>> createPacked() {
        FieldEncoding fieldEncoding2 = this.fieldEncoding;
        FieldEncoding fieldEncoding3 = FieldEncoding.LENGTH_DELIMITED;
        if (fieldEncoding2 != fieldEncoding3) {
            return new ProtoAdapter<List<E>>(fieldEncoding3, List.class) {
                public List<E> decode(ProtoReader protoReader) throws IOException {
                    return Collections.singletonList(ProtoAdapter.this.decode(protoReader));
                }

                public void encode(ProtoWriter protoWriter, List<E> list) throws IOException {
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        ProtoAdapter.this.encode(protoWriter, list.get(i));
                    }
                }

                public void encodeWithTag(ProtoWriter protoWriter, int i, List<E> list) throws IOException {
                    if (!list.isEmpty()) {
                        ProtoAdapter.super.encodeWithTag(protoWriter, i, list);
                    }
                }

                public int encodedSize(List<E> list) {
                    int i = 0;
                    for (int i2 = 0; i2 < list.size(); i2++) {
                        i += ProtoAdapter.this.encodedSize(list.get(i2));
                    }
                    return i;
                }

                public int encodedSizeWithTag(int i, List<E> list) {
                    if (list.isEmpty()) {
                        return 0;
                    }
                    return ProtoAdapter.super.encodedSizeWithTag(i, list);
                }

                public List<E> redact(List<E> list) {
                    return Collections.emptyList();
                }
            };
        }
        throw new IllegalArgumentException("Unable to pack a length-delimited type.");
    }

    private ProtoAdapter<List<E>> createRepeated() {
        return new ProtoAdapter<List<E>>(this.fieldEncoding, List.class) {
            public List<E> decode(ProtoReader protoReader) throws IOException {
                return Collections.singletonList(ProtoAdapter.this.decode(protoReader));
            }

            public void encode(ProtoWriter protoWriter, List<E> list) {
                throw new UnsupportedOperationException("Repeated values can only be encoded with a tag.");
            }

            public void encodeWithTag(ProtoWriter protoWriter, int i, List<E> list) throws IOException {
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ProtoAdapter.this.encodeWithTag(protoWriter, i, list.get(i2));
                }
            }

            public int encodedSize(List<E> list) {
                throw new UnsupportedOperationException("Repeated values can only be sized with a tag.");
            }

            public int encodedSizeWithTag(int i, List<E> list) {
                int i2 = 0;
                for (int i3 = 0; i3 < list.size(); i3++) {
                    i2 += ProtoAdapter.this.encodedSizeWithTag(i, list.get(i3));
                }
                return i2;
            }

            public List<E> redact(List<E> list) {
                return Collections.emptyList();
            }
        };
    }

    public static <M extends Message> ProtoAdapter<M> get(M m) {
        return get(m.getClass());
    }

    public static <E extends WireEnum> RuntimeEnumAdapter<E> newEnumAdapter(Class<E> cls) {
        return new RuntimeEnumAdapter<>(cls);
    }

    public static <K, V> ProtoAdapter<Map<K, V>> newMapAdapter(ProtoAdapter<K> protoAdapter, ProtoAdapter<V> protoAdapter2) {
        return new MapProtoAdapter(protoAdapter, protoAdapter2);
    }

    public static <M extends Message<M, B>, B extends Builder<M, B>> ProtoAdapter<M> newMessageAdapter(Class<M> cls) {
        return RuntimeMessageAdapter.create(cls);
    }

    public final ProtoAdapter<List<E>> asPacked() {
        ProtoAdapter<List<E>> protoAdapter = this.packedAdapter;
        if (protoAdapter != null) {
            return protoAdapter;
        }
        ProtoAdapter<List<E>> createPacked = createPacked();
        this.packedAdapter = createPacked;
        return createPacked;
    }

    public final ProtoAdapter<List<E>> asRepeated() {
        ProtoAdapter<List<E>> protoAdapter = this.repeatedAdapter;
        if (protoAdapter != null) {
            return protoAdapter;
        }
        ProtoAdapter<List<E>> createRepeated = createRepeated();
        this.repeatedAdapter = createRepeated;
        return createRepeated;
    }

    public abstract E decode(ProtoReader protoReader) throws IOException;

    public final E decode(byte[] bArr) throws IOException {
        Preconditions.checkNotNull(bArr, "bytes == null");
        C13342c cVar = new C13342c();
        cVar.write(bArr);
        return decode((BufferedSource) cVar);
    }

    public abstract void encode(ProtoWriter protoWriter, E e) throws IOException;

    public final void encode(BufferedSink bufferedSink, E e) throws IOException {
        Preconditions.checkNotNull(e, "value == null");
        Preconditions.checkNotNull(bufferedSink, "sink == null");
        encode(new ProtoWriter(bufferedSink), e);
    }

    public void encodeWithTag(ProtoWriter protoWriter, int i, E e) throws IOException {
        if (e != null) {
            protoWriter.writeTag(i, this.fieldEncoding);
            if (this.fieldEncoding == FieldEncoding.LENGTH_DELIMITED) {
                protoWriter.writeVarint32(encodedSize(e));
            }
            encode(protoWriter, e);
        }
    }

    public abstract int encodedSize(E e);

    public int encodedSizeWithTag(int i, E e) {
        if (e == null) {
            return 0;
        }
        int encodedSize = encodedSize(e);
        if (this.fieldEncoding == FieldEncoding.LENGTH_DELIMITED) {
            encodedSize += ProtoWriter.varint32Size(encodedSize);
        }
        return encodedSize + ProtoWriter.tagSize(i);
    }

    public E redact(E e) {
        return null;
    }

    public String toString(E e) {
        return e.toString();
    }

    /* access modifiers changed from: 0000 */
    public ProtoAdapter<?> withLabel(Label label) {
        ProtoAdapter<?> protoAdapter;
        if (!label.isRepeated()) {
            return this;
        }
        if (label.isPacked()) {
            protoAdapter = asPacked();
        } else {
            protoAdapter = asRepeated();
        }
        return protoAdapter;
    }

    public static <M> ProtoAdapter<M> get(Class<M> cls) {
        try {
            return (ProtoAdapter) cls.getField("ADAPTER").get(null);
        } catch (IllegalAccessException | NoSuchFieldException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("failed to access ");
            sb.append(cls.getName());
            sb.append("#ADAPTER");
            throw new IllegalArgumentException(sb.toString(), e);
        }
    }

    public final E decode(C13346d dVar) throws IOException {
        Preconditions.checkNotNull(dVar, "bytes == null");
        C13342c cVar = new C13342c();
        cVar.write(dVar);
        return decode((BufferedSource) cVar);
    }

    public static ProtoAdapter<?> get(String str) {
        try {
            int indexOf = str.indexOf(35);
            String substring = str.substring(0, indexOf);
            return (ProtoAdapter) Class.forName(substring).getField(str.substring(indexOf + 1)).get(null);
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("failed to access ");
            sb.append(str);
            throw new IllegalArgumentException(sb.toString(), e);
        }
    }

    public final byte[] encode(E e) {
        Preconditions.checkNotNull(e, "value == null");
        C13342c cVar = new C13342c();
        try {
            encode((BufferedSink) cVar, e);
            return cVar.readByteArray();
        } catch (IOException e2) {
            throw new AssertionError(e2);
        }
    }

    public final E decode(InputStream inputStream) throws IOException {
        Preconditions.checkNotNull(inputStream, "stream == null");
        return decode(C13354l.m35375a(C13354l.m35381a(inputStream)));
    }

    public final E decode(BufferedSource bufferedSource) throws IOException {
        Preconditions.checkNotNull(bufferedSource, "source == null");
        return decode(new ProtoReader(bufferedSource));
    }

    public final void encode(OutputStream outputStream, E e) throws IOException {
        Preconditions.checkNotNull(e, "value == null");
        Preconditions.checkNotNull(outputStream, "stream == null");
        BufferedSink a = C13354l.m35374a(C13354l.m35378a(outputStream));
        encode(a, e);
        a.emit();
    }
}

package p213co.znly.core.vendor.com.google.protobuf;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: co.znly.core.vendor.com.google.protobuf.LazyStringArrayList */
public class LazyStringArrayList extends AbstractProtobufList<String> implements LazyStringList, RandomAccess {
    public static final LazyStringList EMPTY = EMPTY_LIST;
    private static final LazyStringArrayList EMPTY_LIST = new LazyStringArrayList();
    private final List<Object> list;

    /* renamed from: co.znly.core.vendor.com.google.protobuf.LazyStringArrayList$ByteArrayListView */
    private static class ByteArrayListView extends AbstractList<byte[]> implements RandomAccess {
        private final LazyStringArrayList list;

        ByteArrayListView(LazyStringArrayList lazyStringArrayList) {
            this.list = lazyStringArrayList;
        }

        public int size() {
            return this.list.size();
        }

        public void add(int i, byte[] bArr) {
            this.list.add(i, bArr);
            this.modCount++;
        }

        public byte[] get(int i) {
            return this.list.getByteArray(i);
        }

        public byte[] remove(int i) {
            String remove = this.list.remove(i);
            this.modCount++;
            return LazyStringArrayList.asByteArray(remove);
        }

        public byte[] set(int i, byte[] bArr) {
            Object access$000 = this.list.setAndReturn(i, bArr);
            this.modCount++;
            return LazyStringArrayList.asByteArray(access$000);
        }
    }

    /* renamed from: co.znly.core.vendor.com.google.protobuf.LazyStringArrayList$ByteStringListView */
    private static class ByteStringListView extends AbstractList<ByteString> implements RandomAccess {
        private final LazyStringArrayList list;

        ByteStringListView(LazyStringArrayList lazyStringArrayList) {
            this.list = lazyStringArrayList;
        }

        public int size() {
            return this.list.size();
        }

        public void add(int i, ByteString byteString) {
            this.list.add(i, byteString);
            this.modCount++;
        }

        public ByteString get(int i) {
            return this.list.getByteString(i);
        }

        public ByteString remove(int i) {
            String remove = this.list.remove(i);
            this.modCount++;
            return LazyStringArrayList.asByteString(remove);
        }

        public ByteString set(int i, ByteString byteString) {
            Object access$300 = this.list.setAndReturn(i, byteString);
            this.modCount++;
            return LazyStringArrayList.asByteString(access$300);
        }
    }

    static {
        EMPTY_LIST.makeImmutable();
    }

    public LazyStringArrayList() {
        this(10);
    }

    /* access modifiers changed from: private */
    public static byte[] asByteArray(Object obj) {
        if (obj instanceof byte[]) {
            return (byte[]) obj;
        }
        if (obj instanceof String) {
            return Internal.toByteArray((String) obj);
        }
        return ((ByteString) obj).toByteArray();
    }

    /* access modifiers changed from: private */
    public static ByteString asByteString(Object obj) {
        if (obj instanceof ByteString) {
            return (ByteString) obj;
        }
        if (obj instanceof String) {
            return ByteString.copyFromUtf8((String) obj);
        }
        return ByteString.copyFrom((byte[]) obj);
    }

    private static String asString(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof ByteString) {
            return ((ByteString) obj).toStringUtf8();
        }
        return Internal.toStringUtf8((byte[]) obj);
    }

    static LazyStringArrayList emptyList() {
        return EMPTY_LIST;
    }

    /* access modifiers changed from: private */
    public Object setAndReturn(int i, ByteString byteString) {
        ensureIsMutable();
        return this.list.set(i, byteString);
    }

    public boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    public boolean addAllByteArray(Collection<byte[]> collection) {
        ensureIsMutable();
        boolean addAll = this.list.addAll(collection);
        this.modCount++;
        return addAll;
    }

    public boolean addAllByteString(Collection<? extends ByteString> collection) {
        ensureIsMutable();
        boolean addAll = this.list.addAll(collection);
        this.modCount++;
        return addAll;
    }

    public List<byte[]> asByteArrayList() {
        return new ByteArrayListView(this);
    }

    public List<ByteString> asByteStringList() {
        return new ByteStringListView(this);
    }

    public void clear() {
        ensureIsMutable();
        this.list.clear();
        this.modCount++;
    }

    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    public byte[] getByteArray(int i) {
        Object obj = this.list.get(i);
        byte[] asByteArray = asByteArray(obj);
        if (asByteArray != obj) {
            this.list.set(i, asByteArray);
        }
        return asByteArray;
    }

    public ByteString getByteString(int i) {
        Object obj = this.list.get(i);
        ByteString asByteString = asByteString(obj);
        if (asByteString != obj) {
            this.list.set(i, asByteString);
        }
        return asByteString;
    }

    public Object getRaw(int i) {
        return this.list.get(i);
    }

    public List<?> getUnderlyingElements() {
        return Collections.unmodifiableList(this.list);
    }

    public LazyStringList getUnmodifiableView() {
        return isModifiable() ? new UnmodifiableLazyStringList(this) : this;
    }

    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    public /* bridge */ /* synthetic */ boolean isModifiable() {
        return super.isModifiable();
    }

    public void mergeFrom(LazyStringList lazyStringList) {
        ensureIsMutable();
        for (Object next : lazyStringList.getUnderlyingElements()) {
            if (next instanceof byte[]) {
                byte[] bArr = (byte[]) next;
                this.list.add(Arrays.copyOf(bArr, bArr.length));
            } else {
                this.list.add(next);
            }
        }
    }

    public /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    public /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    public int size() {
        return this.list.size();
    }

    public LazyStringArrayList(int i) {
        this(new ArrayList<>(i));
    }

    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        return super.add(obj);
    }

    public boolean addAll(int i, Collection<? extends String> collection) {
        ensureIsMutable();
        if (collection instanceof LazyStringList) {
            collection = ((LazyStringList) collection).getUnderlyingElements();
        }
        boolean addAll = this.list.addAll(i, collection);
        this.modCount++;
        return addAll;
    }

    public String get(int i) {
        Object obj = this.list.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.list.set(i, stringUtf8);
            }
            return stringUtf8;
        }
        byte[] bArr = (byte[]) obj;
        String stringUtf82 = Internal.toStringUtf8(bArr);
        if (Internal.isValidUtf8(bArr)) {
            this.list.set(i, stringUtf82);
        }
        return stringUtf82;
    }

    public LazyStringArrayList mutableCopyWithCapacity(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.list);
            return new LazyStringArrayList(arrayList);
        }
        throw new IllegalArgumentException();
    }

    public /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    public String set(int i, String str) {
        ensureIsMutable();
        return asString(this.list.set(i, str));
    }

    public LazyStringArrayList(LazyStringList lazyStringList) {
        this.list = new ArrayList(lazyStringList.size());
        addAll(lazyStringList);
    }

    /* access modifiers changed from: private */
    public Object setAndReturn(int i, byte[] bArr) {
        ensureIsMutable();
        return this.list.set(i, bArr);
    }

    public void add(int i, String str) {
        ensureIsMutable();
        this.list.add(i, str);
        this.modCount++;
    }

    public String remove(int i) {
        ensureIsMutable();
        Object remove = this.list.remove(i);
        this.modCount++;
        return asString(remove);
    }

    public void set(int i, ByteString byteString) {
        setAndReturn(i, byteString);
    }

    public LazyStringArrayList(List<String> list2) {
        this(new ArrayList<>(list2));
    }

    /* access modifiers changed from: private */
    public void add(int i, ByteString byteString) {
        ensureIsMutable();
        this.list.add(i, byteString);
        this.modCount++;
    }

    public void set(int i, byte[] bArr) {
        setAndReturn(i, bArr);
    }

    private LazyStringArrayList(ArrayList<Object> arrayList) {
        this.list = arrayList;
    }

    /* access modifiers changed from: private */
    public void add(int i, byte[] bArr) {
        ensureIsMutable();
        this.list.add(i, bArr);
        this.modCount++;
    }

    public void add(ByteString byteString) {
        ensureIsMutable();
        this.list.add(byteString);
        this.modCount++;
    }

    public void add(byte[] bArr) {
        ensureIsMutable();
        this.list.add(bArr);
        this.modCount++;
    }
}

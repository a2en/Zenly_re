package p213co.znly.core.vendor.com.google.protobuf;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import p213co.znly.core.vendor.com.google.protobuf.Internal.BooleanList;

/* renamed from: co.znly.core.vendor.com.google.protobuf.BooleanArrayList */
final class BooleanArrayList extends AbstractProtobufList<Boolean> implements BooleanList, RandomAccess {
    private static final BooleanArrayList EMPTY_LIST = new BooleanArrayList();
    private boolean[] array;
    private int size;

    static {
        EMPTY_LIST.makeImmutable();
    }

    BooleanArrayList() {
        this(new boolean[10], 0);
    }

    public static BooleanArrayList emptyList() {
        return EMPTY_LIST;
    }

    private void ensureIndexInRange(int i) {
        if (i < 0 || i >= this.size) {
            throw new IndexOutOfBoundsException(makeOutOfBoundsExceptionMessage(i));
        }
    }

    private String makeOutOfBoundsExceptionMessage(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(this.size);
        return sb.toString();
    }

    public boolean addAll(Collection<? extends Boolean> collection) {
        ensureIsMutable();
        if (collection == null) {
            throw new NullPointerException();
        } else if (!(collection instanceof BooleanArrayList)) {
            return super.addAll(collection);
        } else {
            BooleanArrayList booleanArrayList = (BooleanArrayList) collection;
            int i = booleanArrayList.size;
            if (i == 0) {
                return false;
            }
            int i2 = this.size;
            if (Integer.MAX_VALUE - i2 >= i) {
                int i3 = i2 + i;
                boolean[] zArr = this.array;
                if (i3 > zArr.length) {
                    this.array = Arrays.copyOf(zArr, i3);
                }
                System.arraycopy(booleanArrayList.array, 0, this.array, this.size, booleanArrayList.size);
                this.size = i3;
                this.modCount++;
                return true;
            }
            throw new OutOfMemoryError();
        }
    }

    public void addBoolean(boolean z) {
        addBoolean(this.size, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BooleanArrayList)) {
            return super.equals(obj);
        }
        BooleanArrayList booleanArrayList = (BooleanArrayList) obj;
        if (this.size != booleanArrayList.size) {
            return false;
        }
        boolean[] zArr = booleanArrayList.array;
        for (int i = 0; i < this.size; i++) {
            if (this.array[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    public boolean getBoolean(int i) {
        ensureIndexInRange(i);
        return this.array[i];
    }

    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.size; i2++) {
            i = (i * 31) + Internal.hashBoolean(this.array[i2]);
        }
        return i;
    }

    public boolean setBoolean(int i, boolean z) {
        ensureIsMutable();
        ensureIndexInRange(i);
        boolean[] zArr = this.array;
        boolean z2 = zArr[i];
        zArr[i] = z;
        return z2;
    }

    public int size() {
        return this.size;
    }

    private BooleanArrayList(boolean[] zArr, int i) {
        this.array = zArr;
        this.size = i;
    }

    private void addBoolean(int i, boolean z) {
        ensureIsMutable();
        if (i >= 0) {
            int i2 = this.size;
            if (i <= i2) {
                boolean[] zArr = this.array;
                if (i2 < zArr.length) {
                    System.arraycopy(zArr, i, zArr, i + 1, i2 - i);
                } else {
                    boolean[] zArr2 = new boolean[(((i2 * 3) / 2) + 1)];
                    System.arraycopy(zArr, 0, zArr2, 0, i);
                    System.arraycopy(this.array, i, zArr2, i + 1, this.size - i);
                    this.array = zArr2;
                }
                this.array[i] = z;
                this.size++;
                this.modCount++;
                return;
            }
        }
        throw new IndexOutOfBoundsException(makeOutOfBoundsExceptionMessage(i));
    }

    public void add(int i, Boolean bool) {
        addBoolean(i, bool.booleanValue());
    }

    public Boolean get(int i) {
        return Boolean.valueOf(getBoolean(i));
    }

    public BooleanList mutableCopyWithCapacity(int i) {
        if (i >= this.size) {
            return new BooleanArrayList(Arrays.copyOf(this.array, i), this.size);
        }
        throw new IllegalArgumentException();
    }

    public boolean remove(Object obj) {
        ensureIsMutable();
        for (int i = 0; i < this.size; i++) {
            if (obj.equals(Boolean.valueOf(this.array[i]))) {
                boolean[] zArr = this.array;
                System.arraycopy(zArr, i + 1, zArr, i, this.size - i);
                this.size--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    public Boolean set(int i, Boolean bool) {
        return Boolean.valueOf(setBoolean(i, bool.booleanValue()));
    }

    public Boolean remove(int i) {
        ensureIsMutable();
        ensureIndexInRange(i);
        boolean[] zArr = this.array;
        boolean z = zArr[i];
        System.arraycopy(zArr, i + 1, zArr, i, this.size - i);
        this.size--;
        this.modCount++;
        return Boolean.valueOf(z);
    }
}

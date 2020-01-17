package p213co.znly.core.vendor.com.google.protobuf;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

/* renamed from: co.znly.core.vendor.com.google.protobuf.UnsafeUtil */
final class UnsafeUtil {
    private static final long ARRAY_BASE_OFFSET = ((long) byteArrayBaseOffset());
    private static final long BUFFER_ADDRESS_OFFSET = fieldOffset(field(Buffer.class, "address"));
    private static final boolean HAS_UNSAFE_ARRAY_OPERATIONS = supportsUnsafeArrayOperations();
    private static final boolean HAS_UNSAFE_BYTEBUFFER_OPERATIONS = supportsUnsafeByteBufferOperations();
    private static final Unsafe UNSAFE = getUnsafe();

    private UnsafeUtil() {
    }

    static long addressOffset(ByteBuffer byteBuffer) {
        return UNSAFE.getLong(byteBuffer, BUFFER_ADDRESS_OFFSET);
    }

    private static int byteArrayBaseOffset() {
        if (HAS_UNSAFE_ARRAY_OPERATIONS) {
            return UNSAFE.arrayBaseOffset(byte[].class);
        }
        return -1;
    }

    static void copyMemory(byte[] bArr, long j, byte[] bArr2, long j2, long j3) {
        UNSAFE.copyMemory(bArr, j, bArr2, j2, j3);
    }

    private static Field field(Class<?> cls, String str) {
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static long fieldOffset(Field field) {
        if (field != null) {
            Unsafe unsafe = UNSAFE;
            if (unsafe != null) {
                return unsafe.objectFieldOffset(field);
            }
        }
        return -1;
    }

    static long getArrayBaseOffset() {
        return ARRAY_BASE_OFFSET;
    }

    static byte getByte(byte[] bArr, long j) {
        return UNSAFE.getByte(bArr, j);
    }

    static long getLong(byte[] bArr, long j) {
        return UNSAFE.getLong(bArr, j);
    }

    private static Unsafe getUnsafe() {
        try {
            return (Unsafe) AccessController.doPrivileged(new PrivilegedExceptionAction<Unsafe>() {
                public Unsafe run() throws Exception {
                    Field[] declaredFields;
                    Class<Unsafe> cls = Unsafe.class;
                    for (Field field : cls.getDeclaredFields()) {
                        field.setAccessible(true);
                        Object obj = field.get(null);
                        if (cls.isInstance(obj)) {
                            return (Unsafe) cls.cast(obj);
                        }
                    }
                    return null;
                }
            });
        } catch (Throwable unused) {
            return null;
        }
    }

    static boolean hasUnsafeArrayOperations() {
        return HAS_UNSAFE_ARRAY_OPERATIONS;
    }

    static boolean hasUnsafeByteBufferOperations() {
        return HAS_UNSAFE_BYTEBUFFER_OPERATIONS;
    }

    static void putByte(byte[] bArr, long j, byte b) {
        UNSAFE.putByte(bArr, j, b);
    }

    private static boolean supportsUnsafeArrayOperations() {
        Class<Object> cls = Object.class;
        Unsafe unsafe = UNSAFE;
        if (unsafe != null) {
            try {
                Class cls2 = unsafe.getClass();
                cls2.getMethod("arrayBaseOffset", new Class[]{Class.class});
                cls2.getMethod("getByte", new Class[]{cls, Long.TYPE});
                cls2.getMethod("putByte", new Class[]{cls, Long.TYPE, Byte.TYPE});
                cls2.getMethod("getLong", new Class[]{cls, Long.TYPE});
                cls2.getMethod("copyMemory", new Class[]{cls, Long.TYPE, cls, Long.TYPE, Long.TYPE});
                return true;
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    private static boolean supportsUnsafeByteBufferOperations() {
        String str = "getLong";
        Unsafe unsafe = UNSAFE;
        if (unsafe != null) {
            try {
                Class cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", new Class[]{Field.class});
                cls.getMethod("getByte", new Class[]{Long.TYPE});
                cls.getMethod(str, new Class[]{Object.class, Long.TYPE});
                cls.getMethod("putByte", new Class[]{Long.TYPE, Byte.TYPE});
                cls.getMethod(str, new Class[]{Long.TYPE});
                cls.getMethod("copyMemory", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                return true;
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    static void copyMemory(long j, long j2, long j3) {
        UNSAFE.copyMemory(j, j2, j3);
    }

    static byte getByte(long j) {
        return UNSAFE.getByte(j);
    }

    static long getLong(long j) {
        return UNSAFE.getLong(j);
    }

    static void putByte(long j, byte b) {
        UNSAFE.putByte(j, b);
    }
}

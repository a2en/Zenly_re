package com.google.android.gms.common.data;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.Log;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C10134a;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

public class BitmapTeleporter extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Creator<BitmapTeleporter> CREATOR = new C10071a();

    /* renamed from: e */
    private final int f26461e;

    /* renamed from: f */
    private ParcelFileDescriptor f26462f;

    /* renamed from: g */
    private final int f26463g;

    /* renamed from: h */
    private Bitmap f26464h = null;

    /* renamed from: i */
    private File f26465i;

    BitmapTeleporter(int i, ParcelFileDescriptor parcelFileDescriptor, int i2) {
        this.f26461e = i;
        this.f26462f = parcelFileDescriptor;
        this.f26463g = i2;
    }

    /* renamed from: a */
    private final FileOutputStream m25321a() {
        File file = this.f26465i;
        if (file != null) {
            try {
                File createTempFile = File.createTempFile("teleporter", ".tmp", file);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
                    this.f26462f = ParcelFileDescriptor.open(createTempFile, 268435456);
                    createTempFile.delete();
                    return fileOutputStream;
                } catch (FileNotFoundException unused) {
                    throw new IllegalStateException("Temporary file is somehow already deleted");
                }
            } catch (IOException e) {
                throw new IllegalStateException("Could not create temporary file", e);
            }
        } else {
            throw new IllegalStateException("setTempDir() must be called before writing this object to a parcel");
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (this.f26462f == null) {
            Bitmap bitmap = this.f26464h;
            ByteBuffer allocate = ByteBuffer.allocate(bitmap.getRowBytes() * bitmap.getHeight());
            bitmap.copyPixelsToBuffer(allocate);
            byte[] array = allocate.array();
            DataOutputStream dataOutputStream = new DataOutputStream(new BufferedOutputStream(m25321a()));
            try {
                dataOutputStream.writeInt(array.length);
                dataOutputStream.writeInt(bitmap.getWidth());
                dataOutputStream.writeInt(bitmap.getHeight());
                dataOutputStream.writeUTF(bitmap.getConfig().toString());
                dataOutputStream.write(array);
                m25322a(dataOutputStream);
            } catch (IOException e) {
                throw new IllegalStateException("Could not write into unlinked file", e);
            } catch (Throwable th) {
                m25322a(dataOutputStream);
                throw th;
            }
        }
        int i2 = i | 1;
        int a = C10134a.m25570a(parcel);
        C10134a.m25575a(parcel, 1, this.f26461e);
        C10134a.m25580a(parcel, 2, (Parcelable) this.f26462f, i2, false);
        C10134a.m25575a(parcel, 3, this.f26463g);
        C10134a.m25571a(parcel, a);
        this.f26462f = null;
    }

    /* renamed from: a */
    private static void m25322a(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException e) {
            Log.w("BitmapTeleporter", "Could not close stream", e);
        }
    }
}

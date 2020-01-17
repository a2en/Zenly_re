package app.zenly.locator.p143s.p147k;

import android.content.Context;
import androidx.core.util.C0599a;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.MessageLite;
import p387h.p388a.C12143a;

/* renamed from: app.zenly.locator.s.k.c */
public class C5440c<T extends MessageLite> {

    /* renamed from: a */
    private final C0599a f14005a;

    /* renamed from: b */
    private final MessageLite f14006b;

    public C5440c(Context context, String str, T t) {
        File filesDir = context.getFilesDir();
        StringBuilder sb = new StringBuilder();
        sb.append("proto_cache_");
        sb.append(str);
        this.f14005a = new C0599a(new File(filesDir, sb.toString()));
        this.f14006b = t;
    }

    /* renamed from: a */
    private static byte[] m15453a(int i) {
        return new byte[]{(byte) (i >> 24), (byte) (i >> 16), (byte) (i >> 8), (byte) i};
    }

    /* renamed from: a */
    public List<T> mo13012a() {
        ArrayList arrayList = new ArrayList();
        if (!this.f14005a.mo3242a().exists()) {
            return arrayList;
        }
        try {
            FileInputStream b = this.f14005a.mo3244b();
            while (b.available() > 0) {
                byte[] bArr = new byte[4];
                if (b.read(bArr) == 4) {
                    int a = m15452a(bArr);
                    byte[] bArr2 = new byte[a];
                    if (b.read(bArr2) == a) {
                        arrayList.add(this.f14006b.newBuilderForType().mergeFrom(bArr2).build());
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("expected ");
                        sb.append(a);
                        sb.append(" bytes");
                        throw new IOException(sb.toString());
                    }
                } else {
                    throw new IOException("expected 4 bytes");
                }
            }
        } catch (IOException | OutOfMemoryError e) {
            C12143a.m32032b(e, "Error reading protobuf data", new Object[0]);
        }
        return arrayList;
    }

    /* renamed from: a */
    public boolean mo13013a(Collection<T> collection) {
        ArrayList<MessageLite> arrayList = new ArrayList<>(collection);
        try {
            FileOutputStream c = this.f14005a.mo3246c();
            for (MessageLite messageLite : arrayList) {
                if (messageLite != null) {
                    byte[] byteArray = messageLite.toByteArray();
                    c.write(m15453a(byteArray.length));
                    c.write(byteArray);
                }
            }
            this.f14005a.mo3245b(c);
            return true;
        } catch (IOException unused) {
            if (0 != 0) {
                this.f14005a.mo3243a(null);
            }
            return false;
        }
    }

    /* renamed from: a */
    private static int m15452a(byte[] bArr) {
        return (bArr[3] & 255) | (bArr[0] << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8);
    }
}

package com.facebook.imagepipeline.producers;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.ContactsContract.Contacts;
import com.facebook.common.memory.PooledByteBufferFactory;
import com.facebook.common.util.C9559e;
import com.facebook.imagepipeline.image.C9732e;
import com.facebook.imagepipeline.request.C9884a;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Executor;

/* renamed from: com.facebook.imagepipeline.producers.u */
public class C9874u extends C9879x {

    /* renamed from: d */
    private static final String[] f25928d = {"_id", "_data"};

    /* renamed from: c */
    private final ContentResolver f25929c;

    public C9874u(Executor executor, PooledByteBufferFactory pooledByteBufferFactory, ContentResolver contentResolver) {
        super(executor, pooledByteBufferFactory);
        this.f25929c = contentResolver;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C9732e mo26645a(C9884a aVar) throws IOException {
        InputStream inputStream;
        Uri p = aVar.mo26743p();
        if (C9559e.m23389e(p)) {
            if (p.toString().endsWith("/photo")) {
                inputStream = this.f25929c.openInputStream(p);
            } else {
                String str = "Contact photo does not exist: ";
                if (p.toString().endsWith("/display_photo")) {
                    try {
                        inputStream = this.f25929c.openAssetFileDescriptor(p, "r").createInputStream();
                    } catch (IOException unused) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(str);
                        sb.append(p);
                        throw new IOException(sb.toString());
                    }
                } else {
                    InputStream openContactPhotoInputStream = Contacts.openContactPhotoInputStream(this.f25929c, p);
                    if (openContactPhotoInputStream != null) {
                        inputStream = openContactPhotoInputStream;
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(str);
                        sb2.append(p);
                        throw new IOException(sb2.toString());
                    }
                }
            }
            return mo26688b(inputStream, -1);
        }
        if (C9559e.m23388d(p)) {
            C9732e a = m24608a(p);
            if (a != null) {
                return a;
            }
        }
        return mo26688b(this.f25929c.openInputStream(p), -1);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo26646a() {
        return "LocalContentUriFetchProducer";
    }

    /* renamed from: a */
    private C9732e m24608a(Uri uri) throws IOException {
        Cursor query = this.f25929c.query(uri, f25928d, null, null, null);
        if (query == null) {
            return null;
        }
        try {
            if (query.getCount() == 0) {
                return null;
            }
            query.moveToFirst();
            String string = query.getString(query.getColumnIndex("_data"));
            if (string != null) {
                C9732e b = mo26688b(new FileInputStream(string), m24607a(string));
                query.close();
                return b;
            }
            query.close();
            return null;
        } finally {
            query.close();
        }
    }

    /* renamed from: a */
    private static int m24607a(String str) {
        if (str == null) {
            return -1;
        }
        return (int) new File(str).length();
    }
}

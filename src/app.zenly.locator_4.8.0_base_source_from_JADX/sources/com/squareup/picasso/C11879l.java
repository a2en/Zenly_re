package com.squareup.picasso;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory.Options;
import android.net.Uri;
import android.provider.MediaStore.Images;
import android.provider.MediaStore.Video.Thumbnails;
import com.squareup.picasso.C11893u.C11894a;
import com.squareup.picasso.Picasso.C11847d;
import java.io.IOException;

/* renamed from: com.squareup.picasso.l */
class C11879l extends C11868e {

    /* renamed from: b */
    private static final String[] f30778b = {"orientation"};

    /* renamed from: com.squareup.picasso.l$a */
    enum C11880a {
        MICRO(3, 96, 96),
        MINI(1, 512, 384),
        FULL(2, -1, -1);
        

        /* renamed from: e */
        final int f30783e;

        /* renamed from: f */
        final int f30784f;

        /* renamed from: g */
        final int f30785g;

        private C11880a(int i, int i2, int i3) {
            this.f30783e = i;
            this.f30784f = i2;
            this.f30785g = i3;
        }
    }

    C11879l(Context context) {
        super(context);
    }

    /* renamed from: a */
    public boolean mo35069a(C11889s sVar) {
        Uri uri = sVar.f30811d;
        if ("content".equals(uri.getScheme())) {
            if ("media".equals(uri.getAuthority())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public C11894a mo35068a(C11889s sVar, int i) throws IOException {
        Bitmap bitmap;
        C11889s sVar2 = sVar;
        ContentResolver contentResolver = this.f30742a.getContentResolver();
        int a = m31198a(contentResolver, sVar2.f30811d);
        String type = contentResolver.getType(sVar2.f30811d);
        boolean z = type != null && type.startsWith("video/");
        if (sVar.mo35143c()) {
            C11880a a2 = m31199a(sVar2.f30815h, sVar2.f30816i);
            if (!z && a2 == C11880a.FULL) {
                return new C11894a(null, mo35093c(sVar), C11847d.DISK, a);
            }
            long parseId = ContentUris.parseId(sVar2.f30811d);
            Options b = C11893u.m31248b(sVar);
            b.inJustDecodeBounds = true;
            Options options = b;
            C11893u.m31245a(sVar2.f30815h, sVar2.f30816i, a2.f30784f, a2.f30785g, b, sVar);
            if (z) {
                bitmap = Thumbnails.getThumbnail(contentResolver, parseId, a2 == C11880a.FULL ? 1 : a2.f30783e, options);
            } else {
                bitmap = Images.Thumbnails.getThumbnail(contentResolver, parseId, a2.f30783e, options);
            }
            if (bitmap != null) {
                return new C11894a(bitmap, null, C11847d.DISK, a);
            }
        }
        return new C11894a(null, mo35093c(sVar), C11847d.DISK, a);
    }

    /* renamed from: a */
    static C11880a m31199a(int i, int i2) {
        C11880a aVar = C11880a.MICRO;
        if (i <= aVar.f30784f && i2 <= aVar.f30785g) {
            return aVar;
        }
        C11880a aVar2 = C11880a.MINI;
        if (i > aVar2.f30784f || i2 > aVar2.f30785g) {
            return C11880a.FULL;
        }
        return aVar2;
    }

    /* renamed from: a */
    static int m31198a(ContentResolver contentResolver, Uri uri) {
        Cursor cursor = null;
        try {
            Cursor query = contentResolver.query(uri, f30778b, null, null, null);
            if (query != null) {
                if (query.moveToFirst()) {
                    int i = query.getInt(0);
                    if (query != null) {
                        query.close();
                    }
                    return i;
                }
            }
            if (query != null) {
                query.close();
            }
            return 0;
        } catch (RuntimeException unused) {
            if (cursor != null) {
                cursor.close();
            }
            return 0;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }
}

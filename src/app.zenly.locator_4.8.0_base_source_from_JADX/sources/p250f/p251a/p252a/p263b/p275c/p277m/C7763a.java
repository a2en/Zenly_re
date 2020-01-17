package p250f.p251a.p252a.p263b.p275c.p277m;

import android.content.ContentUris;
import android.net.Uri;
import android.provider.MediaStore.Images.Media;
import android.provider.MediaStore.Video;
import kotlin.jvm.internal.C12932j;

/* renamed from: f.a.a.b.c.m.a */
public final class C7763a {

    /* renamed from: a */
    private final boolean f19431a = C13028q.m34003a(this.f19434d, "video/", false, 2, null);

    /* renamed from: b */
    private final boolean f19432b = C13028q.m34003a(this.f19434d, "image/", false, 2, null);

    /* renamed from: c */
    private final long f19433c;

    /* renamed from: d */
    private final String f19434d;

    /* renamed from: e */
    private final int f19435e;

    public C7763a(long j, String str, int i) {
        C12932j.m33818b(str, "mimeType");
        this.f19433c = j;
        this.f19434d = str;
        this.f19435e = i;
    }

    /* renamed from: a */
    public final long mo19972a() {
        return this.f19433c;
    }

    /* renamed from: b */
    public final int mo19973b() {
        return this.f19435e;
    }

    /* renamed from: c */
    public final Uri mo19974c() {
        if (this.f19432b) {
            return ContentUris.withAppendedId(Media.EXTERNAL_CONTENT_URI, this.f19433c);
        }
        if (this.f19431a) {
            return ContentUris.withAppendedId(Video.Media.EXTERNAL_CONTENT_URI, this.f19433c);
        }
        return null;
    }

    /* renamed from: d */
    public final boolean mo19975d() {
        return this.f19432b;
    }

    /* renamed from: e */
    public final boolean mo19976e() {
        return this.f19431a;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C7763a) {
                C7763a aVar = (C7763a) obj;
                if ((this.f19433c == aVar.f19433c) && C12932j.m33817a((Object) this.f19434d, (Object) aVar.f19434d)) {
                    if (this.f19435e == aVar.f19435e) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        long j = this.f19433c;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        String str = this.f19434d;
        return ((i + (str != null ? str.hashCode() : 0)) * 31) + this.f19435e;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MediaPickerModel(mediaId=");
        sb.append(this.f19433c);
        sb.append(", mimeType=");
        sb.append(this.f19434d);
        sb.append(", orientation=");
        sb.append(this.f19435e);
        sb.append(")");
        return sb.toString();
    }
}

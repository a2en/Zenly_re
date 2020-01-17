package p250f.p251a.p252a.p263b.p275c.p276l;

import android.content.ContentResolver;
import androidx.paging.DataSource;
import androidx.paging.DataSource.C1000a;
import kotlin.jvm.internal.C12932j;
import p250f.p251a.p252a.p263b.p275c.p277m.C7763a;

/* renamed from: f.a.a.b.c.l.b */
public final class C7761b extends C1000a<Integer, C7763a> {

    /* renamed from: a */
    private final ContentResolver f19429a;

    public C7761b(ContentResolver contentResolver) {
        C12932j.m33818b(contentResolver, "contentResolver");
        this.f19429a = contentResolver;
    }

    /* renamed from: a */
    public DataSource<Integer, C7763a> mo4806a() {
        return new C7758a(this.f19429a);
    }
}

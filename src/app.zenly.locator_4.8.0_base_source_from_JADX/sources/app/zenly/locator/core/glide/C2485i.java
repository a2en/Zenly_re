package app.zenly.locator.core.glide;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.bumptech.glide.C8867j;
import com.bumptech.glide.Glide;
import com.bumptech.glide.manager.Lifecycle;
import com.bumptech.glide.manager.RequestManagerTreeNode;
import com.bumptech.glide.request.C9220a;
import com.bumptech.glide.request.C9224d;
import java.io.File;

/* renamed from: app.zenly.locator.core.glide.i */
public class C2485i extends C8867j {
    public C2485i(Glide glide, Lifecycle lifecycle, RequestManagerTreeNode requestManagerTreeNode, Context context) {
        super(glide, lifecycle, requestManagerTreeNode, context);
    }

    /* renamed from: c */
    public C2484h<File> mo8553c() {
        return (C2484h) super.mo8553c();
    }

    /* renamed from: b */
    public C2484h<Drawable> m8720b() {
        return (C2484h) super.mo8552b();
    }

    /* renamed from: a */
    public <ResourceType> C2484h<ResourceType> m8716a(Class<ResourceType> cls) {
        return new C2484h<>(this.f23111e, this, cls, this.f23112f);
    }

    /* renamed from: a */
    public C2484h<Bitmap> m8714a() {
        return (C2484h) super.mo8543a();
    }

    /* renamed from: a */
    public C2484h<Drawable> mo8544a(Drawable drawable) {
        return (C2484h) super.mo8544a(drawable);
    }

    /* renamed from: a */
    public C2484h<Drawable> mo8550a(String str) {
        return (C2484h) super.mo8550a(str);
    }

    /* renamed from: a */
    public C2484h<Drawable> m8715a(Uri uri) {
        return (C2484h) super.mo8545a(uri);
    }

    /* renamed from: a */
    public C2484h<Drawable> mo8546a(File file) {
        return (C2484h) super.mo8546a(file);
    }

    /* renamed from: a */
    public C2484h<Drawable> m8717a(Integer num) {
        return (C2484h) super.mo8548a(num);
    }

    /* renamed from: a */
    public C2484h<Drawable> mo8549a(Object obj) {
        return (C2484h) super.mo8549a(obj);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo8551a(C9224d dVar) {
        if (dVar instanceof C2483g) {
            super.mo8551a(dVar);
        } else {
            super.mo8551a((C9224d) new C2483g().m8640a((C9220a<?>) dVar));
        }
    }
}

package com.facebook.imagepipeline.request;

import android.net.Uri;
import com.facebook.common.internal.C9536j;
import com.facebook.common.util.C9559e;
import com.facebook.imagepipeline.common.C9697a;
import com.facebook.imagepipeline.common.C9698b;
import com.facebook.imagepipeline.common.C9700d;
import com.facebook.imagepipeline.common.C9701e;
import com.facebook.imagepipeline.common.C9702f;
import com.facebook.imagepipeline.core.C9712f;
import com.facebook.imagepipeline.listener.RequestListener;
import com.facebook.imagepipeline.request.C9884a.C9885a;
import com.facebook.imagepipeline.request.C9884a.C9886b;

public class ImageRequestBuilder {

    /* renamed from: a */
    private Uri f25950a = null;

    /* renamed from: b */
    private C9886b f25951b = C9886b.FULL_FETCH;

    /* renamed from: c */
    private C9701e f25952c = null;

    /* renamed from: d */
    private C9702f f25953d = null;

    /* renamed from: e */
    private C9698b f25954e = C9698b.m23841a();

    /* renamed from: f */
    private C9885a f25955f = C9885a.DEFAULT;

    /* renamed from: g */
    private boolean f25956g = C9712f.m23901C().mo26339a();

    /* renamed from: h */
    private boolean f25957h = false;

    /* renamed from: i */
    private C9700d f25958i = C9700d.HIGH;

    /* renamed from: j */
    private Postprocessor f25959j = null;

    /* renamed from: k */
    private boolean f25960k = true;

    /* renamed from: l */
    private boolean f25961l = true;

    /* renamed from: m */
    private Boolean f25962m = null;

    /* renamed from: n */
    private RequestListener f25963n;

    /* renamed from: o */
    private C9697a f25964o = null;

    /* renamed from: p */
    private Boolean f25965p = null;

    public static class BuilderException extends RuntimeException {
        public BuilderException(String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid request builder: ");
            sb.append(str);
            super(sb.toString());
        }
    }

    private ImageRequestBuilder() {
    }

    /* renamed from: a */
    public static ImageRequestBuilder m24644a(C9884a aVar) {
        ImageRequestBuilder b = m24645b(aVar.mo26743p());
        b.mo26693a(aVar.mo26728c());
        b.mo26692a(aVar.mo26726a());
        b.mo26699a(aVar.mo26727b());
        b.mo26702a(aVar.mo26729d());
        b.mo26700a(aVar.mo26730e());
        b.mo26698a(aVar.mo26732f());
        b.mo26705b(aVar.mo26737j());
        b.mo26694a(aVar.mo26736i());
        b.mo26695a(aVar.mo26739l());
        b.mo26697a(aVar.mo26738k());
        b.mo26696a(aVar.mo26741n());
        b.mo26701a(aVar.mo26747t());
        return b;
    }

    /* renamed from: b */
    public static ImageRequestBuilder m24645b(Uri uri) {
        ImageRequestBuilder imageRequestBuilder = new ImageRequestBuilder();
        imageRequestBuilder.mo26691a(uri);
        return imageRequestBuilder;
    }

    /* renamed from: c */
    public C9885a mo26706c() {
        return this.f25955f;
    }

    /* renamed from: d */
    public C9698b mo26707d() {
        return this.f25954e;
    }

    /* renamed from: e */
    public C9886b mo26708e() {
        return this.f25951b;
    }

    /* renamed from: f */
    public Postprocessor mo26709f() {
        return this.f25959j;
    }

    /* renamed from: g */
    public RequestListener mo26710g() {
        return this.f25963n;
    }

    /* renamed from: h */
    public C9700d mo26711h() {
        return this.f25958i;
    }

    /* renamed from: i */
    public C9701e mo26712i() {
        return this.f25952c;
    }

    /* renamed from: j */
    public Boolean mo26713j() {
        return this.f25965p;
    }

    /* renamed from: k */
    public C9702f mo26714k() {
        return this.f25953d;
    }

    /* renamed from: l */
    public Uri mo26715l() {
        return this.f25950a;
    }

    /* renamed from: m */
    public boolean mo26716m() {
        return this.f25960k && C9559e.m23393i(this.f25950a);
    }

    /* renamed from: n */
    public boolean mo26717n() {
        return this.f25957h;
    }

    /* renamed from: o */
    public boolean mo26718o() {
        return this.f25961l;
    }

    /* renamed from: p */
    public boolean mo26719p() {
        return this.f25956g;
    }

    /* renamed from: q */
    public Boolean mo26720q() {
        return this.f25962m;
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public void mo26721r() {
        Uri uri = this.f25950a;
        if (uri != null) {
            if (C9559e.m23392h(uri)) {
                if (!this.f25950a.isAbsolute()) {
                    throw new BuilderException("Resource URI path must be absolute.");
                } else if (!this.f25950a.getPath().isEmpty()) {
                    try {
                        Integer.parseInt(this.f25950a.getPath().substring(1));
                    } catch (NumberFormatException unused) {
                        throw new BuilderException("Resource URI path must be a resource id.");
                    }
                } else {
                    throw new BuilderException("Resource URI must not be empty");
                }
            }
            if (C9559e.m23387c(this.f25950a) && !this.f25950a.isAbsolute()) {
                throw new BuilderException("Asset URI path must be absolute.");
            }
            return;
        }
        throw new BuilderException("Source must be set!");
    }

    /* renamed from: b */
    public C9697a mo26704b() {
        return this.f25964o;
    }

    /* renamed from: b */
    public ImageRequestBuilder mo26705b(boolean z) {
        this.f25956g = z;
        return this;
    }

    /* renamed from: a */
    public ImageRequestBuilder mo26691a(Uri uri) {
        C9536j.m23271a(uri);
        this.f25950a = uri;
        return this;
    }

    /* renamed from: a */
    public ImageRequestBuilder mo26700a(C9886b bVar) {
        this.f25951b = bVar;
        return this;
    }

    /* renamed from: a */
    public ImageRequestBuilder mo26695a(C9701e eVar) {
        this.f25952c = eVar;
        return this;
    }

    /* renamed from: a */
    public ImageRequestBuilder mo26696a(C9702f fVar) {
        this.f25953d = fVar;
        return this;
    }

    /* renamed from: a */
    public ImageRequestBuilder mo26692a(C9697a aVar) {
        this.f25964o = aVar;
        return this;
    }

    /* renamed from: a */
    public ImageRequestBuilder mo26693a(C9698b bVar) {
        this.f25954e = bVar;
        return this;
    }

    /* renamed from: a */
    public ImageRequestBuilder mo26699a(C9885a aVar) {
        this.f25955f = aVar;
        return this;
    }

    /* renamed from: a */
    public ImageRequestBuilder mo26702a(boolean z) {
        this.f25957h = z;
        return this;
    }

    /* renamed from: a */
    public ImageRequestBuilder mo26694a(C9700d dVar) {
        this.f25958i = dVar;
        return this;
    }

    /* renamed from: a */
    public ImageRequestBuilder mo26698a(Postprocessor postprocessor) {
        this.f25959j = postprocessor;
        return this;
    }

    /* renamed from: a */
    public ImageRequestBuilder mo26697a(RequestListener requestListener) {
        this.f25963n = requestListener;
        return this;
    }

    /* renamed from: a */
    public C9884a mo26703a() {
        mo26721r();
        return new C9884a(this);
    }

    /* renamed from: a */
    public ImageRequestBuilder mo26701a(Boolean bool) {
        this.f25962m = bool;
        return this;
    }
}

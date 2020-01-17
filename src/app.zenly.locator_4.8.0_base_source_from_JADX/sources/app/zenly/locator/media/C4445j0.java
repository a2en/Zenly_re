package app.zenly.locator.media;

import p389io.reactivex.functions.Function;

/* renamed from: app.zenly.locator.media.j0 */
/* compiled from: lambda */
public final /* synthetic */ class C4445j0 implements Function {

    /* renamed from: e */
    private final /* synthetic */ TakePictureActivity f11992e;

    /* renamed from: f */
    private final /* synthetic */ byte[] f11993f;

    public /* synthetic */ C4445j0(TakePictureActivity takePictureActivity, byte[] bArr) {
        this.f11992e = takePictureActivity;
        this.f11993f = bArr;
    }

    public final Object apply(Object obj) {
        return this.f11992e.mo11593a(this.f11993f, (byte[]) obj);
    }
}

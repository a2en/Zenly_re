package app.zenly.locator.media;

import java.io.ByteArrayOutputStream;
import java.io.File;
import p389io.reactivex.functions.Function;

/* renamed from: app.zenly.locator.media.m0 */
/* compiled from: lambda */
public final /* synthetic */ class C4451m0 implements Function {

    /* renamed from: e */
    private final /* synthetic */ ByteArrayOutputStream f12002e;

    public /* synthetic */ C4451m0(ByteArrayOutputStream byteArrayOutputStream) {
        this.f12002e = byteArrayOutputStream;
    }

    public final Object apply(Object obj) {
        File file = (File) obj;
        TakePictureActivity.m13169a(this.f12002e, file);
        return file;
    }
}

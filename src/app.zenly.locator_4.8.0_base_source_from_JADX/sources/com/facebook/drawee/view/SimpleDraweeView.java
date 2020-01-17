package com.facebook.drawee.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.net.Uri;
import android.util.AttributeSet;
import com.facebook.common.internal.C9536j;
import com.facebook.common.internal.Supplier;
import com.facebook.common.util.C9559e;
import com.facebook.drawee.controller.C9592b;
import com.facebook.imagepipeline.request.C9884a;
import com.facebook.imagepipeline.systrace.FrescoSystrace;
import p333g.p339c.p346c.C12034a;
import p333g.p339c.p346c.p351d.C12045a;

public class SimpleDraweeView extends GenericDraweeView {

    /* renamed from: l */
    private static Supplier<? extends C9592b> f25079l;

    /* renamed from: k */
    private C9592b f25080k;

    public SimpleDraweeView(Context context, C12045a aVar) {
        super(context, aVar);
        m23639b(context, null);
    }

    /* renamed from: a */
    public static void m23638a(Supplier<? extends C9592b> supplier) {
        f25079l = supplier;
    }

    /* renamed from: b */
    private void m23639b(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes;
        try {
            if (FrescoSystrace.m24705c()) {
                FrescoSystrace.m24703a("SimpleDraweeView#init");
            }
            if (isInEditMode()) {
                getTopLevelDrawable().setVisible(true, false);
                getTopLevelDrawable().invalidateSelf();
            } else {
                C9536j.m23272a(f25079l, (Object) "SimpleDraweeView was not initialized!");
                this.f25080k = (C9592b) f25079l.get();
            }
            if (attributeSet != null) {
                obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C12034a.SimpleDraweeView);
                if (obtainStyledAttributes.hasValue(C12034a.SimpleDraweeView_actualImageUri)) {
                    mo26068a(Uri.parse(obtainStyledAttributes.getString(C12034a.SimpleDraweeView_actualImageUri)), (Object) null);
                } else if (obtainStyledAttributes.hasValue(C12034a.SimpleDraweeView_actualImageResource)) {
                    int resourceId = obtainStyledAttributes.getResourceId(C12034a.SimpleDraweeView_actualImageResource, -1);
                    if (resourceId != -1) {
                        if (isInEditMode()) {
                            setImageResource(resourceId);
                        } else {
                            setActualImageResource(resourceId);
                        }
                    }
                }
                obtainStyledAttributes.recycle();
            }
            if (FrescoSystrace.m24705c()) {
                FrescoSystrace.m24702a();
            }
        } catch (Throwable th) {
            if (FrescoSystrace.m24705c()) {
                FrescoSystrace.m24702a();
            }
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    public C9592b getControllerBuilder() {
        return this.f25080k;
    }

    public void setActualImageResource(int i) {
        mo26067a(i, (Object) null);
    }

    public void setImageRequest(C9884a aVar) {
        C9592b bVar = this.f25080k;
        bVar.mo25885a(aVar);
        bVar.setOldController(getController());
        setController(bVar.build());
    }

    public void setImageResource(int i) {
        super.setImageResource(i);
    }

    public void setImageURI(Uri uri) {
        mo26068a(uri, (Object) null);
    }

    /* renamed from: a */
    public void mo26068a(Uri uri, Object obj) {
        C9592b bVar = this.f25080k;
        bVar.setCallerContext(obj);
        setController(bVar.setUri(uri).setOldController(getController()).build());
    }

    public void setImageURI(String str) {
        mo26069a(str, (Object) null);
    }

    public SimpleDraweeView(Context context) {
        super(context);
        m23639b(context, null);
    }

    public SimpleDraweeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m23639b(context, attributeSet);
    }

    public SimpleDraweeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m23639b(context, attributeSet);
    }

    /* renamed from: a */
    public void mo26069a(String str, Object obj) {
        mo26068a(str != null ? Uri.parse(str) : null, obj);
    }

    @TargetApi(21)
    public SimpleDraweeView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m23639b(context, attributeSet);
    }

    /* renamed from: a */
    public void mo26067a(int i, Object obj) {
        mo26068a(C9559e.m23383a(i), obj);
    }
}

package com.facebook.drawee.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import com.facebook.imagepipeline.systrace.FrescoSystrace;
import p333g.p339c.p346c.p351d.C12045a;
import p333g.p339c.p346c.p351d.C12046b;
import p333g.p339c.p346c.p351d.C12047c;

public class GenericDraweeView extends DraweeView<C12045a> {
    public GenericDraweeView(Context context, C12045a aVar) {
        super(context);
        setHierarchy(aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo26066a(Context context, AttributeSet attributeSet) {
        if (FrescoSystrace.m24705c()) {
            FrescoSystrace.m24703a("GenericDraweeView#inflateHierarchy");
        }
        C12046b a = C12047c.m31812a(context, attributeSet);
        setAspectRatio(a.mo35731f());
        setHierarchy(a.mo35713a());
        if (FrescoSystrace.m24705c()) {
            FrescoSystrace.m24702a();
        }
    }

    public GenericDraweeView(Context context) {
        super(context);
        mo26066a(context, null);
    }

    public GenericDraweeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo26066a(context, attributeSet);
    }

    public GenericDraweeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo26066a(context, attributeSet);
    }

    @TargetApi(21)
    public GenericDraweeView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        mo26066a(context, attributeSet);
    }
}

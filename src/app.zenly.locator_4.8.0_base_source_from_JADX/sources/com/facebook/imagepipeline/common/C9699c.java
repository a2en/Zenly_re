package com.facebook.imagepipeline.common;

import android.graphics.Bitmap.Config;
import android.graphics.ColorSpace;
import com.facebook.imagepipeline.decoder.ImageDecoder;
import com.facebook.imagepipeline.transformation.BitmapTransformation;

/* renamed from: com.facebook.imagepipeline.common.c */
public class C9699c {

    /* renamed from: a */
    private int f25342a = 100;

    /* renamed from: b */
    private boolean f25343b;

    /* renamed from: c */
    private boolean f25344c;

    /* renamed from: d */
    private boolean f25345d;

    /* renamed from: e */
    private boolean f25346e;

    /* renamed from: f */
    private Config f25347f = Config.ARGB_8888;

    /* renamed from: g */
    private ImageDecoder f25348g;

    /* renamed from: h */
    private BitmapTransformation f25349h;

    /* renamed from: i */
    private ColorSpace f25350i;

    /* renamed from: a */
    public C9698b mo26260a() {
        return new C9698b(this);
    }

    /* renamed from: b */
    public Config mo26261b() {
        return this.f25347f;
    }

    /* renamed from: c */
    public BitmapTransformation mo26262c() {
        return this.f25349h;
    }

    /* renamed from: d */
    public ColorSpace mo26263d() {
        return this.f25350i;
    }

    /* renamed from: e */
    public ImageDecoder mo26264e() {
        return this.f25348g;
    }

    /* renamed from: f */
    public boolean mo26265f() {
        return this.f25345d;
    }

    /* renamed from: g */
    public boolean mo26266g() {
        return this.f25343b;
    }

    /* renamed from: h */
    public boolean mo26267h() {
        return this.f25346e;
    }

    /* renamed from: i */
    public int mo26268i() {
        return this.f25342a;
    }

    /* renamed from: j */
    public boolean mo26269j() {
        return this.f25344c;
    }
}

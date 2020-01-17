package com.bumptech.glide.p299m;

import com.bumptech.glide.load.ImageHeaderParser;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bumptech.glide.m.b */
public final class C9173b {

    /* renamed from: a */
    private final List<ImageHeaderParser> f23807a = new ArrayList();

    /* renamed from: a */
    public synchronized List<ImageHeaderParser> mo24727a() {
        return this.f23807a;
    }

    /* renamed from: a */
    public synchronized void mo24728a(ImageHeaderParser imageHeaderParser) {
        this.f23807a.add(imageHeaderParser);
    }
}

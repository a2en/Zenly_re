package com.airbnb.lottie.p285n;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable.Callback;
import android.view.View;
import com.airbnb.lottie.C8469a;
import com.airbnb.lottie.model.C8585h;
import com.airbnb.lottie.p289q.C8654d;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.airbnb.lottie.n.a */
public class C8602a {

    /* renamed from: a */
    private final C8585h<String> f22113a = new C8585h<>();

    /* renamed from: b */
    private final Map<C8585h<String>, Typeface> f22114b = new HashMap();

    /* renamed from: c */
    private final Map<String, Typeface> f22115c = new HashMap();

    /* renamed from: d */
    private final AssetManager f22116d;

    /* renamed from: e */
    private C8469a f22117e;

    /* renamed from: f */
    private String f22118f = ".ttf";

    public C8602a(Callback callback, C8469a aVar) {
        this.f22117e = aVar;
        if (!(callback instanceof View)) {
            C8654d.m20155b("LottieDrawable must be inside of a view for images to work.");
            this.f22116d = null;
            return;
        }
        this.f22116d = ((View) callback).getContext().getAssets();
    }

    /* renamed from: a */
    public void mo23214a(C8469a aVar) {
        this.f22117e = aVar;
    }

    /* renamed from: a */
    public Typeface mo23213a(String str, String str2) {
        this.f22113a.mo23175a(str, str2);
        Typeface typeface = (Typeface) this.f22114b.get(this.f22113a);
        if (typeface != null) {
            return typeface;
        }
        Typeface a = m19993a(m19994a(str), str2);
        this.f22114b.put(this.f22113a, a);
        return a;
    }

    /* renamed from: a */
    private Typeface m19994a(String str) {
        Typeface typeface = (Typeface) this.f22115c.get(str);
        if (typeface != null) {
            return typeface;
        }
        C8469a aVar = this.f22117e;
        if (aVar != null) {
            aVar.mo22873a(str);
            throw null;
        } else if (aVar != null) {
            aVar.mo22874b(str);
            throw null;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("fonts/");
            sb.append(str);
            sb.append(this.f22118f);
            Typeface createFromAsset = Typeface.createFromAsset(this.f22116d, sb.toString());
            this.f22115c.put(str, createFromAsset);
            return createFromAsset;
        }
    }

    /* renamed from: a */
    private Typeface m19993a(Typeface typeface, String str) {
        boolean contains = str.contains("Italic");
        boolean contains2 = str.contains("Bold");
        int i = (!contains || !contains2) ? contains ? 2 : contains2 ? 1 : 0 : 3;
        if (typeface.getStyle() == i) {
            return typeface;
        }
        return Typeface.create(typeface, i);
    }
}

package com.bumptech.glide.load.model;

import android.net.Uri;
import android.text.TextUtils;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.p301o.C9216j;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.util.Map;

/* renamed from: com.bumptech.glide.load.model.c */
public class C9053c implements Key {

    /* renamed from: b */
    private final Headers f23587b;

    /* renamed from: c */
    private final URL f23588c;

    /* renamed from: d */
    private final String f23589d;

    /* renamed from: e */
    private String f23590e;

    /* renamed from: f */
    private URL f23591f;

    /* renamed from: g */
    private volatile byte[] f23592g;

    /* renamed from: h */
    private int f23593h;

    public C9053c(URL url) {
        this(url, Headers.f23577a);
    }

    /* renamed from: d */
    private byte[] m21711d() {
        if (this.f23592g == null) {
            this.f23592g = mo24559a().getBytes(Key.f23163a);
        }
        return this.f23592g;
    }

    /* renamed from: e */
    private String m21712e() {
        if (TextUtils.isEmpty(this.f23590e)) {
            String str = this.f23589d;
            if (TextUtils.isEmpty(str)) {
                URL url = this.f23588c;
                C9216j.m22083a(url);
                str = url.toString();
            }
            this.f23590e = Uri.encode(str, "@#&=*+-_.,:!?()/~'%;$");
        }
        return this.f23590e;
    }

    /* renamed from: f */
    private URL m21713f() throws MalformedURLException {
        if (this.f23591f == null) {
            this.f23591f = new URL(m21712e());
        }
        return this.f23591f;
    }

    /* renamed from: a */
    public String mo24559a() {
        String str = this.f23589d;
        if (str != null) {
            return str;
        }
        URL url = this.f23588c;
        C9216j.m22083a(url);
        return url.toString();
    }

    /* renamed from: b */
    public Map<String, String> mo24560b() {
        return this.f23587b.getHeaders();
    }

    /* renamed from: c */
    public URL mo24561c() throws MalformedURLException {
        return m21713f();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C9053c)) {
            return false;
        }
        C9053c cVar = (C9053c) obj;
        if (!mo24559a().equals(cVar.mo24559a()) || !this.f23587b.equals(cVar.f23587b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        if (this.f23593h == 0) {
            this.f23593h = mo24559a().hashCode();
            this.f23593h = (this.f23593h * 31) + this.f23587b.hashCode();
        }
        return this.f23593h;
    }

    public String toString() {
        return mo24559a();
    }

    public void updateDiskCacheKey(MessageDigest messageDigest) {
        messageDigest.update(m21711d());
    }

    public C9053c(String str) {
        this(str, Headers.f23577a);
    }

    public C9053c(URL url, Headers headers) {
        C9216j.m22083a(url);
        this.f23588c = url;
        this.f23589d = null;
        C9216j.m22083a(headers);
        this.f23587b = headers;
    }

    public C9053c(String str, Headers headers) {
        this.f23588c = null;
        C9216j.m22085a(str);
        this.f23589d = str;
        C9216j.m22083a(headers);
        this.f23587b = headers;
    }
}

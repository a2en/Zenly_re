package com.google.android.gms.internal.clearcut;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.gms.internal.clearcut.c */
public final class C10283c {

    /* renamed from: h */
    private static final ConcurrentHashMap<Uri, C10283c> f26921h = new ConcurrentHashMap<>();

    /* renamed from: i */
    private static final String[] f26922i = {"key", "value"};

    /* renamed from: a */
    private final ContentResolver f26923a;

    /* renamed from: b */
    private final Uri f26924b;

    /* renamed from: c */
    private final ContentObserver f26925c;

    /* renamed from: d */
    private final Object f26926d = new Object();

    /* renamed from: e */
    private volatile Map<String, String> f26927e;

    /* renamed from: f */
    private final Object f26928f = new Object();

    /* renamed from: g */
    private final List<zzad> f26929g = new ArrayList();

    private C10283c(ContentResolver contentResolver, Uri uri) {
        this.f26923a = contentResolver;
        this.f26924b = uri;
        this.f26925c = new C10290d(this, null);
    }

    /* renamed from: a */
    public static C10283c m25983a(ContentResolver contentResolver, Uri uri) {
        C10283c cVar = (C10283c) f26921h.get(uri);
        if (cVar != null) {
            return cVar;
        }
        C10283c cVar2 = new C10283c(contentResolver, uri);
        C10283c cVar3 = (C10283c) f26921h.putIfAbsent(uri, cVar2);
        if (cVar3 != null) {
            return cVar3;
        }
        cVar2.f26923a.registerContentObserver(cVar2.f26924b, false, cVar2.f26925c);
        return cVar2;
    }

    /* renamed from: c */
    private final Map<String, String> m25985c() {
        Cursor query;
        try {
            HashMap hashMap = new HashMap();
            query = this.f26923a.query(this.f26924b, f26922i, null, null, null);
            if (query != null) {
                while (query.moveToNext()) {
                    hashMap.put(query.getString(0), query.getString(1));
                }
                query.close();
            }
            return hashMap;
        } catch (SQLiteException | SecurityException unused) {
            Log.e("ConfigurationContentLoader", "PhenotypeFlag unable to load ContentProvider, using default values");
            return null;
        } catch (Throwable th) {
            query.close();
            throw th;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final void m25986d() {
        synchronized (this.f26928f) {
            for (zzad zzk : this.f26929g) {
                zzk.zzk();
            }
        }
    }

    /* renamed from: a */
    public final Map<String, String> mo27841a() {
        Map<String, String> c = C10297e.m26045a("gms:phenotype:phenotype_flag:debug_disable_caching", false) ? m25985c() : this.f26927e;
        if (c == null) {
            synchronized (this.f26926d) {
                Map<String, String> map = this.f26927e;
                if (map == null) {
                    map = m25985c();
                    this.f26927e = map;
                }
            }
        }
        return c != null ? c : Collections.emptyMap();
    }

    /* renamed from: b */
    public final void mo27842b() {
        synchronized (this.f26926d) {
            this.f26927e = null;
        }
    }
}

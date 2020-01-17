package com.snapchat.kit.sdk.core.metrics.p330b;

import android.util.Base64;
import com.google.gson.C11125d;
import com.google.gson.JsonParseException;
import com.google.gson.p316k.C11261a;
import com.snapchat.kit.sdk.core.metrics.C11795c;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.snapchat.kit.sdk.core.metrics.b.a */
public class C11783a {

    /* renamed from: b */
    private static final Type f30535b = new C11784a().getType();

    /* renamed from: a */
    private final C11125d f30536a;

    /* renamed from: com.snapchat.kit.sdk.core.metrics.b.a$a */
    static class C11784a extends C11261a<List<C11795c<String>>> {
        C11784a() {
        }
    }

    C11783a(C11125d dVar) {
        this.f30536a = dVar;
    }

    /* renamed from: b */
    private static <T extends Message> List<C11795c<String>> m30940b(List<C11795c<T>> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (C11795c cVar : list) {
            try {
                arrayList.add(new C11795c(Base64.encodeToString(((Message) cVar.mo34669c()).encode(), 0), cVar.mo34668b()));
            } catch (Exception unused) {
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public <T extends Message> String mo34653a(List<C11795c<T>> list) {
        try {
            return this.f30536a.mo32461a((Object) m30940b(list), f30535b);
        } catch (JsonParseException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public <T extends Message> List<C11795c<T>> mo34654a(ProtoAdapter<T> protoAdapter, String str) {
        try {
            List list = (List) this.f30536a.mo32458a(str, f30535b);
            if (list == null) {
                return null;
            }
            return m30939a(protoAdapter, list);
        } catch (JsonParseException unused) {
            return null;
        }
    }

    /* renamed from: a */
    private static <T extends Message> List<C11795c<T>> m30939a(ProtoAdapter<T> protoAdapter, List<C11795c<String>> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (C11795c cVar : list) {
            String str = (String) cVar.mo34669c();
            if (str != null) {
                try {
                    arrayList.add(new C11795c((Message) protoAdapter.decode(Base64.decode(str, 0)), cVar.mo34668b()));
                } catch (Exception unused) {
                }
            }
        }
        return arrayList;
    }
}

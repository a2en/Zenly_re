package com.google.firebase.platforminfo;

import com.google.firebase.components.C11025d;
import com.google.firebase.components.C11025d.C11027b;
import com.google.firebase.components.C11040k;
import com.google.firebase.components.ComponentContainer;
import java.util.Iterator;
import java.util.Set;

/* renamed from: com.google.firebase.platforminfo.c */
public class C11112c implements UserAgentPublisher {

    /* renamed from: a */
    private final String f28805a;

    /* renamed from: b */
    private final C11113d f28806b;

    C11112c(Set<C11114e> set, C11113d dVar) {
        this.f28805a = m28618a(set);
        this.f28806b = dVar;
    }

    /* renamed from: a */
    private static String m28618a(Set<C11114e> set) {
        StringBuilder sb = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C11114e eVar = (C11114e) it.next();
            sb.append(eVar.mo32360a());
            sb.append('/');
            sb.append(eVar.mo32361b());
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    public String getUserAgent() {
        if (this.f28806b.mo32365a().isEmpty()) {
            return this.f28805a;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f28805a);
        sb.append(' ');
        sb.append(m28618a(this.f28806b.mo32365a()));
        return sb.toString();
    }

    /* renamed from: a */
    public static C11025d<UserAgentPublisher> m28616a() {
        C11027b a = C11025d.m28392a(UserAgentPublisher.class);
        a.mo32185a(C11040k.m28442b(C11114e.class));
        a.mo32184a(C11111b.m28615a());
        return a.mo32186b();
    }

    /* renamed from: a */
    static /* synthetic */ UserAgentPublisher m28617a(ComponentContainer componentContainer) {
        return new C11112c(componentContainer.setOf(C11114e.class), C11113d.m28619b());
    }
}

package com.google.firebase.iid;

import androidx.annotation.Keep;
import com.google.firebase.FirebaseApp;
import com.google.firebase.components.C11025d;
import com.google.firebase.components.C11025d.C11027b;
import com.google.firebase.components.C11040k;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.events.Subscriber;
import com.google.firebase.iid.internal.FirebaseInstanceIdInternal;
import com.google.firebase.platforminfo.UserAgentPublisher;
import java.util.Arrays;
import java.util.List;

@Keep
public final class Registrar implements ComponentRegistrar {

    /* renamed from: com.google.firebase.iid.Registrar$a */
    private static class C11048a implements FirebaseInstanceIdInternal {

        /* renamed from: a */
        private final FirebaseInstanceId f28670a;

        public C11048a(FirebaseInstanceId firebaseInstanceId) {
            this.f28670a = firebaseInstanceId;
        }

        public final String getId() {
            return this.f28670a.getId();
        }

        public final String getToken() {
            return this.f28670a.getToken();
        }
    }

    @Keep
    public final List<C11025d<?>> getComponents() {
        Class<FirebaseInstanceId> cls = FirebaseInstanceId.class;
        C11027b a = C11025d.m28392a(cls);
        a.mo32185a(C11040k.m28441a(FirebaseApp.class));
        a.mo32185a(C11040k.m28441a(Subscriber.class));
        a.mo32185a(C11040k.m28441a(UserAgentPublisher.class));
        a.mo32184a(C11077o.f28736a);
        a.mo32183a();
        C11025d b = a.mo32186b();
        C11027b a2 = C11025d.m28392a(FirebaseInstanceIdInternal.class);
        a2.mo32185a(C11040k.m28441a(cls));
        a2.mo32184a(C11079p.f28738a);
        return Arrays.asList(new C11025d[]{b, a2.mo32186b()});
    }
}

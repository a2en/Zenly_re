package com.segment.analytics;

import android.app.Activity;
import android.os.Bundle;
import com.segment.analytics.integrations.C11649a;
import com.segment.analytics.integrations.C11654c;
import com.segment.analytics.integrations.C11655d;
import com.segment.analytics.integrations.C11658f;
import com.segment.analytics.integrations.C11660g;
import com.segment.analytics.integrations.Integration;
import com.segment.analytics.p326t.C11692b;
import java.util.Map;

/* renamed from: com.segment.analytics.h */
abstract class C11633h {

    /* renamed from: a */
    static final C11633h f30204a = new C11638e();

    /* renamed from: com.segment.analytics.h$a */
    static class C11634a extends C11633h {

        /* renamed from: b */
        final /* synthetic */ C11660g f30205b;

        C11634a(C11660g gVar) {
            this.f30205b = gVar;
            super(null);
        }

        /* renamed from: a */
        public void mo34303a(String str, Integration<?> integration, C11666k kVar) {
            C11685r b = this.f30205b.mo34332b();
            C11685r e = kVar.mo34372e();
            if (C11692b.m30718b((Map) e)) {
                if (C11633h.m30500a(b, str)) {
                    integration.mo34275a(this.f30205b);
                }
                return;
            }
            C11685r b2 = e.mo34422b(this.f30205b.mo34358e());
            String str2 = "Segment.io";
            String str3 = "enabled";
            if (C11692b.m30718b((Map) b2)) {
                if (!C11692b.m30718b((Map) b)) {
                    if (C11633h.m30500a(b, str)) {
                        integration.mo34275a(this.f30205b);
                    }
                    return;
                }
                C11685r b3 = e.mo34422b("__default");
                if (C11692b.m30718b((Map) b3)) {
                    integration.mo34275a(this.f30205b);
                    return;
                }
                if (b3.mo34421a(str3, true) || str2.equals(str)) {
                    integration.mo34275a(this.f30205b);
                }
            } else if (!b2.mo34421a(str3, true)) {
                if (str2.equals(str)) {
                    integration.mo34275a(this.f30205b);
                }
            } else {
                C11685r rVar = new C11685r();
                C11685r b4 = b2.mo34422b("integrations");
                if (!C11692b.m30718b((Map) b4)) {
                    rVar.putAll(b4);
                }
                rVar.putAll(b);
                if (C11633h.m30500a(rVar, str)) {
                    integration.mo34275a(this.f30205b);
                }
            }
        }

        public String toString() {
            return this.f30205b.toString();
        }
    }

    /* renamed from: com.segment.analytics.h$b */
    static class C11635b extends C11633h {

        /* renamed from: b */
        final /* synthetic */ C11658f f30206b;

        C11635b(C11658f fVar) {
            this.f30206b = fVar;
            super(null);
        }

        /* renamed from: a */
        public void mo34303a(String str, Integration<?> integration, C11666k kVar) {
            if (C11633h.m30500a(this.f30206b.mo34332b(), str)) {
                integration.mo34323a(this.f30206b);
            }
        }

        public String toString() {
            return this.f30206b.toString();
        }
    }

    /* renamed from: com.segment.analytics.h$c */
    static class C11636c extends C11633h {

        /* renamed from: b */
        final /* synthetic */ C11649a f30207b;

        C11636c(C11649a aVar) {
            this.f30207b = aVar;
            super(null);
        }

        /* renamed from: a */
        public void mo34303a(String str, Integration<?> integration, C11666k kVar) {
            if (C11633h.m30500a(this.f30207b.mo34332b(), str)) {
                integration.mo34321a(this.f30207b);
            }
        }

        public String toString() {
            return this.f30207b.toString();
        }
    }

    /* renamed from: com.segment.analytics.h$d */
    static class C11637d extends C11633h {
        C11637d() {
            super(null);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo34303a(String str, Integration<?> integration, C11666k kVar) {
            integration.mo34319a();
        }

        public String toString() {
            return "Flush";
        }
    }

    /* renamed from: com.segment.analytics.h$e */
    static class C11638e extends C11633h {
        C11638e() {
            super(null);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo34303a(String str, Integration<?> integration, C11666k kVar) {
            integration.mo34324b();
        }

        public String toString() {
            return "Reset";
        }
    }

    /* renamed from: com.segment.analytics.h$f */
    static class C11639f extends C11633h {

        /* renamed from: b */
        final /* synthetic */ Activity f30208b;

        /* renamed from: c */
        final /* synthetic */ Bundle f30209c;

        C11639f(Activity activity, Bundle bundle) {
            this.f30208b = activity;
            this.f30209c = bundle;
            super(null);
        }

        /* renamed from: a */
        public void mo34303a(String str, Integration<?> integration, C11666k kVar) {
            integration.mo34273a(this.f30208b, this.f30209c);
        }

        public String toString() {
            return "Activity Created";
        }
    }

    /* renamed from: com.segment.analytics.h$g */
    static class C11640g extends C11633h {

        /* renamed from: b */
        final /* synthetic */ Activity f30210b;

        C11640g(Activity activity) {
            this.f30210b = activity;
            super(null);
        }

        /* renamed from: a */
        public void mo34303a(String str, Integration<?> integration, C11666k kVar) {
            integration.mo34328d(this.f30210b);
        }

        public String toString() {
            return "Activity Started";
        }
    }

    /* renamed from: com.segment.analytics.h$h */
    static class C11641h extends C11633h {

        /* renamed from: b */
        final /* synthetic */ Activity f30211b;

        C11641h(Activity activity) {
            this.f30211b = activity;
            super(null);
        }

        /* renamed from: a */
        public void mo34303a(String str, Integration<?> integration, C11666k kVar) {
            integration.mo34327c(this.f30211b);
        }

        public String toString() {
            return "Activity Resumed";
        }
    }

    /* renamed from: com.segment.analytics.h$i */
    static class C11642i extends C11633h {

        /* renamed from: b */
        final /* synthetic */ Activity f30212b;

        C11642i(Activity activity) {
            this.f30212b = activity;
            super(null);
        }

        /* renamed from: a */
        public void mo34303a(String str, Integration<?> integration, C11666k kVar) {
            integration.mo34325b(this.f30212b);
        }

        public String toString() {
            return "Activity Paused";
        }
    }

    /* renamed from: com.segment.analytics.h$j */
    static class C11643j extends C11633h {

        /* renamed from: b */
        final /* synthetic */ Activity f30213b;

        C11643j(Activity activity) {
            this.f30213b = activity;
            super(null);
        }

        /* renamed from: a */
        public void mo34303a(String str, Integration<?> integration, C11666k kVar) {
            integration.mo34329e(this.f30213b);
        }

        public String toString() {
            return "Activity Stopped";
        }
    }

    /* renamed from: com.segment.analytics.h$k */
    static class C11644k extends C11633h {

        /* renamed from: b */
        final /* synthetic */ Activity f30214b;

        /* renamed from: c */
        final /* synthetic */ Bundle f30215c;

        C11644k(Activity activity, Bundle bundle) {
            this.f30214b = activity;
            this.f30215c = bundle;
            super(null);
        }

        /* renamed from: a */
        public void mo34303a(String str, Integration<?> integration, C11666k kVar) {
            integration.mo34326b(this.f30214b, this.f30215c);
        }

        public String toString() {
            return "Activity Save Instance";
        }
    }

    /* renamed from: com.segment.analytics.h$l */
    static class C11645l extends C11633h {

        /* renamed from: b */
        final /* synthetic */ Activity f30216b;

        C11645l(Activity activity) {
            this.f30216b = activity;
            super(null);
        }

        /* renamed from: a */
        public void mo34303a(String str, Integration<?> integration, C11666k kVar) {
            integration.mo34320a(this.f30216b);
        }

        public String toString() {
            return "Activity Destroyed";
        }
    }

    /* renamed from: com.segment.analytics.h$m */
    static class C11646m extends C11633h {

        /* renamed from: b */
        final /* synthetic */ C11655d f30217b;

        C11646m(C11655d dVar) {
            this.f30217b = dVar;
            super(null);
        }

        /* renamed from: a */
        public void mo34303a(String str, Integration<?> integration, C11666k kVar) {
            if (C11633h.m30500a(this.f30217b.mo34332b(), str)) {
                integration.mo34274a(this.f30217b);
            }
        }

        public String toString() {
            return this.f30217b.toString();
        }
    }

    /* renamed from: com.segment.analytics.h$n */
    static class C11647n extends C11633h {

        /* renamed from: b */
        final /* synthetic */ C11654c f30218b;

        C11647n(C11654c cVar) {
            this.f30218b = cVar;
            super(null);
        }

        /* renamed from: a */
        public void mo34303a(String str, Integration<?> integration, C11666k kVar) {
            if (C11633h.m30500a(this.f30218b.mo34332b(), str)) {
                integration.mo34322a(this.f30218b);
            }
        }

        public String toString() {
            return this.f30218b.toString();
        }
    }

    static {
        new C11637d();
    }

    /* synthetic */ C11633h(C11639f fVar) {
        this();
    }

    /* renamed from: a */
    static boolean m30500a(C11685r rVar, String str) {
        boolean z = true;
        if (C11692b.m30718b((Map) rVar) || "Segment.io".equals(str)) {
            return true;
        }
        if (rVar.containsKey(str)) {
            z = rVar.mo34421a(str, true);
        } else {
            String str2 = "All";
            if (rVar.containsKey(str2)) {
                z = rVar.mo34421a(str2, true);
            }
        }
        return z;
    }

    /* renamed from: b */
    static C11633h m30501b(Activity activity) {
        return new C11642i(activity);
    }

    /* renamed from: c */
    static C11633h m30503c(Activity activity) {
        return new C11641h(activity);
    }

    /* renamed from: d */
    static C11633h m30504d(Activity activity) {
        return new C11640g(activity);
    }

    /* renamed from: e */
    static C11633h m30505e(Activity activity) {
        return new C11643j(activity);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract void mo34303a(String str, Integration<?> integration, C11666k kVar);

    private C11633h() {
    }

    /* renamed from: b */
    static C11633h m30502b(Activity activity, Bundle bundle) {
        return new C11644k(activity, bundle);
    }

    /* renamed from: a */
    static C11633h m30494a(Activity activity, Bundle bundle) {
        return new C11639f(activity, bundle);
    }

    /* renamed from: a */
    static C11633h m30493a(Activity activity) {
        return new C11645l(activity);
    }

    /* renamed from: a */
    static C11633h m30497a(C11655d dVar) {
        return new C11646m(dVar);
    }

    /* renamed from: a */
    static C11633h m30496a(C11654c cVar) {
        return new C11647n(cVar);
    }

    /* renamed from: a */
    static C11633h m30499a(C11660g gVar) {
        return new C11634a(gVar);
    }

    /* renamed from: a */
    static C11633h m30498a(C11658f fVar) {
        return new C11635b(fVar);
    }

    /* renamed from: a */
    static C11633h m30495a(C11649a aVar) {
        return new C11636c(aVar);
    }
}

package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.C8882a;
import com.bumptech.glide.load.C8884c;

/* renamed from: com.bumptech.glide.load.engine.i */
public abstract class C8978i {

    /* renamed from: a */
    public static final C8978i f23423a = new C8979a();

    /* renamed from: b */
    public static final C8978i f23424b = new C8980b();

    /* renamed from: c */
    public static final C8978i f23425c = new C8981c();

    /* renamed from: d */
    public static final C8978i f23426d = new C8982d();

    /* renamed from: e */
    public static final C8978i f23427e = new C8983e();

    /* renamed from: com.bumptech.glide.load.engine.i$a */
    class C8979a extends C8978i {
        C8979a() {
        }

        /* renamed from: a */
        public boolean mo24463a() {
            return true;
        }

        /* renamed from: a */
        public boolean mo24464a(C8882a aVar) {
            return aVar == C8882a.REMOTE;
        }

        /* renamed from: b */
        public boolean mo24466b() {
            return true;
        }

        /* renamed from: a */
        public boolean mo24465a(boolean z, C8882a aVar, C8884c cVar) {
            return (aVar == C8882a.RESOURCE_DISK_CACHE || aVar == C8882a.MEMORY_CACHE) ? false : true;
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.i$b */
    class C8980b extends C8978i {
        C8980b() {
        }

        /* renamed from: a */
        public boolean mo24463a() {
            return false;
        }

        /* renamed from: a */
        public boolean mo24464a(C8882a aVar) {
            return false;
        }

        /* renamed from: a */
        public boolean mo24465a(boolean z, C8882a aVar, C8884c cVar) {
            return false;
        }

        /* renamed from: b */
        public boolean mo24466b() {
            return false;
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.i$c */
    class C8981c extends C8978i {
        C8981c() {
        }

        /* renamed from: a */
        public boolean mo24463a() {
            return true;
        }

        /* renamed from: a */
        public boolean mo24464a(C8882a aVar) {
            return (aVar == C8882a.DATA_DISK_CACHE || aVar == C8882a.MEMORY_CACHE) ? false : true;
        }

        /* renamed from: a */
        public boolean mo24465a(boolean z, C8882a aVar, C8884c cVar) {
            return false;
        }

        /* renamed from: b */
        public boolean mo24466b() {
            return false;
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.i$d */
    class C8982d extends C8978i {
        C8982d() {
        }

        /* renamed from: a */
        public boolean mo24463a() {
            return false;
        }

        /* renamed from: a */
        public boolean mo24464a(C8882a aVar) {
            return false;
        }

        /* renamed from: a */
        public boolean mo24465a(boolean z, C8882a aVar, C8884c cVar) {
            return (aVar == C8882a.RESOURCE_DISK_CACHE || aVar == C8882a.MEMORY_CACHE) ? false : true;
        }

        /* renamed from: b */
        public boolean mo24466b() {
            return true;
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.i$e */
    class C8983e extends C8978i {
        C8983e() {
        }

        /* renamed from: a */
        public boolean mo24463a() {
            return true;
        }

        /* renamed from: a */
        public boolean mo24464a(C8882a aVar) {
            return aVar == C8882a.REMOTE;
        }

        /* renamed from: b */
        public boolean mo24466b() {
            return true;
        }

        /* renamed from: a */
        public boolean mo24465a(boolean z, C8882a aVar, C8884c cVar) {
            return ((z && aVar == C8882a.DATA_DISK_CACHE) || aVar == C8882a.LOCAL) && cVar == C8884c.TRANSFORMED;
        }
    }

    /* renamed from: a */
    public abstract boolean mo24463a();

    /* renamed from: a */
    public abstract boolean mo24464a(C8882a aVar);

    /* renamed from: a */
    public abstract boolean mo24465a(boolean z, C8882a aVar, C8884c cVar);

    /* renamed from: b */
    public abstract boolean mo24466b();
}

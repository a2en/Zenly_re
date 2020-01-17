package com.facebook.imagepipeline.memory;

import com.facebook.common.internal.C9536j;
import com.facebook.common.memory.ByteArrayPool;
import com.facebook.common.memory.C9550f;
import com.facebook.common.memory.PooledByteBufferFactory;

/* renamed from: com.facebook.imagepipeline.memory.b0 */
public class C9743b0 {

    /* renamed from: a */
    private final C9739a0 f25628a;

    /* renamed from: b */
    private BitmapPool f25629b;

    /* renamed from: c */
    private C9752h f25630c;

    /* renamed from: d */
    private C9759o f25631d;

    /* renamed from: e */
    private C9769w f25632e;

    /* renamed from: f */
    private PooledByteBufferFactory f25633f;

    /* renamed from: g */
    private C9550f f25634g;

    /* renamed from: h */
    private ByteArrayPool f25635h;

    public C9743b0(C9739a0 a0Var) {
        C9536j.m23271a(a0Var);
        this.f25628a = a0Var;
    }

    /* renamed from: a */
    public BitmapPool mo26512a() {
        if (this.f25629b == null) {
            String e = this.f25628a.mo26502e();
            char c = 65535;
            switch (e.hashCode()) {
                case -1868884870:
                    if (e.equals("legacy_default_params")) {
                        c = 3;
                        break;
                    }
                    break;
                case -1106578487:
                    if (e.equals("legacy")) {
                        c = 4;
                        break;
                    }
                    break;
                case -404562712:
                    if (e.equals("experimental")) {
                        c = 2;
                        break;
                    }
                    break;
                case -402149703:
                    if (e.equals("dummy_with_tracking")) {
                        c = 1;
                        break;
                    }
                    break;
                case 95945896:
                    if (e.equals("dummy")) {
                        c = 0;
                        break;
                    }
                    break;
            }
            if (c == 0) {
                this.f25629b = new C9757m();
            } else if (c == 1) {
                this.f25629b = new C9758n();
            } else if (c == 2) {
                this.f25629b = new C9763q(this.f25628a.mo26499b(), this.f25628a.mo26498a(), C9770x.m24258a(), this.f25628a.mo26509l() ? this.f25628a.mo26506i() : null);
            } else if (c != 3) {
                this.f25629b = new C9750f(this.f25628a.mo26506i(), this.f25628a.mo26500c(), this.f25628a.mo26501d());
            } else {
                this.f25629b = new C9750f(this.f25628a.mo26506i(), C9753i.m24214a(), this.f25628a.mo26501d());
            }
        }
        return this.f25629b;
    }

    /* renamed from: b */
    public C9752h mo26513b() {
        if (this.f25630c == null) {
            this.f25630c = new C9752h(this.f25628a.mo26506i(), this.f25628a.mo26504g(), this.f25628a.mo26505h());
        }
        return this.f25630c;
    }

    /* renamed from: c */
    public C9759o mo26514c() {
        if (this.f25631d == null) {
            this.f25631d = new C9759o(this.f25628a.mo26506i(), this.f25628a.mo26503f());
        }
        return this.f25631d;
    }

    /* renamed from: d */
    public int mo26515d() {
        return this.f25628a.mo26503f().f25640e;
    }

    /* renamed from: e */
    public C9769w mo26516e() {
        if (this.f25632e == null) {
            this.f25632e = new C9769w(this.f25628a.mo26506i(), this.f25628a.mo26504g(), this.f25628a.mo26505h());
        }
        return this.f25632e;
    }

    /* renamed from: f */
    public PooledByteBufferFactory mo26517f() {
        return mo26511a(0);
    }

    /* renamed from: g */
    public C9550f mo26518g() {
        if (this.f25634g == null) {
            this.f25634g = new C9550f(mo26519h());
        }
        return this.f25634g;
    }

    /* renamed from: h */
    public ByteArrayPool mo26519h() {
        if (this.f25635h == null) {
            this.f25635h = new C9762p(this.f25628a.mo26506i(), this.f25628a.mo26507j(), this.f25628a.mo26508k());
        }
        return this.f25635h;
    }

    /* renamed from: b */
    private C9765s m24169b(int i) {
        if (i == 0) {
            return mo26516e();
        }
        if (i == 1) {
            return mo26513b();
        }
        throw new IllegalArgumentException("Invalid MemoryChunkType");
    }

    /* renamed from: a */
    public PooledByteBufferFactory mo26511a(int i) {
        if (this.f25633f == null) {
            this.f25633f = new C9768v(m24169b(i), mo26518g());
        }
        return this.f25633f;
    }
}

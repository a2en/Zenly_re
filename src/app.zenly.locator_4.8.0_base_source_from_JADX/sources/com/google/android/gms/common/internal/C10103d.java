package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.view.View;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.signin.C10677a;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import p214e.p228e.C7573b;

/* renamed from: com.google.android.gms.common.internal.d */
public final class C10103d {

    /* renamed from: a */
    private final Account f26585a;

    /* renamed from: b */
    private final Set<Scope> f26586b;

    /* renamed from: c */
    private final Set<Scope> f26587c;

    /* renamed from: d */
    private final Map<Api<?>, C10105b> f26588d;

    /* renamed from: e */
    private final String f26589e;

    /* renamed from: f */
    private final String f26590f;

    /* renamed from: g */
    private final C10677a f26591g;

    /* renamed from: h */
    private Integer f26592h;

    /* renamed from: com.google.android.gms.common.internal.d$a */
    public static final class C10104a {

        /* renamed from: a */
        private Account f26593a;

        /* renamed from: b */
        private C7573b<Scope> f26594b;

        /* renamed from: c */
        private Map<Api<?>, C10105b> f26595c;

        /* renamed from: d */
        private int f26596d = 0;

        /* renamed from: e */
        private View f26597e;

        /* renamed from: f */
        private String f26598f;

        /* renamed from: g */
        private String f26599g;

        /* renamed from: h */
        private C10677a f26600h = C10677a.f27755n;

        /* renamed from: i */
        private boolean f26601i;

        /* renamed from: a */
        public final C10104a mo27455a(Account account) {
            this.f26593a = account;
            return this;
        }

        /* renamed from: b */
        public final C10104a mo27459b(String str) {
            this.f26598f = str;
            return this;
        }

        /* renamed from: a */
        public final C10104a mo27457a(Collection<Scope> collection) {
            if (this.f26594b == null) {
                this.f26594b = new C7573b<>();
            }
            this.f26594b.addAll(collection);
            return this;
        }

        /* renamed from: a */
        public final C10104a mo27456a(String str) {
            this.f26599g = str;
            return this;
        }

        /* renamed from: a */
        public final C10103d mo27458a() {
            C10103d dVar = new C10103d(this.f26593a, this.f26594b, this.f26595c, this.f26596d, this.f26597e, this.f26598f, this.f26599g, this.f26600h, this.f26601i);
            return dVar;
        }
    }

    /* renamed from: com.google.android.gms.common.internal.d$b */
    public static final class C10105b {

        /* renamed from: a */
        public final Set<Scope> f26602a;
    }

    public C10103d(Account account, Set<Scope> set, Map<Api<?>, C10105b> map, int i, View view, String str, String str2, C10677a aVar, boolean z) {
        this.f26585a = account;
        this.f26586b = set == null ? Collections.emptySet() : Collections.unmodifiableSet(set);
        if (map == null) {
            map = Collections.emptyMap();
        }
        this.f26588d = map;
        this.f26589e = str;
        this.f26590f = str2;
        this.f26591g = aVar;
        HashSet hashSet = new HashSet(this.f26586b);
        for (C10105b bVar : this.f26588d.values()) {
            hashSet.addAll(bVar.f26602a);
        }
        this.f26587c = Collections.unmodifiableSet(hashSet);
    }

    /* renamed from: a */
    public final Account mo27446a() {
        return this.f26585a;
    }

    /* renamed from: b */
    public final Account mo27448b() {
        Account account = this.f26585a;
        if (account != null) {
            return account;
        }
        return new Account("<<default account>>", "com.google");
    }

    /* renamed from: c */
    public final Set<Scope> mo27449c() {
        return this.f26587c;
    }

    /* renamed from: d */
    public final Integer mo27450d() {
        return this.f26592h;
    }

    /* renamed from: e */
    public final String mo27451e() {
        return this.f26590f;
    }

    /* renamed from: f */
    public final String mo27452f() {
        return this.f26589e;
    }

    /* renamed from: g */
    public final Set<Scope> mo27453g() {
        return this.f26586b;
    }

    /* renamed from: h */
    public final C10677a mo27454h() {
        return this.f26591g;
    }

    /* renamed from: a */
    public final void mo27447a(Integer num) {
        this.f26592h = num;
    }
}

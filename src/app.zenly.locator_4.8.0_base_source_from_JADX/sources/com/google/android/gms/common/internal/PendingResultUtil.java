package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.C9999d;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.C10693c;
import com.google.android.gms.tasks.C10694d;

public class PendingResultUtil {

    /* renamed from: a */
    private static final zaa f26571a = new C10138v();

    public interface ResultConverter<R extends Result, T> {
        T convert(R r);
    }

    public interface zaa {
        ApiException zaf(Status status);
    }

    /* renamed from: a */
    public static <R extends Result, T> C10693c<T> m25416a(PendingResult<R> pendingResult, ResultConverter<R, T> resultConverter) {
        zaa zaa2 = f26571a;
        C10694d dVar = new C10694d();
        pendingResult.mo27048a(new C10140x(pendingResult, dVar, resultConverter, zaa2));
        return dVar.mo29325a();
    }

    /* renamed from: a */
    public static <R extends Result, T extends C9999d<R>> C10693c<T> m25415a(PendingResult<R> pendingResult, T t) {
        return m25416a(pendingResult, (ResultConverter<R, T>) new C10139w<R,T>(t));
    }

    /* renamed from: a */
    public static <R extends Result> C10693c<Void> m25414a(PendingResult<R> pendingResult) {
        return m25416a(pendingResult, (ResultConverter<R, T>) new C10141y<R,T>());
    }
}

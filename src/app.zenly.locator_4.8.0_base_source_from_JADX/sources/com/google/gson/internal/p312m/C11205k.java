package com.google.gson.internal.p312m;

import com.google.gson.C11125d;
import com.google.gson.C11138i;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.p316k.C11261a;
import com.google.gson.stream.C11262a;
import com.google.gson.stream.C11264b;
import com.google.gson.stream.C11265c;
import java.io.IOException;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/* renamed from: com.google.gson.internal.m.k */
public final class C11205k extends C11138i<Time> {

    /* renamed from: b */
    public static final TypeAdapterFactory f28965b = new C11206a();

    /* renamed from: a */
    private final DateFormat f28966a = new SimpleDateFormat("hh:mm:ss a");

    /* renamed from: com.google.gson.internal.m.k$a */
    static class C11206a implements TypeAdapterFactory {
        C11206a() {
        }

        public <T> C11138i<T> create(C11125d dVar, C11261a<T> aVar) {
            if (aVar.getRawType() == Time.class) {
                return new C11205k();
            }
            return null;
        }
    }

    /* renamed from: a */
    public synchronized void write(C11265c cVar, Time time) throws IOException {
        cVar.mo32603d(time == null ? null : this.f28966a.format(time));
    }

    public synchronized Time read(C11262a aVar) throws IOException {
        if (aVar.peek() == C11264b.NULL) {
            aVar.mo32585o();
            return null;
        }
        try {
            return new Time(this.f28966a.parse(aVar.mo32586p()).getTime());
        } catch (ParseException e) {
            throw new JsonSyntaxException((Throwable) e);
        }
    }
}

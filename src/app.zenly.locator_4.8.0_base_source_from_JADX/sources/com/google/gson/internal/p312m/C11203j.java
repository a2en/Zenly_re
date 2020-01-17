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
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/* renamed from: com.google.gson.internal.m.j */
public final class C11203j extends C11138i<Date> {

    /* renamed from: b */
    public static final TypeAdapterFactory f28963b = new C11204a();

    /* renamed from: a */
    private final DateFormat f28964a = new SimpleDateFormat("MMM d, yyyy");

    /* renamed from: com.google.gson.internal.m.j$a */
    static class C11204a implements TypeAdapterFactory {
        C11204a() {
        }

        public <T> C11138i<T> create(C11125d dVar, C11261a<T> aVar) {
            if (aVar.getRawType() == Date.class) {
                return new C11203j();
            }
            return null;
        }
    }

    /* renamed from: a */
    public synchronized void write(C11265c cVar, Date date) throws IOException {
        cVar.mo32603d(date == null ? null : this.f28964a.format(date));
    }

    public synchronized Date read(C11262a aVar) throws IOException {
        if (aVar.peek() == C11264b.NULL) {
            aVar.mo32585o();
            return null;
        }
        try {
            return new Date(this.f28964a.parse(aVar.mo32586p()).getTime());
        } catch (ParseException e) {
            throw new JsonSyntaxException((Throwable) e);
        }
    }
}

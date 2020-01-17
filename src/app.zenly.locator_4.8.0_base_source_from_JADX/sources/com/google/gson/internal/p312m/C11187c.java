package com.google.gson.internal.p312m;

import com.google.gson.C11125d;
import com.google.gson.C11138i;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.internal.C11162e;
import com.google.gson.internal.C11173i;
import com.google.gson.internal.p312m.p313o.C11252a;
import com.google.gson.p316k.C11261a;
import com.google.gson.stream.C11262a;
import com.google.gson.stream.C11264b;
import com.google.gson.stream.C11265c;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* renamed from: com.google.gson.internal.m.c */
public final class C11187c extends C11138i<Date> {

    /* renamed from: b */
    public static final TypeAdapterFactory f28924b = new C11188a();

    /* renamed from: a */
    private final List<DateFormat> f28925a = new ArrayList();

    /* renamed from: com.google.gson.internal.m.c$a */
    static class C11188a implements TypeAdapterFactory {
        C11188a() {
        }

        public <T> C11138i<T> create(C11125d dVar, C11261a<T> aVar) {
            if (aVar.getRawType() == Date.class) {
                return new C11187c();
            }
            return null;
        }
    }

    public C11187c() {
        this.f28925a.add(DateFormat.getDateTimeInstance(2, 2, Locale.US));
        if (!Locale.getDefault().equals(Locale.US)) {
            this.f28925a.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (C11162e.m28721c()) {
            this.f28925a.add(C11173i.m28738a(2, 2));
        }
    }

    /* renamed from: a */
    private synchronized Date m28754a(String str) {
        for (DateFormat parse : this.f28925a) {
            try {
                return parse.parse(str);
            } catch (ParseException unused) {
            }
        }
        try {
            return C11252a.m28847a(str, new ParsePosition(0));
        } catch (ParseException e) {
            throw new JsonSyntaxException(str, e);
        }
    }

    public Date read(C11262a aVar) throws IOException {
        if (aVar.peek() != C11264b.NULL) {
            return m28754a(aVar.mo32586p());
        }
        aVar.mo32585o();
        return null;
    }

    /* renamed from: a */
    public synchronized void write(C11265c cVar, Date date) throws IOException {
        if (date == null) {
            cVar.mo32606h();
        } else {
            cVar.mo32603d(((DateFormat) this.f28925a.get(0)).format(date));
        }
    }
}

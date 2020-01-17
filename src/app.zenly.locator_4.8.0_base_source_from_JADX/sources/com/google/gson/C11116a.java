package com.google.gson;

import com.google.gson.internal.C11162e;
import com.google.gson.internal.C11173i;
import com.google.gson.internal.p312m.p313o.C11252a;
import com.google.gson.stream.C11262a;
import com.google.gson.stream.C11264b;
import com.google.gson.stream.C11265c;
import java.io.IOException;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* renamed from: com.google.gson.a */
final class C11116a extends C11138i<Date> {

    /* renamed from: a */
    private final Class<? extends Date> f28809a;

    /* renamed from: b */
    private final List<DateFormat> f28810b = new ArrayList();

    C11116a(Class<? extends Date> cls, String str) {
        m28626a(cls);
        this.f28809a = cls;
        this.f28810b.add(new SimpleDateFormat(str, Locale.US));
        if (!Locale.getDefault().equals(Locale.US)) {
            this.f28810b.add(new SimpleDateFormat(str));
        }
    }

    /* renamed from: a */
    private static Class<? extends Date> m28626a(Class<? extends Date> cls) {
        if (cls == Date.class || cls == java.sql.Date.class || cls == Timestamp.class) {
            return cls;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Date type must be one of ");
        sb.append(Date.class);
        sb.append(", ");
        sb.append(Timestamp.class);
        sb.append(", or ");
        sb.append(java.sql.Date.class);
        sb.append(" but was ");
        sb.append(cls);
        throw new IllegalArgumentException(sb.toString());
    }

    public String toString() {
        DateFormat dateFormat = (DateFormat) this.f28810b.get(0);
        String str = "DefaultDateTypeAdapter(";
        if (dateFormat instanceof SimpleDateFormat) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(((SimpleDateFormat) dateFormat).toPattern());
            sb.append(')');
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(dateFormat.getClass().getSimpleName());
        sb2.append(')');
        return sb2.toString();
    }

    public Date read(C11262a aVar) throws IOException {
        if (aVar.peek() == C11264b.NULL) {
            aVar.mo32585o();
            return null;
        }
        Date a = m28627a(aVar.mo32586p());
        Class<? extends Date> cls = this.f28809a;
        if (cls == Date.class) {
            return a;
        }
        if (cls == Timestamp.class) {
            return new Timestamp(a.getTime());
        }
        if (cls == java.sql.Date.class) {
            return new java.sql.Date(a.getTime());
        }
        throw new AssertionError();
    }

    /* renamed from: a */
    public void write(C11265c cVar, Date date) throws IOException {
        if (date == null) {
            cVar.mo32606h();
            return;
        }
        synchronized (this.f28810b) {
            cVar.mo32603d(((DateFormat) this.f28810b.get(0)).format(date));
        }
    }

    public C11116a(Class<? extends Date> cls, int i, int i2) {
        m28626a(cls);
        this.f28809a = cls;
        this.f28810b.add(DateFormat.getDateTimeInstance(i, i2, Locale.US));
        if (!Locale.getDefault().equals(Locale.US)) {
            this.f28810b.add(DateFormat.getDateTimeInstance(i, i2));
        }
        if (C11162e.m28721c()) {
            this.f28810b.add(C11173i.m28738a(i, i2));
        }
    }

    /* renamed from: a */
    private Date m28627a(String str) {
        synchronized (this.f28810b) {
            for (DateFormat parse : this.f28810b) {
                try {
                    Date parse2 = parse.parse(str);
                    return parse2;
                } catch (ParseException unused) {
                }
            }
            try {
                Date a = C11252a.m28847a(str, new ParsePosition(0));
                return a;
            } catch (ParseException e) {
                throw new JsonSyntaxException(str, e);
            }
        }
    }
}

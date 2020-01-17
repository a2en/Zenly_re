package com.segment.analytics;

import android.util.JsonReader;
import android.util.JsonToken;
import android.util.JsonWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.segment.analytics.c */
public class C11621c {

    /* renamed from: c */
    static final C11621c f30189c;

    /* renamed from: a */
    private final boolean f30190a;

    /* renamed from: b */
    private final boolean f30191b;

    /* renamed from: com.segment.analytics.c$a */
    static /* synthetic */ class C11622a {

        /* renamed from: a */
        static final /* synthetic */ int[] f30192a = new int[JsonToken.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|(3:11|12|14)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0040 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        static {
            /*
                android.util.JsonToken[] r0 = android.util.JsonToken.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f30192a = r0
                int[] r0 = f30192a     // Catch:{ NoSuchFieldError -> 0x0014 }
                android.util.JsonToken r1 = android.util.JsonToken.BEGIN_OBJECT     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f30192a     // Catch:{ NoSuchFieldError -> 0x001f }
                android.util.JsonToken r1 = android.util.JsonToken.BEGIN_ARRAY     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f30192a     // Catch:{ NoSuchFieldError -> 0x002a }
                android.util.JsonToken r1 = android.util.JsonToken.BOOLEAN     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f30192a     // Catch:{ NoSuchFieldError -> 0x0035 }
                android.util.JsonToken r1 = android.util.JsonToken.NULL     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = f30192a     // Catch:{ NoSuchFieldError -> 0x0040 }
                android.util.JsonToken r1 = android.util.JsonToken.NUMBER     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                int[] r0 = f30192a     // Catch:{ NoSuchFieldError -> 0x004b }
                android.util.JsonToken r1 = android.util.JsonToken.STRING     // Catch:{ NoSuchFieldError -> 0x004b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004b }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004b }
            L_0x004b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.segment.analytics.C11621c.C11622a.<clinit>():void");
        }
    }

    /* renamed from: com.segment.analytics.c$b */
    public static class C11623b {

        /* renamed from: a */
        private boolean f30193a;

        /* renamed from: b */
        private boolean f30194b;

        /* renamed from: a */
        public C11623b mo34286a(boolean z) {
            this.f30193a = z;
            return this;
        }

        /* renamed from: b */
        public C11623b mo34288b(boolean z) {
            this.f30194b = z;
            return this;
        }

        /* renamed from: a */
        public C11621c mo34287a() {
            return new C11621c(this.f30193a, this.f30194b);
        }
    }

    static {
        C11623b bVar = new C11623b();
        bVar.mo34286a(true);
        bVar.mo34288b(false);
        f30189c = bVar.mo34287a();
    }

    C11621c(boolean z, boolean z2) {
        this.f30190a = z;
        this.f30191b = z2;
    }

    /* renamed from: b */
    private static List<Object> m30464b(JsonReader jsonReader) throws IOException {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(m30460a(jsonReader));
        }
        jsonReader.endArray();
        return arrayList;
    }

    /* renamed from: c */
    private static Map<String, Object> m30466c(JsonReader jsonReader) throws IOException {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            linkedHashMap.put(jsonReader.nextName(), m30460a(jsonReader));
        }
        jsonReader.endObject();
        return linkedHashMap;
    }

    /* renamed from: a */
    public Map<String, Object> mo34284a(String str) throws IOException {
        if (str == null) {
            throw new IllegalArgumentException("json == null");
        } else if (str.length() != 0) {
            return mo34283a((Reader) new StringReader(str));
        } else {
            throw new IllegalArgumentException("json empty");
        }
    }

    /* renamed from: a */
    public Map<String, Object> mo34283a(Reader reader) throws IOException {
        if (reader != null) {
            JsonReader jsonReader = new JsonReader(reader);
            jsonReader.setLenient(this.f30190a);
            try {
                return m30466c(jsonReader);
            } finally {
                reader.close();
            }
        } else {
            throw new IllegalArgumentException("reader == null");
        }
    }

    /* renamed from: b */
    private static void m30465b(Object obj, JsonWriter jsonWriter) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
        } else if (obj instanceof Number) {
            jsonWriter.value((Number) obj);
        } else if (obj instanceof Boolean) {
            jsonWriter.value(((Boolean) obj).booleanValue());
        } else if (obj instanceof List) {
            m30462a((List) obj, jsonWriter);
        } else if (obj instanceof Map) {
            m30463a((Map) obj, jsonWriter);
        } else if (obj.getClass().isArray()) {
            m30461a(obj, jsonWriter);
        } else {
            jsonWriter.value(String.valueOf(obj));
        }
    }

    /* renamed from: a */
    public String mo34282a(Map<?, ?> map) {
        StringWriter stringWriter = new StringWriter();
        try {
            mo34285a(map, (Writer) stringWriter);
            return stringWriter.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: a */
    public void mo34285a(Map<?, ?> map, Writer writer) throws IOException {
        if (map == null) {
            throw new IllegalArgumentException("map == null");
        } else if (writer != null) {
            JsonWriter jsonWriter = new JsonWriter(writer);
            jsonWriter.setLenient(this.f30190a);
            if (this.f30191b) {
                jsonWriter.setIndent("  ");
            }
            try {
                m30463a(map, jsonWriter);
            } finally {
                jsonWriter.close();
            }
        } else {
            throw new IllegalArgumentException("writer == null");
        }
    }

    /* renamed from: a */
    private static Object m30460a(JsonReader jsonReader) throws IOException {
        JsonToken peek = jsonReader.peek();
        switch (C11622a.f30192a[peek.ordinal()]) {
            case 1:
                return m30466c(jsonReader);
            case 2:
                return m30464b(jsonReader);
            case 3:
                return Boolean.valueOf(jsonReader.nextBoolean());
            case 4:
                jsonReader.nextNull();
                return null;
            case 5:
                return Double.valueOf(jsonReader.nextDouble());
            case 6:
                return jsonReader.nextString();
            default:
                StringBuilder sb = new StringBuilder();
                sb.append("Invalid token ");
                sb.append(peek);
                throw new IllegalStateException(sb.toString());
        }
    }

    /* renamed from: a */
    private static void m30463a(Map<?, ?> map, JsonWriter jsonWriter) throws IOException {
        jsonWriter.beginObject();
        for (Entry entry : map.entrySet()) {
            jsonWriter.name(String.valueOf(entry.getKey()));
            m30465b(entry.getValue(), jsonWriter);
        }
        jsonWriter.endObject();
    }

    /* renamed from: a */
    private static void m30462a(List<?> list, JsonWriter jsonWriter) throws IOException {
        jsonWriter.beginArray();
        for (Object b : list) {
            m30465b(b, jsonWriter);
        }
        jsonWriter.endArray();
    }

    /* renamed from: a */
    private static void m30461a(Object obj, JsonWriter jsonWriter) throws IOException {
        jsonWriter.beginArray();
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            m30465b(Array.get(obj, i), jsonWriter);
        }
        jsonWriter.endArray();
    }
}

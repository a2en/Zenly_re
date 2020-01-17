package retrofit2;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Map;
import java.util.Map.Entry;
import okhttp3.C13317r;
import okhttp3.C13322u.C13324b;
import okhttp3.C13333z;

/* renamed from: retrofit2.e */
abstract class C13409e<T> {

    /* renamed from: retrofit2.e$a */
    class C13410a extends C13409e<Iterable<T>> {
        C13410a() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo38642a(C13427g gVar, Iterable<T> iterable) throws IOException {
            if (iterable != null) {
                for (T a : iterable) {
                    C13409e.this.mo38642a(gVar, a);
                }
            }
        }
    }

    /* renamed from: retrofit2.e$b */
    class C13411b extends C13409e<Object> {
        C13411b() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo38642a(C13427g gVar, Object obj) throws IOException {
            if (obj != null) {
                int length = Array.getLength(obj);
                for (int i = 0; i < length; i++) {
                    C13409e.this.mo38642a(gVar, Array.get(obj, i));
                }
            }
        }
    }

    /* renamed from: retrofit2.e$c */
    static final class C13412c<T> extends C13409e<T> {

        /* renamed from: a */
        private final Converter<T, C13333z> f34787a;

        C13412c(Converter<T, C13333z> converter) {
            this.f34787a = converter;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo38642a(C13427g gVar, T t) {
            if (t != null) {
                try {
                    gVar.mo38659a((C13333z) this.f34787a.convert(t));
                } catch (IOException e) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unable to convert ");
                    sb.append(t);
                    sb.append(" to RequestBody");
                    throw new RuntimeException(sb.toString(), e);
                }
            } else {
                throw new IllegalArgumentException("Body parameter value must not be null.");
            }
        }
    }

    /* renamed from: retrofit2.e$d */
    static final class C13413d<T> extends C13409e<T> {

        /* renamed from: a */
        private final String f34788a;

        /* renamed from: b */
        private final Converter<T, String> f34789b;

        /* renamed from: c */
        private final boolean f34790c;

        C13413d(String str, Converter<T, String> converter, boolean z) {
            C13435k.m35594a(str, "name == null");
            this.f34788a = str;
            this.f34789b = converter;
            this.f34790c = z;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo38642a(C13427g gVar, T t) throws IOException {
            if (t != null) {
                String str = (String) this.f34789b.convert(t);
                if (str != null) {
                    gVar.mo38656a(this.f34788a, str, this.f34790c);
                }
            }
        }
    }

    /* renamed from: retrofit2.e$e */
    static final class C13414e<T> extends C13409e<Map<String, T>> {

        /* renamed from: a */
        private final Converter<T, String> f34791a;

        /* renamed from: b */
        private final boolean f34792b;

        C13414e(Converter<T, String> converter, boolean z) {
            this.f34791a = converter;
            this.f34792b = z;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo38642a(C13427g gVar, Map<String, T> map) throws IOException {
            if (map != null) {
                for (Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str != null) {
                        Object value = entry.getValue();
                        String str2 = "'.";
                        if (value != null) {
                            String str3 = (String) this.f34791a.convert(value);
                            if (str3 != null) {
                                gVar.mo38656a(str, str3, this.f34792b);
                            } else {
                                StringBuilder sb = new StringBuilder();
                                sb.append("Field map value '");
                                sb.append(value);
                                sb.append("' converted to null by ");
                                sb.append(this.f34791a.getClass().getName());
                                sb.append(" for key '");
                                sb.append(str);
                                sb.append(str2);
                                throw new IllegalArgumentException(sb.toString());
                            }
                        } else {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Field map contained null value for key '");
                            sb2.append(str);
                            sb2.append(str2);
                            throw new IllegalArgumentException(sb2.toString());
                        }
                    } else {
                        throw new IllegalArgumentException("Field map contained null key.");
                    }
                }
                return;
            }
            throw new IllegalArgumentException("Field map was null.");
        }
    }

    /* renamed from: retrofit2.e$f */
    static final class C13415f<T> extends C13409e<T> {

        /* renamed from: a */
        private final String f34793a;

        /* renamed from: b */
        private final Converter<T, String> f34794b;

        C13415f(String str, Converter<T, String> converter) {
            C13435k.m35594a(str, "name == null");
            this.f34793a = str;
            this.f34794b = converter;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo38642a(C13427g gVar, T t) throws IOException {
            if (t != null) {
                String str = (String) this.f34794b.convert(t);
                if (str != null) {
                    gVar.mo38655a(this.f34793a, str);
                }
            }
        }
    }

    /* renamed from: retrofit2.e$g */
    static final class C13416g<T> extends C13409e<T> {

        /* renamed from: a */
        private final C13317r f34795a;

        /* renamed from: b */
        private final Converter<T, C13333z> f34796b;

        C13416g(C13317r rVar, Converter<T, C13333z> converter) {
            this.f34795a = rVar;
            this.f34796b = converter;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo38642a(C13427g gVar, T t) {
            if (t != null) {
                try {
                    gVar.mo38657a(this.f34795a, (C13333z) this.f34796b.convert(t));
                } catch (IOException e) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unable to convert ");
                    sb.append(t);
                    sb.append(" to RequestBody");
                    throw new RuntimeException(sb.toString(), e);
                }
            }
        }
    }

    /* renamed from: retrofit2.e$h */
    static final class C13417h<T> extends C13409e<Map<String, T>> {

        /* renamed from: a */
        private final Converter<T, C13333z> f34797a;

        /* renamed from: b */
        private final String f34798b;

        C13417h(Converter<T, C13333z> converter, String str) {
            this.f34797a = converter;
            this.f34798b = str;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo38642a(C13427g gVar, Map<String, T> map) throws IOException {
            if (map != null) {
                for (Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str != null) {
                        Object value = entry.getValue();
                        if (value != null) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("form-data; name=\"");
                            sb.append(str);
                            sb.append("\"");
                            gVar.mo38657a(C13317r.m35096a("Content-Disposition", sb.toString(), "Content-Transfer-Encoding", this.f34798b), (C13333z) this.f34797a.convert(value));
                        } else {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Part map contained null value for key '");
                            sb2.append(str);
                            sb2.append("'.");
                            throw new IllegalArgumentException(sb2.toString());
                        }
                    } else {
                        throw new IllegalArgumentException("Part map contained null key.");
                    }
                }
                return;
            }
            throw new IllegalArgumentException("Part map was null.");
        }
    }

    /* renamed from: retrofit2.e$i */
    static final class C13418i<T> extends C13409e<T> {

        /* renamed from: a */
        private final String f34799a;

        /* renamed from: b */
        private final Converter<T, String> f34800b;

        /* renamed from: c */
        private final boolean f34801c;

        C13418i(String str, Converter<T, String> converter, boolean z) {
            C13435k.m35594a(str, "name == null");
            this.f34799a = str;
            this.f34800b = converter;
            this.f34801c = z;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo38642a(C13427g gVar, T t) throws IOException {
            if (t != null) {
                gVar.mo38660b(this.f34799a, (String) this.f34800b.convert(t), this.f34801c);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Path parameter \"");
            sb.append(this.f34799a);
            sb.append("\" value must not be null.");
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: retrofit2.e$j */
    static final class C13419j<T> extends C13409e<T> {

        /* renamed from: a */
        private final String f34802a;

        /* renamed from: b */
        private final Converter<T, String> f34803b;

        /* renamed from: c */
        private final boolean f34804c;

        C13419j(String str, Converter<T, String> converter, boolean z) {
            C13435k.m35594a(str, "name == null");
            this.f34802a = str;
            this.f34803b = converter;
            this.f34804c = z;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo38642a(C13427g gVar, T t) throws IOException {
            if (t != null) {
                String str = (String) this.f34803b.convert(t);
                if (str != null) {
                    gVar.mo38661c(this.f34802a, str, this.f34804c);
                }
            }
        }
    }

    /* renamed from: retrofit2.e$k */
    static final class C13420k<T> extends C13409e<Map<String, T>> {

        /* renamed from: a */
        private final Converter<T, String> f34805a;

        /* renamed from: b */
        private final boolean f34806b;

        C13420k(Converter<T, String> converter, boolean z) {
            this.f34805a = converter;
            this.f34806b = z;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo38642a(C13427g gVar, Map<String, T> map) throws IOException {
            if (map != null) {
                for (Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str != null) {
                        Object value = entry.getValue();
                        String str2 = "'.";
                        if (value != null) {
                            String str3 = (String) this.f34805a.convert(value);
                            if (str3 != null) {
                                gVar.mo38661c(str, str3, this.f34806b);
                            } else {
                                StringBuilder sb = new StringBuilder();
                                sb.append("Query map value '");
                                sb.append(value);
                                sb.append("' converted to null by ");
                                sb.append(this.f34805a.getClass().getName());
                                sb.append(" for key '");
                                sb.append(str);
                                sb.append(str2);
                                throw new IllegalArgumentException(sb.toString());
                            }
                        } else {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Query map contained null value for key '");
                            sb2.append(str);
                            sb2.append(str2);
                            throw new IllegalArgumentException(sb2.toString());
                        }
                    } else {
                        throw new IllegalArgumentException("Query map contained null key.");
                    }
                }
                return;
            }
            throw new IllegalArgumentException("Query map was null.");
        }
    }

    /* renamed from: retrofit2.e$l */
    static final class C13421l<T> extends C13409e<T> {

        /* renamed from: a */
        private final Converter<T, String> f34807a;

        /* renamed from: b */
        private final boolean f34808b;

        C13421l(Converter<T, String> converter, boolean z) {
            this.f34807a = converter;
            this.f34808b = z;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo38642a(C13427g gVar, T t) throws IOException {
            if (t != null) {
                gVar.mo38661c((String) this.f34807a.convert(t), null, this.f34808b);
            }
        }
    }

    /* renamed from: retrofit2.e$m */
    static final class C13422m extends C13409e<C13324b> {

        /* renamed from: a */
        static final C13422m f34809a = new C13422m();

        private C13422m() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo38642a(C13427g gVar, C13324b bVar) {
            if (bVar != null) {
                gVar.mo38658a(bVar);
            }
        }
    }

    C13409e() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C13409e<Object> mo38641a() {
        return new C13411b();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract void mo38642a(C13427g gVar, T t) throws IOException;

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final C13409e<Iterable<T>> mo38643b() {
        return new C13410a();
    }
}

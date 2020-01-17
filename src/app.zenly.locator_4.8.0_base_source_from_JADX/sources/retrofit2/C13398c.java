package retrofit2;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.concurrent.Executor;
import okhttp3.C13331y;
import retrofit2.CallAdapter.C13388a;

/* renamed from: retrofit2.c */
final class C13398c extends C13388a {

    /* renamed from: a */
    final Executor f34761a;

    /* renamed from: retrofit2.c$a */
    class C13399a implements CallAdapter<Object, Call<?>> {

        /* renamed from: a */
        final /* synthetic */ Type f34762a;

        C13399a(Type type) {
            this.f34762a = type;
        }

        public Type responseType() {
            return this.f34762a;
        }

        public Call<Object> adapt(Call<Object> call) {
            return new C13400b(C13398c.this.f34761a, call);
        }
    }

    /* renamed from: retrofit2.c$b */
    static final class C13400b<T> implements Call<T> {

        /* renamed from: e */
        final Executor f34764e;

        /* renamed from: f */
        final Call<T> f34765f;

        /* renamed from: retrofit2.c$b$a */
        class C13401a implements Callback<T> {

            /* renamed from: a */
            final /* synthetic */ Callback f34766a;

            /* renamed from: retrofit2.c$b$a$a */
            class C13402a implements Runnable {

                /* renamed from: e */
                final /* synthetic */ C13429h f34768e;

                C13402a(C13429h hVar) {
                    this.f34768e = hVar;
                }

                public void run() {
                    if (C13400b.this.f34765f.isCanceled()) {
                        C13401a aVar = C13401a.this;
                        aVar.f34766a.onFailure(C13400b.this, new IOException("Canceled"));
                        return;
                    }
                    C13401a aVar2 = C13401a.this;
                    aVar2.f34766a.onResponse(C13400b.this, this.f34768e);
                }
            }

            /* renamed from: retrofit2.c$b$a$b */
            class C13403b implements Runnable {

                /* renamed from: e */
                final /* synthetic */ Throwable f34770e;

                C13403b(Throwable th) {
                    this.f34770e = th;
                }

                public void run() {
                    C13401a aVar = C13401a.this;
                    aVar.f34766a.onFailure(C13400b.this, this.f34770e);
                }
            }

            C13401a(Callback callback) {
                this.f34766a = callback;
            }

            public void onFailure(Call<T> call, Throwable th) {
                C13400b.this.f34764e.execute(new C13403b(th));
            }

            public void onResponse(Call<T> call, C13429h<T> hVar) {
                C13400b.this.f34764e.execute(new C13402a(hVar));
            }
        }

        C13400b(Executor executor, Call<T> call) {
            this.f34764e = executor;
            this.f34765f = call;
        }

        public void cancel() {
            this.f34765f.cancel();
        }

        public void enqueue(Callback<T> callback) {
            C13435k.m35594a(callback, "callback == null");
            this.f34765f.enqueue(new C13401a(callback));
        }

        public C13429h<T> execute() throws IOException {
            return this.f34765f.execute();
        }

        public boolean isCanceled() {
            return this.f34765f.isCanceled();
        }

        public boolean isExecuted() {
            return this.f34765f.isExecuted();
        }

        public C13331y request() {
            return this.f34765f.request();
        }

        public Call<T> clone() {
            return new C13400b(this.f34764e, this.f34765f.clone());
        }
    }

    C13398c(Executor executor) {
        this.f34761a = executor;
    }

    /* renamed from: a */
    public CallAdapter<?, ?> mo38628a(Type type, Annotation[] annotationArr, C13430i iVar) {
        if (C13388a.m35479a(type) != Call.class) {
            return null;
        }
        return new C13399a(C13435k.m35605b(type));
    }
}

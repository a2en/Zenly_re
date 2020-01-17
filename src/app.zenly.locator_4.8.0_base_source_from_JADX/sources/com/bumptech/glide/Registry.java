package com.bumptech.glide;

import androidx.core.util.Pools$Pool;
import com.bumptech.glide.load.Encoder;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.ResourceEncoder;
import com.bumptech.glide.load.data.C8889d;
import com.bumptech.glide.load.data.DataRewinder;
import com.bumptech.glide.load.data.DataRewinder.Factory;
import com.bumptech.glide.load.engine.C8976h;
import com.bumptech.glide.load.engine.C9003q;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.model.C9063g;
import com.bumptech.glide.load.model.ModelLoader;
import com.bumptech.glide.load.model.ModelLoaderFactory;
import com.bumptech.glide.load.resource.transcode.C9168e;
import com.bumptech.glide.load.resource.transcode.ResourceTranscoder;
import com.bumptech.glide.p299m.C9171a;
import com.bumptech.glide.p299m.C9173b;
import com.bumptech.glide.p299m.C9174c;
import com.bumptech.glide.p299m.C9175d;
import com.bumptech.glide.p299m.C9176e;
import com.bumptech.glide.p299m.C9178f;
import com.bumptech.glide.util.pool.FactoryPools;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Registry {

    /* renamed from: a */
    private final C9063g f22995a = new C9063g(this.f23004j);

    /* renamed from: b */
    private final C9171a f22996b = new C9171a();

    /* renamed from: c */
    private final C9176e f22997c = new C9176e();

    /* renamed from: d */
    private final C9178f f22998d = new C9178f();

    /* renamed from: e */
    private final C8889d f22999e = new C8889d();

    /* renamed from: f */
    private final C9168e f23000f = new C9168e();

    /* renamed from: g */
    private final C9173b f23001g = new C9173b();

    /* renamed from: h */
    private final C9175d f23002h = new C9175d();

    /* renamed from: i */
    private final C9174c f23003i = new C9174c();

    /* renamed from: j */
    private final Pools$Pool<List<Throwable>> f23004j = FactoryPools.m22259b();

    public static class MissingComponentException extends RuntimeException {
        public MissingComponentException(String str) {
            super(str);
        }
    }

    public static final class NoImageHeaderParserException extends MissingComponentException {
        public NoImageHeaderParserException() {
            super("Failed to find image header parser.");
        }
    }

    public static class NoModelLoaderAvailableException extends MissingComponentException {
        public NoModelLoaderAvailableException(Object obj) {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to find any ModelLoaders for model: ");
            sb.append(obj);
            super(sb.toString());
        }

        public NoModelLoaderAvailableException(Class<?> cls, Class<?> cls2) {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to find any ModelLoaders for model: ");
            sb.append(cls);
            sb.append(" and data: ");
            sb.append(cls2);
            super(sb.toString());
        }
    }

    public static class NoResultEncoderAvailableException extends MissingComponentException {
        public NoResultEncoderAvailableException(Class<?> cls) {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to find result encoder for resource class: ");
            sb.append(cls);
            sb.append(", you may need to consider registering a new Encoder for the requested type or DiskCacheStrategy.DATA/DiskCacheStrategy.NONE if caching your transformed resource is unnecessary.");
            super(sb.toString());
        }
    }

    public static class NoSourceEncoderAvailableException extends MissingComponentException {
        public NoSourceEncoderAvailableException(Class<?> cls) {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to find source encoder for data class: ");
            sb.append(cls);
            super(sb.toString());
        }
    }

    public Registry() {
        mo24112a(Arrays.asList(new String[]{"Gif", "Bitmap", "BitmapDrawable"}));
    }

    /* renamed from: c */
    private <Data, TResource, Transcode> List<C8976h<Data, TResource, Transcode>> m21152c(Class<Data> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        ArrayList arrayList = new ArrayList();
        for (Class cls4 : this.f22997c.mo24737b(cls, cls2)) {
            for (Class cls5 : this.f23000f.mo24722b(cls4, cls3)) {
                C8976h hVar = new C8976h(cls, cls4, cls5, this.f22997c.mo24734a(cls, cls4), this.f23000f.mo24720a(cls4, cls5), this.f23004j);
                arrayList.add(hVar);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public <Data> Registry mo24106a(Class<Data> cls, Encoder<Data> encoder) {
        this.f22996b.mo24725a(cls, encoder);
        return this;
    }

    /* renamed from: b */
    public <Model, Data> Registry mo24117b(Class<Model> cls, Class<Data> cls2, ModelLoaderFactory<Model, Data> modelLoaderFactory) {
        this.f22995a.mo24581b(cls, cls2, modelLoaderFactory);
        return this;
    }

    /* renamed from: a */
    public <Data, TResource> Registry mo24108a(Class<Data> cls, Class<TResource> cls2, ResourceDecoder<Data, TResource> resourceDecoder) {
        mo24111a("legacy_append", cls, cls2, resourceDecoder);
        return this;
    }

    /* renamed from: b */
    public <Model, TResource, Transcode> List<Class<?>> mo24119b(Class<Model> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        List<Class<?>> a = this.f23002h.mo24732a(cls, cls2, cls3);
        if (a == null) {
            a = new ArrayList<>();
            for (Class b : this.f22995a.mo24578a(cls)) {
                for (Class cls4 : this.f22997c.mo24737b(b, cls2)) {
                    if (!this.f23000f.mo24722b(cls4, cls3).isEmpty() && !a.contains(cls4)) {
                        a.add(cls4);
                    }
                }
            }
            this.f23002h.mo24733a(cls, cls2, cls3, Collections.unmodifiableList(a));
        }
        return a;
    }

    /* renamed from: a */
    public <Data, TResource> Registry mo24111a(String str, Class<Data> cls, Class<TResource> cls2, ResourceDecoder<Data, TResource> resourceDecoder) {
        this.f22997c.mo24735a(str, resourceDecoder, cls, cls2);
        return this;
    }

    /* renamed from: a */
    public final Registry mo24112a(List<String> list) {
        ArrayList arrayList = new ArrayList(list.size());
        arrayList.addAll(list);
        arrayList.add(0, "legacy_prepend_all");
        arrayList.add("legacy_append");
        this.f22997c.mo24736a((List<String>) arrayList);
        return this;
    }

    /* renamed from: a */
    public <TResource> Registry mo24107a(Class<TResource> cls, ResourceEncoder<TResource> resourceEncoder) {
        this.f22998d.mo24740a(cls, resourceEncoder);
        return this;
    }

    /* renamed from: a */
    public Registry mo24105a(Factory<?> factory) {
        this.f22999e.mo24255a(factory);
        return this;
    }

    /* renamed from: a */
    public <TResource, Transcode> Registry mo24110a(Class<TResource> cls, Class<Transcode> cls2, ResourceTranscoder<TResource, Transcode> resourceTranscoder) {
        this.f23000f.mo24721a(cls, cls2, resourceTranscoder);
        return this;
    }

    /* renamed from: a */
    public Registry mo24104a(ImageHeaderParser imageHeaderParser) {
        this.f23001g.mo24728a(imageHeaderParser);
        return this;
    }

    /* renamed from: a */
    public <Model, Data> Registry mo24109a(Class<Model> cls, Class<Data> cls2, ModelLoaderFactory<Model, Data> modelLoaderFactory) {
        this.f22995a.mo24580a(cls, cls2, modelLoaderFactory);
        return this;
    }

    /* renamed from: a */
    public <Data, TResource, Transcode> C9003q<Data, TResource, Transcode> mo24114a(Class<Data> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        C9003q<Data, TResource, Transcode> a = this.f23003i.mo24729a(cls, cls2, cls3);
        if (this.f23003i.mo24731a(a)) {
            return null;
        }
        if (a == null) {
            List c = m21152c(cls, cls2, cls3);
            if (c.isEmpty()) {
                a = null;
            } else {
                a = new C9003q<>(cls, cls2, cls3, c, this.f23004j);
            }
            this.f23003i.mo24730a(cls, cls2, cls3, a);
        }
        return a;
    }

    /* renamed from: c */
    public <X> Encoder<X> mo24121c(X x) throws NoSourceEncoderAvailableException {
        Encoder<X> a = this.f22996b.mo24724a(x.getClass());
        if (a != null) {
            return a;
        }
        throw new NoSourceEncoderAvailableException(x.getClass());
    }

    /* renamed from: b */
    public boolean mo24120b(Resource<?> resource) {
        return this.f22998d.mo24739a(resource.getResourceClass()) != null;
    }

    /* renamed from: b */
    public <X> DataRewinder<X> mo24118b(X x) {
        return this.f22999e.mo24254a(x);
    }

    /* renamed from: a */
    public <X> ResourceEncoder<X> mo24113a(Resource<X> resource) throws NoResultEncoderAvailableException {
        ResourceEncoder<X> a = this.f22998d.mo24739a(resource.getResourceClass());
        if (a != null) {
            return a;
        }
        throw new NoResultEncoderAvailableException(resource.getResourceClass());
    }

    /* renamed from: a */
    public <Model> List<ModelLoader<Model, ?>> mo24116a(Model model) {
        List<ModelLoader<Model, ?>> a = this.f22995a.mo24579a(model);
        if (!a.isEmpty()) {
            return a;
        }
        throw new NoModelLoaderAvailableException(model);
    }

    /* renamed from: a */
    public List<ImageHeaderParser> mo24115a() {
        List<ImageHeaderParser> a = this.f23001g.mo24727a();
        if (!a.isEmpty()) {
            return a;
        }
        throw new NoImageHeaderParserException();
    }
}

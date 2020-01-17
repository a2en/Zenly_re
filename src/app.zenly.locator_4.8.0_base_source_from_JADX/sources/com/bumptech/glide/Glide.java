package com.bumptech.glide;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.bumptech.glide.gifdecoder.GifDecoder;
import com.bumptech.glide.load.Encoder;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.ResourceEncoder;
import com.bumptech.glide.load.data.C8898i.C8899a;
import com.bumptech.glide.load.data.DataRewinder.Factory;
import com.bumptech.glide.load.engine.C8984j;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.engine.cache.MemoryCache;
import com.bumptech.glide.load.model.AssetUriLoader.C9028a;
import com.bumptech.glide.load.model.AssetUriLoader.C9029b;
import com.bumptech.glide.load.model.ByteArrayLoader.C9030a;
import com.bumptech.glide.load.model.ByteArrayLoader.C9033c;
import com.bumptech.glide.load.model.C9049a;
import com.bumptech.glide.load.model.C9050b.C9052b;
import com.bumptech.glide.load.model.C9053c;
import com.bumptech.glide.load.model.C9057e.C9058a;
import com.bumptech.glide.load.model.C9072j.C9073a;
import com.bumptech.glide.load.model.C9072j.C9074b;
import com.bumptech.glide.load.model.C9072j.C9075c;
import com.bumptech.glide.load.model.C9072j.C9076d;
import com.bumptech.glide.load.model.C9077k;
import com.bumptech.glide.load.model.C9078l.C9079a;
import com.bumptech.glide.load.model.C9078l.C9080b;
import com.bumptech.glide.load.model.C9078l.C9081c;
import com.bumptech.glide.load.model.C9082m.C9083a;
import com.bumptech.glide.load.model.C9085n.C9086a;
import com.bumptech.glide.load.model.DataUrlLoader.C9036b;
import com.bumptech.glide.load.model.FileLoader.C9039b;
import com.bumptech.glide.load.model.FileLoader.C9042d;
import com.bumptech.glide.load.model.ModelLoaderFactory;
import com.bumptech.glide.load.model.UriLoader.C9046a;
import com.bumptech.glide.load.model.UriLoader.C9047b;
import com.bumptech.glide.load.model.UriLoader.C9048c;
import com.bumptech.glide.load.model.p298o.C9087a.C9088a;
import com.bumptech.glide.load.model.p298o.C9089b.C9090a;
import com.bumptech.glide.load.model.p298o.C9091c.C9092a;
import com.bumptech.glide.load.model.p298o.C9093d.C9094a;
import com.bumptech.glide.load.model.p298o.C9095e.C9096a;
import com.bumptech.glide.load.p294h.p295d.C9018a.C9019a;
import com.bumptech.glide.load.p294h.p296e.C9024d;
import com.bumptech.glide.load.p294h.p296e.C9025e;
import com.bumptech.glide.load.p294h.p297f.C9026a;
import com.bumptech.glide.load.resource.bitmap.C9098a;
import com.bumptech.glide.load.resource.bitmap.C9099a0;
import com.bumptech.glide.load.resource.bitmap.C9106b;
import com.bumptech.glide.load.resource.bitmap.C9107c;
import com.bumptech.glide.load.resource.bitmap.C9111g;
import com.bumptech.glide.load.resource.bitmap.C9112h;
import com.bumptech.glide.load.resource.bitmap.C9116l;
import com.bumptech.glide.load.resource.bitmap.C9132p;
import com.bumptech.glide.load.resource.bitmap.C9135s;
import com.bumptech.glide.load.resource.bitmap.C9139v;
import com.bumptech.glide.load.resource.bitmap.C9141x;
import com.bumptech.glide.load.resource.bitmap.C9147z;
import com.bumptech.glide.load.resource.bitmap.Downsampler;
import com.bumptech.glide.load.resource.gif.C9152a;
import com.bumptech.glide.load.resource.gif.C9156c;
import com.bumptech.glide.load.resource.gif.C9158d;
import com.bumptech.glide.load.resource.gif.C9161g;
import com.bumptech.glide.load.resource.gif.C9163i;
import com.bumptech.glide.load.resource.transcode.C9164a;
import com.bumptech.glide.load.resource.transcode.C9165b;
import com.bumptech.glide.load.resource.transcode.C9166c;
import com.bumptech.glide.load.resource.transcode.C9167d;
import com.bumptech.glide.load.resource.transcode.ResourceTranscoder;
import com.bumptech.glide.manager.ConnectivityMonitorFactory;
import com.bumptech.glide.manager.RequestManagerRetriever;
import com.bumptech.glide.module.C9197d;
import com.bumptech.glide.module.GlideModule;
import com.bumptech.glide.p301o.C9216j;
import com.bumptech.glide.p301o.C9217k;
import com.bumptech.glide.request.C9224d;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.target.C9236g;
import com.bumptech.glide.request.target.Target;
import java.io.File;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Glide implements ComponentCallbacks2 {

    /* renamed from: m */
    private static volatile Glide f22985m;

    /* renamed from: n */
    private static volatile boolean f22986n;

    /* renamed from: e */
    private final BitmapPool f22987e;

    /* renamed from: f */
    private final MemoryCache f22988f;

    /* renamed from: g */
    private final C8856d f22989g;

    /* renamed from: h */
    private final Registry f22990h;

    /* renamed from: i */
    private final ArrayPool f22991i;

    /* renamed from: j */
    private final RequestManagerRetriever f22992j;

    /* renamed from: k */
    private final ConnectivityMonitorFactory f22993k;

    /* renamed from: l */
    private final List<C8867j> f22994l = new ArrayList();

    public interface RequestOptionsFactory {
        C9224d build();
    }

    Glide(Context context, C8984j jVar, MemoryCache memoryCache, BitmapPool bitmapPool, ArrayPool arrayPool, RequestManagerRetriever requestManagerRetriever, ConnectivityMonitorFactory connectivityMonitorFactory, int i, RequestOptionsFactory requestOptionsFactory, Map<Class<?>, C8871k<?, ?>> map, List<RequestListener<Object>> list, boolean z, boolean z2, int i2, int i3) {
        ResourceDecoder resourceDecoder;
        ResourceDecoder resourceDecoder2;
        Context context2 = context;
        BitmapPool bitmapPool2 = bitmapPool;
        ArrayPool arrayPool2 = arrayPool;
        Class<GifDecoder> cls = GifDecoder.class;
        Class<byte[]> cls2 = byte[].class;
        C8857e eVar = C8857e.NORMAL;
        this.f22987e = bitmapPool2;
        this.f22991i = arrayPool2;
        this.f22988f = memoryCache;
        this.f22992j = requestManagerRetriever;
        this.f22993k = connectivityMonitorFactory;
        Resources resources = context.getResources();
        this.f22990h = new Registry();
        this.f22990h.mo24104a((ImageHeaderParser) new C9116l());
        if (VERSION.SDK_INT >= 27) {
            this.f22990h.mo24104a((ImageHeaderParser) new C9132p());
        }
        List a = this.f22990h.mo24115a();
        C9152a aVar = new C9152a(context2, a, bitmapPool2, arrayPool2);
        ResourceDecoder b = C9099a0.m21801b(bitmapPool);
        if (!z2 || VERSION.SDK_INT < 28) {
            Downsampler downsampler = new Downsampler(this.f22990h.mo24115a(), resources.getDisplayMetrics(), bitmapPool2, arrayPool2);
            resourceDecoder = new C9111g(downsampler);
            resourceDecoder2 = new C9141x(downsampler, arrayPool2);
        } else {
            resourceDecoder2 = new C9135s();
            resourceDecoder = new C9112h();
        }
        C9024d dVar = new C9024d(context2);
        C9075c cVar = new C9075c(resources);
        C9076d dVar2 = new C9076d(resources);
        C9074b bVar = new C9074b(resources);
        Class<byte[]> cls3 = cls2;
        C9073a aVar2 = new C9073a(resources);
        C9107c cVar2 = new C9107c(arrayPool2);
        C9073a aVar3 = aVar2;
        C9164a aVar4 = new C9164a();
        C9167d dVar3 = new C9167d();
        ContentResolver contentResolver = context.getContentResolver();
        Registry registry = this.f22990h;
        C9076d dVar4 = dVar2;
        registry.mo24106a(ByteBuffer.class, (Encoder<Data>) new C9049a<Data>());
        registry.mo24106a(InputStream.class, (Encoder<Data>) new C9077k<Data>(arrayPool2));
        C9074b bVar2 = bVar;
        String str = "Bitmap";
        registry.mo24111a(str, ByteBuffer.class, Bitmap.class, resourceDecoder);
        registry.mo24111a(str, InputStream.class, Bitmap.class, resourceDecoder2);
        registry.mo24111a(str, ParcelFileDescriptor.class, Bitmap.class, b);
        C9075c cVar3 = cVar;
        registry.mo24111a(str, AssetFileDescriptor.class, Bitmap.class, C9099a0.m21799a(bitmapPool));
        registry.mo24109a(Bitmap.class, Bitmap.class, (ModelLoaderFactory<Model, Data>) C9083a.m21760a());
        registry.mo24111a(str, Bitmap.class, Bitmap.class, new C9147z());
        registry.mo24107a(Bitmap.class, (ResourceEncoder<TResource>) cVar2);
        C9098a aVar5 = new C9098a(resources, resourceDecoder);
        String str2 = "BitmapDrawable";
        registry.mo24111a(str2, ByteBuffer.class, BitmapDrawable.class, aVar5);
        registry.mo24111a(str2, InputStream.class, BitmapDrawable.class, new C9098a(resources, resourceDecoder2));
        registry.mo24111a(str2, ParcelFileDescriptor.class, BitmapDrawable.class, new C9098a(resources, b));
        registry.mo24107a(BitmapDrawable.class, (ResourceEncoder<TResource>) new C9106b<TResource>(bitmapPool2, cVar2));
        C9163i iVar = new C9163i(a, aVar, arrayPool2);
        String str3 = "Gif";
        registry.mo24111a(str3, InputStream.class, C9156c.class, iVar);
        registry.mo24111a(str3, ByteBuffer.class, C9156c.class, aVar);
        registry.mo24107a(C9156c.class, (ResourceEncoder<TResource>) new C9158d<TResource>());
        registry.mo24109a(cls, cls, (ModelLoaderFactory<Model, Data>) C9083a.m21760a());
        registry.mo24111a(str, cls, Bitmap.class, new C9161g(bitmapPool2));
        registry.mo24108a(Uri.class, Drawable.class, (ResourceDecoder<Data, TResource>) dVar);
        registry.mo24108a(Uri.class, Bitmap.class, (ResourceDecoder<Data, TResource>) new C9139v<Data,TResource>(dVar, bitmapPool2));
        registry.mo24105a((Factory<?>) new C9019a<Object>());
        registry.mo24109a(File.class, ByteBuffer.class, (ModelLoaderFactory<Model, Data>) new C9052b<Model,Data>());
        registry.mo24109a(File.class, InputStream.class, (ModelLoaderFactory<Model, Data>) new C9042d<Model,Data>());
        registry.mo24108a(File.class, File.class, (ResourceDecoder<Data, TResource>) new C9026a<Data,TResource>());
        registry.mo24109a(File.class, ParcelFileDescriptor.class, (ModelLoaderFactory<Model, Data>) new C9039b<Model,Data>());
        registry.mo24109a(File.class, File.class, (ModelLoaderFactory<Model, Data>) C9083a.m21760a());
        registry.mo24105a((Factory<?>) new C8899a<Object>(arrayPool2));
        C9075c cVar4 = cVar3;
        registry.mo24109a(Integer.TYPE, InputStream.class, (ModelLoaderFactory<Model, Data>) cVar4);
        C9074b bVar3 = bVar2;
        registry.mo24109a(Integer.TYPE, ParcelFileDescriptor.class, (ModelLoaderFactory<Model, Data>) bVar3);
        registry.mo24109a(Integer.class, InputStream.class, (ModelLoaderFactory<Model, Data>) cVar4);
        registry.mo24109a(Integer.class, ParcelFileDescriptor.class, (ModelLoaderFactory<Model, Data>) bVar3);
        C9076d dVar5 = dVar4;
        registry.mo24109a(Integer.class, Uri.class, (ModelLoaderFactory<Model, Data>) dVar5);
        C9073a aVar6 = aVar3;
        registry.mo24109a(Integer.TYPE, AssetFileDescriptor.class, (ModelLoaderFactory<Model, Data>) aVar6);
        registry.mo24109a(Integer.class, AssetFileDescriptor.class, (ModelLoaderFactory<Model, Data>) aVar6);
        registry.mo24109a(Integer.TYPE, Uri.class, (ModelLoaderFactory<Model, Data>) dVar5);
        registry.mo24109a(String.class, InputStream.class, (ModelLoaderFactory<Model, Data>) new C9036b<Model,Data>());
        registry.mo24109a(Uri.class, InputStream.class, (ModelLoaderFactory<Model, Data>) new C9036b<Model,Data>());
        registry.mo24109a(String.class, InputStream.class, (ModelLoaderFactory<Model, Data>) new C9081c<Model,Data>());
        registry.mo24109a(String.class, ParcelFileDescriptor.class, (ModelLoaderFactory<Model, Data>) new C9080b<Model,Data>());
        registry.mo24109a(String.class, AssetFileDescriptor.class, (ModelLoaderFactory<Model, Data>) new C9079a<Model,Data>());
        registry.mo24109a(Uri.class, InputStream.class, (ModelLoaderFactory<Model, Data>) new C9090a<Model,Data>());
        registry.mo24109a(Uri.class, InputStream.class, (ModelLoaderFactory<Model, Data>) new C9029b<Model,Data>(context.getAssets()));
        registry.mo24109a(Uri.class, ParcelFileDescriptor.class, (ModelLoaderFactory<Model, Data>) new C9028a<Model,Data>(context.getAssets()));
        Context context3 = context;
        registry.mo24109a(Uri.class, InputStream.class, (ModelLoaderFactory<Model, Data>) new C9092a<Model,Data>(context3));
        registry.mo24109a(Uri.class, InputStream.class, (ModelLoaderFactory<Model, Data>) new C9094a<Model,Data>(context3));
        ContentResolver contentResolver2 = contentResolver;
        registry.mo24109a(Uri.class, InputStream.class, (ModelLoaderFactory<Model, Data>) new C9048c<Model,Data>(contentResolver2));
        registry.mo24109a(Uri.class, ParcelFileDescriptor.class, (ModelLoaderFactory<Model, Data>) new C9047b<Model,Data>(contentResolver2));
        registry.mo24109a(Uri.class, AssetFileDescriptor.class, (ModelLoaderFactory<Model, Data>) new C9046a<Model,Data>(contentResolver2));
        registry.mo24109a(Uri.class, InputStream.class, (ModelLoaderFactory<Model, Data>) new C9086a<Model,Data>());
        registry.mo24109a(URL.class, InputStream.class, (ModelLoaderFactory<Model, Data>) new C9096a<Model,Data>());
        registry.mo24109a(Uri.class, File.class, (ModelLoaderFactory<Model, Data>) new C9058a<Model,Data>(context3));
        registry.mo24109a(C9053c.class, InputStream.class, (ModelLoaderFactory<Model, Data>) new C9088a<Model,Data>());
        Class<byte[]> cls4 = cls3;
        registry.mo24109a(cls4, ByteBuffer.class, (ModelLoaderFactory<Model, Data>) new C9030a<Model,Data>());
        registry.mo24109a(cls4, InputStream.class, (ModelLoaderFactory<Model, Data>) new C9033c<Model,Data>());
        registry.mo24109a(Uri.class, Uri.class, (ModelLoaderFactory<Model, Data>) C9083a.m21760a());
        registry.mo24109a(Drawable.class, Drawable.class, (ModelLoaderFactory<Model, Data>) C9083a.m21760a());
        registry.mo24108a(Drawable.class, Drawable.class, (ResourceDecoder<Data, TResource>) new C9025e<Data,TResource>());
        registry.mo24110a(Bitmap.class, BitmapDrawable.class, (ResourceTranscoder<TResource, Transcode>) new C9165b<TResource,Transcode>(resources));
        C9164a aVar7 = aVar4;
        registry.mo24110a(Bitmap.class, cls4, (ResourceTranscoder<TResource, Transcode>) aVar7);
        C9167d dVar6 = dVar3;
        registry.mo24110a(Drawable.class, cls4, (ResourceTranscoder<TResource, Transcode>) new C9166c<TResource,Transcode>(bitmapPool2, aVar7, dVar6));
        registry.mo24110a(C9156c.class, cls4, (ResourceTranscoder<TResource, Transcode>) dVar6);
        Context context4 = context;
        ArrayPool arrayPool3 = arrayPool;
        C8856d dVar7 = new C8856d(context4, arrayPool3, this.f22990h, new C9236g(), requestOptionsFactory, map, list, jVar, z, i);
        this.f22989g = dVar7;
    }

    /* renamed from: a */
    public static Glide m21128a(Context context) {
        if (f22985m == null) {
            GeneratedAppGlideModule b = m21136b(context.getApplicationContext());
            synchronized (Glide.class) {
                if (f22985m == null) {
                    m21133a(context, b);
                }
            }
        }
        return f22985m;
    }

    /* renamed from: b */
    private static void m21137b(Context context, GeneratedAppGlideModule generatedAppGlideModule) {
        m21134a(context, new C8854c(), generatedAppGlideModule);
    }

    /* renamed from: c */
    public BitmapPool mo24091c() {
        return this.f22987e;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public ConnectivityMonitorFactory mo24092d() {
        return this.f22993k;
    }

    /* renamed from: e */
    public Context mo24093e() {
        return this.f22989g.getBaseContext();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public C8856d mo24094f() {
        return this.f22989g;
    }

    /* renamed from: g */
    public Registry mo24095g() {
        return this.f22990h;
    }

    /* renamed from: h */
    public RequestManagerRetriever mo24096h() {
        return this.f22992j;
    }

    public void onConfigurationChanged(Configuration configuration) {
    }

    public void onLowMemory() {
        mo24085a();
    }

    public void onTrimMemory(int i) {
        mo24086a(i);
    }

    /* renamed from: b */
    private static GeneratedAppGlideModule m21136b(Context context) {
        try {
            return (GeneratedAppGlideModule) Class.forName("com.bumptech.glide.GeneratedAppGlideModuleImpl").getDeclaredConstructor(new Class[]{Context.class}).newInstance(new Object[]{context.getApplicationContext()});
        } catch (ClassNotFoundException unused) {
            String str = "Glide";
            if (Log.isLoggable(str, 5)) {
                Log.w(str, "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored");
            }
            return null;
        } catch (InstantiationException e) {
            m21135a((Exception) e);
            throw null;
        } catch (IllegalAccessException e2) {
            m21135a((Exception) e2);
            throw null;
        } catch (NoSuchMethodException e3) {
            m21135a((Exception) e3);
            throw null;
        } catch (InvocationTargetException e4) {
            m21135a((Exception) e4);
            throw null;
        }
    }

    /* renamed from: c */
    private static RequestManagerRetriever m21138c(Context context) {
        C9216j.m22084a(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        return m21128a(context).mo24096h();
    }

    /* renamed from: d */
    public static C8867j m21139d(Context context) {
        return m21138c(context).mo24747a(context);
    }

    /* renamed from: a */
    private static void m21133a(Context context, GeneratedAppGlideModule generatedAppGlideModule) {
        if (!f22986n) {
            f22986n = true;
            m21137b(context, generatedAppGlideModule);
            f22986n = false;
            return;
        }
        throw new IllegalStateException("You cannot call Glide.get() in registerComponents(), use the provided Glide instance instead");
    }

    /* renamed from: b */
    public ArrayPool mo24089b() {
        return this.f22991i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo24090b(C8867j jVar) {
        synchronized (this.f22994l) {
            if (this.f22994l.contains(jVar)) {
                this.f22994l.remove(jVar);
            } else {
                throw new IllegalStateException("Cannot unregister not yet registered manager");
            }
        }
    }

    /* renamed from: a */
    private static void m21134a(Context context, C8854c cVar, GeneratedAppGlideModule generatedAppGlideModule) {
        Context applicationContext = context.getApplicationContext();
        List<GlideModule> emptyList = Collections.emptyList();
        if (generatedAppGlideModule == null || generatedAppGlideModule.mo8472a()) {
            emptyList = new C9197d(applicationContext).mo24794a();
        }
        String str = "Glide";
        if (generatedAppGlideModule != null && !generatedAppGlideModule.mo24082b().isEmpty()) {
            Set b = generatedAppGlideModule.mo24082b();
            Iterator it = emptyList.iterator();
            while (it.hasNext()) {
                GlideModule glideModule = (GlideModule) it.next();
                if (b.contains(glideModule.getClass())) {
                    if (Log.isLoggable(str, 3)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("AppGlideModule excludes manifest GlideModule: ");
                        sb.append(glideModule);
                        Log.d(str, sb.toString());
                    }
                    it.remove();
                }
            }
        }
        if (Log.isLoggable(str, 3)) {
            for (GlideModule glideModule2 : emptyList) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Discovered GlideModule from manifest: ");
                sb2.append(glideModule2.getClass());
                Log.d(str, sb2.toString());
            }
        }
        cVar.mo24124a(generatedAppGlideModule != null ? generatedAppGlideModule.mo24083c() : null);
        for (GlideModule a : emptyList) {
            a.mo24793a(applicationContext, cVar);
        }
        if (generatedAppGlideModule != null) {
            generatedAppGlideModule.mo24084a(applicationContext, cVar);
        }
        Glide a2 = cVar.mo24123a(applicationContext);
        for (GlideModule glideModule3 : emptyList) {
            try {
                glideModule3.mo24792a(applicationContext, a2, a2.f22990h);
            } catch (AbstractMethodError e) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Attempting to register a Glide v3 module. If you see this, you or one of your dependencies may be including Glide v3 even though you're using Glide v4. You'll need to find and remove (or update) the offending dependency. The v3 module name is: ");
                sb3.append(glideModule3.getClass().getName());
                throw new IllegalStateException(sb3.toString(), e);
            }
        }
        if (generatedAppGlideModule != null) {
            generatedAppGlideModule.mo8471a(applicationContext, a2, a2.f22990h);
        }
        applicationContext.registerComponentCallbacks(a2);
        f22985m = a2;
    }

    /* renamed from: a */
    private static void m21135a(Exception exc) {
        throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", exc);
    }

    /* renamed from: a */
    public void mo24085a() {
        C9217k.m22103b();
        this.f22988f.clearMemory();
        this.f22987e.clearMemory();
        this.f22991i.clearMemory();
    }

    /* renamed from: a */
    public void mo24086a(int i) {
        C9217k.m22103b();
        for (C8867j onTrimMemory : this.f22994l) {
            onTrimMemory.onTrimMemory(i);
        }
        this.f22988f.trimMemory(i);
        this.f22987e.trimMemory(i);
        this.f22991i.trimMemory(i);
    }

    /* renamed from: a */
    public static C8867j m21129a(Activity activity) {
        return m21138c(activity).mo24745a(activity);
    }

    /* renamed from: a */
    public static C8867j m21132a(FragmentActivity fragmentActivity) {
        return m21138c(fragmentActivity).mo24750a(fragmentActivity);
    }

    /* renamed from: a */
    public static C8867j m21131a(Fragment fragment) {
        return m21138c(fragment.getContext()).mo24749a(fragment);
    }

    /* renamed from: a */
    public static C8867j m21130a(View view) {
        return m21138c(view.getContext()).mo24748a(view);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo24088a(Target<?> target) {
        synchronized (this.f22994l) {
            for (C8867j b : this.f22994l) {
                if (b.mo24180b(target)) {
                    return true;
                }
            }
            return false;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo24087a(C8867j jVar) {
        synchronized (this.f22994l) {
            if (!this.f22994l.contains(jVar)) {
                this.f22994l.add(jVar);
            } else {
                throw new IllegalStateException("Cannot register already registered manager");
            }
        }
    }
}

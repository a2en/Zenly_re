package com.bumptech.glide.load.engine;

import android.util.Log;
import androidx.core.util.Pools$Pool;
import com.bumptech.glide.load.C9011f;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.data.DataRewinder;
import com.bumptech.glide.load.resource.transcode.ResourceTranscoder;
import com.bumptech.glide.p301o.C9216j;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bumptech.glide.load.engine.h */
public class C8976h<DataType, ResourceType, Transcode> {

    /* renamed from: a */
    private final Class<DataType> f23418a;

    /* renamed from: b */
    private final List<? extends ResourceDecoder<DataType, ResourceType>> f23419b;

    /* renamed from: c */
    private final ResourceTranscoder<ResourceType, Transcode> f23420c;

    /* renamed from: d */
    private final Pools$Pool<List<Throwable>> f23421d;

    /* renamed from: e */
    private final String f23422e;

    /* renamed from: com.bumptech.glide.load.engine.h$a */
    interface C8977a<ResourceType> {
        /* renamed from: a */
        Resource<ResourceType> mo24451a(Resource<ResourceType> resource);
    }

    public C8976h(Class<DataType> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<? extends ResourceDecoder<DataType, ResourceType>> list, ResourceTranscoder<ResourceType, Transcode> resourceTranscoder, Pools$Pool<List<Throwable>> pools$Pool) {
        this.f23418a = cls;
        this.f23419b = list;
        this.f23420c = resourceTranscoder;
        this.f23421d = pools$Pool;
        StringBuilder sb = new StringBuilder();
        sb.append("Failed DecodePath{");
        sb.append(cls.getSimpleName());
        String str = "->";
        sb.append(str);
        sb.append(cls2.getSimpleName());
        sb.append(str);
        sb.append(cls3.getSimpleName());
        sb.append("}");
        this.f23422e = sb.toString();
    }

    /* renamed from: a */
    public Resource<Transcode> mo24461a(DataRewinder<DataType> dataRewinder, int i, int i2, C9011f fVar, C8977a<ResourceType> aVar) throws GlideException {
        return this.f23420c.transcode(aVar.mo24451a(m21582a(dataRewinder, i, i2, fVar)), fVar);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DecodePath{ dataClass=");
        sb.append(this.f23418a);
        sb.append(", decoders=");
        sb.append(this.f23419b);
        sb.append(", transcoder=");
        sb.append(this.f23420c);
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: a */
    private Resource<ResourceType> m21582a(DataRewinder<DataType> dataRewinder, int i, int i2, C9011f fVar) throws GlideException {
        Object acquire = this.f23421d.acquire();
        C9216j.m22083a(acquire);
        List list = (List) acquire;
        try {
            Resource<ResourceType> a = m21583a(dataRewinder, i, i2, fVar, list);
            return a;
        } finally {
            this.f23421d.release(list);
        }
    }

    /* renamed from: a */
    private Resource<ResourceType> m21583a(DataRewinder<DataType> dataRewinder, int i, int i2, C9011f fVar, List<Throwable> list) throws GlideException {
        int size = this.f23419b.size();
        Resource<ResourceType> resource = null;
        for (int i3 = 0; i3 < size; i3++) {
            ResourceDecoder resourceDecoder = (ResourceDecoder) this.f23419b.get(i3);
            try {
                if (resourceDecoder.handles(dataRewinder.rewindAndGet(), fVar)) {
                    resource = resourceDecoder.decode(dataRewinder.rewindAndGet(), i, i2, fVar);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e) {
                String str = "DecodePath";
                if (Log.isLoggable(str, 2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Failed to decode data for ");
                    sb.append(resourceDecoder);
                    Log.v(str, sb.toString(), e);
                }
                list.add(e);
            }
            if (resource != null) {
                break;
            }
        }
        if (resource != null) {
            return resource;
        }
        throw new GlideException(this.f23422e, (List<Throwable>) new ArrayList<Throwable>(list));
    }
}

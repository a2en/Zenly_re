package com.bumptech.glide.load.engine;

import androidx.core.util.Pools$Pool;
import com.bumptech.glide.load.C9011f;
import com.bumptech.glide.load.data.DataRewinder;
import com.bumptech.glide.p301o.C9216j;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.bumptech.glide.load.engine.q */
public class C9003q<Data, ResourceType, Transcode> {

    /* renamed from: a */
    private final Pools$Pool<List<Throwable>> f23504a;

    /* renamed from: b */
    private final List<? extends C8976h<Data, ResourceType, Transcode>> f23505b;

    /* renamed from: c */
    private final String f23506c;

    public C9003q(Class<Data> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<C8976h<Data, ResourceType, Transcode>> list, Pools$Pool<List<Throwable>> pools$Pool) {
        this.f23504a = pools$Pool;
        C9216j.m22086a(list);
        this.f23505b = list;
        StringBuilder sb = new StringBuilder();
        sb.append("Failed LoadPath{");
        sb.append(cls.getSimpleName());
        String str = "->";
        sb.append(str);
        sb.append(cls2.getSimpleName());
        sb.append(str);
        sb.append(cls3.getSimpleName());
        sb.append("}");
        this.f23506c = sb.toString();
    }

    /* renamed from: a */
    public Resource<Transcode> mo24510a(DataRewinder<Data> dataRewinder, C9011f fVar, int i, int i2, C8977a<ResourceType> aVar) throws GlideException {
        Object acquire = this.f23504a.acquire();
        C9216j.m22083a(acquire);
        List list = (List) acquire;
        try {
            Resource<Transcode> a = m21659a(dataRewinder, fVar, i, i2, aVar, list);
            return a;
        } finally {
            this.f23504a.release(list);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LoadPath{decodePaths=");
        sb.append(Arrays.toString(this.f23505b.toArray()));
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: a */
    private Resource<Transcode> m21659a(DataRewinder<Data> dataRewinder, C9011f fVar, int i, int i2, C8977a<ResourceType> aVar, List<Throwable> list) throws GlideException {
        List<Throwable> list2 = list;
        int size = this.f23505b.size();
        Resource<Transcode> resource = null;
        for (int i3 = 0; i3 < size; i3++) {
            try {
                resource = ((C8976h) this.f23505b.get(i3)).mo24461a(dataRewinder, i, i2, fVar, aVar);
            } catch (GlideException e) {
                list2.add(e);
            }
            if (resource != null) {
                break;
            }
        }
        if (resource != null) {
            return resource;
        }
        throw new GlideException(this.f23506c, (List<Throwable>) new ArrayList<Throwable>(list2));
    }
}

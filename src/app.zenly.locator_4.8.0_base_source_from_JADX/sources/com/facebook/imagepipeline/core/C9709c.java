package com.facebook.imagepipeline.core;

import com.facebook.cache.disk.C9500c;
import com.facebook.cache.disk.C9504d;
import com.facebook.cache.disk.C9504d.C9507c;
import com.facebook.cache.disk.DiskStorage;
import com.facebook.cache.disk.FileCache;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* renamed from: com.facebook.imagepipeline.core.c */
public class C9709c implements FileCacheFactory {

    /* renamed from: a */
    private DiskStorageFactory f25401a;

    public C9709c(DiskStorageFactory diskStorageFactory) {
        this.f25401a = diskStorageFactory;
    }

    /* renamed from: a */
    public static C9504d m23893a(C9500c cVar, DiskStorage diskStorage) {
        return m23894a(cVar, diskStorage, Executors.newSingleThreadExecutor());
    }

    public FileCache get(C9500c cVar) {
        return m23893a(cVar, this.f25401a.get(cVar));
    }

    /* renamed from: a */
    public static C9504d m23894a(C9500c cVar, DiskStorage diskStorage, Executor executor) {
        C9507c cVar2 = new C9507c(cVar.mo25576k(), cVar.mo25575j(), cVar.mo25571f());
        DiskStorage diskStorage2 = diskStorage;
        C9507c cVar3 = cVar2;
        C9504d dVar = new C9504d(diskStorage2, cVar.mo25573h(), cVar3, cVar.mo25569d(), cVar.mo25568c(), cVar.mo25572g(), cVar.mo25570e(), executor, cVar.mo25574i());
        return dVar;
    }
}

package com.facebook.imagepipeline.core;

import com.facebook.cache.disk.C9500c;
import com.facebook.cache.disk.C9508e;
import com.facebook.cache.disk.DiskStorage;

/* renamed from: com.facebook.imagepipeline.core.d */
public class C9710d implements DiskStorageFactory {
    public DiskStorage get(C9500c cVar) {
        return new C9508e(cVar.mo25577l(), cVar.mo25567b(), cVar.mo25566a(), cVar.mo25568c());
    }
}

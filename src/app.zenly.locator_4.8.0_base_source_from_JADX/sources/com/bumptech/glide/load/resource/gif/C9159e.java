package com.bumptech.glide.load.resource.gif;

import com.bumptech.glide.load.engine.Initializable;
import com.bumptech.glide.load.p294h.p296e.C9022b;

/* renamed from: com.bumptech.glide.load.resource.gif.e */
public class C9159e extends C9022b<C9156c> implements Initializable {
    public C9159e(C9156c cVar) {
        super(cVar);
    }

    public Class<C9156c> getResourceClass() {
        return C9156c.class;
    }

    public int getSize() {
        return ((C9156c) this.f23557e).mo24698e();
    }

    public void initialize() {
        ((C9156c) this.f23557e).mo24694b().prepareToDraw();
    }

    public void recycle() {
        ((C9156c) this.f23557e).stop();
        ((C9156c) this.f23557e).mo24699f();
    }
}

package com.squareup.wire;

import com.squareup.wire.Message;
import com.squareup.wire.Message.Builder;
import java.io.IOException;
import java.io.ObjectStreamException;
import java.io.OutputStream;
import java.io.Serializable;
import okio.BufferedSink;
import okio.C13342c;
import okio.C13346d;

public abstract class Message<M extends Message<M, B>, B extends Builder<M, B>> implements Serializable {
    private static final long serialVersionUID = 0;
    private final transient ProtoAdapter<M> adapter;
    transient int cachedSerializedSize = 0;
    protected transient int hashCode = 0;
    private final transient C13346d unknownFields;

    public static abstract class Builder<M extends Message<M, B>, B extends Builder<M, B>> {
        transient C13342c unknownFieldsBuffer;
        transient C13346d unknownFieldsByteString = C13346d.f34617i;
        transient ProtoWriter unknownFieldsWriter;

        protected Builder() {
        }

        private void prepareForNewUnknownFields() {
            if (this.unknownFieldsBuffer == null) {
                this.unknownFieldsBuffer = new C13342c();
                this.unknownFieldsWriter = new ProtoWriter(this.unknownFieldsBuffer);
                try {
                    this.unknownFieldsWriter.writeBytes(this.unknownFieldsByteString);
                    this.unknownFieldsByteString = C13346d.f34617i;
                } catch (IOException unused) {
                    throw new AssertionError();
                }
            }
        }

        public final Builder<M, B> addUnknownField(int i, FieldEncoding fieldEncoding, Object obj) {
            prepareForNewUnknownFields();
            try {
                fieldEncoding.rawProtoAdapter().encodeWithTag(this.unknownFieldsWriter, i, obj);
                return this;
            } catch (IOException unused) {
                throw new AssertionError();
            }
        }

        public final Builder<M, B> addUnknownFields(C13346d dVar) {
            if (dVar.mo38528g() > 0) {
                prepareForNewUnknownFields();
                try {
                    this.unknownFieldsWriter.writeBytes(dVar);
                } catch (IOException unused) {
                    throw new AssertionError();
                }
            }
            return this;
        }

        public abstract M build();

        public final C13346d buildUnknownFields() {
            C13342c cVar = this.unknownFieldsBuffer;
            if (cVar != null) {
                this.unknownFieldsByteString = cVar.readByteString();
                this.unknownFieldsBuffer = null;
                this.unknownFieldsWriter = null;
            }
            return this.unknownFieldsByteString;
        }

        public final Builder<M, B> clearUnknownFields() {
            this.unknownFieldsByteString = C13346d.f34617i;
            C13342c cVar = this.unknownFieldsBuffer;
            if (cVar != null) {
                cVar.clear();
                this.unknownFieldsBuffer = null;
            }
            this.unknownFieldsWriter = null;
            return this;
        }
    }

    protected Message(ProtoAdapter<M> protoAdapter, C13346d dVar) {
        if (protoAdapter == null) {
            throw new NullPointerException("adapter == null");
        } else if (dVar != null) {
            this.adapter = protoAdapter;
            this.unknownFields = dVar;
        } else {
            throw new NullPointerException("unknownFields == null");
        }
    }

    public final ProtoAdapter<M> adapter() {
        return this.adapter;
    }

    public final void encode(BufferedSink bufferedSink) throws IOException {
        this.adapter.encode(bufferedSink, this);
    }

    public abstract Builder<M, B> newBuilder();

    public String toString() {
        return this.adapter.toString(this);
    }

    public final C13346d unknownFields() {
        C13346d dVar = this.unknownFields;
        return dVar != null ? dVar : C13346d.f34617i;
    }

    public final M withoutUnknownFields() {
        return newBuilder().clearUnknownFields().build();
    }

    /* access modifiers changed from: protected */
    public final Object writeReplace() throws ObjectStreamException {
        return new MessageSerializedForm(encode(), getClass());
    }

    public final byte[] encode() {
        return this.adapter.encode(this);
    }

    public final void encode(OutputStream outputStream) throws IOException {
        this.adapter.encode(outputStream, this);
    }
}

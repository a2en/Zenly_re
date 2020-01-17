package com.google.gson;

import com.google.gson.internal.C11175k;
import com.google.gson.stream.C11265c;
import java.io.IOException;
import java.io.StringWriter;
import java.math.BigDecimal;
import java.math.BigInteger;

public abstract class JsonElement {
    public abstract JsonElement deepCopy();

    public BigDecimal getAsBigDecimal() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public BigInteger getAsBigInteger() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public boolean getAsBoolean() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    /* access modifiers changed from: 0000 */
    public Boolean getAsBooleanWrapper() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public byte getAsByte() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public char getAsCharacter() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public double getAsDouble() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public float getAsFloat() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public int getAsInt() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public JsonArray getAsJsonArray() {
        if (isJsonArray()) {
            return (JsonArray) this;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Not a JSON Array: ");
        sb.append(this);
        throw new IllegalStateException(sb.toString());
    }

    public C11133f getAsJsonNull() {
        if (isJsonNull()) {
            return (C11133f) this;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Not a JSON Null: ");
        sb.append(this);
        throw new IllegalStateException(sb.toString());
    }

    public JsonObject getAsJsonObject() {
        if (isJsonObject()) {
            return (JsonObject) this;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Not a JSON Object: ");
        sb.append(this);
        throw new IllegalStateException(sb.toString());
    }

    public JsonPrimitive getAsJsonPrimitive() {
        if (isJsonPrimitive()) {
            return (JsonPrimitive) this;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Not a JSON Primitive: ");
        sb.append(this);
        throw new IllegalStateException(sb.toString());
    }

    public long getAsLong() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public Number getAsNumber() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public short getAsShort() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public String getAsString() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public boolean isJsonArray() {
        return this instanceof JsonArray;
    }

    public boolean isJsonNull() {
        return this instanceof C11133f;
    }

    public boolean isJsonObject() {
        return this instanceof JsonObject;
    }

    public boolean isJsonPrimitive() {
        return this instanceof JsonPrimitive;
    }

    public String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            C11265c cVar = new C11265c(stringWriter);
            cVar.mo32676b(true);
            C11175k.m28745a(this, cVar);
            return stringWriter.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}

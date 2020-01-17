package com.mapbox.geojson;

import android.support.annotation.Nullable;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import javax.annotation.Generated;

@Generated(
    value = "com.ryanharter.auto.value.gson.AutoValueGsonExtension",
    comments = "https://github.com/rharter/auto-value-gson"
)
final class AutoValue_Feature extends $AutoValue_Feature {
  AutoValue_Feature(String type, @Nullable BoundingBox bbox, @Nullable String id,
      @Nullable Geometry geometry, @Nullable JsonObject properties) {
    super(type, bbox, id, geometry, properties);
  }

  public static final class GsonTypeAdapter extends TypeAdapter<Feature> {
    private volatile TypeAdapter<String> string_adapter;
    private volatile TypeAdapter<BoundingBox> boundingBox_adapter;
    private volatile TypeAdapter<Geometry> geometry_adapter;
    private volatile TypeAdapter<JsonObject> jsonObject_adapter;
    private final Gson gson;
    public GsonTypeAdapter(Gson gson) {
      this.gson = gson;
    }
    @Override
    @SuppressWarnings("unchecked")
    public void write(JsonWriter jsonWriter, Feature object) throws IOException {
      if (object == null) {
        jsonWriter.nullValue();
        return;
      }
      jsonWriter.beginObject();
      jsonWriter.name("type");
      if (object.type() == null) {
        jsonWriter.nullValue();
      } else {
        TypeAdapter<String> string_adapter = this.string_adapter;
        if (string_adapter == null) {
          this.string_adapter = string_adapter = gson.getAdapter(String.class);
        }
        string_adapter.write(jsonWriter, object.type());
      }
      jsonWriter.name("bbox");
      if (object.bbox() == null) {
        jsonWriter.nullValue();
      } else {
        TypeAdapter<BoundingBox> boundingBox_adapter = this.boundingBox_adapter;
        if (boundingBox_adapter == null) {
          this.boundingBox_adapter = boundingBox_adapter = gson.getAdapter(BoundingBox.class);
        }
        boundingBox_adapter.write(jsonWriter, object.bbox());
      }
      jsonWriter.name("id");
      if (object.id() == null) {
        jsonWriter.nullValue();
      } else {
        TypeAdapter<String> string_adapter = this.string_adapter;
        if (string_adapter == null) {
          this.string_adapter = string_adapter = gson.getAdapter(String.class);
        }
        string_adapter.write(jsonWriter, object.id());
      }
      jsonWriter.name("geometry");
      if (object.geometry() == null) {
        jsonWriter.nullValue();
      } else {
        TypeAdapter<Geometry> geometry_adapter = this.geometry_adapter;
        if (geometry_adapter == null) {
          this.geometry_adapter = geometry_adapter = gson.getAdapter(Geometry.class);
        }
        geometry_adapter.write(jsonWriter, object.geometry());
      }
      jsonWriter.name("properties");
      if (object.properties() == null) {
        jsonWriter.nullValue();
      } else {
        TypeAdapter<JsonObject> jsonObject_adapter = this.jsonObject_adapter;
        if (jsonObject_adapter == null) {
          this.jsonObject_adapter = jsonObject_adapter = gson.getAdapter(JsonObject.class);
        }
        jsonObject_adapter.write(jsonWriter, object.properties());
      }
      jsonWriter.endObject();
    }
    @Override
    @SuppressWarnings("unchecked")
    public Feature read(JsonReader jsonReader) throws IOException {
      if (jsonReader.peek() == JsonToken.NULL) {
        jsonReader.nextNull();
        return null;
      }
      jsonReader.beginObject();
      String type = null;
      BoundingBox bbox = null;
      String id = null;
      Geometry geometry = null;
      JsonObject properties = null;
      while (jsonReader.hasNext()) {
        String _name = jsonReader.nextName();
        if (jsonReader.peek() == JsonToken.NULL) {
          jsonReader.nextNull();
          continue;
        }
        switch (_name) {
          case "type": {
            TypeAdapter<String> string_adapter = this.string_adapter;
            if (string_adapter == null) {
              this.string_adapter = string_adapter = gson.getAdapter(String.class);
            }
            type = string_adapter.read(jsonReader);
            break;
          }
          case "bbox": {
            TypeAdapter<BoundingBox> boundingBox_adapter = this.boundingBox_adapter;
            if (boundingBox_adapter == null) {
              this.boundingBox_adapter = boundingBox_adapter = gson.getAdapter(BoundingBox.class);
            }
            bbox = boundingBox_adapter.read(jsonReader);
            break;
          }
          case "id": {
            TypeAdapter<String> string_adapter = this.string_adapter;
            if (string_adapter == null) {
              this.string_adapter = string_adapter = gson.getAdapter(String.class);
            }
            id = string_adapter.read(jsonReader);
            break;
          }
          case "geometry": {
            TypeAdapter<Geometry> geometry_adapter = this.geometry_adapter;
            if (geometry_adapter == null) {
              this.geometry_adapter = geometry_adapter = gson.getAdapter(Geometry.class);
            }
            geometry = geometry_adapter.read(jsonReader);
            break;
          }
          case "properties": {
            TypeAdapter<JsonObject> jsonObject_adapter = this.jsonObject_adapter;
            if (jsonObject_adapter == null) {
              this.jsonObject_adapter = jsonObject_adapter = gson.getAdapter(JsonObject.class);
            }
            properties = jsonObject_adapter.read(jsonReader);
            break;
          }
          default: {
            jsonReader.skipValue();
          }
        }
      }
      jsonReader.endObject();
      return new AutoValue_Feature(type, bbox, id, geometry, properties);
    }
  }
}

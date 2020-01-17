package com.mapbox.geojson;

import android.support.annotation.Nullable;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.List;
import javax.annotation.Generated;

@Generated(
    value = "com.ryanharter.auto.value.gson.AutoValueGsonExtension",
    comments = "https://github.com/rharter/auto-value-gson"
)
final class AutoValue_GeometryCollection extends $AutoValue_GeometryCollection {
  AutoValue_GeometryCollection(String type, @Nullable BoundingBox bbox, List<Geometry> geometries) {
    super(type, bbox, geometries);
  }

  public static final class GsonTypeAdapter extends TypeAdapter<GeometryCollection> {
    private volatile TypeAdapter<String> string_adapter;
    private volatile TypeAdapter<BoundingBox> boundingBox_adapter;
    private volatile TypeAdapter<List<Geometry>> list__geometry_adapter;
    private final Gson gson;
    public GsonTypeAdapter(Gson gson) {
      this.gson = gson;
    }
    @Override
    @SuppressWarnings("unchecked")
    public void write(JsonWriter jsonWriter, GeometryCollection object) throws IOException {
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
      jsonWriter.name("geometries");
      if (object.geometries() == null) {
        jsonWriter.nullValue();
      } else {
        TypeAdapter<List<Geometry>> list__geometry_adapter = this.list__geometry_adapter;
        if (list__geometry_adapter == null) {
          this.list__geometry_adapter = list__geometry_adapter = (TypeAdapter<List<Geometry>>) gson.getAdapter(TypeToken.getParameterized(List.class, Geometry.class));
        }
        list__geometry_adapter.write(jsonWriter, object.geometries());
      }
      jsonWriter.endObject();
    }
    @Override
    @SuppressWarnings("unchecked")
    public GeometryCollection read(JsonReader jsonReader) throws IOException {
      if (jsonReader.peek() == JsonToken.NULL) {
        jsonReader.nextNull();
        return null;
      }
      jsonReader.beginObject();
      String type = null;
      BoundingBox bbox = null;
      List<Geometry> geometries = null;
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
          case "geometries": {
            TypeAdapter<List<Geometry>> list__geometry_adapter = this.list__geometry_adapter;
            if (list__geometry_adapter == null) {
              this.list__geometry_adapter = list__geometry_adapter = (TypeAdapter<List<Geometry>>) gson.getAdapter(TypeToken.getParameterized(List.class, Geometry.class));
            }
            geometries = list__geometry_adapter.read(jsonReader);
            break;
          }
          default: {
            jsonReader.skipValue();
          }
        }
      }
      jsonReader.endObject();
      return new AutoValue_GeometryCollection(type, bbox, geometries);
    }
  }
}

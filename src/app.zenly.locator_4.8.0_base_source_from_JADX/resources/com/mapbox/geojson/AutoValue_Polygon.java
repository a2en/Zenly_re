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
final class AutoValue_Polygon extends $AutoValue_Polygon {
  AutoValue_Polygon(String type, @Nullable BoundingBox bbox, List<List<Point>> coordinates) {
    super(type, bbox, coordinates);
  }

  public static final class GsonTypeAdapter extends TypeAdapter<Polygon> {
    private volatile TypeAdapter<String> string_adapter;
    private volatile TypeAdapter<BoundingBox> boundingBox_adapter;
    private volatile TypeAdapter<List<List<Point>>> list__list__point_adapter;
    private final Gson gson;
    public GsonTypeAdapter(Gson gson) {
      this.gson = gson;
    }
    @Override
    @SuppressWarnings("unchecked")
    public void write(JsonWriter jsonWriter, Polygon object) throws IOException {
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
      jsonWriter.name("coordinates");
      if (object.coordinates() == null) {
        jsonWriter.nullValue();
      } else {
        TypeAdapter<List<List<Point>>> list__list__point_adapter = this.list__list__point_adapter;
        if (list__list__point_adapter == null) {
          this.list__list__point_adapter = list__list__point_adapter = (TypeAdapter<List<List<Point>>>) gson.getAdapter(TypeToken.getParameterized(List.class, TypeToken.getParameterized(List.class, Point.class).getType()));
        }
        list__list__point_adapter.write(jsonWriter, object.coordinates());
      }
      jsonWriter.endObject();
    }
    @Override
    @SuppressWarnings("unchecked")
    public Polygon read(JsonReader jsonReader) throws IOException {
      if (jsonReader.peek() == JsonToken.NULL) {
        jsonReader.nextNull();
        return null;
      }
      jsonReader.beginObject();
      String type = null;
      BoundingBox bbox = null;
      List<List<Point>> coordinates = null;
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
          case "coordinates": {
            TypeAdapter<List<List<Point>>> list__list__point_adapter = this.list__list__point_adapter;
            if (list__list__point_adapter == null) {
              this.list__list__point_adapter = list__list__point_adapter = (TypeAdapter<List<List<Point>>>) gson.getAdapter(TypeToken.getParameterized(List.class, TypeToken.getParameterized(List.class, Point.class).getType()));
            }
            coordinates = list__list__point_adapter.read(jsonReader);
            break;
          }
          default: {
            jsonReader.skipValue();
          }
        }
      }
      jsonReader.endObject();
      return new AutoValue_Polygon(type, bbox, coordinates);
    }
  }
}

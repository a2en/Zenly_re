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
final class AutoValue_FeatureCollection extends $AutoValue_FeatureCollection {
  AutoValue_FeatureCollection(String type, @Nullable BoundingBox bbox,
      @Nullable List<Feature> features) {
    super(type, bbox, features);
  }

  public static final class GsonTypeAdapter extends TypeAdapter<FeatureCollection> {
    private volatile TypeAdapter<String> string_adapter;
    private volatile TypeAdapter<BoundingBox> boundingBox_adapter;
    private volatile TypeAdapter<List<Feature>> list__feature_adapter;
    private final Gson gson;
    public GsonTypeAdapter(Gson gson) {
      this.gson = gson;
    }
    @Override
    @SuppressWarnings("unchecked")
    public void write(JsonWriter jsonWriter, FeatureCollection object) throws IOException {
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
      jsonWriter.name("features");
      if (object.features() == null) {
        jsonWriter.nullValue();
      } else {
        TypeAdapter<List<Feature>> list__feature_adapter = this.list__feature_adapter;
        if (list__feature_adapter == null) {
          this.list__feature_adapter = list__feature_adapter = (TypeAdapter<List<Feature>>) gson.getAdapter(TypeToken.getParameterized(List.class, Feature.class));
        }
        list__feature_adapter.write(jsonWriter, object.features());
      }
      jsonWriter.endObject();
    }
    @Override
    @SuppressWarnings("unchecked")
    public FeatureCollection read(JsonReader jsonReader) throws IOException {
      if (jsonReader.peek() == JsonToken.NULL) {
        jsonReader.nextNull();
        return null;
      }
      jsonReader.beginObject();
      String type = null;
      BoundingBox bbox = null;
      List<Feature> features = null;
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
          case "features": {
            TypeAdapter<List<Feature>> list__feature_adapter = this.list__feature_adapter;
            if (list__feature_adapter == null) {
              this.list__feature_adapter = list__feature_adapter = (TypeAdapter<List<Feature>>) gson.getAdapter(TypeToken.getParameterized(List.class, Feature.class));
            }
            features = list__feature_adapter.read(jsonReader);
            break;
          }
          default: {
            jsonReader.skipValue();
          }
        }
      }
      jsonReader.endObject();
      return new AutoValue_FeatureCollection(type, bbox, features);
    }
  }
}

/*
 * Twitter API v2
 * Twitter API v2 available endpoints
 *
 * The version of the OpenAPI document: 2.54
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * Place ID being attached to the Tweet for geo location.
 */
@ApiModel(description = "Place ID being attached to the Tweet for geo location.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TweetCreateRequestGeo {
  public static final String SERIALIZED_NAME_PLACE_ID = "place_id";
  @SerializedName(SERIALIZED_NAME_PLACE_ID)
  private String placeId;

  public TweetCreateRequestGeo() {
  }

  public TweetCreateRequestGeo placeId(String placeId) {
    
    this.placeId = placeId;
    return this;
  }

   /**
   * Get placeId
   * @return placeId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPlaceId() {
    return placeId;
  }


  public void setPlaceId(String placeId) {
    this.placeId = placeId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TweetCreateRequestGeo tweetCreateRequestGeo = (TweetCreateRequestGeo) o;
    return Objects.equals(this.placeId, tweetCreateRequestGeo.placeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(placeId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TweetCreateRequestGeo {\n");
    sb.append("    placeId: ").append(toIndentedString(placeId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("place_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TweetCreateRequestGeo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!TweetCreateRequestGeo.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TweetCreateRequestGeo is not found in the empty JSON string", TweetCreateRequestGeo.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TweetCreateRequestGeo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TweetCreateRequestGeo` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("place_id") != null && !jsonObj.get("place_id").isJsonNull()) && !jsonObj.get("place_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `place_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("place_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TweetCreateRequestGeo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TweetCreateRequestGeo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TweetCreateRequestGeo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TweetCreateRequestGeo.class));

       return (TypeAdapter<T>) new TypeAdapter<TweetCreateRequestGeo>() {
           @Override
           public void write(JsonWriter out, TweetCreateRequestGeo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TweetCreateRequestGeo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TweetCreateRequestGeo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TweetCreateRequestGeo
  * @throws IOException if the JSON string is invalid with respect to TweetCreateRequestGeo
  */
  public static TweetCreateRequestGeo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TweetCreateRequestGeo.class);
  }

 /**
  * Convert an instance of TweetCreateRequestGeo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


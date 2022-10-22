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
import java.util.ArrayList;
import java.util.List;

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
 * Media information being attached to created Tweet. This is mutually exclusive from Quote Tweet Id, Poll, and Card URI.
 */
@ApiModel(description = "Media information being attached to created Tweet. This is mutually exclusive from Quote Tweet Id, Poll, and Card URI.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TweetCreateRequestMedia {
  public static final String SERIALIZED_NAME_MEDIA_IDS = "media_ids";
  @SerializedName(SERIALIZED_NAME_MEDIA_IDS)
  private List<String> mediaIds = new ArrayList<>();

  public static final String SERIALIZED_NAME_TAGGED_USER_IDS = "tagged_user_ids";
  @SerializedName(SERIALIZED_NAME_TAGGED_USER_IDS)
  private List<String> taggedUserIds = null;

  public TweetCreateRequestMedia() {
  }

  public TweetCreateRequestMedia mediaIds(List<String> mediaIds) {
    
    this.mediaIds = mediaIds;
    return this;
  }

  public TweetCreateRequestMedia addMediaIdsItem(String mediaIdsItem) {
    this.mediaIds.add(mediaIdsItem);
    return this;
  }

   /**
   * A list of Media Ids to be attached to a created Tweet.
   * @return mediaIds
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A list of Media Ids to be attached to a created Tweet.")

  public List<String> getMediaIds() {
    return mediaIds;
  }


  public void setMediaIds(List<String> mediaIds) {
    this.mediaIds = mediaIds;
  }


  public TweetCreateRequestMedia taggedUserIds(List<String> taggedUserIds) {
    
    this.taggedUserIds = taggedUserIds;
    return this;
  }

  public TweetCreateRequestMedia addTaggedUserIdsItem(String taggedUserIdsItem) {
    if (this.taggedUserIds == null) {
      this.taggedUserIds = new ArrayList<>();
    }
    this.taggedUserIds.add(taggedUserIdsItem);
    return this;
  }

   /**
   * A list of User Ids to be tagged in the media for created Tweet.
   * @return taggedUserIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of User Ids to be tagged in the media for created Tweet.")

  public List<String> getTaggedUserIds() {
    return taggedUserIds;
  }


  public void setTaggedUserIds(List<String> taggedUserIds) {
    this.taggedUserIds = taggedUserIds;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TweetCreateRequestMedia tweetCreateRequestMedia = (TweetCreateRequestMedia) o;
    return Objects.equals(this.mediaIds, tweetCreateRequestMedia.mediaIds) &&
        Objects.equals(this.taggedUserIds, tweetCreateRequestMedia.taggedUserIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mediaIds, taggedUserIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TweetCreateRequestMedia {\n");
    sb.append("    mediaIds: ").append(toIndentedString(mediaIds)).append("\n");
    sb.append("    taggedUserIds: ").append(toIndentedString(taggedUserIds)).append("\n");
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
    openapiFields.add("media_ids");
    openapiFields.add("tagged_user_ids");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("media_ids");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TweetCreateRequestMedia
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!TweetCreateRequestMedia.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TweetCreateRequestMedia is not found in the empty JSON string", TweetCreateRequestMedia.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TweetCreateRequestMedia.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TweetCreateRequestMedia` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TweetCreateRequestMedia.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // ensure the json data is an array
      if ((jsonObj.get("media_ids") != null && !jsonObj.get("media_ids").isJsonNull()) && !jsonObj.get("media_ids").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `media_ids` to be an array in the JSON string but got `%s`", jsonObj.get("media_ids").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("tagged_user_ids").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `tagged_user_ids` to be an array in the JSON string but got `%s`", jsonObj.get("tagged_user_ids").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TweetCreateRequestMedia.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TweetCreateRequestMedia' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TweetCreateRequestMedia> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TweetCreateRequestMedia.class));

       return (TypeAdapter<T>) new TypeAdapter<TweetCreateRequestMedia>() {
           @Override
           public void write(JsonWriter out, TweetCreateRequestMedia value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TweetCreateRequestMedia read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TweetCreateRequestMedia given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TweetCreateRequestMedia
  * @throws IOException if the JSON string is invalid with respect to TweetCreateRequestMedia
  */
  public static TweetCreateRequestMedia fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TweetCreateRequestMedia.class);
  }

 /**
  * Convert an instance of TweetCreateRequestMedia to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


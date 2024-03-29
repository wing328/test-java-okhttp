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
import org.openapitools.client.model.TweetCreateRequestGeo;
import org.openapitools.client.model.TweetCreateRequestMedia;
import org.openapitools.client.model.TweetCreateRequestPoll;
import org.openapitools.client.model.TweetCreateRequestReply;

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
 * TweetCreateRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TweetCreateRequest {
  public static final String SERIALIZED_NAME_CARD_URI = "card_uri";
  @SerializedName(SERIALIZED_NAME_CARD_URI)
  private String cardUri;

  public static final String SERIALIZED_NAME_DIRECT_MESSAGE_DEEP_LINK = "direct_message_deep_link";
  @SerializedName(SERIALIZED_NAME_DIRECT_MESSAGE_DEEP_LINK)
  private String directMessageDeepLink;

  public static final String SERIALIZED_NAME_FOR_SUPER_FOLLOWERS_ONLY = "for_super_followers_only";
  @SerializedName(SERIALIZED_NAME_FOR_SUPER_FOLLOWERS_ONLY)
  private Boolean forSuperFollowersOnly = false;

  public static final String SERIALIZED_NAME_GEO = "geo";
  @SerializedName(SERIALIZED_NAME_GEO)
  private TweetCreateRequestGeo geo;

  public static final String SERIALIZED_NAME_MEDIA = "media";
  @SerializedName(SERIALIZED_NAME_MEDIA)
  private TweetCreateRequestMedia media;

  public static final String SERIALIZED_NAME_NULLCAST = "nullcast";
  @SerializedName(SERIALIZED_NAME_NULLCAST)
  private Boolean nullcast = false;

  public static final String SERIALIZED_NAME_POLL = "poll";
  @SerializedName(SERIALIZED_NAME_POLL)
  private TweetCreateRequestPoll poll;

  public static final String SERIALIZED_NAME_QUOTE_TWEET_ID = "quote_tweet_id";
  @SerializedName(SERIALIZED_NAME_QUOTE_TWEET_ID)
  private String quoteTweetId;

  public static final String SERIALIZED_NAME_REPLY = "reply";
  @SerializedName(SERIALIZED_NAME_REPLY)
  private TweetCreateRequestReply reply;

  /**
   * Settings to indicate who can reply to the Tweet.
   */
  @JsonAdapter(ReplySettingsEnum.Adapter.class)
  public enum ReplySettingsEnum {
    FOLLOWING("following"),
    
    MENTIONEDUSERS("mentionedUsers");

    private String value;

    ReplySettingsEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ReplySettingsEnum fromValue(String value) {
      for (ReplySettingsEnum b : ReplySettingsEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ReplySettingsEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ReplySettingsEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ReplySettingsEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ReplySettingsEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_REPLY_SETTINGS = "reply_settings";
  @SerializedName(SERIALIZED_NAME_REPLY_SETTINGS)
  private ReplySettingsEnum replySettings;

  public static final String SERIALIZED_NAME_TEXT = "text";
  @SerializedName(SERIALIZED_NAME_TEXT)
  private String text;

  public TweetCreateRequest() {
  }

  public TweetCreateRequest cardUri(String cardUri) {
    
    this.cardUri = cardUri;
    return this;
  }

   /**
   * Card Uri Parameter. This is mutually exclusive from Quote Tweet Id, Poll, Media, and Direct Message Deep Link.
   * @return cardUri
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Card Uri Parameter. This is mutually exclusive from Quote Tweet Id, Poll, Media, and Direct Message Deep Link.")

  public String getCardUri() {
    return cardUri;
  }


  public void setCardUri(String cardUri) {
    this.cardUri = cardUri;
  }


  public TweetCreateRequest directMessageDeepLink(String directMessageDeepLink) {
    
    this.directMessageDeepLink = directMessageDeepLink;
    return this;
  }

   /**
   * Link to take the conversation from the public timeline to a private Direct Message.
   * @return directMessageDeepLink
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Link to take the conversation from the public timeline to a private Direct Message.")

  public String getDirectMessageDeepLink() {
    return directMessageDeepLink;
  }


  public void setDirectMessageDeepLink(String directMessageDeepLink) {
    this.directMessageDeepLink = directMessageDeepLink;
  }


  public TweetCreateRequest forSuperFollowersOnly(Boolean forSuperFollowersOnly) {
    
    this.forSuperFollowersOnly = forSuperFollowersOnly;
    return this;
  }

   /**
   * Exclusive Tweet for super followers.
   * @return forSuperFollowersOnly
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Exclusive Tweet for super followers.")

  public Boolean getForSuperFollowersOnly() {
    return forSuperFollowersOnly;
  }


  public void setForSuperFollowersOnly(Boolean forSuperFollowersOnly) {
    this.forSuperFollowersOnly = forSuperFollowersOnly;
  }


  public TweetCreateRequest geo(TweetCreateRequestGeo geo) {
    
    this.geo = geo;
    return this;
  }

   /**
   * Get geo
   * @return geo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TweetCreateRequestGeo getGeo() {
    return geo;
  }


  public void setGeo(TweetCreateRequestGeo geo) {
    this.geo = geo;
  }


  public TweetCreateRequest media(TweetCreateRequestMedia media) {
    
    this.media = media;
    return this;
  }

   /**
   * Get media
   * @return media
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TweetCreateRequestMedia getMedia() {
    return media;
  }


  public void setMedia(TweetCreateRequestMedia media) {
    this.media = media;
  }


  public TweetCreateRequest nullcast(Boolean nullcast) {
    
    this.nullcast = nullcast;
    return this;
  }

   /**
   * Nullcasted (promoted-only) Tweets do not appear in the public timeline and are not served to followers.
   * @return nullcast
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Nullcasted (promoted-only) Tweets do not appear in the public timeline and are not served to followers.")

  public Boolean getNullcast() {
    return nullcast;
  }


  public void setNullcast(Boolean nullcast) {
    this.nullcast = nullcast;
  }


  public TweetCreateRequest poll(TweetCreateRequestPoll poll) {
    
    this.poll = poll;
    return this;
  }

   /**
   * Get poll
   * @return poll
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TweetCreateRequestPoll getPoll() {
    return poll;
  }


  public void setPoll(TweetCreateRequestPoll poll) {
    this.poll = poll;
  }


  public TweetCreateRequest quoteTweetId(String quoteTweetId) {
    
    this.quoteTweetId = quoteTweetId;
    return this;
  }

   /**
   * Unique identifier of this Tweet. This is returned as a string in order to avoid complications with languages and tools that cannot handle large integers.
   * @return quoteTweetId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1346889436626259968", value = "Unique identifier of this Tweet. This is returned as a string in order to avoid complications with languages and tools that cannot handle large integers.")

  public String getQuoteTweetId() {
    return quoteTweetId;
  }


  public void setQuoteTweetId(String quoteTweetId) {
    this.quoteTweetId = quoteTweetId;
  }


  public TweetCreateRequest reply(TweetCreateRequestReply reply) {
    
    this.reply = reply;
    return this;
  }

   /**
   * Get reply
   * @return reply
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TweetCreateRequestReply getReply() {
    return reply;
  }


  public void setReply(TweetCreateRequestReply reply) {
    this.reply = reply;
  }


  public TweetCreateRequest replySettings(ReplySettingsEnum replySettings) {
    
    this.replySettings = replySettings;
    return this;
  }

   /**
   * Settings to indicate who can reply to the Tweet.
   * @return replySettings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Settings to indicate who can reply to the Tweet.")

  public ReplySettingsEnum getReplySettings() {
    return replySettings;
  }


  public void setReplySettings(ReplySettingsEnum replySettings) {
    this.replySettings = replySettings;
  }


  public TweetCreateRequest text(String text) {
    
    this.text = text;
    return this;
  }

   /**
   * The content of the Tweet.
   * @return text
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Learn how to use the user Tweet timeline and user mention timeline endpoints in the Twitter API v2 to explore Tweet\\u2026 https://t.co/56a0vZUx7i", value = "The content of the Tweet.")

  public String getText() {
    return text;
  }


  public void setText(String text) {
    this.text = text;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TweetCreateRequest tweetCreateRequest = (TweetCreateRequest) o;
    return Objects.equals(this.cardUri, tweetCreateRequest.cardUri) &&
        Objects.equals(this.directMessageDeepLink, tweetCreateRequest.directMessageDeepLink) &&
        Objects.equals(this.forSuperFollowersOnly, tweetCreateRequest.forSuperFollowersOnly) &&
        Objects.equals(this.geo, tweetCreateRequest.geo) &&
        Objects.equals(this.media, tweetCreateRequest.media) &&
        Objects.equals(this.nullcast, tweetCreateRequest.nullcast) &&
        Objects.equals(this.poll, tweetCreateRequest.poll) &&
        Objects.equals(this.quoteTweetId, tweetCreateRequest.quoteTweetId) &&
        Objects.equals(this.reply, tweetCreateRequest.reply) &&
        Objects.equals(this.replySettings, tweetCreateRequest.replySettings) &&
        Objects.equals(this.text, tweetCreateRequest.text);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cardUri, directMessageDeepLink, forSuperFollowersOnly, geo, media, nullcast, poll, quoteTweetId, reply, replySettings, text);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TweetCreateRequest {\n");
    sb.append("    cardUri: ").append(toIndentedString(cardUri)).append("\n");
    sb.append("    directMessageDeepLink: ").append(toIndentedString(directMessageDeepLink)).append("\n");
    sb.append("    forSuperFollowersOnly: ").append(toIndentedString(forSuperFollowersOnly)).append("\n");
    sb.append("    geo: ").append(toIndentedString(geo)).append("\n");
    sb.append("    media: ").append(toIndentedString(media)).append("\n");
    sb.append("    nullcast: ").append(toIndentedString(nullcast)).append("\n");
    sb.append("    poll: ").append(toIndentedString(poll)).append("\n");
    sb.append("    quoteTweetId: ").append(toIndentedString(quoteTweetId)).append("\n");
    sb.append("    reply: ").append(toIndentedString(reply)).append("\n");
    sb.append("    replySettings: ").append(toIndentedString(replySettings)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
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
    openapiFields.add("card_uri");
    openapiFields.add("direct_message_deep_link");
    openapiFields.add("for_super_followers_only");
    openapiFields.add("geo");
    openapiFields.add("media");
    openapiFields.add("nullcast");
    openapiFields.add("poll");
    openapiFields.add("quote_tweet_id");
    openapiFields.add("reply");
    openapiFields.add("reply_settings");
    openapiFields.add("text");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TweetCreateRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!TweetCreateRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TweetCreateRequest is not found in the empty JSON string", TweetCreateRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TweetCreateRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TweetCreateRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("card_uri") != null && !jsonObj.get("card_uri").isJsonNull()) && !jsonObj.get("card_uri").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `card_uri` to be a primitive type in the JSON string but got `%s`", jsonObj.get("card_uri").toString()));
      }
      if ((jsonObj.get("direct_message_deep_link") != null && !jsonObj.get("direct_message_deep_link").isJsonNull()) && !jsonObj.get("direct_message_deep_link").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `direct_message_deep_link` to be a primitive type in the JSON string but got `%s`", jsonObj.get("direct_message_deep_link").toString()));
      }
      // validate the optional field `geo`
      if (jsonObj.get("geo") != null && !jsonObj.get("geo").isJsonNull()) {
        TweetCreateRequestGeo.validateJsonObject(jsonObj.getAsJsonObject("geo"));
      }
      // validate the optional field `media`
      if (jsonObj.get("media") != null && !jsonObj.get("media").isJsonNull()) {
        TweetCreateRequestMedia.validateJsonObject(jsonObj.getAsJsonObject("media"));
      }
      // validate the optional field `poll`
      if (jsonObj.get("poll") != null && !jsonObj.get("poll").isJsonNull()) {
        TweetCreateRequestPoll.validateJsonObject(jsonObj.getAsJsonObject("poll"));
      }
      if ((jsonObj.get("quote_tweet_id") != null && !jsonObj.get("quote_tweet_id").isJsonNull()) && !jsonObj.get("quote_tweet_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `quote_tweet_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("quote_tweet_id").toString()));
      }
      // validate the optional field `reply`
      if (jsonObj.get("reply") != null && !jsonObj.get("reply").isJsonNull()) {
        TweetCreateRequestReply.validateJsonObject(jsonObj.getAsJsonObject("reply"));
      }
      if ((jsonObj.get("reply_settings") != null && !jsonObj.get("reply_settings").isJsonNull()) && !jsonObj.get("reply_settings").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reply_settings` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reply_settings").toString()));
      }
      if ((jsonObj.get("text") != null && !jsonObj.get("text").isJsonNull()) && !jsonObj.get("text").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `text` to be a primitive type in the JSON string but got `%s`", jsonObj.get("text").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TweetCreateRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TweetCreateRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TweetCreateRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TweetCreateRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<TweetCreateRequest>() {
           @Override
           public void write(JsonWriter out, TweetCreateRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TweetCreateRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TweetCreateRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TweetCreateRequest
  * @throws IOException if the JSON string is invalid with respect to TweetCreateRequest
  */
  public static TweetCreateRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TweetCreateRequest.class);
  }

 /**
  * Convert an instance of TweetCreateRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


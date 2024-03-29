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
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Shows who can reply a Tweet. Fields returned are everyone, mentioned_users, and following.
 */
@JsonAdapter(ReplySettings.Adapter.class)
public enum ReplySettings {
  
  EVERYONE("everyone"),
  
  MENTIONEDUSERS("mentionedUsers"),
  
  FOLLOWING("following"),
  
  OTHER("other");

  private String value;

  ReplySettings(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ReplySettings fromValue(String value) {
    for (ReplySettings b : ReplySettings.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ReplySettings> {
    @Override
    public void write(final JsonWriter jsonWriter, final ReplySettings enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ReplySettings read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ReplySettings.fromValue(value);
    }
  }
}


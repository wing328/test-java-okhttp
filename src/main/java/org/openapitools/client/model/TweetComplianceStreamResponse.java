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
import org.openapitools.client.model.Problem;
import org.openapitools.client.model.TweetComplianceData;
import org.openapitools.client.model.TweetComplianceStreamResponseOneOf;
import org.openapitools.client.model.TweetComplianceStreamResponseOneOf1;

import javax.ws.rs.core.GenericType;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.JsonPrimitive;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

import org.openapitools.client.JSON;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TweetComplianceStreamResponse extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(TweetComplianceStreamResponse.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!TweetComplianceStreamResponse.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'TweetComplianceStreamResponse' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<TweetComplianceStreamResponseOneOf> adapterTweetComplianceStreamResponseOneOf = gson.getDelegateAdapter(this, TypeToken.get(TweetComplianceStreamResponseOneOf.class));
            final TypeAdapter<TweetComplianceStreamResponseOneOf1> adapterTweetComplianceStreamResponseOneOf1 = gson.getDelegateAdapter(this, TypeToken.get(TweetComplianceStreamResponseOneOf1.class));

            return (TypeAdapter<T>) new TypeAdapter<TweetComplianceStreamResponse>() {
                @Override
                public void write(JsonWriter out, TweetComplianceStreamResponse value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `TweetComplianceStreamResponseOneOf`
                    if (value.getActualInstance() instanceof TweetComplianceStreamResponseOneOf) {
                        JsonObject obj = adapterTweetComplianceStreamResponseOneOf.toJsonTree((TweetComplianceStreamResponseOneOf)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `TweetComplianceStreamResponseOneOf1`
                    if (value.getActualInstance() instanceof TweetComplianceStreamResponseOneOf1) {
                        JsonObject obj = adapterTweetComplianceStreamResponseOneOf1.toJsonTree((TweetComplianceStreamResponseOneOf1)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: TweetComplianceStreamResponseOneOf, TweetComplianceStreamResponseOneOf1");
                }

                @Override
                public TweetComplianceStreamResponse read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonObject jsonObject = elementAdapter.read(in).getAsJsonObject();

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize TweetComplianceStreamResponseOneOf
                    try {
                        // validate the JSON object to see if any exception is thrown
                        TweetComplianceStreamResponseOneOf.validateJsonObject(jsonObject);
                        actualAdapter = adapterTweetComplianceStreamResponseOneOf;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'TweetComplianceStreamResponseOneOf'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for TweetComplianceStreamResponseOneOf failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'TweetComplianceStreamResponseOneOf'", e);
                    }

                    // deserialize TweetComplianceStreamResponseOneOf1
                    try {
                        // validate the JSON object to see if any exception is thrown
                        TweetComplianceStreamResponseOneOf1.validateJsonObject(jsonObject);
                        actualAdapter = adapterTweetComplianceStreamResponseOneOf1;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'TweetComplianceStreamResponseOneOf1'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for TweetComplianceStreamResponseOneOf1 failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'TweetComplianceStreamResponseOneOf1'", e);
                    }

                    if (match == 1) {
                        TweetComplianceStreamResponse ret = new TweetComplianceStreamResponse();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonObject));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for TweetComplianceStreamResponse: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonObject.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public TweetComplianceStreamResponse() {
        super("oneOf", Boolean.FALSE);
    }

    public TweetComplianceStreamResponse(TweetComplianceStreamResponseOneOf o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public TweetComplianceStreamResponse(TweetComplianceStreamResponseOneOf1 o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("TweetComplianceStreamResponseOneOf", new GenericType<TweetComplianceStreamResponseOneOf>() {
        });
        schemas.put("TweetComplianceStreamResponseOneOf1", new GenericType<TweetComplianceStreamResponseOneOf1>() {
        });
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return TweetComplianceStreamResponse.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * TweetComplianceStreamResponseOneOf, TweetComplianceStreamResponseOneOf1
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof TweetComplianceStreamResponseOneOf) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof TweetComplianceStreamResponseOneOf1) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be TweetComplianceStreamResponseOneOf, TweetComplianceStreamResponseOneOf1");
    }

    /**
     * Get the actual instance, which can be the following:
     * TweetComplianceStreamResponseOneOf, TweetComplianceStreamResponseOneOf1
     *
     * @return The actual instance (TweetComplianceStreamResponseOneOf, TweetComplianceStreamResponseOneOf1)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `TweetComplianceStreamResponseOneOf`. If the actual instance is not `TweetComplianceStreamResponseOneOf`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `TweetComplianceStreamResponseOneOf`
     * @throws ClassCastException if the instance is not `TweetComplianceStreamResponseOneOf`
     */
    public TweetComplianceStreamResponseOneOf getTweetComplianceStreamResponseOneOf() throws ClassCastException {
        return (TweetComplianceStreamResponseOneOf)super.getActualInstance();
    }

    /**
     * Get the actual instance of `TweetComplianceStreamResponseOneOf1`. If the actual instance is not `TweetComplianceStreamResponseOneOf1`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `TweetComplianceStreamResponseOneOf1`
     * @throws ClassCastException if the instance is not `TweetComplianceStreamResponseOneOf1`
     */
    public TweetComplianceStreamResponseOneOf1 getTweetComplianceStreamResponseOneOf1() throws ClassCastException {
        return (TweetComplianceStreamResponseOneOf1)super.getActualInstance();
    }


 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TweetComplianceStreamResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
    // validate oneOf schemas one by one
    int validCount = 0;
    ArrayList<String> errorMessages = new ArrayList<>();
    // validate the json string with TweetComplianceStreamResponseOneOf
    try {
      TweetComplianceStreamResponseOneOf.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for TweetComplianceStreamResponseOneOf failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with TweetComplianceStreamResponseOneOf1
    try {
      TweetComplianceStreamResponseOneOf1.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for TweetComplianceStreamResponseOneOf1 failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    if (validCount != 1) {
      throw new IOException(String.format("The JSON string is invalid for TweetComplianceStreamResponse with oneOf schemas: TweetComplianceStreamResponseOneOf, TweetComplianceStreamResponseOneOf1. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonObj.toString()));
    }
  }

 /**
  * Create an instance of TweetComplianceStreamResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TweetComplianceStreamResponse
  * @throws IOException if the JSON string is invalid with respect to TweetComplianceStreamResponse
  */
  public static TweetComplianceStreamResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TweetComplianceStreamResponse.class);
  }

 /**
  * Convert an instance of TweetComplianceStreamResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


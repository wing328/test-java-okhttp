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
 * Represents the data for the annotation.
 */
@ApiModel(description = "Represents the data for the annotation.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class FullTextEntitiesAnnotationsInnerAllOf {
  public static final String SERIALIZED_NAME_NORMALIZED_TEXT = "normalized_text";
  @SerializedName(SERIALIZED_NAME_NORMALIZED_TEXT)
  private String normalizedText;

  public static final String SERIALIZED_NAME_PROBABILITY = "probability";
  @SerializedName(SERIALIZED_NAME_PROBABILITY)
  private Double probability;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public FullTextEntitiesAnnotationsInnerAllOf() {
  }

  public FullTextEntitiesAnnotationsInnerAllOf normalizedText(String normalizedText) {
    
    this.normalizedText = normalizedText;
    return this;
  }

   /**
   * Text used to determine annotation.
   * @return normalizedText
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Barack Obama", value = "Text used to determine annotation.")

  public String getNormalizedText() {
    return normalizedText;
  }


  public void setNormalizedText(String normalizedText) {
    this.normalizedText = normalizedText;
  }


  public FullTextEntitiesAnnotationsInnerAllOf probability(Double probability) {
    
    this.probability = probability;
    return this;
  }

   /**
   * Confidence factor for annotation type.
   * minimum: 0
   * maximum: 1
   * @return probability
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Confidence factor for annotation type.")

  public Double getProbability() {
    return probability;
  }


  public void setProbability(Double probability) {
    this.probability = probability;
  }


  public FullTextEntitiesAnnotationsInnerAllOf type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Annotation type.
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Person", value = "Annotation type.")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   */
  public FullTextEntitiesAnnotationsInnerAllOf putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FullTextEntitiesAnnotationsInnerAllOf fullTextEntitiesAnnotationsInnerAllOf = (FullTextEntitiesAnnotationsInnerAllOf) o;
    return Objects.equals(this.normalizedText, fullTextEntitiesAnnotationsInnerAllOf.normalizedText) &&
        Objects.equals(this.probability, fullTextEntitiesAnnotationsInnerAllOf.probability) &&
        Objects.equals(this.type, fullTextEntitiesAnnotationsInnerAllOf.type)&&
        Objects.equals(this.additionalProperties, fullTextEntitiesAnnotationsInnerAllOf.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(normalizedText, probability, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FullTextEntitiesAnnotationsInnerAllOf {\n");
    sb.append("    normalizedText: ").append(toIndentedString(normalizedText)).append("\n");
    sb.append("    probability: ").append(toIndentedString(probability)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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
    openapiFields.add("normalized_text");
    openapiFields.add("probability");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to FullTextEntitiesAnnotationsInnerAllOf
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!FullTextEntitiesAnnotationsInnerAllOf.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in FullTextEntitiesAnnotationsInnerAllOf is not found in the empty JSON string", FullTextEntitiesAnnotationsInnerAllOf.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("normalized_text") != null && !jsonObj.get("normalized_text").isJsonNull()) && !jsonObj.get("normalized_text").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `normalized_text` to be a primitive type in the JSON string but got `%s`", jsonObj.get("normalized_text").toString()));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FullTextEntitiesAnnotationsInnerAllOf.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FullTextEntitiesAnnotationsInnerAllOf' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FullTextEntitiesAnnotationsInnerAllOf> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FullTextEntitiesAnnotationsInnerAllOf.class));

       return (TypeAdapter<T>) new TypeAdapter<FullTextEntitiesAnnotationsInnerAllOf>() {
           @Override
           public void write(JsonWriter out, FullTextEntitiesAnnotationsInnerAllOf value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public FullTextEntitiesAnnotationsInnerAllOf read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             FullTextEntitiesAnnotationsInnerAllOf instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FullTextEntitiesAnnotationsInnerAllOf given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FullTextEntitiesAnnotationsInnerAllOf
  * @throws IOException if the JSON string is invalid with respect to FullTextEntitiesAnnotationsInnerAllOf
  */
  public static FullTextEntitiesAnnotationsInnerAllOf fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FullTextEntitiesAnnotationsInnerAllOf.class);
  }

 /**
  * Convert an instance of FullTextEntitiesAnnotationsInnerAllOf to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


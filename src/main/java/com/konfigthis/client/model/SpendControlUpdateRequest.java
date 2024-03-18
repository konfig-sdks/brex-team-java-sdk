/*
 * Team API
 *  The team API lets you manage users, departments, locations, and cards. 
 *
 * The version of the OpenAPI document: 1.0
 * Contact: developer-access@brex.com
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.konfigthis.client.model.SetUserLimitRequestMonthlyLimit;
import com.konfigthis.client.model.SpendDuration;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.LocalDate;
import org.openapitools.jackson.nullable.JsonNullable;

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
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.konfigthis.client.JSON;

/**
 * SpendControlUpdateRequest
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class SpendControlUpdateRequest {
  public static final String SERIALIZED_NAME_SPEND_LIMIT = "spend_limit";
  @SerializedName(SERIALIZED_NAME_SPEND_LIMIT)
  private SetUserLimitRequestMonthlyLimit spendLimit;

  public static final String SERIALIZED_NAME_SPEND_DURATION = "spend_duration";
  @SerializedName(SERIALIZED_NAME_SPEND_DURATION)
  private SpendDuration spendDuration;

  public static final String SERIALIZED_NAME_REASON = "reason";
  @SerializedName(SERIALIZED_NAME_REASON)
  private String reason;

  public static final String SERIALIZED_NAME_LOCK_AFTER_DATE = "lock_after_date";
  @SerializedName(SERIALIZED_NAME_LOCK_AFTER_DATE)
  private LocalDate lockAfterDate;

  public SpendControlUpdateRequest() {
  }

  public SpendControlUpdateRequest spendLimit(SetUserLimitRequestMonthlyLimit spendLimit) {
    
    
    
    
    this.spendLimit = spendLimit;
    return this;
  }

   /**
   * Get spendLimit
   * @return spendLimit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SetUserLimitRequestMonthlyLimit getSpendLimit() {
    return spendLimit;
  }


  public void setSpendLimit(SetUserLimitRequestMonthlyLimit spendLimit) {
    
    
    
    this.spendLimit = spendLimit;
  }


  public SpendControlUpdateRequest spendDuration(SpendDuration spendDuration) {
    
    
    
    
    this.spendDuration = spendDuration;
    return this;
  }

   /**
   * Get spendDuration
   * @return spendDuration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SpendDuration getSpendDuration() {
    return spendDuration;
  }


  public void setSpendDuration(SpendDuration spendDuration) {
    
    
    
    this.spendDuration = spendDuration;
  }


  public SpendControlUpdateRequest reason(String reason) {
    
    
    
    
    this.reason = reason;
    return this;
  }

   /**
   * Get reason
   * @return reason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getReason() {
    return reason;
  }


  public void setReason(String reason) {
    
    
    
    this.reason = reason;
  }


  public SpendControlUpdateRequest lockAfterDate(LocalDate lockAfterDate) {
    
    
    
    
    this.lockAfterDate = lockAfterDate;
    return this;
  }

   /**
   * Get lockAfterDate
   * @return lockAfterDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LocalDate getLockAfterDate() {
    return lockAfterDate;
  }


  public void setLockAfterDate(LocalDate lockAfterDate) {
    
    
    
    this.lockAfterDate = lockAfterDate;
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
   *
   * @param key name of the property
   * @param value value of the property
   * @return the SpendControlUpdateRequest instance itself
   */
  public SpendControlUpdateRequest putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
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
    SpendControlUpdateRequest spendControlUpdateRequest = (SpendControlUpdateRequest) o;
    return Objects.equals(this.spendLimit, spendControlUpdateRequest.spendLimit) &&
        Objects.equals(this.spendDuration, spendControlUpdateRequest.spendDuration) &&
        Objects.equals(this.reason, spendControlUpdateRequest.reason) &&
        Objects.equals(this.lockAfterDate, spendControlUpdateRequest.lockAfterDate)&&
        Objects.equals(this.additionalProperties, spendControlUpdateRequest.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(spendLimit, spendDuration, reason, lockAfterDate, additionalProperties);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpendControlUpdateRequest {\n");
    sb.append("    spendLimit: ").append(toIndentedString(spendLimit)).append("\n");
    sb.append("    spendDuration: ").append(toIndentedString(spendDuration)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    lockAfterDate: ").append(toIndentedString(lockAfterDate)).append("\n");
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
    openapiFields.add("spend_limit");
    openapiFields.add("spend_duration");
    openapiFields.add("reason");
    openapiFields.add("lock_after_date");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SpendControlUpdateRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!SpendControlUpdateRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SpendControlUpdateRequest is not found in the empty JSON string", SpendControlUpdateRequest.openapiRequiredFields.toString()));
        }
      }
      // validate the optional field `spend_limit`
      if (jsonObj.get("spend_limit") != null && !jsonObj.get("spend_limit").isJsonNull()) {
        SetUserLimitRequestMonthlyLimit.validateJsonObject(jsonObj.getAsJsonObject("spend_limit"));
      }
      // validate the optional field `spend_duration`
      if (jsonObj.get("spend_duration") != null && !jsonObj.get("spend_duration").isJsonNull()) {
        SpendDuration.validateJsonObject(jsonObj.getAsJsonObject("spend_duration"));
      }
      if (!jsonObj.get("reason").isJsonNull() && (jsonObj.get("reason") != null && !jsonObj.get("reason").isJsonNull()) && !jsonObj.get("reason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reason").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SpendControlUpdateRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SpendControlUpdateRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SpendControlUpdateRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SpendControlUpdateRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<SpendControlUpdateRequest>() {
           @Override
           public void write(JsonWriter out, SpendControlUpdateRequest value) throws IOException {
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
           public SpendControlUpdateRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             SpendControlUpdateRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of SpendControlUpdateRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SpendControlUpdateRequest
  * @throws IOException if the JSON string is invalid with respect to SpendControlUpdateRequest
  */
  public static SpendControlUpdateRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SpendControlUpdateRequest.class);
  }

 /**
  * Convert an instance of SpendControlUpdateRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


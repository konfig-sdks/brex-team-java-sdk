# CardsApi

All URIs are relative to *https://platform.brexapis.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createNewCard**](CardsApi.md#createNewCard) | **POST** /v2/cards |  Create card  |
| [**createSecureEmail**](CardsApi.md#createSecureEmail) | **POST** /v2/cards/{id}/secure_email |  Create secure email to send card number   |
| [**getById**](CardsApi.md#getById) | **GET** /v2/cards/{id} |  Get card  |
| [**getCardDetails**](CardsApi.md#getCardDetails) | **GET** /v2/cards/{id}/pan |  Get card number  |
| [**listByUserId**](CardsApi.md#listByUserId) | **GET** /v2/cards |  List cards  |
| [**lockCard**](CardsApi.md#lockCard) | **POST** /v2/cards/{id}/lock |  Lock card  |
| [**terminateExistingCard**](CardsApi.md#terminateExistingCard) | **POST** /v2/cards/{id}/terminate |  Terminate card  |
| [**unlockExistingCard**](CardsApi.md#unlockExistingCard) | **POST** /v2/cards/{id}/unlock |  Unlock card  |
| [**updateCard**](CardsApi.md#updateCard) | **PUT** /v2/cards/{id} |  Update card  |


<a name="createNewCard"></a>
# **createNewCard**
> Card createNewCard(idempotencyKey, createCardRequest).execute();

 Create card 

 Creates a new card. The &#x60;spend_controls&#x60; field is required when &#x60;limit_type&#x60; &#x3D; &#x60;CARD&#x60;. The &#x60;mailing_address&#x60; field is required for physical cards and is the shipping address used to send the card; it is not the same as the billing and mailing address used for online purchases. The first 2 lines of this address must be under 60 characters long. Each user can only have up to 10 active physical cards. For Empower accounts, this endpoint requires budget management. If your account does not have access to budget management features, a 403 response status will be returned.  If this is the case and you want to gain access to this endpoint, please contact Brex support. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BrexTeam;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CardsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://platform.brexapis.com";
    
    // Configure OAuth2 access token for authorization: OAuth2
    configuration.accessToken = "YOUR ACCESS TOKEN";
    BrexTeam client = new BrexTeam(configuration);
    Object owner = null;
    String cardName = "cardName_example";
    CardType cardType = CardType.fromValue("VIRTUAL");
    LimitType limitType = LimitType.fromValue("CARD");
    String idempotencyKey = "idempotencyKey_example";
    CreateCardRequestSpendControls spendControls = new CreateCardRequestSpendControls();
    CardMailingAddress mailingAddress = new CardMailingAddress();
    Map<String, String> metadata = new HashMap(); //  Set of key value pairs associated with this object. Please do not store any personally identifiable or sensitive information here. Limitations: maximum of 50 keys, keys cannot exceed 40 characters, values cannot exceed 500 characters.  
    CreateCardRequestCardAttributePreferences cardAttributePreferences = new CreateCardRequestCardAttributePreferences();
    try {
      Card result = client
              .cards
              .createNewCard(owner, cardName, cardType, limitType, idempotencyKey)
              .spendControls(spendControls)
              .mailingAddress(mailingAddress)
              .metadata(metadata)
              .cardAttributePreferences(cardAttributePreferences)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getOwner());
      System.out.println(result.getStatus());
      System.out.println(result.getLastFour());
      System.out.println(result.getCardName());
      System.out.println(result.getCardType());
      System.out.println(result.getLimitType());
      System.out.println(result.getSpendControls());
      System.out.println(result.getBillingAddress());
      System.out.println(result.getMailingAddress());
      System.out.println(result.getExpirationDate());
      System.out.println(result.getMetadata());
    } catch (ApiException e) {
      System.err.println("Exception when calling CardsApi#createNewCard");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Card> response = client
              .cards
              .createNewCard(owner, cardName, cardType, limitType, idempotencyKey)
              .spendControls(spendControls)
              .mailingAddress(mailingAddress)
              .metadata(metadata)
              .cardAttributePreferences(cardAttributePreferences)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CardsApi#createNewCard");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **idempotencyKey** | **String**|  | |
| **createCardRequest** | [**CreateCardRequest**](CreateCardRequest.md)|  | |

### Return type

[**Card**](Card.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | createCard 200 response |  -  |

<a name="createSecureEmail"></a>
# **createSecureEmail**
> createSecureEmail(id, idempotencyKey, secureEmailForCardDetailsRequest).execute();

 Create secure email to send card number  

 Creates a secure email to send card number, CVV, and expiration date of a card by ID to the specified email.  This endpoint is currently gated. If you would like to request access, please reach out to developer-access@brex.com 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BrexTeam;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CardsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://platform.brexapis.com";
    
    // Configure OAuth2 access token for authorization: OAuth2
    configuration.accessToken = "YOUR ACCESS TOKEN";
    BrexTeam client = new BrexTeam(configuration);
    String id = "id_example";
    String idempotencyKey = "idempotencyKey_example";
    String recipientEmail = "recipientEmail_example"; // Email address to send card details to
    String senderName = "senderName_example"; // Sender name. Shows up in the subject of the email
    String message = "message_example"; // Message to send with the card details
    Integer expiryDays = 56; // Link expiry in number of days. Defaults to 30
    try {
      client
              .cards
              .createSecureEmail(id, idempotencyKey)
              .recipientEmail(recipientEmail)
              .senderName(senderName)
              .message(message)
              .expiryDays(expiryDays)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling CardsApi#createSecureEmail");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .cards
              .createSecureEmail(id, idempotencyKey)
              .recipientEmail(recipientEmail)
              .senderName(senderName)
              .message(message)
              .expiryDays(expiryDays)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling CardsApi#createSecureEmail");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**|  | |
| **idempotencyKey** | **String**|  | |
| **secureEmailForCardDetailsRequest** | [**SecureEmailForCardDetailsRequest**](SecureEmailForCardDetailsRequest.md)|  | |

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | emailCardNumber 200 response |  -  |

<a name="getById"></a>
# **getById**
> Card getById(id).execute();

 Get card 

 Retrieves a card by ID. Only cards with &#x60;limit_type &#x3D; CARD&#x60; have &#x60;spend_controls&#x60; 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BrexTeam;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CardsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://platform.brexapis.com";
    
    // Configure OAuth2 access token for authorization: OAuth2
    configuration.accessToken = "YOUR ACCESS TOKEN";
    BrexTeam client = new BrexTeam(configuration);
    String id = "id_example";
    try {
      Card result = client
              .cards
              .getById(id)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getOwner());
      System.out.println(result.getStatus());
      System.out.println(result.getLastFour());
      System.out.println(result.getCardName());
      System.out.println(result.getCardType());
      System.out.println(result.getLimitType());
      System.out.println(result.getSpendControls());
      System.out.println(result.getBillingAddress());
      System.out.println(result.getMailingAddress());
      System.out.println(result.getExpirationDate());
      System.out.println(result.getMetadata());
    } catch (ApiException e) {
      System.err.println("Exception when calling CardsApi#getById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Card> response = client
              .cards
              .getById(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CardsApi#getById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**|  | |

### Return type

[**Card**](Card.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | getCardById 200 response |  -  |

<a name="getCardDetails"></a>
# **getCardDetails**
> CardNumberResponse getCardDetails(id).execute();

 Get card number 

 Retrieves card number, CVV, and expiration date of a card by ID. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BrexTeam;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CardsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://platform.brexapis.com";
    
    // Configure OAuth2 access token for authorization: OAuth2
    configuration.accessToken = "YOUR ACCESS TOKEN";
    BrexTeam client = new BrexTeam(configuration);
    String id = "id_example";
    try {
      CardNumberResponse result = client
              .cards
              .getCardDetails(id)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getNumber());
      System.out.println(result.getCvv());
      System.out.println(result.getExpirationDate());
    } catch (ApiException e) {
      System.err.println("Exception when calling CardsApi#getCardDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CardNumberResponse> response = client
              .cards
              .getCardDetails(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CardsApi#getCardDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**|  | |

### Return type

[**CardNumberResponse**](CardNumberResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | getCardNumber 200 response |  -  |

<a name="listByUserId"></a>
# **listByUserId**
> PageCard listByUserId().userId(userId).cursor(cursor).limit(limit).execute();

 List cards 

 Lists all cards by a &#x60;user_id&#x60;. Only cards with &#x60;limit_type &#x3D; CARD&#x60; have &#x60;spend_controls&#x60; 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BrexTeam;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CardsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://platform.brexapis.com";
    
    // Configure OAuth2 access token for authorization: OAuth2
    configuration.accessToken = "YOUR ACCESS TOKEN";
    BrexTeam client = new BrexTeam(configuration);
    String userId = "userId_example";
    String cursor = "cursor_example";
    Integer limit = 56;
    try {
      PageCard result = client
              .cards
              .listByUserId()
              .userId(userId)
              .cursor(cursor)
              .limit(limit)
              .execute();
      System.out.println(result);
      System.out.println(result.getNextCursor());
      System.out.println(result.getItems());
    } catch (ApiException e) {
      System.err.println("Exception when calling CardsApi#listByUserId");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PageCard> response = client
              .cards
              .listByUserId()
              .userId(userId)
              .cursor(cursor)
              .limit(limit)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CardsApi#listByUserId");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **userId** | **String**|  | [optional] |
| **cursor** | **String**|  | [optional] |
| **limit** | **Integer**|  | [optional] |

### Return type

[**PageCard**](PageCard.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | listCardsByUserId 200 response |  -  |

<a name="lockCard"></a>
# **lockCard**
> Card lockCard(id, lockCardRequest).idempotencyKey(idempotencyKey).execute();

 Lock card 

 Locks an existing, unlocked card. And the card owner will receive a notification about it. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BrexTeam;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CardsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://platform.brexapis.com";
    
    // Configure OAuth2 access token for authorization: OAuth2
    configuration.accessToken = "YOUR ACCESS TOKEN";
    BrexTeam client = new BrexTeam(configuration);
    ChangeCardReason reason = ChangeCardReason.fromValue("CARD_DAMAGED");
    String id = "id_example";
    String description = "description_example"; // Description for locking a card
    String idempotencyKey = "idempotencyKey_example";
    try {
      Card result = client
              .cards
              .lockCard(reason, id)
              .description(description)
              .idempotencyKey(idempotencyKey)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getOwner());
      System.out.println(result.getStatus());
      System.out.println(result.getLastFour());
      System.out.println(result.getCardName());
      System.out.println(result.getCardType());
      System.out.println(result.getLimitType());
      System.out.println(result.getSpendControls());
      System.out.println(result.getBillingAddress());
      System.out.println(result.getMailingAddress());
      System.out.println(result.getExpirationDate());
      System.out.println(result.getMetadata());
    } catch (ApiException e) {
      System.err.println("Exception when calling CardsApi#lockCard");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Card> response = client
              .cards
              .lockCard(reason, id)
              .description(description)
              .idempotencyKey(idempotencyKey)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CardsApi#lockCard");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**|  | |
| **lockCardRequest** | [**LockCardRequest**](LockCardRequest.md)|  | |
| **idempotencyKey** | **String**|  | [optional] |

### Return type

[**Card**](Card.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | lockCard 200 response |  -  |

<a name="terminateExistingCard"></a>
# **terminateExistingCard**
> Card terminateExistingCard(id, terminateCardRequest).idempotencyKey(idempotencyKey).execute();

 Terminate card 

 Terminates an existing card. The card owner will receive a notification about it. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BrexTeam;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CardsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://platform.brexapis.com";
    
    // Configure OAuth2 access token for authorization: OAuth2
    configuration.accessToken = "YOUR ACCESS TOKEN";
    BrexTeam client = new BrexTeam(configuration);
    ChangeCardReason reason = ChangeCardReason.fromValue("CARD_DAMAGED");
    String id = "id_example";
    String description = "description_example"; // Description for terminating a card
    String idempotencyKey = "idempotencyKey_example";
    try {
      Card result = client
              .cards
              .terminateExistingCard(reason, id)
              .description(description)
              .idempotencyKey(idempotencyKey)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getOwner());
      System.out.println(result.getStatus());
      System.out.println(result.getLastFour());
      System.out.println(result.getCardName());
      System.out.println(result.getCardType());
      System.out.println(result.getLimitType());
      System.out.println(result.getSpendControls());
      System.out.println(result.getBillingAddress());
      System.out.println(result.getMailingAddress());
      System.out.println(result.getExpirationDate());
      System.out.println(result.getMetadata());
    } catch (ApiException e) {
      System.err.println("Exception when calling CardsApi#terminateExistingCard");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Card> response = client
              .cards
              .terminateExistingCard(reason, id)
              .description(description)
              .idempotencyKey(idempotencyKey)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CardsApi#terminateExistingCard");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**|  | |
| **terminateCardRequest** | [**TerminateCardRequest**](TerminateCardRequest.md)|  | |
| **idempotencyKey** | **String**|  | [optional] |

### Return type

[**Card**](Card.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | terminateCard 200 response |  -  |

<a name="unlockExistingCard"></a>
# **unlockExistingCard**
> Card unlockExistingCard(id).idempotencyKey(idempotencyKey).execute();

 Unlock card 

 Unlocks an existing card. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BrexTeam;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CardsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://platform.brexapis.com";
    
    // Configure OAuth2 access token for authorization: OAuth2
    configuration.accessToken = "YOUR ACCESS TOKEN";
    BrexTeam client = new BrexTeam(configuration);
    String id = "id_example";
    String idempotencyKey = "idempotencyKey_example";
    try {
      Card result = client
              .cards
              .unlockExistingCard(id)
              .idempotencyKey(idempotencyKey)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getOwner());
      System.out.println(result.getStatus());
      System.out.println(result.getLastFour());
      System.out.println(result.getCardName());
      System.out.println(result.getCardType());
      System.out.println(result.getLimitType());
      System.out.println(result.getSpendControls());
      System.out.println(result.getBillingAddress());
      System.out.println(result.getMailingAddress());
      System.out.println(result.getExpirationDate());
      System.out.println(result.getMetadata());
    } catch (ApiException e) {
      System.err.println("Exception when calling CardsApi#unlockExistingCard");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Card> response = client
              .cards
              .unlockExistingCard(id)
              .idempotencyKey(idempotencyKey)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CardsApi#unlockExistingCard");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**|  | |
| **idempotencyKey** | **String**|  | [optional] |

### Return type

[**Card**](Card.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | unlockCard 200 response |  -  |

<a name="updateCard"></a>
# **updateCard**
> Card updateCard(id, updateCardRequest).idempotencyKey(idempotencyKey).execute();

 Update card 

 Update an existing vendor card 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BrexTeam;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CardsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://platform.brexapis.com";
    
    // Configure OAuth2 access token for authorization: OAuth2
    configuration.accessToken = "YOUR ACCESS TOKEN";
    BrexTeam client = new BrexTeam(configuration);
    String id = "id_example";
    UpdateCardRequestSpendControls spendControls = new UpdateCardRequestSpendControls();
    Map<String, String> metadata = new HashMap(); //  Set of key value pairs associated with this object. Please do not store any personally identifiable or sensitive information here. Limitations: maximum of 50 keys, keys cannot exceed 40 characters, values cannot exceed 500 characters.  
    String idempotencyKey = "idempotencyKey_example";
    try {
      Card result = client
              .cards
              .updateCard(id)
              .spendControls(spendControls)
              .metadata(metadata)
              .idempotencyKey(idempotencyKey)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getOwner());
      System.out.println(result.getStatus());
      System.out.println(result.getLastFour());
      System.out.println(result.getCardName());
      System.out.println(result.getCardType());
      System.out.println(result.getLimitType());
      System.out.println(result.getSpendControls());
      System.out.println(result.getBillingAddress());
      System.out.println(result.getMailingAddress());
      System.out.println(result.getExpirationDate());
      System.out.println(result.getMetadata());
    } catch (ApiException e) {
      System.err.println("Exception when calling CardsApi#updateCard");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Card> response = client
              .cards
              .updateCard(id)
              .spendControls(spendControls)
              .metadata(metadata)
              .idempotencyKey(idempotencyKey)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CardsApi#updateCard");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**|  | |
| **updateCardRequest** | [**UpdateCardRequest**](UpdateCardRequest.md)|  | |
| **idempotencyKey** | **String**|  | [optional] |

### Return type

[**Card**](Card.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | updateCard 200 response |  -  |


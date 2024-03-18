# UsersApi

All URIs are relative to *https://platform.brexapis.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getCurrentUser**](UsersApi.md#getCurrentUser) | **GET** /v2/users/me |  Get current user  |
| [**getMonthlyLimit**](UsersApi.md#getMonthlyLimit) | **GET** /v2/users/{id}/limit |  Get limit for the user  |
| [**getUserById**](UsersApi.md#getUserById) | **GET** /v2/users/{id} |  Get user  |
| [**inviteNewEmployee**](UsersApi.md#inviteNewEmployee) | **POST** /v2/users |  Invite user  |
| [**listUsers**](UsersApi.md#listUsers) | **GET** /v2/users |  List users  |
| [**setMonthlyLimit**](UsersApi.md#setMonthlyLimit) | **POST** /v2/users/{id}/limit |  Set limit for the user  |
| [**updateUser**](UsersApi.md#updateUser) | **PUT** /v2/users/{id} |  Update user  |


<a name="getCurrentUser"></a>
# **getCurrentUser**
> UserResponse getCurrentUser().execute();

 Get current user 

 This endpoint returns the user associated with the OAuth2 access token. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BrexTeam;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UsersApi;
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
    try {
      UserResponse result = client
              .users
              .getCurrentUser()
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getFirstName());
      System.out.println(result.getLastName());
      System.out.println(result.getEmail());
      System.out.println(result.getStatus());
      System.out.println(result.getManagerId());
      System.out.println(result.getDepartmentId());
      System.out.println(result.getLocationId());
      System.out.println(result.getTitleId());
      System.out.println(result.getMetadata());
      System.out.println(result.getRemoteDisplayId());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#getCurrentUser");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<UserResponse> response = client
              .users
              .getCurrentUser()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#getCurrentUser");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters
This endpoint does not need any parameter.

### Return type

[**UserResponse**](UserResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | getMe 200 response |  -  |

<a name="getMonthlyLimit"></a>
# **getMonthlyLimit**
> UserLimitResponse getMonthlyLimit(id).execute();

 Get limit for the user 

 This endpoint gets the monthly limit for the user including the monthly available limit. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BrexTeam;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UsersApi;
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
      UserLimitResponse result = client
              .users
              .getMonthlyLimit(id)
              .execute();
      System.out.println(result);
      System.out.println(result.getMonthlyLimit());
      System.out.println(result.getMonthlyAvailable());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#getMonthlyLimit");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<UserLimitResponse> response = client
              .users
              .getMonthlyLimit(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#getMonthlyLimit");
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

[**UserLimitResponse**](UserLimitResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | getUserLimit 200 response |  -  |

<a name="getUserById"></a>
# **getUserById**
> UserResponse getUserById(id).execute();

 Get user 

 This endpoint gets a user by ID. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BrexTeam;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UsersApi;
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
      UserResponse result = client
              .users
              .getUserById(id)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getFirstName());
      System.out.println(result.getLastName());
      System.out.println(result.getEmail());
      System.out.println(result.getStatus());
      System.out.println(result.getManagerId());
      System.out.println(result.getDepartmentId());
      System.out.println(result.getLocationId());
      System.out.println(result.getTitleId());
      System.out.println(result.getMetadata());
      System.out.println(result.getRemoteDisplayId());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#getUserById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<UserResponse> response = client
              .users
              .getUserById(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#getUserById");
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

[**UserResponse**](UserResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | getUserById 200 response |  -  |

<a name="inviteNewEmployee"></a>
# **inviteNewEmployee**
> UserResponse inviteNewEmployee(createUserRequest).idempotencyKey(idempotencyKey).execute();

 Invite user 

 This endpoint invites a new user as an employee. To update user&#39;s role, check out [this article](https://support.brex.com/how-do-i-change-another-user-s-role/). 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BrexTeam;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UsersApi;
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
    String firstName = "firstName_example";
    String lastName = "lastName_example";
    String email = "email_example";
    String managerId = "managerId_example";
    String departmentId = "departmentId_example";
    String locationId = "locationId_example";
    String titleId = "titleId_example";
    Map<String, String> metadata = new HashMap(); // The metadata or customized attributes of the user. Maximum number of entries: 100
    String idempotencyKey = "idempotencyKey_example";
    try {
      UserResponse result = client
              .users
              .inviteNewEmployee(firstName, lastName, email)
              .managerId(managerId)
              .departmentId(departmentId)
              .locationId(locationId)
              .titleId(titleId)
              .metadata(metadata)
              .idempotencyKey(idempotencyKey)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getFirstName());
      System.out.println(result.getLastName());
      System.out.println(result.getEmail());
      System.out.println(result.getStatus());
      System.out.println(result.getManagerId());
      System.out.println(result.getDepartmentId());
      System.out.println(result.getLocationId());
      System.out.println(result.getTitleId());
      System.out.println(result.getMetadata());
      System.out.println(result.getRemoteDisplayId());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#inviteNewEmployee");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<UserResponse> response = client
              .users
              .inviteNewEmployee(firstName, lastName, email)
              .managerId(managerId)
              .departmentId(departmentId)
              .locationId(locationId)
              .titleId(titleId)
              .metadata(metadata)
              .idempotencyKey(idempotencyKey)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#inviteNewEmployee");
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
| **createUserRequest** | [**CreateUserRequest**](CreateUserRequest.md)|  | |
| **idempotencyKey** | **String**|  | [optional] |

### Return type

[**UserResponse**](UserResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | createUser 200 response |  -  |

<a name="listUsers"></a>
# **listUsers**
> PageUserResponse listUsers().cursor(cursor).limit(limit).email(email).remoteDisplayId(remoteDisplayId).expand(expand).execute();

 List users 

 This endpoint lists all users. To find a user id by email, you can filter using the &#x60;email&#x60; query parameter. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BrexTeam;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UsersApi;
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
    String cursor = "cursor_example";
    Integer limit = 56;
    String email = "email_example";
    String remoteDisplayId = "remoteDisplayId_example";
    List<String> expand = Arrays.asList();
    try {
      PageUserResponse result = client
              .users
              .listUsers()
              .cursor(cursor)
              .limit(limit)
              .email(email)
              .remoteDisplayId(remoteDisplayId)
              .expand(expand)
              .execute();
      System.out.println(result);
      System.out.println(result.getNextCursor());
      System.out.println(result.getItems());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#listUsers");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PageUserResponse> response = client
              .users
              .listUsers()
              .cursor(cursor)
              .limit(limit)
              .email(email)
              .remoteDisplayId(remoteDisplayId)
              .expand(expand)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#listUsers");
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
| **cursor** | **String**|  | [optional] |
| **limit** | **Integer**|  | [optional] |
| **email** | **String**|  | [optional] |
| **remoteDisplayId** | **String**|  | [optional] |
| **expand** | [**List&lt;String&gt;**](String.md)|  | [optional] |

### Return type

[**PageUserResponse**](PageUserResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | listUsers 200 response |  -  |

<a name="setMonthlyLimit"></a>
# **setMonthlyLimit**
> UserLimitResponse setMonthlyLimit(id, setUserLimitRequest).idempotencyKey(idempotencyKey).execute();

 Set limit for the user 

 This endpoint sets the monthly limit for a user.  The limit amount must be non-negative.  To unset the monthly limit of the user, just set &#x60;monthly_limit&#x60; to null. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BrexTeam;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UsersApi;
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
    SetUserLimitRequestMonthlyLimit monthlyLimit = new SetUserLimitRequestMonthlyLimit();
    String idempotencyKey = "idempotencyKey_example";
    try {
      UserLimitResponse result = client
              .users
              .setMonthlyLimit(id)
              .monthlyLimit(monthlyLimit)
              .idempotencyKey(idempotencyKey)
              .execute();
      System.out.println(result);
      System.out.println(result.getMonthlyLimit());
      System.out.println(result.getMonthlyAvailable());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#setMonthlyLimit");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<UserLimitResponse> response = client
              .users
              .setMonthlyLimit(id)
              .monthlyLimit(monthlyLimit)
              .idempotencyKey(idempotencyKey)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#setMonthlyLimit");
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
| **setUserLimitRequest** | [**SetUserLimitRequest**](SetUserLimitRequest.md)|  | |
| **idempotencyKey** | **String**|  | [optional] |

### Return type

[**UserLimitResponse**](UserLimitResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | setUserLimit 200 response |  -  |

<a name="updateUser"></a>
# **updateUser**
> UserResponse updateUser(id, updateUserRequest).idempotencyKey(idempotencyKey).execute();

 Update user 

 This endpoint updates a user. Any parameters not provided will be left unchanged. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.BrexTeam;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UsersApi;
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
    UpdateUserStatus status = new UpdateUserStatus();
    String managerId = "managerId_example"; // The user id of the manager of this user
    String departmentId = "departmentId_example";
    String locationId = "locationId_example";
    String titleId = "titleId_example";
    Map<String, String> metadata = new HashMap(); // The metadata or customized attributes of the user. Maximum number of entries: 100
    String idempotencyKey = "idempotencyKey_example";
    try {
      UserResponse result = client
              .users
              .updateUser(id)
              .status(status)
              .managerId(managerId)
              .departmentId(departmentId)
              .locationId(locationId)
              .titleId(titleId)
              .metadata(metadata)
              .idempotencyKey(idempotencyKey)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getFirstName());
      System.out.println(result.getLastName());
      System.out.println(result.getEmail());
      System.out.println(result.getStatus());
      System.out.println(result.getManagerId());
      System.out.println(result.getDepartmentId());
      System.out.println(result.getLocationId());
      System.out.println(result.getTitleId());
      System.out.println(result.getMetadata());
      System.out.println(result.getRemoteDisplayId());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#updateUser");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<UserResponse> response = client
              .users
              .updateUser(id)
              .status(status)
              .managerId(managerId)
              .departmentId(departmentId)
              .locationId(locationId)
              .titleId(titleId)
              .metadata(metadata)
              .idempotencyKey(idempotencyKey)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#updateUser");
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
| **updateUserRequest** | [**UpdateUserRequest**](UpdateUserRequest.md)|  | |
| **idempotencyKey** | **String**|  | [optional] |

### Return type

[**UserResponse**](UserResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | updateUser 200 response |  -  |


<div align="left">

[![Visit Brex](./header.png)](https://brex.com)

# [Brex](https://brex.com)


The team API lets you manage users, departments, locations, and cards.


</div>

## Requirements

Building the API client library requires:

1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

If you are adding this library to an Android Application or Library:

3. Android 8.0+ (API Level 26+)

## Installation<a id="installation"></a>
<div align="center">
  <a href="https://konfigthis.com/sdk-sign-up?company=Brex&serviceName=Team&language=Java">
    <img src="https://raw.githubusercontent.com/konfig-dev/brand-assets/HEAD/cta-images/java-cta.png" width="70%">
  </a>
</div>

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.konfigthis</groupId>
  <artifactId>brex-team-java-sdk</artifactId>
  <version>1.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your `build.gradle`:

```groovy
// build.gradle
repositories {
  mavenCentral()
}

dependencies {
   implementation "com.konfigthis:brex-team-java-sdk:1.0"
}
```

### Android users

Make sure your `build.gradle` file as a `minSdk` version of at least 26:
```groovy
// build.gradle
android {
    defaultConfig {
        minSdk 26
    }
}
```

Also make sure your library or application has internet permissions in your `AndroidManifest.xml`:

```xml
<!--AndroidManifest.xml-->
<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools">
    <uses-permission android:name="android.permission.INTERNET"/>
</manifest>
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/brex-team-java-sdk-1.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

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

## Documentation for API Endpoints

All URIs are relative to *https://platform.brexapis.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*CardsApi* | [**createNewCard**](docs/CardsApi.md#createNewCard) | **POST** /v2/cards |  Create card 
*CardsApi* | [**createSecureEmail**](docs/CardsApi.md#createSecureEmail) | **POST** /v2/cards/{id}/secure_email |  Create secure email to send card number  
*CardsApi* | [**getById**](docs/CardsApi.md#getById) | **GET** /v2/cards/{id} |  Get card 
*CardsApi* | [**getCardDetails**](docs/CardsApi.md#getCardDetails) | **GET** /v2/cards/{id}/pan |  Get card number 
*CardsApi* | [**listByUserId**](docs/CardsApi.md#listByUserId) | **GET** /v2/cards |  List cards 
*CardsApi* | [**lockCard**](docs/CardsApi.md#lockCard) | **POST** /v2/cards/{id}/lock |  Lock card 
*CardsApi* | [**terminateExistingCard**](docs/CardsApi.md#terminateExistingCard) | **POST** /v2/cards/{id}/terminate |  Terminate card 
*CardsApi* | [**unlockExistingCard**](docs/CardsApi.md#unlockExistingCard) | **POST** /v2/cards/{id}/unlock |  Unlock card 
*CardsApi* | [**updateCard**](docs/CardsApi.md#updateCard) | **PUT** /v2/cards/{id} |  Update card 
*CompaniesApi* | [**getInfo**](docs/CompaniesApi.md#getInfo) | **GET** /v2/company |  Get company 
*DepartmentsApi* | [**addNewDepartment**](docs/DepartmentsApi.md#addNewDepartment) | **POST** /v2/departments |  Create department 
*DepartmentsApi* | [**getById**](docs/DepartmentsApi.md#getById) | **GET** /v2/departments/{id} |  Get department 
*DepartmentsApi* | [**listAll**](docs/DepartmentsApi.md#listAll) | **GET** /v2/departments |  List departments 
*LocationsApi* | [**addNewLocation**](docs/LocationsApi.md#addNewLocation) | **POST** /v2/locations |  Create location 
*LocationsApi* | [**getAllLocations**](docs/LocationsApi.md#getAllLocations) | **GET** /v2/locations |  List locations 
*LocationsApi* | [**getLocationById**](docs/LocationsApi.md#getLocationById) | **GET** /v2/locations/{id} |  Get location 
*TitlesApi* | [**createNewTitle**](docs/TitlesApi.md#createNewTitle) | **POST** /v2/titles |  Create title 
*TitlesApi* | [**getAll**](docs/TitlesApi.md#getAll) | **GET** /v2/titles |  List titles 
*TitlesApi* | [**getTitleById**](docs/TitlesApi.md#getTitleById) | **GET** /v2/titles/{id} |  Get title 
*UsersApi* | [**getCurrentUser**](docs/UsersApi.md#getCurrentUser) | **GET** /v2/users/me |  Get current user 
*UsersApi* | [**getMonthlyLimit**](docs/UsersApi.md#getMonthlyLimit) | **GET** /v2/users/{id}/limit |  Get limit for the user 
*UsersApi* | [**getUserById**](docs/UsersApi.md#getUserById) | **GET** /v2/users/{id} |  Get user 
*UsersApi* | [**inviteNewEmployee**](docs/UsersApi.md#inviteNewEmployee) | **POST** /v2/users |  Invite user 
*UsersApi* | [**listUsers**](docs/UsersApi.md#listUsers) | **GET** /v2/users |  List users 
*UsersApi* | [**setMonthlyLimit**](docs/UsersApi.md#setMonthlyLimit) | **POST** /v2/users/{id}/limit |  Set limit for the user 
*UsersApi* | [**updateUser**](docs/UsersApi.md#updateUser) | **PUT** /v2/users/{id} |  Update user 


## Documentation for Models

 - [AccountType](docs/AccountType.md)
 - [Address](docs/Address.md)
 - [Card](docs/Card.md)
 - [CardAttributePreferences](docs/CardAttributePreferences.md)
 - [CardExpiration](docs/CardExpiration.md)
 - [CardMailingAddress](docs/CardMailingAddress.md)
 - [CardNumberResponse](docs/CardNumberResponse.md)
 - [CardSpendControls](docs/CardSpendControls.md)
 - [CardStatus](docs/CardStatus.md)
 - [CardType](docs/CardType.md)
 - [ChangeCardReason](docs/ChangeCardReason.md)
 - [CompanyResponse](docs/CompanyResponse.md)
 - [CreateCardRequest](docs/CreateCardRequest.md)
 - [CreateCardRequestCardAttributePreferences](docs/CreateCardRequestCardAttributePreferences.md)
 - [CreateCardRequestSpendControls](docs/CreateCardRequestSpendControls.md)
 - [CreateDepartmentRequest](docs/CreateDepartmentRequest.md)
 - [CreateLocationRequest](docs/CreateLocationRequest.md)
 - [CreateTitleRequest](docs/CreateTitleRequest.md)
 - [CreateUserRequest](docs/CreateUserRequest.md)
 - [DepartmentResponse](docs/DepartmentResponse.md)
 - [LimitType](docs/LimitType.md)
 - [LocationResponse](docs/LocationResponse.md)
 - [LockCardRequest](docs/LockCardRequest.md)
 - [Money](docs/Money.md)
 - [OwnerType](docs/OwnerType.md)
 - [PageCard](docs/PageCard.md)
 - [PageDepartmentResponse](docs/PageDepartmentResponse.md)
 - [PageLocationResponse](docs/PageLocationResponse.md)
 - [PageTitleResponse](docs/PageTitleResponse.md)
 - [PageUserResponse](docs/PageUserResponse.md)
 - [SecureEmailForCardDetailsRequest](docs/SecureEmailForCardDetailsRequest.md)
 - [SetUserLimitRequest](docs/SetUserLimitRequest.md)
 - [SetUserLimitRequestMonthlyLimit](docs/SetUserLimitRequestMonthlyLimit.md)
 - [SpendControl](docs/SpendControl.md)
 - [SpendControlRequest](docs/SpendControlRequest.md)
 - [SpendControlUpdateRequest](docs/SpendControlUpdateRequest.md)
 - [SpendDuration](docs/SpendDuration.md)
 - [TerminateCardRequest](docs/TerminateCardRequest.md)
 - [ThreeDomainSecureEnabledPreference](docs/ThreeDomainSecureEnabledPreference.md)
 - [TitleResponse](docs/TitleResponse.md)
 - [UpdateCardRequest](docs/UpdateCardRequest.md)
 - [UpdateCardRequestSpendControls](docs/UpdateCardRequestSpendControls.md)
 - [UpdateUserRequest](docs/UpdateUserRequest.md)
 - [UpdateUserStatus](docs/UpdateUserStatus.md)
 - [UserLimitResponse](docs/UserLimitResponse.md)
 - [UserOwner](docs/UserOwner.md)
 - [UserOwnerAllOf](docs/UserOwnerAllOf.md)
 - [UserResponse](docs/UserResponse.md)
 - [UserStatus](docs/UserStatus.md)


## Author
This Java package is automatically generated by [Konfig](https://konfigthis.com)

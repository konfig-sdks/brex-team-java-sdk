

# UserResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** |  |  |
|**firstName** | **String** | First name of the user |  |
|**lastName** | **String** | Last name of the user |  |
|**email** | **String** | Email address of the user |  |
|**status** | [**UserStatus**](UserStatus.md) |  |  [optional] |
|**managerId** | **String** | The user id of the manager of this user |  [optional] |
|**departmentId** | **String** |  |  [optional] |
|**locationId** | **String** |  |  [optional] |
|**titleId** | **String** |  |  [optional] |
|**metadata** | **Map&lt;String, String&gt;** | The metadata or customized attributes of the user. Maximum number of entries: 100 |  [optional] |
|**remoteDisplayId** | **String** | Identifier that is displayed on the IDP or HR system, eg, if OKTA identifies you as user xyz |  [optional] |




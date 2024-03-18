

# CreateCardRequest

 The `spend_controls` field is required when `limit_type` = `CARD`. The `shipping_address` field is required for physical cards, and the first 2 lines of the address must be under 60 characters long. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**owner** | **Object** |  |  |
|**cardName** | **String** |  |  |
|**cardType** | **CardType** |  |  |
|**limitType** | **LimitType** |  |  |
|**spendControls** | [**CreateCardRequestSpendControls**](CreateCardRequestSpendControls.md) |  |  [optional] |
|**mailingAddress** | [**CardMailingAddress**](CardMailingAddress.md) |  |  [optional] |
|**metadata** | **Map&lt;String, String&gt;** |  Set of key value pairs associated with this object. Please do not store any personally identifiable or sensitive information here. Limitations: maximum of 50 keys, keys cannot exceed 40 characters, values cannot exceed 500 characters.   |  [optional] |
|**cardAttributePreferences** | [**CreateCardRequestCardAttributePreferences**](CreateCardRequestCardAttributePreferences.md) |  |  [optional] |




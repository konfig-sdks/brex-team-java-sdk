

# Card

 Only cards with limit_type = CARD have spend_controls 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** |  |  |
|**owner** | **Object** |  |  |
|**status** | [**CardStatus**](CardStatus.md) |  |  [optional] |
|**lastFour** | **String** |  |  |
|**cardName** | **String** |  |  |
|**cardType** | [**CardType**](CardType.md) |  |  [optional] |
|**limitType** | **LimitType** |  |  |
|**spendControls** | [**CardSpendControls**](CardSpendControls.md) |  |  [optional] |
|**billingAddress** | [**Address**](Address.md) |  |  |
|**mailingAddress** | [**CardMailingAddress**](CardMailingAddress.md) |  |  [optional] |
|**expirationDate** | [**CardExpiration**](CardExpiration.md) |  |  |
|**metadata** | **Map&lt;String, String&gt;** |  Set of key value pairs associated with this object. Please do not store any personally identifiable or sensitive information here. Limitations: maximum of 50 keys, keys cannot exceed 40 characters, values cannot exceed 500 characters.   |  [optional] |




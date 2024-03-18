

# CreateCardRequestSpendControls


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**spendLimit** | [**Money**](Money.md) |  |  |
|**spendDuration** | **SpendDuration** |  |  |
|**reason** | **String** |  |  [optional] |
|**lockAfterDate** | **LocalDate** |  |  [optional] |
|**parentBudgetId** | **String** |  If using the Empower platform, a new &#x60;budget&#x60; will be created for this card. You can specify a &#x60;parent_budget&#x60; that your new &#x60;budget&#x60; will be nested under. If &#x60;parent_budget_id&#x60; is null, we will nest the new budget under the top-level account &#x60;budget&#x60;.  |  [optional] |




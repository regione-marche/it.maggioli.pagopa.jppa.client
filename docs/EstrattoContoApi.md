# EstrattoContoApi

All URIs are relative to *https://pagopa-staging.maggioli.cloud/jcitygov-pagopa/api/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getEstrattoContoUsingPOST**](EstrattoContoApi.md#getEstrattoContoUsingPOST) | **POST** /rest/estrattoConto/v1/ricerca | Restituisce i debiti filtrati dai parametri passati in input


<a name="getEstrattoContoUsingPOST"></a>
# **getEstrattoContoUsingPOST**
> EstrattoContoDto getEstrattoContoUsingPOST(filtriRicercaEstrattoConto)

Restituisce i debiti filtrati dai parametri passati in input

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EstrattoContoApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: jwtToken
ApiKeyAuth jwtToken = (ApiKeyAuth) defaultClient.getAuthentication("jwtToken");
jwtToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//jwtToken.setApiKeyPrefix("Token");

EstrattoContoApi apiInstance = new EstrattoContoApi();
EstrattoContoSearchFilter filtriRicercaEstrattoConto = new EstrattoContoSearchFilter(); // EstrattoContoSearchFilter | filtriRicercaEstrattoConto
try {
    EstrattoContoDto result = apiInstance.getEstrattoContoUsingPOST(filtriRicercaEstrattoConto);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EstrattoContoApi#getEstrattoContoUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filtriRicercaEstrattoConto** | [**EstrattoContoSearchFilter**](EstrattoContoSearchFilter.md)| filtriRicercaEstrattoConto |

### Return type

[**EstrattoContoDto**](EstrattoContoDto.md)

### Authorization

[jwtToken](../README.md#jwtToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=utf-8


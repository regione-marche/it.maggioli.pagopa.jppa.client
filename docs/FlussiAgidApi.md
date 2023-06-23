# FlussiAgidApi

All URIs are relative to *https://pagopa-staging.maggioli.cloud/jcitygov-pagopa/api/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**postScaricaUsingPOST**](FlussiAgidApi.md#postScaricaUsingPOST) | **POST** /rest/flussiAgid/v1/scarica | Servizio che permette di scaricare i flussi AGID secondo i parametri in input


<a name="postScaricaUsingPOST"></a>
# **postScaricaUsingPOST**
> RispostaScaricaFlussiAgidDto postScaricaUsingPOST(filterFlussiAgid)

Servizio che permette di scaricare i flussi AGID secondo i parametri in input

I campi vengono filtrati per priorità, quindi l’identificativo del flusso è il primo su cui viene filtrato, omettendo ma mettendo le date vengono interpolate per recuperare la lista dei flussi che soddisfano il filtro

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FlussiAgidApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: jwtToken
ApiKeyAuth jwtToken = (ApiKeyAuth) defaultClient.getAuthentication("jwtToken");
jwtToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//jwtToken.setApiKeyPrefix("Token");

FlussiAgidApi apiInstance = new FlussiAgidApi();
RichiestaScaricaFlussiAgidDto filterFlussiAgid = new RichiestaScaricaFlussiAgidDto(); // RichiestaScaricaFlussiAgidDto | filterFlussiAgid
try {
    RispostaScaricaFlussiAgidDto result = apiInstance.postScaricaUsingPOST(filterFlussiAgid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FlussiAgidApi#postScaricaUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filterFlussiAgid** | [**RichiestaScaricaFlussiAgidDto**](RichiestaScaricaFlussiAgidDto.md)| filterFlussiAgid |

### Return type

[**RispostaScaricaFlussiAgidDto**](RispostaScaricaFlussiAgidDto.md)

### Authorization

[jwtToken](../README.md#jwtToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=utf-8


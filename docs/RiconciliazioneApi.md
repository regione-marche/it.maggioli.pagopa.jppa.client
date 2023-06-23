# RiconciliazioneApi

All URIs are relative to *https://pagopa-staging.maggioli.cloud/jcitygov-pagopa/api/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**postInfoPerFlussoVersamentoUsingPOST**](RiconciliazioneApi.md#postInfoPerFlussoVersamentoUsingPOST) | **POST** /rest/riconciliazione/v1/infoRiconciliazione | Restituisce l’elenco dei pagamenti riconciliati


<a name="postInfoPerFlussoVersamentoUsingPOST"></a>
# **postInfoPerFlussoVersamentoUsingPOST**
> RispostaInfoRiconciliazioneDto postInfoPerFlussoVersamentoUsingPOST(richiesta)

Restituisce l’elenco dei pagamenti riconciliati

Il metodo prevede due possibili input: flusso di rendicontazione oppure il sospeso relativo. Il risultato è il medesimo, cambia solo l’input di partenza

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RiconciliazioneApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: jwtToken
ApiKeyAuth jwtToken = (ApiKeyAuth) defaultClient.getAuthentication("jwtToken");
jwtToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//jwtToken.setApiKeyPrefix("Token");

RiconciliazioneApi apiInstance = new RiconciliazioneApi();
RichiestaInfoRiconciliazioneDto richiesta = new RichiestaInfoRiconciliazioneDto(); // RichiestaInfoRiconciliazioneDto | richiesta
try {
    RispostaInfoRiconciliazioneDto result = apiInstance.postInfoPerFlussoVersamentoUsingPOST(richiesta);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RiconciliazioneApi#postInfoPerFlussoVersamentoUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **richiesta** | [**RichiestaInfoRiconciliazioneDto**](RichiestaInfoRiconciliazioneDto.md)| richiesta |

### Return type

[**RispostaInfoRiconciliazioneDto**](RispostaInfoRiconciliazioneDto.md)

### Authorization

[jwtToken](../README.md#jwtToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=utf-8


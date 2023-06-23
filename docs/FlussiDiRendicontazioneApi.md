# FlussiDiRendicontazioneApi

All URIs are relative to *https://pagopa-staging.maggioli.cloud/jcitygov-pagopa/api/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**postInfoUsingPOST1**](FlussiDiRendicontazioneApi.md#postInfoUsingPOST1) | **POST** /rest/flussiDiRendicontazione/v1/info | Servizio che restituisce una lista di Flussi di Rendicontazione nell’intervallo di date indicate.


<a name="postInfoUsingPOST1"></a>
# **postInfoUsingPOST1**
> RispostaInfoListaFlussiRendicontazioneDto postInfoUsingPOST1(richiestaInfoListaFlussiRendicontazioneDto)

Servizio che restituisce una lista di Flussi di Rendicontazione nell’intervallo di date indicate.

Sono state predisposte delle operazioni per indicare se le date indicano Regolamento o Inserimento

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FlussiDiRendicontazioneApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: jwtToken
ApiKeyAuth jwtToken = (ApiKeyAuth) defaultClient.getAuthentication("jwtToken");
jwtToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//jwtToken.setApiKeyPrefix("Token");

FlussiDiRendicontazioneApi apiInstance = new FlussiDiRendicontazioneApi();
RichiestaInfoListaFlussiRendicontazioneDto richiestaInfoListaFlussiRendicontazioneDto = new RichiestaInfoListaFlussiRendicontazioneDto(); // RichiestaInfoListaFlussiRendicontazioneDto | richiestaInfoListaFlussiRendicontazioneDto
try {
    RispostaInfoListaFlussiRendicontazioneDto result = apiInstance.postInfoUsingPOST1(richiestaInfoListaFlussiRendicontazioneDto);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FlussiDiRendicontazioneApi#postInfoUsingPOST1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **richiestaInfoListaFlussiRendicontazioneDto** | [**RichiestaInfoListaFlussiRendicontazioneDto**](RichiestaInfoListaFlussiRendicontazioneDto.md)| richiestaInfoListaFlussiRendicontazioneDto |

### Return type

[**RispostaInfoListaFlussiRendicontazioneDto**](RispostaInfoListaFlussiRendicontazioneDto.md)

### Authorization

[jwtToken](../README.md#jwtToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=utf-8


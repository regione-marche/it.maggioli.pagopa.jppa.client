# PagamentiApi

All URIs are relative to *https://pagopa-staging.maggioli.cloud/jcitygov-pagopa/api/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**postInfoPerDebitoUsingPOST**](PagamentiApi.md#postInfoPerDebitoUsingPOST) | **POST** /rest/pagamenti/v1/infoPerDebito | Servizio che restituisce il dettaglio del pagamento se è stato pagato utilizzando le chiavi del debito come input
[**postInfoPerDovutoUsingPOST**](PagamentiApi.md#postInfoPerDovutoUsingPOST) | **POST** /rest/pagamenti/v1/infoPerDovuto | Servizio che restituisce il dettaglio del pagamento se è stato pagato utilizzando le chiavi del debito come input
[**postInfoPerIuvUsingPOST**](PagamentiApi.md#postInfoPerIuvUsingPOST) | **POST** /rest/pagamenti/v1/infoPerIuv | Servizio che permette di ricevere informazioni sui pagamenti attraverso lo IUV in input
[**postInfoPerTransazioneUsingPOST**](PagamentiApi.md#postInfoPerTransazioneUsingPOST) | **POST** /rest/pagamenti/v1/infoPerTransazione | Servizio che restituisce il dettaglio del pagamento se è stato pagato utilizzando l’idTransazione del pagamento come input
[**postInfoUsingPOST2**](PagamentiApi.md#postInfoUsingPOST2) | **POST** /rest/pagamenti/v1/infoPerDate | Servizio che permette il recupero della lista di pagamenti effettuati.


<a name="postInfoPerDebitoUsingPOST"></a>
# **postInfoPerDebitoUsingPOST**
> RispostaInfoPagamentoDebitoDto postInfoPerDebitoUsingPOST(richiestaInfo)

Servizio che restituisce il dettaglio del pagamento se è stato pagato utilizzando le chiavi del debito come input

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PagamentiApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: jwtToken
ApiKeyAuth jwtToken = (ApiKeyAuth) defaultClient.getAuthentication("jwtToken");
jwtToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//jwtToken.setApiKeyPrefix("Token");

PagamentiApi apiInstance = new PagamentiApi();
RichiestaInfoPagamentoDebitoDto richiestaInfo = new RichiestaInfoPagamentoDebitoDto(); // RichiestaInfoPagamentoDebitoDto | richiestaInfo
try {
    RispostaInfoPagamentoDebitoDto result = apiInstance.postInfoPerDebitoUsingPOST(richiestaInfo);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PagamentiApi#postInfoPerDebitoUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **richiestaInfo** | [**RichiestaInfoPagamentoDebitoDto**](RichiestaInfoPagamentoDebitoDto.md)| richiestaInfo |

### Return type

[**RispostaInfoPagamentoDebitoDto**](RispostaInfoPagamentoDebitoDto.md)

### Authorization

[jwtToken](../README.md#jwtToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=utf-8

<a name="postInfoPerDovutoUsingPOST"></a>
# **postInfoPerDovutoUsingPOST**
> RispostaInfoPagamentoDovutoDto postInfoPerDovutoUsingPOST(richiestaInfoPagamentoDovutoDto)

Servizio che restituisce il dettaglio del pagamento se è stato pagato utilizzando le chiavi del debito come input

Ritorna anche il testo della nuova RT (se presente), sia per i debiti monobeneficiario che per i multibeneficiario. Inoltre nel caso ci siano associati dei pagamenti multibeneficiario, c’è un tag aggiuntivo che li descrive e i relativi pagamenti telematici

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PagamentiApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: jwtToken
ApiKeyAuth jwtToken = (ApiKeyAuth) defaultClient.getAuthentication("jwtToken");
jwtToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//jwtToken.setApiKeyPrefix("Token");

PagamentiApi apiInstance = new PagamentiApi();
RichiestaInfoPagamentoDovutoDto richiestaInfoPagamentoDovutoDto = new RichiestaInfoPagamentoDovutoDto(); // RichiestaInfoPagamentoDovutoDto | richiestaInfoPagamentoDovutoDto
try {
    RispostaInfoPagamentoDovutoDto result = apiInstance.postInfoPerDovutoUsingPOST(richiestaInfoPagamentoDovutoDto);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PagamentiApi#postInfoPerDovutoUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **richiestaInfoPagamentoDovutoDto** | [**RichiestaInfoPagamentoDovutoDto**](RichiestaInfoPagamentoDovutoDto.md)| richiestaInfoPagamentoDovutoDto |

### Return type

[**RispostaInfoPagamentoDovutoDto**](RispostaInfoPagamentoDovutoDto.md)

### Authorization

[jwtToken](../README.md#jwtToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=utf-8

<a name="postInfoPerIuvUsingPOST"></a>
# **postInfoPerIuvUsingPOST**
> RispostaInfoPagamentoPerIuvDto postInfoPerIuvUsingPOST(richiestaInfoPagamentoDebitoDto)

Servizio che permette di ricevere informazioni sui pagamenti attraverso lo IUV in input

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PagamentiApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: jwtToken
ApiKeyAuth jwtToken = (ApiKeyAuth) defaultClient.getAuthentication("jwtToken");
jwtToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//jwtToken.setApiKeyPrefix("Token");

PagamentiApi apiInstance = new PagamentiApi();
RichiestaInfoAvvisoPagamentoPerIuvDto richiestaInfoPagamentoDebitoDto = new RichiestaInfoAvvisoPagamentoPerIuvDto(); // RichiestaInfoAvvisoPagamentoPerIuvDto | richiestaInfoPagamentoDebitoDto
try {
    RispostaInfoPagamentoPerIuvDto result = apiInstance.postInfoPerIuvUsingPOST(richiestaInfoPagamentoDebitoDto);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PagamentiApi#postInfoPerIuvUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **richiestaInfoPagamentoDebitoDto** | [**RichiestaInfoAvvisoPagamentoPerIuvDto**](RichiestaInfoAvvisoPagamentoPerIuvDto.md)| richiestaInfoPagamentoDebitoDto |

### Return type

[**RispostaInfoPagamentoPerIuvDto**](RispostaInfoPagamentoPerIuvDto.md)

### Authorization

[jwtToken](../README.md#jwtToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=utf-8

<a name="postInfoPerTransazioneUsingPOST"></a>
# **postInfoPerTransazioneUsingPOST**
> RispostaInfoPagamentoTransazioneDto postInfoPerTransazioneUsingPOST(richiesta)

Servizio che restituisce il dettaglio del pagamento se è stato pagato utilizzando l’idTransazione del pagamento come input

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PagamentiApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: jwtToken
ApiKeyAuth jwtToken = (ApiKeyAuth) defaultClient.getAuthentication("jwtToken");
jwtToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//jwtToken.setApiKeyPrefix("Token");

PagamentiApi apiInstance = new PagamentiApi();
RichiestaInfoPagamentoTransazioneDto richiesta = new RichiestaInfoPagamentoTransazioneDto(); // RichiestaInfoPagamentoTransazioneDto | richiesta
try {
    RispostaInfoPagamentoTransazioneDto result = apiInstance.postInfoPerTransazioneUsingPOST(richiesta);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PagamentiApi#postInfoPerTransazioneUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **richiesta** | [**RichiestaInfoPagamentoTransazioneDto**](RichiestaInfoPagamentoTransazioneDto.md)| richiesta |

### Return type

[**RispostaInfoPagamentoTransazioneDto**](RispostaInfoPagamentoTransazioneDto.md)

### Authorization

[jwtToken](../README.md#jwtToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=utf-8

<a name="postInfoUsingPOST2"></a>
# **postInfoUsingPOST2**
> RispostaListaPagamentiDto postInfoUsingPOST2(richiestaListaPagamentiDto)

Servizio che permette il recupero della lista di pagamenti effettuati.

Recupera tutti i pagamenti nello stato CONTABILIZZATO o NOTIFICATO con data di creazione del pagamento telematico incluso nelle date, non è la data del pagamento!

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PagamentiApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: jwtToken
ApiKeyAuth jwtToken = (ApiKeyAuth) defaultClient.getAuthentication("jwtToken");
jwtToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//jwtToken.setApiKeyPrefix("Token");

PagamentiApi apiInstance = new PagamentiApi();
RichiestaListaPagamentiDto richiestaListaPagamentiDto = new RichiestaListaPagamentiDto(); // RichiestaListaPagamentiDto | richiestaListaPagamentiDto
try {
    RispostaListaPagamentiDto result = apiInstance.postInfoUsingPOST2(richiestaListaPagamentiDto);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PagamentiApi#postInfoUsingPOST2");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **richiestaListaPagamentiDto** | [**RichiestaListaPagamentiDto**](RichiestaListaPagamentiDto.md)| richiestaListaPagamentiDto |

### Return type

[**RispostaListaPagamentiDto**](RispostaListaPagamentiDto.md)

### Authorization

[jwtToken](../README.md#jwtToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=utf-8


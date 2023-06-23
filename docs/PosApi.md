# PosApi

All URIs are relative to *https://pagopa-staging.maggioli.cloud/jcitygov-pagopa/api/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**postInfoPerIdPosUsingPOST**](PosApi.md#postInfoPerIdPosUsingPOST) | **POST** /rest/pos/v1/infoAvvisoPagamento | Servizio che restituisce il dettaglio del debito tramite chiave debito ridotta
[**postInfoPerIdPosUsingPOST1**](PosApi.md#postInfoPerIdPosUsingPOST1) | **POST** /rest/pos/v1/infoListaTerminali | Si occupa di restituire l&#39;elenco dei terminali POS censiti per un dato ente. Attualmente sono gestiti solo il Pos “Nexi” e Pos di “Progetti e Soluzioni”. Sono gestite due tipi di chiamate differenti, una chiamata con filtro contesto e una chiamata senza filtri.
[**postPagaPosUsingPOST**](PosApi.md#postPagaPosUsingPOST) | **POST** /rest/pos/v1/pagaDebito | Servizio che gestisce la richiesta di pagamento di un carrello di debiti e restituisce l&#39;identificativo della transazione che è stata creata ed un URL


<a name="postInfoPerIdPosUsingPOST"></a>
# **postInfoPerIdPosUsingPOST**
> RispostaInfoAvvisoPagamentoPerIdPosDto postInfoPerIdPosUsingPOST(infoAvvisiPagamentoPerChiaveDebito)

Servizio che restituisce il dettaglio del debito tramite chiave debito ridotta

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PosApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: jwtToken
ApiKeyAuth jwtToken = (ApiKeyAuth) defaultClient.getAuthentication("jwtToken");
jwtToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//jwtToken.setApiKeyPrefix("Token");

PosApi apiInstance = new PosApi();
RichiestaInfoAvvisoPagamentoPerIdPosDto infoAvvisiPagamentoPerChiaveDebito = new RichiestaInfoAvvisoPagamentoPerIdPosDto(); // RichiestaInfoAvvisoPagamentoPerIdPosDto | infoAvvisiPagamentoPerChiaveDebito
try {
    RispostaInfoAvvisoPagamentoPerIdPosDto result = apiInstance.postInfoPerIdPosUsingPOST(infoAvvisiPagamentoPerChiaveDebito);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PosApi#postInfoPerIdPosUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **infoAvvisiPagamentoPerChiaveDebito** | [**RichiestaInfoAvvisoPagamentoPerIdPosDto**](RichiestaInfoAvvisoPagamentoPerIdPosDto.md)| infoAvvisiPagamentoPerChiaveDebito |

### Return type

[**RispostaInfoAvvisoPagamentoPerIdPosDto**](RispostaInfoAvvisoPagamentoPerIdPosDto.md)

### Authorization

[jwtToken](../README.md#jwtToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=utf-8

<a name="postInfoPerIdPosUsingPOST1"></a>
# **postInfoPerIdPosUsingPOST1**
> RispostaListaTerminaliPOSDto postInfoPerIdPosUsingPOST1(richiesta)

Si occupa di restituire l&#39;elenco dei terminali POS censiti per un dato ente. Attualmente sono gestiti solo il Pos “Nexi” e Pos di “Progetti e Soluzioni”. Sono gestite due tipi di chiamate differenti, una chiamata con filtro contesto e una chiamata senza filtri.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PosApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: jwtToken
ApiKeyAuth jwtToken = (ApiKeyAuth) defaultClient.getAuthentication("jwtToken");
jwtToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//jwtToken.setApiKeyPrefix("Token");

PosApi apiInstance = new PosApi();
RichiestaListaTerminaliPOSDto richiesta = new RichiestaListaTerminaliPOSDto(); // RichiestaListaTerminaliPOSDto | richiesta
try {
    RispostaListaTerminaliPOSDto result = apiInstance.postInfoPerIdPosUsingPOST1(richiesta);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PosApi#postInfoPerIdPosUsingPOST1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **richiesta** | [**RichiestaListaTerminaliPOSDto**](RichiestaListaTerminaliPOSDto.md)| richiesta |

### Return type

[**RispostaListaTerminaliPOSDto**](RispostaListaTerminaliPOSDto.md)

### Authorization

[jwtToken](../README.md#jwtToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=utf-8

<a name="postPagaPosUsingPOST"></a>
# **postPagaPosUsingPOST**
> RispostaPagaDebitiDto postPagaPosUsingPOST(richiestaPagaDebitiDto)

Servizio che gestisce la richiesta di pagamento di un carrello di debiti e restituisce l&#39;identificativo della transazione che è stata creata ed un URL

Il servizio creerà il/i debito/i, creerà una transazione e restituirà un identTransazione e un URL. Il client invocando tale URL concluderà la procedura di pagamento (modello 1) del carrello debiti prima sottomesso.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PosApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: jwtToken
ApiKeyAuth jwtToken = (ApiKeyAuth) defaultClient.getAuthentication("jwtToken");
jwtToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//jwtToken.setApiKeyPrefix("Token");

PosApi apiInstance = new PosApi();
RichiestaPagaDebitoPOSDto richiestaPagaDebitiDto = new RichiestaPagaDebitoPOSDto(); // RichiestaPagaDebitoPOSDto | richiestaPagaDebitiDto
try {
    RispostaPagaDebitiDto result = apiInstance.postPagaPosUsingPOST(richiestaPagaDebitiDto);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PosApi#postPagaPosUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **richiestaPagaDebitiDto** | [**RichiestaPagaDebitoPOSDto**](RichiestaPagaDebitoPOSDto.md)| richiestaPagaDebitiDto |

### Return type

[**RispostaPagaDebitiDto**](RispostaPagaDebitiDto.md)

### Authorization

[jwtToken](../README.md#jwtToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=utf-8


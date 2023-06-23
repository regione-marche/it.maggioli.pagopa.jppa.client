# AvvisiPagamentoApi

All URIs are relative to *https://pagopa-staging.maggioli.cloud/jcitygov-pagopa/api/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteEliminaUsingDELETE**](AvvisiPagamentoApi.md#deleteEliminaUsingDELETE) | **DELETE** /rest/avvisiPagamento/v1/elimina | Servizio che permette la cancellazione logica di un avviso
[**patchModificaCausaleUsingPATCH**](AvvisiPagamentoApi.md#patchModificaCausaleUsingPATCH) | **PATCH** /rest/avvisiPagamento/v1/modificaCausale | Servizio che permette la modifica della causale di un avviso (attivo)
[**patchModificaContribuenteUsingPATCH**](AvvisiPagamentoApi.md#patchModificaContribuenteUsingPATCH) | **PATCH** /rest/avvisiPagamento/v1/modificaContribuente | Servizio che permette la modifica del contribuente di un avviso (attivo)
[**patchModificaImportoUsingPATCH**](AvvisiPagamentoApi.md#patchModificaImportoUsingPATCH) | **PATCH** /rest/avvisiPagamento/v1/modificaImporto | Permette la modifica dell&#39;importo di un avviso (attivo)
[**postAttivaPerIdLottoUsingPATCH**](AvvisiPagamentoApi.md#postAttivaPerIdLottoUsingPATCH) | **PATCH** /rest/avvisiPagamento/v1/attivaPerIdLotto | Permette l&#39;attivazione di un avviso di pagamento attraverso l&#39;id lotto
[**postAttivaUsingPATCH**](AvvisiPagamentoApi.md#postAttivaUsingPATCH) | **PATCH** /rest/avvisiPagamento/v1/attiva | Permette l&#39;attivazione di un avviso di pagamento
[**postCreaMultipliUsingPOST**](AvvisiPagamentoApi.md#postCreaMultipliUsingPOST) | **POST** /rest/avvisiPagamento/v1/creaMultipli | Permette la creazione di più avvisi di pagamento
[**postCreaUsingPOST**](AvvisiPagamentoApi.md#postCreaUsingPOST) | **POST** /rest/avvisiPagamento/v1/crea | Permette la creazione di un avviso di pagamento
[**postInfoPerChiaveDebitoUsingPOST**](AvvisiPagamentoApi.md#postInfoPerChiaveDebitoUsingPOST) | **POST** /rest/avvisiPagamento/v1/infoPerChiaveDebito | Servizio che restituisce il dettaglio del debito tramite la chiave del debito
[**postInfoPerNumeroAvvisoUsingPOST**](AvvisiPagamentoApi.md#postInfoPerNumeroAvvisoUsingPOST) | **POST** /rest/avvisiPagamento/v1/infoPerNumeroAvviso | Servizio che restituisce il dettaglio del debito tramite NumeroAvviso
[**postInfoUsingPOST**](AvvisiPagamentoApi.md#postInfoUsingPOST) | **POST** /rest/avvisiPagamento/v1/info | Servizio che restituisce la lista di pagamenti mod 3 che rispettano diversi criteri di ricerca (tipo debito, date, flag vari ecc.)
[**postSostituisciUsingPUT**](AvvisiPagamentoApi.md#postSostituisciUsingPUT) | **PUT** /rest/avvisiPagamento/v1/sostituisci | Servizio che permette la sostituzione di un avviso (attivo).


<a name="deleteEliminaUsingDELETE"></a>
# **deleteEliminaUsingDELETE**
> RispostaEliminaAvvisoPagamentoDto deleteEliminaUsingDELETE(eliminaAvvisoPagamentoDto)

Servizio che permette la cancellazione logica di un avviso

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AvvisiPagamentoApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: jwtToken
ApiKeyAuth jwtToken = (ApiKeyAuth) defaultClient.getAuthentication("jwtToken");
jwtToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//jwtToken.setApiKeyPrefix("Token");

AvvisiPagamentoApi apiInstance = new AvvisiPagamentoApi();
RichiestaEliminaAvvisoPagamentoDto eliminaAvvisoPagamentoDto = new RichiestaEliminaAvvisoPagamentoDto(); // RichiestaEliminaAvvisoPagamentoDto | eliminaAvvisoPagamentoDto
try {
    RispostaEliminaAvvisoPagamentoDto result = apiInstance.deleteEliminaUsingDELETE(eliminaAvvisoPagamentoDto);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AvvisiPagamentoApi#deleteEliminaUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eliminaAvvisoPagamentoDto** | [**RichiestaEliminaAvvisoPagamentoDto**](RichiestaEliminaAvvisoPagamentoDto.md)| eliminaAvvisoPagamentoDto |

### Return type

[**RispostaEliminaAvvisoPagamentoDto**](RispostaEliminaAvvisoPagamentoDto.md)

### Authorization

[jwtToken](../README.md#jwtToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;charset=utf-8

<a name="patchModificaCausaleUsingPATCH"></a>
# **patchModificaCausaleUsingPATCH**
> RispostaModificaCausaleDto patchModificaCausaleUsingPATCH(modificaCausaleDto)

Servizio che permette la modifica della causale di un avviso (attivo)

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AvvisiPagamentoApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: jwtToken
ApiKeyAuth jwtToken = (ApiKeyAuth) defaultClient.getAuthentication("jwtToken");
jwtToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//jwtToken.setApiKeyPrefix("Token");

AvvisiPagamentoApi apiInstance = new AvvisiPagamentoApi();
RichiestaModificaCausaleDto modificaCausaleDto = new RichiestaModificaCausaleDto(); // RichiestaModificaCausaleDto | modificaCausaleDto
try {
    RispostaModificaCausaleDto result = apiInstance.patchModificaCausaleUsingPATCH(modificaCausaleDto);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AvvisiPagamentoApi#patchModificaCausaleUsingPATCH");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modificaCausaleDto** | [**RichiestaModificaCausaleDto**](RichiestaModificaCausaleDto.md)| modificaCausaleDto |

### Return type

[**RispostaModificaCausaleDto**](RispostaModificaCausaleDto.md)

### Authorization

[jwtToken](../README.md#jwtToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=utf-8

<a name="patchModificaContribuenteUsingPATCH"></a>
# **patchModificaContribuenteUsingPATCH**
> RispostaModificaContribuenteDto patchModificaContribuenteUsingPATCH(modificaContribuenteDto)

Servizio che permette la modifica del contribuente di un avviso (attivo)

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AvvisiPagamentoApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: jwtToken
ApiKeyAuth jwtToken = (ApiKeyAuth) defaultClient.getAuthentication("jwtToken");
jwtToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//jwtToken.setApiKeyPrefix("Token");

AvvisiPagamentoApi apiInstance = new AvvisiPagamentoApi();
RichiestaModificaContribuenteDto modificaContribuenteDto = new RichiestaModificaContribuenteDto(); // RichiestaModificaContribuenteDto | modificaContribuenteDto
try {
    RispostaModificaContribuenteDto result = apiInstance.patchModificaContribuenteUsingPATCH(modificaContribuenteDto);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AvvisiPagamentoApi#patchModificaContribuenteUsingPATCH");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modificaContribuenteDto** | [**RichiestaModificaContribuenteDto**](RichiestaModificaContribuenteDto.md)| modificaContribuenteDto |

### Return type

[**RispostaModificaContribuenteDto**](RispostaModificaContribuenteDto.md)

### Authorization

[jwtToken](../README.md#jwtToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=utf-8

<a name="patchModificaImportoUsingPATCH"></a>
# **patchModificaImportoUsingPATCH**
> RispostaModificaImportoDto patchModificaImportoUsingPATCH(modificaImportoDto)

Permette la modifica dell&#39;importo di un avviso (attivo)

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AvvisiPagamentoApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: jwtToken
ApiKeyAuth jwtToken = (ApiKeyAuth) defaultClient.getAuthentication("jwtToken");
jwtToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//jwtToken.setApiKeyPrefix("Token");

AvvisiPagamentoApi apiInstance = new AvvisiPagamentoApi();
RichiestaModificaImportoDto modificaImportoDto = new RichiestaModificaImportoDto(); // RichiestaModificaImportoDto | modificaImportoDto
try {
    RispostaModificaImportoDto result = apiInstance.patchModificaImportoUsingPATCH(modificaImportoDto);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AvvisiPagamentoApi#patchModificaImportoUsingPATCH");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modificaImportoDto** | [**RichiestaModificaImportoDto**](RichiestaModificaImportoDto.md)| modificaImportoDto |

### Return type

[**RispostaModificaImportoDto**](RispostaModificaImportoDto.md)

### Authorization

[jwtToken](../README.md#jwtToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=utf-8

<a name="postAttivaPerIdLottoUsingPATCH"></a>
# **postAttivaPerIdLottoUsingPATCH**
> RispostaAttivaAvvisiPagamentoPerIdLottoDto postAttivaPerIdLottoUsingPATCH(attivaAvvisiPagamentoDto)

Permette l&#39;attivazione di un avviso di pagamento attraverso l&#39;id lotto

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AvvisiPagamentoApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: jwtToken
ApiKeyAuth jwtToken = (ApiKeyAuth) defaultClient.getAuthentication("jwtToken");
jwtToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//jwtToken.setApiKeyPrefix("Token");

AvvisiPagamentoApi apiInstance = new AvvisiPagamentoApi();
RichiestaAttivaAvvisiPagamentoPerIdLottoDto attivaAvvisiPagamentoDto = new RichiestaAttivaAvvisiPagamentoPerIdLottoDto(); // RichiestaAttivaAvvisiPagamentoPerIdLottoDto | attivaAvvisiPagamentoDto
try {
    RispostaAttivaAvvisiPagamentoPerIdLottoDto result = apiInstance.postAttivaPerIdLottoUsingPATCH(attivaAvvisiPagamentoDto);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AvvisiPagamentoApi#postAttivaPerIdLottoUsingPATCH");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **attivaAvvisiPagamentoDto** | [**RichiestaAttivaAvvisiPagamentoPerIdLottoDto**](RichiestaAttivaAvvisiPagamentoPerIdLottoDto.md)| attivaAvvisiPagamentoDto |

### Return type

[**RispostaAttivaAvvisiPagamentoPerIdLottoDto**](RispostaAttivaAvvisiPagamentoPerIdLottoDto.md)

### Authorization

[jwtToken](../README.md#jwtToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=utf-8

<a name="postAttivaUsingPATCH"></a>
# **postAttivaUsingPATCH**
> RispostaAttivaAvvisiPagamentoDto postAttivaUsingPATCH(attivaAvvisiPagamentoDto)

Permette l&#39;attivazione di un avviso di pagamento

Funziona solo in attivazione

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AvvisiPagamentoApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: jwtToken
ApiKeyAuth jwtToken = (ApiKeyAuth) defaultClient.getAuthentication("jwtToken");
jwtToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//jwtToken.setApiKeyPrefix("Token");

AvvisiPagamentoApi apiInstance = new AvvisiPagamentoApi();
RichiestaAttivaAvvisiPagamentoDto attivaAvvisiPagamentoDto = new RichiestaAttivaAvvisiPagamentoDto(); // RichiestaAttivaAvvisiPagamentoDto | attivaAvvisiPagamentoDto
try {
    RispostaAttivaAvvisiPagamentoDto result = apiInstance.postAttivaUsingPATCH(attivaAvvisiPagamentoDto);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AvvisiPagamentoApi#postAttivaUsingPATCH");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **attivaAvvisiPagamentoDto** | [**RichiestaAttivaAvvisiPagamentoDto**](RichiestaAttivaAvvisiPagamentoDto.md)| attivaAvvisiPagamentoDto |

### Return type

[**RispostaAttivaAvvisiPagamentoDto**](RispostaAttivaAvvisiPagamentoDto.md)

### Authorization

[jwtToken](../README.md#jwtToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=utf-8

<a name="postCreaMultipliUsingPOST"></a>
# **postCreaMultipliUsingPOST**
> RispostaCreaAvvisiPagamentoDto postCreaMultipliUsingPOST(creaAvvisiPagamentoDto)

Permette la creazione di più avvisi di pagamento

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AvvisiPagamentoApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: jwtToken
ApiKeyAuth jwtToken = (ApiKeyAuth) defaultClient.getAuthentication("jwtToken");
jwtToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//jwtToken.setApiKeyPrefix("Token");

AvvisiPagamentoApi apiInstance = new AvvisiPagamentoApi();
RichiestaCreaAvvisiPagamentoDto creaAvvisiPagamentoDto = new RichiestaCreaAvvisiPagamentoDto(); // RichiestaCreaAvvisiPagamentoDto | creaAvvisiPagamentoDto
try {
    RispostaCreaAvvisiPagamentoDto result = apiInstance.postCreaMultipliUsingPOST(creaAvvisiPagamentoDto);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AvvisiPagamentoApi#postCreaMultipliUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **creaAvvisiPagamentoDto** | [**RichiestaCreaAvvisiPagamentoDto**](RichiestaCreaAvvisiPagamentoDto.md)| creaAvvisiPagamentoDto |

### Return type

[**RispostaCreaAvvisiPagamentoDto**](RispostaCreaAvvisiPagamentoDto.md)

### Authorization

[jwtToken](../README.md#jwtToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=utf-8

<a name="postCreaUsingPOST"></a>
# **postCreaUsingPOST**
> RispostaCreaAvvisoPagamentoDto postCreaUsingPOST(creaAvvisoPagamentoDto)

Permette la creazione di un avviso di pagamento

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AvvisiPagamentoApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: jwtToken
ApiKeyAuth jwtToken = (ApiKeyAuth) defaultClient.getAuthentication("jwtToken");
jwtToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//jwtToken.setApiKeyPrefix("Token");

AvvisiPagamentoApi apiInstance = new AvvisiPagamentoApi();
RichiestaCreaAvvisoPagamentoDto creaAvvisoPagamentoDto = new RichiestaCreaAvvisoPagamentoDto(); // RichiestaCreaAvvisoPagamentoDto | creaAvvisoPagamentoDto
try {
    RispostaCreaAvvisoPagamentoDto result = apiInstance.postCreaUsingPOST(creaAvvisoPagamentoDto);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AvvisiPagamentoApi#postCreaUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **creaAvvisoPagamentoDto** | [**RichiestaCreaAvvisoPagamentoDto**](RichiestaCreaAvvisoPagamentoDto.md)| creaAvvisoPagamentoDto |

### Return type

[**RispostaCreaAvvisoPagamentoDto**](RispostaCreaAvvisoPagamentoDto.md)

### Authorization

[jwtToken](../README.md#jwtToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=utf-8

<a name="postInfoPerChiaveDebitoUsingPOST"></a>
# **postInfoPerChiaveDebitoUsingPOST**
> RispostaInfoAvvisoPagamentoPerChiaveDebitoDto postInfoPerChiaveDebitoUsingPOST(infoAvvisiPagamentoPerChiaveDebito)

Servizio che restituisce il dettaglio del debito tramite la chiave del debito

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AvvisiPagamentoApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: jwtToken
ApiKeyAuth jwtToken = (ApiKeyAuth) defaultClient.getAuthentication("jwtToken");
jwtToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//jwtToken.setApiKeyPrefix("Token");

AvvisiPagamentoApi apiInstance = new AvvisiPagamentoApi();
RichiestaInfoAvvisoPagamentoPerChiaveDebitoDto infoAvvisiPagamentoPerChiaveDebito = new RichiestaInfoAvvisoPagamentoPerChiaveDebitoDto(); // RichiestaInfoAvvisoPagamentoPerChiaveDebitoDto | infoAvvisiPagamentoPerChiaveDebito
try {
    RispostaInfoAvvisoPagamentoPerChiaveDebitoDto result = apiInstance.postInfoPerChiaveDebitoUsingPOST(infoAvvisiPagamentoPerChiaveDebito);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AvvisiPagamentoApi#postInfoPerChiaveDebitoUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **infoAvvisiPagamentoPerChiaveDebito** | [**RichiestaInfoAvvisoPagamentoPerChiaveDebitoDto**](RichiestaInfoAvvisoPagamentoPerChiaveDebitoDto.md)| infoAvvisiPagamentoPerChiaveDebito |

### Return type

[**RispostaInfoAvvisoPagamentoPerChiaveDebitoDto**](RispostaInfoAvvisoPagamentoPerChiaveDebitoDto.md)

### Authorization

[jwtToken](../README.md#jwtToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=utf-8

<a name="postInfoPerNumeroAvvisoUsingPOST"></a>
# **postInfoPerNumeroAvvisoUsingPOST**
> RispostaInfoAvvisoPagamentoPerNumeroAvvisoDto postInfoPerNumeroAvvisoUsingPOST(infoAvvisiPagamentoPerNumeroAvviso)

Servizio che restituisce il dettaglio del debito tramite NumeroAvviso

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AvvisiPagamentoApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: jwtToken
ApiKeyAuth jwtToken = (ApiKeyAuth) defaultClient.getAuthentication("jwtToken");
jwtToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//jwtToken.setApiKeyPrefix("Token");

AvvisiPagamentoApi apiInstance = new AvvisiPagamentoApi();
RichiestaInfoAvvisoPagamentoPerNumeroAvvisoDto infoAvvisiPagamentoPerNumeroAvviso = new RichiestaInfoAvvisoPagamentoPerNumeroAvvisoDto(); // RichiestaInfoAvvisoPagamentoPerNumeroAvvisoDto | infoAvvisiPagamentoPerNumeroAvviso
try {
    RispostaInfoAvvisoPagamentoPerNumeroAvvisoDto result = apiInstance.postInfoPerNumeroAvvisoUsingPOST(infoAvvisiPagamentoPerNumeroAvviso);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AvvisiPagamentoApi#postInfoPerNumeroAvvisoUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **infoAvvisiPagamentoPerNumeroAvviso** | [**RichiestaInfoAvvisoPagamentoPerNumeroAvvisoDto**](RichiestaInfoAvvisoPagamentoPerNumeroAvvisoDto.md)| infoAvvisiPagamentoPerNumeroAvviso |

### Return type

[**RispostaInfoAvvisoPagamentoPerNumeroAvvisoDto**](RispostaInfoAvvisoPagamentoPerNumeroAvvisoDto.md)

### Authorization

[jwtToken](../README.md#jwtToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=utf-8

<a name="postInfoUsingPOST"></a>
# **postInfoUsingPOST**
> RispostaInfoAvvisiPagamentoDto postInfoUsingPOST(infoAvvisiPagamento)

Servizio che restituisce la lista di pagamenti mod 3 che rispettano diversi criteri di ricerca (tipo debito, date, flag vari ecc.)

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AvvisiPagamentoApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: jwtToken
ApiKeyAuth jwtToken = (ApiKeyAuth) defaultClient.getAuthentication("jwtToken");
jwtToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//jwtToken.setApiKeyPrefix("Token");

AvvisiPagamentoApi apiInstance = new AvvisiPagamentoApi();
RichiestaInfoAvvisiPagamentoDto infoAvvisiPagamento = new RichiestaInfoAvvisiPagamentoDto(); // RichiestaInfoAvvisiPagamentoDto | infoAvvisiPagamento
try {
    RispostaInfoAvvisiPagamentoDto result = apiInstance.postInfoUsingPOST(infoAvvisiPagamento);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AvvisiPagamentoApi#postInfoUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **infoAvvisiPagamento** | [**RichiestaInfoAvvisiPagamentoDto**](RichiestaInfoAvvisiPagamentoDto.md)| infoAvvisiPagamento |

### Return type

[**RispostaInfoAvvisiPagamentoDto**](RispostaInfoAvvisiPagamentoDto.md)

### Authorization

[jwtToken](../README.md#jwtToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=utf-8

<a name="postSostituisciUsingPUT"></a>
# **postSostituisciUsingPUT**
> RispostaSostituisciAvvisoPagamentoDto postSostituisciUsingPUT(sostituisciAvvisoPagamentoDto)

Servizio che permette la sostituzione di un avviso (attivo).

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AvvisiPagamentoApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: jwtToken
ApiKeyAuth jwtToken = (ApiKeyAuth) defaultClient.getAuthentication("jwtToken");
jwtToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//jwtToken.setApiKeyPrefix("Token");

AvvisiPagamentoApi apiInstance = new AvvisiPagamentoApi();
RichiestaSostituisciAvvisoPagamentoDto sostituisciAvvisoPagamentoDto = new RichiestaSostituisciAvvisoPagamentoDto(); // RichiestaSostituisciAvvisoPagamentoDto | sostituisciAvvisoPagamentoDto
try {
    RispostaSostituisciAvvisoPagamentoDto result = apiInstance.postSostituisciUsingPUT(sostituisciAvvisoPagamentoDto);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AvvisiPagamentoApi#postSostituisciUsingPUT");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sostituisciAvvisoPagamentoDto** | [**RichiestaSostituisciAvvisoPagamentoDto**](RichiestaSostituisciAvvisoPagamentoDto.md)| sostituisciAvvisoPagamentoDto |

### Return type

[**RispostaSostituisciAvvisoPagamentoDto**](RispostaSostituisciAvvisoPagamentoDto.md)

### Authorization

[jwtToken](../README.md#jwtToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=utf-8


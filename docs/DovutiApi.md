# DovutiApi

All URIs are relative to *https://pagopa-staging.maggioli.cloud/jcitygov-pagopa/api/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteCancellaUsingDELETE**](DovutiApi.md#deleteCancellaUsingDELETE) | **DELETE** /rest/dovuti/v1/cancella | Necessario ad eliminare la posizione multi beneficiario, in opposizione all’attuale CancellaPosizionePagamento
[**patchAttivaUsingPATCH**](DovutiApi.md#patchAttivaUsingPATCH) | **PATCH** /rest/dovuti/v1/attiva | Necessario ad attivare la posizione multi beneficiario in caso sia stata disabilitata o creata in tale stato
[**patchModificaUsingPATCH**](DovutiApi.md#patchModificaUsingPATCH) | **PATCH** /rest/dovuti/v1/modifica | Si occupa di aggiornare le posizioni legate all’avviso multi beneficiario
[**postInviaDovutiUsingPOST**](DovutiApi.md#postInviaDovutiUsingPOST) | **POST** /rest/dovuti/v1/inviaDovuti | Permette di inviare in modo sincrono un singolo debito modello 3 (sia esso monobeneficiario o multibeneficiario). Il metodo è la versione aggiornata alle nuove SANP
[**postInviaDovutoUsingPOST**](DovutiApi.md#postInviaDovutoUsingPOST) | **POST** /rest/dovuti/v1/inviaDovuto | Permette di inviare in modo sincrono un singolo debito modello 3 (sia esso monobeneficiario o multibeneficiario). Il metodo è la versione aggiornata alle nuove SANP


<a name="deleteCancellaUsingDELETE"></a>
# **deleteCancellaUsingDELETE**
> RispostaEliminaAvvisoPagamentoDto deleteCancellaUsingDELETE(richiesta)

Necessario ad eliminare la posizione multi beneficiario, in opposizione all’attuale CancellaPosizionePagamento

In questo caso non c’è differenza tra multibeneficiario e monobeneficiario, se per un dato Numero Avviso viene trovato un debito multibeneficiario, verranno attivate entrambe le parti, altrimenti il funzionamento rimane lo stesso del precedente metodo.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DovutiApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: jwtToken
ApiKeyAuth jwtToken = (ApiKeyAuth) defaultClient.getAuthentication("jwtToken");
jwtToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//jwtToken.setApiKeyPrefix("Token");

DovutiApi apiInstance = new DovutiApi();
RichiestaCancellaDovutiDto richiesta = new RichiestaCancellaDovutiDto(); // RichiestaCancellaDovutiDto | richiesta
try {
    RispostaEliminaAvvisoPagamentoDto result = apiInstance.deleteCancellaUsingDELETE(richiesta);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DovutiApi#deleteCancellaUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **richiesta** | [**RichiestaCancellaDovutiDto**](RichiestaCancellaDovutiDto.md)| richiesta |

### Return type

[**RispostaEliminaAvvisoPagamentoDto**](RispostaEliminaAvvisoPagamentoDto.md)

### Authorization

[jwtToken](../README.md#jwtToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;charset=utf-8

<a name="patchAttivaUsingPATCH"></a>
# **patchAttivaUsingPATCH**
> RispostaAttivaAvvisiPagamentoDto patchAttivaUsingPATCH(richiesta)

Necessario ad attivare la posizione multi beneficiario in caso sia stata disabilitata o creata in tale stato

In questo caso non c’è differenza tra multibeneficiario e monobeneficiario, se per un dato Numero Avviso viene trovato un debito multibeneficiario, verranno attivate entrambe le parti, altrimenti il funzionamento rimane lo stesso del precedente metodo. E’ possibile passare una lista di elementi. Il metodo permette anche la disattivazione delle posizioni. Non è prassi comune disattivare una posizione esistente e già attiva, ma se necessario è possibile disattivarla chiamando lo stesso metodo con l’aggiunta del parametro relativo, ma solo se non ci sono pagamenti associati e il connettore di riferimento è Maggioli o Payer. In tutti gli altri casi la disattivazione non è concessa

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DovutiApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: jwtToken
ApiKeyAuth jwtToken = (ApiKeyAuth) defaultClient.getAuthentication("jwtToken");
jwtToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//jwtToken.setApiKeyPrefix("Token");

DovutiApi apiInstance = new DovutiApi();
RichiestaAttivaDovutiDto richiesta = new RichiestaAttivaDovutiDto(); // RichiestaAttivaDovutiDto | richiesta
try {
    RispostaAttivaAvvisiPagamentoDto result = apiInstance.patchAttivaUsingPATCH(richiesta);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DovutiApi#patchAttivaUsingPATCH");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **richiesta** | [**RichiestaAttivaDovutiDto**](RichiestaAttivaDovutiDto.md)| richiesta |

### Return type

[**RispostaAttivaAvvisiPagamentoDto**](RispostaAttivaAvvisiPagamentoDto.md)

### Authorization

[jwtToken](../README.md#jwtToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=utf-8

<a name="patchModificaUsingPATCH"></a>
# **patchModificaUsingPATCH**
> RispostaModificaDovutiDto patchModificaUsingPATCH(richiestaModifica)

Si occupa di aggiornare le posizioni legate all’avviso multi beneficiario

Sono state predisposte delle operazioni per dividere le modifiche che vogliono essere apportate

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DovutiApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: jwtToken
ApiKeyAuth jwtToken = (ApiKeyAuth) defaultClient.getAuthentication("jwtToken");
jwtToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//jwtToken.setApiKeyPrefix("Token");

DovutiApi apiInstance = new DovutiApi();
RichiestaModificaDovutiDto richiestaModifica = new RichiestaModificaDovutiDto(); // RichiestaModificaDovutiDto | richiestaModifica
try {
    RispostaModificaDovutiDto result = apiInstance.patchModificaUsingPATCH(richiestaModifica);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DovutiApi#patchModificaUsingPATCH");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **richiestaModifica** | [**RichiestaModificaDovutiDto**](RichiestaModificaDovutiDto.md)| richiestaModifica |

### Return type

[**RispostaModificaDovutiDto**](RispostaModificaDovutiDto.md)

### Authorization

[jwtToken](../README.md#jwtToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=utf-8

<a name="postInviaDovutiUsingPOST"></a>
# **postInviaDovutiUsingPOST**
> RispostaInviaDovutiDto postInviaDovutiUsingPOST(richiesta)

Permette di inviare in modo sincrono un singolo debito modello 3 (sia esso monobeneficiario o multibeneficiario). Il metodo è la versione aggiornata alle nuove SANP

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DovutiApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: jwtToken
ApiKeyAuth jwtToken = (ApiKeyAuth) defaultClient.getAuthentication("jwtToken");
jwtToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//jwtToken.setApiKeyPrefix("Token");

DovutiApi apiInstance = new DovutiApi();
RichiestaInviaDovutiRestDto richiesta = new RichiestaInviaDovutiRestDto(); // RichiestaInviaDovutiRestDto | richiesta
try {
    RispostaInviaDovutiDto result = apiInstance.postInviaDovutiUsingPOST(richiesta);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DovutiApi#postInviaDovutiUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **richiesta** | [**RichiestaInviaDovutiRestDto**](RichiestaInviaDovutiRestDto.md)| richiesta |

### Return type

[**RispostaInviaDovutiDto**](RispostaInviaDovutiDto.md)

### Authorization

[jwtToken](../README.md#jwtToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=utf-8

<a name="postInviaDovutoUsingPOST"></a>
# **postInviaDovutoUsingPOST**
> RispostaInviaDovutoDto postInviaDovutoUsingPOST(richiesta)

Permette di inviare in modo sincrono un singolo debito modello 3 (sia esso monobeneficiario o multibeneficiario). Il metodo è la versione aggiornata alle nuove SANP

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DovutiApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: jwtToken
ApiKeyAuth jwtToken = (ApiKeyAuth) defaultClient.getAuthentication("jwtToken");
jwtToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//jwtToken.setApiKeyPrefix("Token");

DovutiApi apiInstance = new DovutiApi();
RichiestaInviaDovutoRestDto richiesta = new RichiestaInviaDovutoRestDto(); // RichiestaInviaDovutoRestDto | richiesta
try {
    RispostaInviaDovutoDto result = apiInstance.postInviaDovutoUsingPOST(richiesta);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DovutiApi#postInviaDovutoUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **richiesta** | [**RichiestaInviaDovutoRestDto**](RichiestaInviaDovutoRestDto.md)| richiesta |

### Return type

[**RispostaInviaDovutoDto**](RispostaInviaDovutoDto.md)

### Authorization

[jwtToken](../README.md#jwtToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=utf-8


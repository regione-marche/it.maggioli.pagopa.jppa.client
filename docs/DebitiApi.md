# DebitiApi

All URIs are relative to *https://pagopa-staging.maggioli.cloud/jcitygov-pagopa/api/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**patchModificaAnnoCompetenzaUsingPATCH**](DebitiApi.md#patchModificaAnnoCompetenzaUsingPATCH) | **PATCH** /rest/debiti/v1/modificaAnnoCompetenza | Permette di modificare l&#39;anno di competenza per TUTTI i dettagli del debito (&lt;b&gt;anche per debiti già pagati&lt;/b&gt;). Serve per aggiornare in particolare i dati contabili
[**patchModificaDettagliImportoUsingPATCH**](DebitiApi.md#patchModificaDettagliImportoUsingPATCH) | **PATCH** /rest/debiti/v1/modificaDettagliImporto | Permette di modificare i dettagli amministrativi del debito
[**postCheckoutUsingPOST**](DebitiApi.md#postCheckoutUsingPOST) | **POST** /rest/debiti/v1/checkout | Servizio che gestisce la richiesta di pagamento di un carrello di debiti e restituisce l&#39;identificativo della transazione che è stata creata ed un URL
[**postInfoListaScartiUsingPOST**](DebitiApi.md#postInfoListaScartiUsingPOST) | **POST** /rest/debiti/v1/infoListaScarti | Servizio che restituisce la lista di pagamenti mod 3 scartati dal caricamento o dall’aggiornamento in un certo periodo di tempo
[**postPagaUsingPATCH**](DebitiApi.md#postPagaUsingPATCH) | **PATCH** /rest/debiti/v1/modificaGruppoDebiti | Servizio che permette di modificare il campo gruppodeb di una lista di debiti mod 3
[**postPagaUsingPOST**](DebitiApi.md#postPagaUsingPOST) | **POST** /rest/debiti/v1/paga | Servizio che gestisce la richiesta di pagamento di un carrello di debiti e restituisce l&#39;identificativo della transazione che è stata creata ed un URL


<a name="patchModificaAnnoCompetenzaUsingPATCH"></a>
# **patchModificaAnnoCompetenzaUsingPATCH**
> RispostaModificaAnnoCompetenzaDto patchModificaAnnoCompetenzaUsingPATCH(richiestaPagaDebitiDto)

Permette di modificare l&#39;anno di competenza per TUTTI i dettagli del debito (&lt;b&gt;anche per debiti già pagati&lt;/b&gt;). Serve per aggiornare in particolare i dati contabili

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DebitiApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: jwtToken
ApiKeyAuth jwtToken = (ApiKeyAuth) defaultClient.getAuthentication("jwtToken");
jwtToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//jwtToken.setApiKeyPrefix("Token");

DebitiApi apiInstance = new DebitiApi();
RichiestaModificaAnnoCompetenzaDto richiestaPagaDebitiDto = new RichiestaModificaAnnoCompetenzaDto(); // RichiestaModificaAnnoCompetenzaDto | richiestaPagaDebitiDto
try {
    RispostaModificaAnnoCompetenzaDto result = apiInstance.patchModificaAnnoCompetenzaUsingPATCH(richiestaPagaDebitiDto);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DebitiApi#patchModificaAnnoCompetenzaUsingPATCH");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **richiestaPagaDebitiDto** | [**RichiestaModificaAnnoCompetenzaDto**](RichiestaModificaAnnoCompetenzaDto.md)| richiestaPagaDebitiDto |

### Return type

[**RispostaModificaAnnoCompetenzaDto**](RispostaModificaAnnoCompetenzaDto.md)

### Authorization

[jwtToken](../README.md#jwtToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=utf-8

<a name="patchModificaDettagliImportoUsingPATCH"></a>
# **patchModificaDettagliImportoUsingPATCH**
> RispostaModificaDettagliImportoDto patchModificaDettagliImportoUsingPATCH(richiestaPagaDebitiDto)

Permette di modificare i dettagli amministrativi del debito

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DebitiApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: jwtToken
ApiKeyAuth jwtToken = (ApiKeyAuth) defaultClient.getAuthentication("jwtToken");
jwtToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//jwtToken.setApiKeyPrefix("Token");

DebitiApi apiInstance = new DebitiApi();
RichiestaModificaDettagliImportoDto richiestaPagaDebitiDto = new RichiestaModificaDettagliImportoDto(); // RichiestaModificaDettagliImportoDto | richiestaPagaDebitiDto
try {
    RispostaModificaDettagliImportoDto result = apiInstance.patchModificaDettagliImportoUsingPATCH(richiestaPagaDebitiDto);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DebitiApi#patchModificaDettagliImportoUsingPATCH");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **richiestaPagaDebitiDto** | [**RichiestaModificaDettagliImportoDto**](RichiestaModificaDettagliImportoDto.md)| richiestaPagaDebitiDto |

### Return type

[**RispostaModificaDettagliImportoDto**](RispostaModificaDettagliImportoDto.md)

### Authorization

[jwtToken](../README.md#jwtToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=utf-8

<a name="postCheckoutUsingPOST"></a>
# **postCheckoutUsingPOST**
> RispostaPagaDebitiDto postCheckoutUsingPOST(richiestaCheckoutDto)

Servizio che gestisce la richiesta di pagamento di un carrello di debiti e restituisce l&#39;identificativo della transazione che è stata creata ed un URL

Il servizio creerà il/i debito/i, creerà una transazione e restituirà un identTransazione e un URL. Il client invocando tale URL concluderà la procedura di pagamento (modello 1) del carrello debiti prima sottomesso.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DebitiApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: jwtToken
ApiKeyAuth jwtToken = (ApiKeyAuth) defaultClient.getAuthentication("jwtToken");
jwtToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//jwtToken.setApiKeyPrefix("Token");

DebitiApi apiInstance = new DebitiApi();
RichiestaCheckoutDto richiestaCheckoutDto = new RichiestaCheckoutDto(); // RichiestaCheckoutDto | richiestaCheckoutDto
try {
    RispostaPagaDebitiDto result = apiInstance.postCheckoutUsingPOST(richiestaCheckoutDto);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DebitiApi#postCheckoutUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **richiestaCheckoutDto** | [**RichiestaCheckoutDto**](RichiestaCheckoutDto.md)| richiestaCheckoutDto |

### Return type

[**RispostaPagaDebitiDto**](RispostaPagaDebitiDto.md)

### Authorization

[jwtToken](../README.md#jwtToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=utf-8

<a name="postInfoListaScartiUsingPOST"></a>
# **postInfoListaScartiUsingPOST**
> RispostaInfoListaScartiCaricamentoDebitiPdpDto postInfoListaScartiUsingPOST(richiestaInfoListaScarti)

Servizio che restituisce la lista di pagamenti mod 3 scartati dal caricamento o dall’aggiornamento in un certo periodo di tempo

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DebitiApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: jwtToken
ApiKeyAuth jwtToken = (ApiKeyAuth) defaultClient.getAuthentication("jwtToken");
jwtToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//jwtToken.setApiKeyPrefix("Token");

DebitiApi apiInstance = new DebitiApi();
RichiestaInfoListaScartiCaricamentoDebitiPdpDto richiestaInfoListaScarti = new RichiestaInfoListaScartiCaricamentoDebitiPdpDto(); // RichiestaInfoListaScartiCaricamentoDebitiPdpDto | richiestaInfoListaScarti
try {
    RispostaInfoListaScartiCaricamentoDebitiPdpDto result = apiInstance.postInfoListaScartiUsingPOST(richiestaInfoListaScarti);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DebitiApi#postInfoListaScartiUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **richiestaInfoListaScarti** | [**RichiestaInfoListaScartiCaricamentoDebitiPdpDto**](RichiestaInfoListaScartiCaricamentoDebitiPdpDto.md)| richiestaInfoListaScarti |

### Return type

[**RispostaInfoListaScartiCaricamentoDebitiPdpDto**](RispostaInfoListaScartiCaricamentoDebitiPdpDto.md)

### Authorization

[jwtToken](../README.md#jwtToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=utf-8

<a name="postPagaUsingPATCH"></a>
# **postPagaUsingPATCH**
> RispostaModificaGruppoDebitiDto postPagaUsingPATCH(richiestaModificaGruppoDebiti)

Servizio che permette di modificare il campo gruppodeb di una lista di debiti mod 3

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DebitiApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: jwtToken
ApiKeyAuth jwtToken = (ApiKeyAuth) defaultClient.getAuthentication("jwtToken");
jwtToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//jwtToken.setApiKeyPrefix("Token");

DebitiApi apiInstance = new DebitiApi();
RichiestaModificaGruppoDebitiDto richiestaModificaGruppoDebiti = new RichiestaModificaGruppoDebitiDto(); // RichiestaModificaGruppoDebitiDto | richiestaModificaGruppoDebiti
try {
    RispostaModificaGruppoDebitiDto result = apiInstance.postPagaUsingPATCH(richiestaModificaGruppoDebiti);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DebitiApi#postPagaUsingPATCH");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **richiestaModificaGruppoDebiti** | [**RichiestaModificaGruppoDebitiDto**](RichiestaModificaGruppoDebitiDto.md)| richiestaModificaGruppoDebiti |

### Return type

[**RispostaModificaGruppoDebitiDto**](RispostaModificaGruppoDebitiDto.md)

### Authorization

[jwtToken](../README.md#jwtToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=utf-8

<a name="postPagaUsingPOST"></a>
# **postPagaUsingPOST**
> RispostaPagaDebitiDto postPagaUsingPOST(richiestaPagaDebitiDto)

Servizio che gestisce la richiesta di pagamento di un carrello di debiti e restituisce l&#39;identificativo della transazione che è stata creata ed un URL

Il servizio creerà il/i debito/i, creerà una transazione e restituirà un identTransazione e un URL. Il client invocando tale URL concluderà la procedura di pagamento (modello 1) del carrello debiti prima sottomesso.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DebitiApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: jwtToken
ApiKeyAuth jwtToken = (ApiKeyAuth) defaultClient.getAuthentication("jwtToken");
jwtToken.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//jwtToken.setApiKeyPrefix("Token");

DebitiApi apiInstance = new DebitiApi();
RichiestaPagaDebitiDto richiestaPagaDebitiDto = new RichiestaPagaDebitiDto(); // RichiestaPagaDebitiDto | richiestaPagaDebitiDto
try {
    RispostaPagaDebitiDto result = apiInstance.postPagaUsingPOST(richiestaPagaDebitiDto);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DebitiApi#postPagaUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **richiestaPagaDebitiDto** | [**RichiestaPagaDebitiDto**](RichiestaPagaDebitiDto.md)| richiestaPagaDebitiDto |

### Return type

[**RispostaPagaDebitiDto**](RispostaPagaDebitiDto.md)

### Authorization

[jwtToken](../README.md#jwtToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=utf-8


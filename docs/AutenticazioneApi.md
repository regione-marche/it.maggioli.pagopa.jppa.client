# AutenticazioneApi

All URIs are relative to *https://pagopa-staging.maggioli.cloud/jcitygov-pagopa/api/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**loginUsingPOST**](AutenticazioneApi.md#loginUsingPOST) | **POST** /rest/login | Permette l&#39;autenticazione


<a name="loginUsingPOST"></a>
# **loginUsingPOST**
> JppaLoginResponse loginUsingPOST(request)

Permette l&#39;autenticazione

Genera un token di autenticazione   Esempio:   idMEssaggio: \&quot;2024-04-09T13:51:40.996Z\&quot;  identificativoEnte: \&quot;10025\&quot;    password: \&quot;password\&quot;   username: \&quot;username\&quot;

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AutenticazioneApi;


AutenticazioneApi apiInstance = new AutenticazioneApi();
JppaLoginRequest request = new JppaLoginRequest(); // JppaLoginRequest | request
try {
    JppaLoginResponse result = apiInstance.loginUsingPOST(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AutenticazioneApi#loginUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**JppaLoginRequest**](JppaLoginRequest.md)| request |

### Return type

[**JppaLoginResponse**](JppaLoginResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*


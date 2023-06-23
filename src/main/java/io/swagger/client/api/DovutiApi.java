/*
 * API Gateway Pagamenti
 * Set API REST PagoPA
 *
 * OpenAPI spec version: 1.0
 * Contact: pagamenti.produzione@maggioli.it
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api;

import io.swagger.client.ApiCallback;
import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.ApiResponse;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;
import io.swagger.client.ProgressRequestBody;
import io.swagger.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import io.swagger.client.model.RichiestaAttivaDovutiDto;
import io.swagger.client.model.RichiestaCancellaDovutiDto;
import io.swagger.client.model.RichiestaInviaDovutiRestDto;
import io.swagger.client.model.RichiestaInviaDovutoRestDto;
import io.swagger.client.model.RichiestaModificaDovutiDto;
import io.swagger.client.model.RispostaAttivaAvvisiPagamentoDto;
import io.swagger.client.model.RispostaEliminaAvvisoPagamentoDto;
import io.swagger.client.model.RispostaInviaDovutiDto;
import io.swagger.client.model.RispostaInviaDovutoDto;
import io.swagger.client.model.RispostaModificaDovutiDto;
import io.swagger.client.model.StandardAPIErrorResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DovutiApi {
    private ApiClient apiClient;

    public DovutiApi() {
        this(Configuration.getDefaultApiClient());
    }

    public DovutiApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for deleteCancellaUsingDELETE
     * @param richiesta richiesta (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteCancellaUsingDELETECall(RichiestaCancellaDovutiDto richiesta, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = richiesta;

        // create path and map variables
        String localVarPath = "/rest/dovuti/v1/cancella";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json;charset=utf-8"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "jwtToken" };
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call deleteCancellaUsingDELETEValidateBeforeCall(RichiestaCancellaDovutiDto richiesta, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'richiesta' is set
        if (richiesta == null) {
            throw new ApiException("Missing the required parameter 'richiesta' when calling deleteCancellaUsingDELETE(Async)");
        }
        

        com.squareup.okhttp.Call call = deleteCancellaUsingDELETECall(richiesta, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Necessario ad eliminare la posizione multi beneficiario, in opposizione all’attuale CancellaPosizionePagamento
     * In questo caso non c’è differenza tra multibeneficiario e monobeneficiario, se per un dato Numero Avviso viene trovato un debito multibeneficiario, verranno attivate entrambe le parti, altrimenti il funzionamento rimane lo stesso del precedente metodo.
     * @param richiesta richiesta (required)
     * @return RispostaEliminaAvvisoPagamentoDto
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public RispostaEliminaAvvisoPagamentoDto deleteCancellaUsingDELETE(RichiestaCancellaDovutiDto richiesta) throws ApiException {
        ApiResponse<RispostaEliminaAvvisoPagamentoDto> resp = deleteCancellaUsingDELETEWithHttpInfo(richiesta);
        return resp.getData();
    }

    /**
     * Necessario ad eliminare la posizione multi beneficiario, in opposizione all’attuale CancellaPosizionePagamento
     * In questo caso non c’è differenza tra multibeneficiario e monobeneficiario, se per un dato Numero Avviso viene trovato un debito multibeneficiario, verranno attivate entrambe le parti, altrimenti il funzionamento rimane lo stesso del precedente metodo.
     * @param richiesta richiesta (required)
     * @return ApiResponse&lt;RispostaEliminaAvvisoPagamentoDto&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<RispostaEliminaAvvisoPagamentoDto> deleteCancellaUsingDELETEWithHttpInfo(RichiestaCancellaDovutiDto richiesta) throws ApiException {
        com.squareup.okhttp.Call call = deleteCancellaUsingDELETEValidateBeforeCall(richiesta, null, null);
        Type localVarReturnType = new TypeToken<RispostaEliminaAvvisoPagamentoDto>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Necessario ad eliminare la posizione multi beneficiario, in opposizione all’attuale CancellaPosizionePagamento (asynchronously)
     * In questo caso non c’è differenza tra multibeneficiario e monobeneficiario, se per un dato Numero Avviso viene trovato un debito multibeneficiario, verranno attivate entrambe le parti, altrimenti il funzionamento rimane lo stesso del precedente metodo.
     * @param richiesta richiesta (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteCancellaUsingDELETEAsync(RichiestaCancellaDovutiDto richiesta, final ApiCallback<RispostaEliminaAvvisoPagamentoDto> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = deleteCancellaUsingDELETEValidateBeforeCall(richiesta, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<RispostaEliminaAvvisoPagamentoDto>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for patchAttivaUsingPATCH
     * @param richiesta richiesta (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call patchAttivaUsingPATCHCall(RichiestaAttivaDovutiDto richiesta, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = richiesta;

        // create path and map variables
        String localVarPath = "/rest/dovuti/v1/attiva";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json;charset=utf-8"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "jwtToken" };
        return apiClient.buildCall(localVarPath, "PATCH", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call patchAttivaUsingPATCHValidateBeforeCall(RichiestaAttivaDovutiDto richiesta, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'richiesta' is set
        if (richiesta == null) {
            throw new ApiException("Missing the required parameter 'richiesta' when calling patchAttivaUsingPATCH(Async)");
        }
        

        com.squareup.okhttp.Call call = patchAttivaUsingPATCHCall(richiesta, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Necessario ad attivare la posizione multi beneficiario in caso sia stata disabilitata o creata in tale stato
     * In questo caso non c’è differenza tra multibeneficiario e monobeneficiario, se per un dato Numero Avviso viene trovato un debito multibeneficiario, verranno attivate entrambe le parti, altrimenti il funzionamento rimane lo stesso del precedente metodo. E’ possibile passare una lista di elementi. Il metodo permette anche la disattivazione delle posizioni. Non è prassi comune disattivare una posizione esistente e già attiva, ma se necessario è possibile disattivarla chiamando lo stesso metodo con l’aggiunta del parametro relativo, ma solo se non ci sono pagamenti associati e il connettore di riferimento è Maggioli o Payer. In tutti gli altri casi la disattivazione non è concessa
     * @param richiesta richiesta (required)
     * @return RispostaAttivaAvvisiPagamentoDto
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public RispostaAttivaAvvisiPagamentoDto patchAttivaUsingPATCH(RichiestaAttivaDovutiDto richiesta) throws ApiException {
        ApiResponse<RispostaAttivaAvvisiPagamentoDto> resp = patchAttivaUsingPATCHWithHttpInfo(richiesta);
        return resp.getData();
    }

    /**
     * Necessario ad attivare la posizione multi beneficiario in caso sia stata disabilitata o creata in tale stato
     * In questo caso non c’è differenza tra multibeneficiario e monobeneficiario, se per un dato Numero Avviso viene trovato un debito multibeneficiario, verranno attivate entrambe le parti, altrimenti il funzionamento rimane lo stesso del precedente metodo. E’ possibile passare una lista di elementi. Il metodo permette anche la disattivazione delle posizioni. Non è prassi comune disattivare una posizione esistente e già attiva, ma se necessario è possibile disattivarla chiamando lo stesso metodo con l’aggiunta del parametro relativo, ma solo se non ci sono pagamenti associati e il connettore di riferimento è Maggioli o Payer. In tutti gli altri casi la disattivazione non è concessa
     * @param richiesta richiesta (required)
     * @return ApiResponse&lt;RispostaAttivaAvvisiPagamentoDto&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<RispostaAttivaAvvisiPagamentoDto> patchAttivaUsingPATCHWithHttpInfo(RichiestaAttivaDovutiDto richiesta) throws ApiException {
        com.squareup.okhttp.Call call = patchAttivaUsingPATCHValidateBeforeCall(richiesta, null, null);
        Type localVarReturnType = new TypeToken<RispostaAttivaAvvisiPagamentoDto>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Necessario ad attivare la posizione multi beneficiario in caso sia stata disabilitata o creata in tale stato (asynchronously)
     * In questo caso non c’è differenza tra multibeneficiario e monobeneficiario, se per un dato Numero Avviso viene trovato un debito multibeneficiario, verranno attivate entrambe le parti, altrimenti il funzionamento rimane lo stesso del precedente metodo. E’ possibile passare una lista di elementi. Il metodo permette anche la disattivazione delle posizioni. Non è prassi comune disattivare una posizione esistente e già attiva, ma se necessario è possibile disattivarla chiamando lo stesso metodo con l’aggiunta del parametro relativo, ma solo se non ci sono pagamenti associati e il connettore di riferimento è Maggioli o Payer. In tutti gli altri casi la disattivazione non è concessa
     * @param richiesta richiesta (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call patchAttivaUsingPATCHAsync(RichiestaAttivaDovutiDto richiesta, final ApiCallback<RispostaAttivaAvvisiPagamentoDto> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = patchAttivaUsingPATCHValidateBeforeCall(richiesta, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<RispostaAttivaAvvisiPagamentoDto>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for patchModificaUsingPATCH
     * @param richiestaModifica richiestaModifica (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call patchModificaUsingPATCHCall(RichiestaModificaDovutiDto richiestaModifica, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = richiestaModifica;

        // create path and map variables
        String localVarPath = "/rest/dovuti/v1/modifica";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json;charset=utf-8"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "jwtToken" };
        return apiClient.buildCall(localVarPath, "PATCH", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call patchModificaUsingPATCHValidateBeforeCall(RichiestaModificaDovutiDto richiestaModifica, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'richiestaModifica' is set
        if (richiestaModifica == null) {
            throw new ApiException("Missing the required parameter 'richiestaModifica' when calling patchModificaUsingPATCH(Async)");
        }
        

        com.squareup.okhttp.Call call = patchModificaUsingPATCHCall(richiestaModifica, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Si occupa di aggiornare le posizioni legate all’avviso multi beneficiario
     * Sono state predisposte delle operazioni per dividere le modifiche che vogliono essere apportate
     * @param richiestaModifica richiestaModifica (required)
     * @return RispostaModificaDovutiDto
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public RispostaModificaDovutiDto patchModificaUsingPATCH(RichiestaModificaDovutiDto richiestaModifica) throws ApiException {
        ApiResponse<RispostaModificaDovutiDto> resp = patchModificaUsingPATCHWithHttpInfo(richiestaModifica);
        return resp.getData();
    }

    /**
     * Si occupa di aggiornare le posizioni legate all’avviso multi beneficiario
     * Sono state predisposte delle operazioni per dividere le modifiche che vogliono essere apportate
     * @param richiestaModifica richiestaModifica (required)
     * @return ApiResponse&lt;RispostaModificaDovutiDto&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<RispostaModificaDovutiDto> patchModificaUsingPATCHWithHttpInfo(RichiestaModificaDovutiDto richiestaModifica) throws ApiException {
        com.squareup.okhttp.Call call = patchModificaUsingPATCHValidateBeforeCall(richiestaModifica, null, null);
        Type localVarReturnType = new TypeToken<RispostaModificaDovutiDto>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Si occupa di aggiornare le posizioni legate all’avviso multi beneficiario (asynchronously)
     * Sono state predisposte delle operazioni per dividere le modifiche che vogliono essere apportate
     * @param richiestaModifica richiestaModifica (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call patchModificaUsingPATCHAsync(RichiestaModificaDovutiDto richiestaModifica, final ApiCallback<RispostaModificaDovutiDto> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = patchModificaUsingPATCHValidateBeforeCall(richiestaModifica, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<RispostaModificaDovutiDto>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for postInviaDovutiUsingPOST
     * @param richiesta richiesta (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postInviaDovutiUsingPOSTCall(RichiestaInviaDovutiRestDto richiesta, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = richiesta;

        // create path and map variables
        String localVarPath = "/rest/dovuti/v1/inviaDovuti";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json;charset=utf-8"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "jwtToken" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call postInviaDovutiUsingPOSTValidateBeforeCall(RichiestaInviaDovutiRestDto richiesta, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'richiesta' is set
        if (richiesta == null) {
            throw new ApiException("Missing the required parameter 'richiesta' when calling postInviaDovutiUsingPOST(Async)");
        }
        

        com.squareup.okhttp.Call call = postInviaDovutiUsingPOSTCall(richiesta, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Permette di inviare in modo sincrono un singolo debito modello 3 (sia esso monobeneficiario o multibeneficiario). Il metodo è la versione aggiornata alle nuove SANP
     * 
     * @param richiesta richiesta (required)
     * @return RispostaInviaDovutiDto
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public RispostaInviaDovutiDto postInviaDovutiUsingPOST(RichiestaInviaDovutiRestDto richiesta) throws ApiException {
        ApiResponse<RispostaInviaDovutiDto> resp = postInviaDovutiUsingPOSTWithHttpInfo(richiesta);
        return resp.getData();
    }

    /**
     * Permette di inviare in modo sincrono un singolo debito modello 3 (sia esso monobeneficiario o multibeneficiario). Il metodo è la versione aggiornata alle nuove SANP
     * 
     * @param richiesta richiesta (required)
     * @return ApiResponse&lt;RispostaInviaDovutiDto&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<RispostaInviaDovutiDto> postInviaDovutiUsingPOSTWithHttpInfo(RichiestaInviaDovutiRestDto richiesta) throws ApiException {
        com.squareup.okhttp.Call call = postInviaDovutiUsingPOSTValidateBeforeCall(richiesta, null, null);
        Type localVarReturnType = new TypeToken<RispostaInviaDovutiDto>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Permette di inviare in modo sincrono un singolo debito modello 3 (sia esso monobeneficiario o multibeneficiario). Il metodo è la versione aggiornata alle nuove SANP (asynchronously)
     * 
     * @param richiesta richiesta (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postInviaDovutiUsingPOSTAsync(RichiestaInviaDovutiRestDto richiesta, final ApiCallback<RispostaInviaDovutiDto> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = postInviaDovutiUsingPOSTValidateBeforeCall(richiesta, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<RispostaInviaDovutiDto>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for postInviaDovutoUsingPOST
     * @param richiesta richiesta (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postInviaDovutoUsingPOSTCall(RichiestaInviaDovutoRestDto richiesta, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = richiesta;

        // create path and map variables
        String localVarPath = "/rest/dovuti/v1/inviaDovuto";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json;charset=utf-8"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "jwtToken" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call postInviaDovutoUsingPOSTValidateBeforeCall(RichiestaInviaDovutoRestDto richiesta, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'richiesta' is set
        if (richiesta == null) {
            throw new ApiException("Missing the required parameter 'richiesta' when calling postInviaDovutoUsingPOST(Async)");
        }
        

        com.squareup.okhttp.Call call = postInviaDovutoUsingPOSTCall(richiesta, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Permette di inviare in modo sincrono un singolo debito modello 3 (sia esso monobeneficiario o multibeneficiario). Il metodo è la versione aggiornata alle nuove SANP
     * 
     * @param richiesta richiesta (required)
     * @return RispostaInviaDovutoDto
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public RispostaInviaDovutoDto postInviaDovutoUsingPOST(RichiestaInviaDovutoRestDto richiesta) throws ApiException {
        ApiResponse<RispostaInviaDovutoDto> resp = postInviaDovutoUsingPOSTWithHttpInfo(richiesta);
        return resp.getData();
    }

    /**
     * Permette di inviare in modo sincrono un singolo debito modello 3 (sia esso monobeneficiario o multibeneficiario). Il metodo è la versione aggiornata alle nuove SANP
     * 
     * @param richiesta richiesta (required)
     * @return ApiResponse&lt;RispostaInviaDovutoDto&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<RispostaInviaDovutoDto> postInviaDovutoUsingPOSTWithHttpInfo(RichiestaInviaDovutoRestDto richiesta) throws ApiException {
        com.squareup.okhttp.Call call = postInviaDovutoUsingPOSTValidateBeforeCall(richiesta, null, null);
        Type localVarReturnType = new TypeToken<RispostaInviaDovutoDto>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Permette di inviare in modo sincrono un singolo debito modello 3 (sia esso monobeneficiario o multibeneficiario). Il metodo è la versione aggiornata alle nuove SANP (asynchronously)
     * 
     * @param richiesta richiesta (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postInviaDovutoUsingPOSTAsync(RichiestaInviaDovutoRestDto richiesta, final ApiCallback<RispostaInviaDovutoDto> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = postInviaDovutoUsingPOSTValidateBeforeCall(richiesta, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<RispostaInviaDovutoDto>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
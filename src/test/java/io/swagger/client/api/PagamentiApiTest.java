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

import io.swagger.client.model.RichiestaInfoAvvisoPagamentoPerIuvDto;
import io.swagger.client.model.RichiestaInfoPagamentoDebitoDto;
import io.swagger.client.model.RichiestaInfoPagamentoDovutoDto;
import io.swagger.client.model.RichiestaInfoPagamentoTransazioneDto;
import io.swagger.client.model.RichiestaListaPagamentiDto;
import io.swagger.client.model.RispostaInfoPagamentoDebitoDto;
import io.swagger.client.model.RispostaInfoPagamentoDovutoDto;
import io.swagger.client.model.RispostaInfoPagamentoPerIuvDto;
import io.swagger.client.model.RispostaInfoPagamentoTransazioneDto;
import io.swagger.client.model.RispostaListaPagamentiDto;
import io.swagger.client.model.StandardAPIErrorResponse;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PagamentiApi
 */
@Ignore
public class PagamentiApiTest {

    private final PagamentiApi api = new PagamentiApi();

    
    /**
     * Servizio che restituisce il dettaglio del pagamento se è stato pagato utilizzando le chiavi del debito come input
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postInfoPerDebitoUsingPOSTTest() throws Exception {
        RichiestaInfoPagamentoDebitoDto richiestaInfo = null;
        RispostaInfoPagamentoDebitoDto response = api.postInfoPerDebitoUsingPOST(richiestaInfo);

        // TODO: test validations
    }
    
    /**
     * Servizio che restituisce il dettaglio del pagamento se è stato pagato utilizzando le chiavi del debito come input
     *
     * Ritorna anche il testo della nuova RT (se presente), sia per i debiti monobeneficiario che per i multibeneficiario. Inoltre nel caso ci siano associati dei pagamenti multibeneficiario, c’è un tag aggiuntivo che li descrive e i relativi pagamenti telematici
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postInfoPerDovutoUsingPOSTTest() throws Exception {
        RichiestaInfoPagamentoDovutoDto richiestaInfoPagamentoDovutoDto = null;
        RispostaInfoPagamentoDovutoDto response = api.postInfoPerDovutoUsingPOST(richiestaInfoPagamentoDovutoDto);

        // TODO: test validations
    }
    
    /**
     * Servizio che permette di ricevere informazioni sui pagamenti attraverso lo IUV in input
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postInfoPerIuvUsingPOSTTest() throws Exception {
        RichiestaInfoAvvisoPagamentoPerIuvDto richiestaInfoPagamentoDebitoDto = null;
        RispostaInfoPagamentoPerIuvDto response = api.postInfoPerIuvUsingPOST(richiestaInfoPagamentoDebitoDto);

        // TODO: test validations
    }
    
    /**
     * Servizio che restituisce il dettaglio del pagamento se è stato pagato utilizzando l’idTransazione del pagamento come input
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postInfoPerTransazioneUsingPOSTTest() throws Exception {
        RichiestaInfoPagamentoTransazioneDto richiesta = null;
        RispostaInfoPagamentoTransazioneDto response = api.postInfoPerTransazioneUsingPOST(richiesta);

        // TODO: test validations
    }
    
    /**
     * Servizio che permette il recupero della lista di pagamenti effettuati.
     *
     * Recupera tutti i pagamenti nello stato CONTABILIZZATO o NOTIFICATO con data di creazione del pagamento telematico incluso nelle date, non è la data del pagamento!
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postInfoUsingPOST2Test() throws Exception {
        RichiestaListaPagamentiDto richiestaListaPagamentiDto = null;
        RispostaListaPagamentiDto response = api.postInfoUsingPOST2(richiestaListaPagamentiDto);

        // TODO: test validations
    }
    
}

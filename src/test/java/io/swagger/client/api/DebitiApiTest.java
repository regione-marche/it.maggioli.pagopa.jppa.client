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

import io.swagger.client.model.RichiestaCheckoutDto;
import io.swagger.client.model.RichiestaInfoListaScartiCaricamentoDebitiPdpDto;
import io.swagger.client.model.RichiestaModificaAnnoCompetenzaDto;
import io.swagger.client.model.RichiestaModificaDettagliImportoDto;
import io.swagger.client.model.RichiestaModificaGruppoDebitiDto;
import io.swagger.client.model.RichiestaPagaDebitiDto;
import io.swagger.client.model.RispostaInfoListaScartiCaricamentoDebitiPdpDto;
import io.swagger.client.model.RispostaModificaAnnoCompetenzaDto;
import io.swagger.client.model.RispostaModificaDettagliImportoDto;
import io.swagger.client.model.RispostaModificaGruppoDebitiDto;
import io.swagger.client.model.RispostaPagaDebitiDto;
import io.swagger.client.model.StandardAPIErrorResponse;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DebitiApi
 */
@Ignore
public class DebitiApiTest {

    private final DebitiApi api = new DebitiApi();

    
    /**
     * Permette di modificare l&#39;anno di competenza per TUTTI i dettagli del debito (&lt;b&gt;anche per debiti già pagati&lt;/b&gt;). Serve per aggiornare in particolare i dati contabili
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void patchModificaAnnoCompetenzaUsingPATCHTest() throws Exception {
        RichiestaModificaAnnoCompetenzaDto richiestaPagaDebitiDto = null;
        RispostaModificaAnnoCompetenzaDto response = api.patchModificaAnnoCompetenzaUsingPATCH(richiestaPagaDebitiDto);

        // TODO: test validations
    }
    
    /**
     * Permette di modificare i dettagli amministrativi del debito
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void patchModificaDettagliImportoUsingPATCHTest() throws Exception {
        RichiestaModificaDettagliImportoDto richiestaPagaDebitiDto = null;
        RispostaModificaDettagliImportoDto response = api.patchModificaDettagliImportoUsingPATCH(richiestaPagaDebitiDto);

        // TODO: test validations
    }
    
    /**
     * Servizio che gestisce la richiesta di pagamento di un carrello di debiti e restituisce l&#39;identificativo della transazione che è stata creata ed un URL
     *
     * Il servizio creerà il/i debito/i, creerà una transazione e restituirà un identTransazione e un URL. Il client invocando tale URL concluderà la procedura di pagamento (modello 1) del carrello debiti prima sottomesso.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postCheckoutUsingPOSTTest() throws Exception {
        RichiestaCheckoutDto richiestaCheckoutDto = null;
        RispostaPagaDebitiDto response = api.postCheckoutUsingPOST(richiestaCheckoutDto);

        // TODO: test validations
    }
    
    /**
     * Servizio che restituisce la lista di pagamenti mod 3 scartati dal caricamento o dall’aggiornamento in un certo periodo di tempo
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postInfoListaScartiUsingPOSTTest() throws Exception {
        RichiestaInfoListaScartiCaricamentoDebitiPdpDto richiestaInfoListaScarti = null;
        RispostaInfoListaScartiCaricamentoDebitiPdpDto response = api.postInfoListaScartiUsingPOST(richiestaInfoListaScarti);

        // TODO: test validations
    }
    
    /**
     * Servizio che permette di modificare il campo gruppodeb di una lista di debiti mod 3
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postPagaUsingPATCHTest() throws Exception {
        RichiestaModificaGruppoDebitiDto richiestaModificaGruppoDebiti = null;
        RispostaModificaGruppoDebitiDto response = api.postPagaUsingPATCH(richiestaModificaGruppoDebiti);

        // TODO: test validations
    }
    
    /**
     * Servizio che gestisce la richiesta di pagamento di un carrello di debiti e restituisce l&#39;identificativo della transazione che è stata creata ed un URL
     *
     * Il servizio creerà il/i debito/i, creerà una transazione e restituirà un identTransazione e un URL. Il client invocando tale URL concluderà la procedura di pagamento (modello 1) del carrello debiti prima sottomesso.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postPagaUsingPOSTTest() throws Exception {
        RichiestaPagaDebitiDto richiestaPagaDebitiDto = null;
        RispostaPagaDebitiDto response = api.postPagaUsingPOST(richiestaPagaDebitiDto);

        // TODO: test validations
    }
    
}

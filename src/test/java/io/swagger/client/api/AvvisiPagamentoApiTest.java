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

import io.swagger.client.model.RichiestaAttivaAvvisiPagamentoDto;
import io.swagger.client.model.RichiestaAttivaAvvisiPagamentoPerIdLottoDto;
import io.swagger.client.model.RichiestaCreaAvvisiPagamentoDto;
import io.swagger.client.model.RichiestaCreaAvvisoPagamentoDto;
import io.swagger.client.model.RichiestaEliminaAvvisoPagamentoDto;
import io.swagger.client.model.RichiestaInfoAvvisiPagamentoDto;
import io.swagger.client.model.RichiestaInfoAvvisoPagamentoPerChiaveDebitoDto;
import io.swagger.client.model.RichiestaInfoAvvisoPagamentoPerNumeroAvvisoDto;
import io.swagger.client.model.RichiestaModificaCausaleDto;
import io.swagger.client.model.RichiestaModificaContribuenteDto;
import io.swagger.client.model.RichiestaModificaImportoDto;
import io.swagger.client.model.RichiestaSostituisciAvvisoPagamentoDto;
import io.swagger.client.model.RispostaAttivaAvvisiPagamentoDto;
import io.swagger.client.model.RispostaAttivaAvvisiPagamentoPerIdLottoDto;
import io.swagger.client.model.RispostaCreaAvvisiPagamentoDto;
import io.swagger.client.model.RispostaCreaAvvisoPagamentoDto;
import io.swagger.client.model.RispostaEliminaAvvisoPagamentoDto;
import io.swagger.client.model.RispostaInfoAvvisiPagamentoDto;
import io.swagger.client.model.RispostaInfoAvvisoPagamentoPerChiaveDebitoDto;
import io.swagger.client.model.RispostaInfoAvvisoPagamentoPerNumeroAvvisoDto;
import io.swagger.client.model.RispostaModificaCausaleDto;
import io.swagger.client.model.RispostaModificaContribuenteDto;
import io.swagger.client.model.RispostaModificaImportoDto;
import io.swagger.client.model.RispostaSostituisciAvvisoPagamentoDto;
import io.swagger.client.model.StandardAPIErrorResponse;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AvvisiPagamentoApi
 */
@Ignore
public class AvvisiPagamentoApiTest {

    private final AvvisiPagamentoApi api = new AvvisiPagamentoApi();

    
    /**
     * Servizio che permette la cancellazione logica di un avviso
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void deleteEliminaUsingDELETETest() throws Exception {
        RichiestaEliminaAvvisoPagamentoDto eliminaAvvisoPagamentoDto = null;
        RispostaEliminaAvvisoPagamentoDto response = api.deleteEliminaUsingDELETE(eliminaAvvisoPagamentoDto);

        // TODO: test validations
    }
    
    /**
     * Servizio che permette la modifica della causale di un avviso (attivo)
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void patchModificaCausaleUsingPATCHTest() throws Exception {
        RichiestaModificaCausaleDto modificaCausaleDto = null;
        RispostaModificaCausaleDto response = api.patchModificaCausaleUsingPATCH(modificaCausaleDto);

        // TODO: test validations
    }
    
    /**
     * Servizio che permette la modifica del contribuente di un avviso (attivo)
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void patchModificaContribuenteUsingPATCHTest() throws Exception {
        RichiestaModificaContribuenteDto modificaContribuenteDto = null;
        RispostaModificaContribuenteDto response = api.patchModificaContribuenteUsingPATCH(modificaContribuenteDto);

        // TODO: test validations
    }
    
    /**
     * Permette la modifica dell&#39;importo di un avviso (attivo)
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void patchModificaImportoUsingPATCHTest() throws Exception {
        RichiestaModificaImportoDto modificaImportoDto = null;
        RispostaModificaImportoDto response = api.patchModificaImportoUsingPATCH(modificaImportoDto);

        // TODO: test validations
    }
    
    /**
     * Permette l&#39;attivazione di un avviso di pagamento attraverso l&#39;id lotto
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postAttivaPerIdLottoUsingPATCHTest() throws Exception {
        RichiestaAttivaAvvisiPagamentoPerIdLottoDto attivaAvvisiPagamentoDto = null;
        RispostaAttivaAvvisiPagamentoPerIdLottoDto response = api.postAttivaPerIdLottoUsingPATCH(attivaAvvisiPagamentoDto);

        // TODO: test validations
    }
    
    /**
     * Permette l&#39;attivazione di un avviso di pagamento
     *
     * Funziona solo in attivazione
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postAttivaUsingPATCHTest() throws Exception {
        RichiestaAttivaAvvisiPagamentoDto attivaAvvisiPagamentoDto = null;
        RispostaAttivaAvvisiPagamentoDto response = api.postAttivaUsingPATCH(attivaAvvisiPagamentoDto);

        // TODO: test validations
    }
    
    /**
     * Permette la creazione di più avvisi di pagamento
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postCreaMultipliUsingPOSTTest() throws Exception {
        RichiestaCreaAvvisiPagamentoDto creaAvvisiPagamentoDto = null;
        RispostaCreaAvvisiPagamentoDto response = api.postCreaMultipliUsingPOST(creaAvvisiPagamentoDto);

        // TODO: test validations
    }
    
    /**
     * Permette la creazione di un avviso di pagamento
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postCreaUsingPOSTTest() throws Exception {
        RichiestaCreaAvvisoPagamentoDto creaAvvisoPagamentoDto = null;
        RispostaCreaAvvisoPagamentoDto response = api.postCreaUsingPOST(creaAvvisoPagamentoDto);

        // TODO: test validations
    }
    
    /**
     * Servizio che restituisce il dettaglio del debito tramite la chiave del debito
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postInfoPerChiaveDebitoUsingPOSTTest() throws Exception {
        RichiestaInfoAvvisoPagamentoPerChiaveDebitoDto infoAvvisiPagamentoPerChiaveDebito = null;
        RispostaInfoAvvisoPagamentoPerChiaveDebitoDto response = api.postInfoPerChiaveDebitoUsingPOST(infoAvvisiPagamentoPerChiaveDebito);

        // TODO: test validations
    }
    
    /**
     * Servizio che restituisce il dettaglio del debito tramite NumeroAvviso
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postInfoPerNumeroAvvisoUsingPOSTTest() throws Exception {
        RichiestaInfoAvvisoPagamentoPerNumeroAvvisoDto infoAvvisiPagamentoPerNumeroAvviso = null;
        RispostaInfoAvvisoPagamentoPerNumeroAvvisoDto response = api.postInfoPerNumeroAvvisoUsingPOST(infoAvvisiPagamentoPerNumeroAvviso);

        // TODO: test validations
    }
    
    /**
     * Servizio che restituisce la lista di pagamenti mod 3 che rispettano diversi criteri di ricerca (tipo debito, date, flag vari ecc.)
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postInfoUsingPOSTTest() throws Exception {
        RichiestaInfoAvvisiPagamentoDto infoAvvisiPagamento = null;
        RispostaInfoAvvisiPagamentoDto response = api.postInfoUsingPOST(infoAvvisiPagamento);

        // TODO: test validations
    }
    
    /**
     * Servizio che permette la sostituzione di un avviso (attivo).
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postSostituisciUsingPUTTest() throws Exception {
        RichiestaSostituisciAvvisoPagamentoDto sostituisciAvvisoPagamentoDto = null;
        RispostaSostituisciAvvisoPagamentoDto response = api.postSostituisciUsingPUT(sostituisciAvvisoPagamentoDto);

        // TODO: test validations
    }
    
}

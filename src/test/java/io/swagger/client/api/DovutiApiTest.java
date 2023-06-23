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
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DovutiApi
 */
@Ignore
public class DovutiApiTest {

    private final DovutiApi api = new DovutiApi();

    
    /**
     * Necessario ad eliminare la posizione multi beneficiario, in opposizione all’attuale CancellaPosizionePagamento
     *
     * In questo caso non c’è differenza tra multibeneficiario e monobeneficiario, se per un dato Numero Avviso viene trovato un debito multibeneficiario, verranno attivate entrambe le parti, altrimenti il funzionamento rimane lo stesso del precedente metodo.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void deleteCancellaUsingDELETETest() throws Exception {
        RichiestaCancellaDovutiDto richiesta = null;
        RispostaEliminaAvvisoPagamentoDto response = api.deleteCancellaUsingDELETE(richiesta);

        // TODO: test validations
    }
    
    /**
     * Necessario ad attivare la posizione multi beneficiario in caso sia stata disabilitata o creata in tale stato
     *
     * In questo caso non c’è differenza tra multibeneficiario e monobeneficiario, se per un dato Numero Avviso viene trovato un debito multibeneficiario, verranno attivate entrambe le parti, altrimenti il funzionamento rimane lo stesso del precedente metodo. E’ possibile passare una lista di elementi. Il metodo permette anche la disattivazione delle posizioni. Non è prassi comune disattivare una posizione esistente e già attiva, ma se necessario è possibile disattivarla chiamando lo stesso metodo con l’aggiunta del parametro relativo, ma solo se non ci sono pagamenti associati e il connettore di riferimento è Maggioli o Payer. In tutti gli altri casi la disattivazione non è concessa
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void patchAttivaUsingPATCHTest() throws Exception {
        RichiestaAttivaDovutiDto richiesta = null;
        RispostaAttivaAvvisiPagamentoDto response = api.patchAttivaUsingPATCH(richiesta);

        // TODO: test validations
    }
    
    /**
     * Si occupa di aggiornare le posizioni legate all’avviso multi beneficiario
     *
     * Sono state predisposte delle operazioni per dividere le modifiche che vogliono essere apportate
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void patchModificaUsingPATCHTest() throws Exception {
        RichiestaModificaDovutiDto richiestaModifica = null;
        RispostaModificaDovutiDto response = api.patchModificaUsingPATCH(richiestaModifica);

        // TODO: test validations
    }
    
    /**
     * Permette di inviare in modo sincrono un singolo debito modello 3 (sia esso monobeneficiario o multibeneficiario). Il metodo è la versione aggiornata alle nuove SANP
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postInviaDovutiUsingPOSTTest() throws Exception {
        RichiestaInviaDovutiRestDto richiesta = null;
        RispostaInviaDovutiDto response = api.postInviaDovutiUsingPOST(richiesta);

        // TODO: test validations
    }
    
    /**
     * Permette di inviare in modo sincrono un singolo debito modello 3 (sia esso monobeneficiario o multibeneficiario). Il metodo è la versione aggiornata alle nuove SANP
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postInviaDovutoUsingPOSTTest() throws Exception {
        RichiestaInviaDovutoRestDto richiesta = null;
        RispostaInviaDovutoDto response = api.postInviaDovutoUsingPOST(richiesta);

        // TODO: test validations
    }
    
}

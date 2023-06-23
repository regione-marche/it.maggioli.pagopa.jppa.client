
# DebitoDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attivaDebito** | **Boolean** | Di default il debito viene creato attivo |  [optional]
**causaAggStato** | [**CausaAggStatoEnum**](#CausaAggStatoEnum) |  |  [optional]
**causaleDebito** | **String** | La causale del debito che viene inviata ad AGID, max 140 caratteri | 
**codIpaCreditore** | **String** | Codice IPA identificativo dell’ente creditore |  [optional]
**codIpaRichiedente** | **String** | Codice IPA identificativo dell’ente richiedente |  [optional]
**codiceLotto** | **String** | Alfanumerico per l&#39;identificazione di debiti aggregati per affinità ed importanza per l&#39;ente, nato esplicitamente per le Poste, max 200 caratteri | 
**codiceServizio** | **String** | Codice del servizio chiamante |  [optional]
**codiceTipoDebito** | [**CodiceTipoDebitoEnum**](#CodiceTipoDebitoEnum) | Codice che raggruppa tutte le parametrizzazioni semanticamente omogeneo di debiti. Identifica tipicamente un tributo o più in generale un onere che l’utente finale ha maturato nei confronti della pubblica amministrazione, max 1000 caratteri | 
**contribuenteDto** | [**ContribuenteDto**](ContribuenteDto.md) |  | 
**dataFineValidita** | [**OffsetDateTime**](OffsetDateTime.md) | Data di fine validità del debito |  [optional]
**dataInizioValidita** | [**OffsetDateTime**](OffsetDateTime.md) | Data di inizio validità del debito | 
**dataLimitePagabilita** | [**OffsetDateTime**](OffsetDateTime.md) | Indica la data limite di pagabilità nel caso in cui la data di fine validità ricada in una data in cui non sia possibile effettuare il pagamento. Se non impostato la data limite di pagabilità sarà impostata uguale alla data di fine validità |  [optional]
**datiAccertamento** | [**List&lt;DatoAccertamentoDto&gt;**](DatoAccertamentoDto.md) |  |  [optional]
**dettaglioPosizione** | **String** | Dettaglio in formato testuale della posizione debitoria di riferimento di questo debito, inteso per poter essere leggibile ed esplicativo. Potrebbe avere i riferimenti ad una contravvenzione o esplicitare una descrizione testuale che accompagna un debito generato da un determinato documento contabile, max 1000 caratteri | 
**gruppo** | **String** | Identifica una opzione di pagamento per la relativa posizione debitoria | 
**idDebitoBO** | **String** | Identificativo del debito, è univoco nello scope della posizione debitoria, max 256 caratteri | 
**idPosizioneBO** | **String** | Identificativo della posizione debitoria. Questo identificativo permette ai vari servizi di poter inserire lo stesso debito in modalità differenti e mantenere un comportamento congruo da parte di jcg_pagopa, max 256 caratteri | 
**identUnivocoVersamento** | **String** |  |  [optional]
**importoDebito** | **Double** | Importo con due cifre decimali, massimo valore previsto 999999999.99 | 
**importoSpeseNotifica** | [**BigDecimal**](BigDecimal.md) | Importo spese notifica con due cifre decimali |  [optional]
**marcaDaBollo** | [**MarcaDaBolloDto**](MarcaDaBolloDto.md) |  |  [optional]
**numeroAvviso** | **String** | Numero avviso, max 18 caratteri |  [optional]
**ordinamento** | **Integer** | Indica l&#39;ordinamento del debito all&#39;interno del gruppo | 
**parametriDebito** | [**List&lt;ParametroDebitoDto&gt;**](ParametroDebitoDto.md) |  |  [optional]
**partnerTecnologico** | [**PartnerTecnologicoEnum**](#PartnerTecnologicoEnum) |  |  [optional]
**speseNotificaDaAttualizzare** | [**SpeseNotificaDaAttualizzareEnum**](#SpeseNotificaDaAttualizzareEnum) | flag attualizzazione spese notifica |  [optional]
**statoSincronizzazionePdp** | [**StatoSincronizzazionePdpEnum**](#StatoSincronizzazionePdpEnum) | Questa costante serve per permettere la sincronizzazione di un debitoin in locale rispetto al suo stato sul PDP |  [optional]
**versioneNumeroAvviso** | **Integer** |  |  [optional]


<a name="CausaAggStatoEnum"></a>
## Enum: CausaAggStatoEnum
Name | Value
---- | -----
ALTRO | &quot;ALTRO&quot;
ATTIVAZIONE | &quot;ATTIVAZIONE&quot;
ATTIVAZIONE_RIAPERTURA_TERMINI | &quot;ATTIVAZIONE_RIAPERTURA_TERMINI&quot;
DISATTIVAZIONE | &quot;DISATTIVAZIONE&quot;
ELIMINAZIONE | &quot;ELIMINAZIONE&quot;
ELIMINAZIONE_DA_CRUSCOTTO | &quot;ELIMINAZIONE_DA_CRUSCOTTO&quot;
ELIMINAZIONE_DEBITO | &quot;ELIMINAZIONE_DEBITO&quot;
IMPORTO_ATTUALIZZATO | &quot;IMPORTO_ATTUALIZZATO&quot;
MODIFICA_CAUSALE | &quot;MODIFICA_CAUSALE&quot;
MODIFICA_CONTRIBUENTE | &quot;MODIFICA_CONTRIBUENTE&quot;
MODIFICA_DATE_SCADENZA | &quot;MODIFICA_DATE_SCADENZA&quot;
MODIFICA_DETTAGLI_IMPORTO | &quot;MODIFICA_DETTAGLI_IMPORTO&quot;
MODIFICA_IMPORTO | &quot;MODIFICA_IMPORTO&quot;
PAGAMENTO_ESTERNO | &quot;PAGAMENTO_ESTERNO&quot;
SOSTITUZIONE | &quot;SOSTITUZIONE&quot;


<a name="CodiceTipoDebitoEnum"></a>
## Enum: CodiceTipoDebitoEnum
Name | Value
---- | -----
CASE_POPOLARI_AFFITTO | &quot;CASE_POPOLARI_AFFITTO&quot;
CIMITERI_SERVIZO | &quot;CIMITERI_SERVIZO&quot;
CIMITERI_VOTIVA | &quot;CIMITERI_VOTIVA&quot;
DEMANIO_CANONE | &quot;DEMANIO_CANONE&quot;
ISTRUTTORIA_SPESE | &quot;ISTRUTTORIA_SPESE&quot;
MENSA | &quot;MENSA&quot;
MULTE | &quot;MULTE&quot;
ONERI | &quot;ONERI&quot;
SAD | &quot;SAD&quot;
SALA_COMUNALE | &quot;SALA_COMUNALE&quot;
SCUOLA_MATERNA_ISCRIZIONE | &quot;SCUOLA_MATERNA_ISCRIZIONE&quot;
SCUOLA_NIDO_RETTA | &quot;SCUOLA_NIDO_RETTA&quot;
SCUOLA_PRE_POST_ORARIO | &quot;SCUOLA_PRE_POST_ORARIO&quot;
SERVIZI | &quot;SERVIZI&quot;
SPORT_PALESTRA | &quot;SPORT_PALESTRA&quot;
SPORT_PISTA | &quot;SPORT_PISTA&quot;
SPORT_STRUTTURA | &quot;SPORT_STRUTTURA&quot;
STABILE_AFFITTO | &quot;STABILE_AFFITTO&quot;
SUAP_ONERI | &quot;SUAP_ONERI&quot;
SUE_ONERI | &quot;SUE_ONERI&quot;
VACANZA_CLIMATICA | &quot;VACANZA_CLIMATICA&quot;
VACANZA_ESTIVO | &quot;VACANZA_ESTIVO&quot;
VERBATEL_RILASCIO | &quot;VERBATEL_RILASCIO&quot;
ZTL_RESIDENTE | &quot;ZTL_RESIDENTE&quot;
ZTL_TEMPORANEA | &quot;ZTL_TEMPORANEA&quot;


<a name="PartnerTecnologicoEnum"></a>
## Enum: PartnerTecnologicoEnum
Name | Value
---- | -----
ESTERNO | &quot;ESTERNO&quot;
MAGGIOLI | &quot;MAGGIOLI&quot;


<a name="SpeseNotificaDaAttualizzareEnum"></a>
## Enum: SpeseNotificaDaAttualizzareEnum
Name | Value
---- | -----
OFF | &quot;ATTUALIZZAZIONE_OFF&quot;
ON | &quot;ATTUALIZZAZIONE_ON&quot;


<a name="StatoSincronizzazionePdpEnum"></a>
## Enum: StatoSincronizzazionePdpEnum
Name | Value
---- | -----
NON_SINCRONIZZABILE | &quot;NON_SINCRONIZZABILE&quot;
SINCRONIZZABILE | &quot;SINCRONIZZABILE&quot;




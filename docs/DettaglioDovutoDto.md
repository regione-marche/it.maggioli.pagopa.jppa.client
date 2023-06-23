
# DettaglioDovutoDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**causaleDebito** | **String** | La causale del debito che viene inviata ad AGID, max 140 caratteri | 
**codiceIpaCreditore** | **String** | Codice IPA identificativo dell’ente creditore |  [optional]
**codiceLotto** | **String** | Alfanumerico per l&#39;identificazione di debiti aggregati per affinità ed importanza per l&#39;ente, nato esplicitamente per le Poste, max 200 caratteri | 
**codiceTipoDebito** | [**CodiceTipoDebitoEnum**](#CodiceTipoDebitoEnum) | Codice che raggruppa tutte le parametrizzazioni semanticamente omogeneo di debiti. Identifica tipicamente un tributo o più in generale un onere che l’utente finale ha maturato nei confronti della pubblica amministrazione, max 1000 caratteri | 
**dataFineValidita** | [**OffsetDateTime**](OffsetDateTime.md) | Data di fine validità del debito |  [optional]
**dataInizioValidita** | [**OffsetDateTime**](OffsetDateTime.md) | Data di inizio validità del debito | 
**dataLimitePagabilita** | [**OffsetDateTime**](OffsetDateTime.md) | Indica la data limite di pagabilità nel caso in cui la data di fine validità ricada in una data in cui non sia possibile effettuare il pagamento. Se non impostato la data limite di pagabilità sarà impostata uguale alla data di fine validità |  [optional]
**datiAccertamento** | [**List&lt;DatoAccertamentoDto&gt;**](DatoAccertamentoDto.md) |  |  [optional]
**gruppo** | **String** | Identifica una opzione di pagamento per la relativa posizione debitoria | 
**idDeb** | **String** | Identificativo del debito, è univoco nello scope della posizione debitoria, max 256 caratteri | 
**importoDebito** | **Double** | Importo con due cifre decimali, massimo valore previsto 999999999.99 | 
**importoSpeseNotifica** | [**BigDecimal**](BigDecimal.md) | Importo spese notifica con due cifre decimali |  [optional]
**marcaDaBollo** | [**MarcaDaBolloDto**](MarcaDaBolloDto.md) |  |  [optional]
**ordinamento** | **Integer** | Indica l&#39;ordinamento del debito all&#39;interno del gruppo | 
**parametriDebito** | [**List&lt;ParametroDebitoDto&gt;**](ParametroDebitoDto.md) |  |  [optional]
**speseNotificaDaAttualizzare** | [**SpeseNotificaDaAttualizzareEnum**](#SpeseNotificaDaAttualizzareEnum) | flag che indica se le spese notifica sono da attualizzare |  [optional]


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


<a name="SpeseNotificaDaAttualizzareEnum"></a>
## Enum: SpeseNotificaDaAttualizzareEnum
Name | Value
---- | -----
OFF | &quot;ATTUALIZZAZIONE_OFF&quot;
ON | &quot;ATTUALIZZAZIONE_ON&quot;




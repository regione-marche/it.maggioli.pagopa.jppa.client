
# PagamentoSingoloDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**causaleSingoloPagamento** | **String** |  |  [optional]
**codiceContestoPagamento** | [**CodiceContestoPagamentoEnum**](#CodiceContestoPagamentoEnum) |  |  [optional]
**codiceEsitoSingoloPagamento** | [**CodiceEsitoSingoloPagamentoEnum**](#CodiceEsitoSingoloPagamentoEnum) |  |  [optional]
**codiceTipoDebito** | [**CodiceTipoDebitoEnum**](#CodiceTipoDebitoEnum) | Codice che raggruppa tutte le parametrizzazioni semanticamente omogeneo di debiti. Identifica tipicamente un tributo o più in generale un onere che l’utente finale ha maturato nei confronti della pubblica amministrazione, max 1000 caratteri | 
**dataEsitoSingoloPagamento** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**dataOraMessaggioRicevuta** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**datiDebitore** | [**DatiDebitoreDto**](DatiDebitoreDto.md) |  |  [optional]
**datiVersante** | [**DatiVersanteDto**](DatiVersanteDto.md) |  |  [optional]
**debitoRiconciliato** | [**DebitoRiconcilaitoDto**](DebitoRiconcilaitoDto.md) |  |  [optional]
**esitoRiconciliazione** | [**EsitoRiconciliazioneEnum**](#EsitoRiconciliazioneEnum) | Indica l’esito della riconciliazione del singolo sospeso, dato un sospeso è possibile avere la lista completa degli iuv che lo compongono, una lista parziale (i.e. perché non tutti gli iuv sono presenti in banca dati come nel caso di multi intermediazione) oppure una lista vuota in quanto il sospeso non è presente in banca dati | 
**identificativoDominio** | **String** |  |  [optional]
**identificativoMessaggioRicevuta** | **String** |  |  [optional]
**identificativoUnivocoRiscossione** | **String** |  |  [optional]
**identificativoUnivocoVersamento** | **String** |  |  [optional]
**messaggio** | **String** |  |  [optional]
**singoloImportoPagato** | [**BigDecimal**](BigDecimal.md) |  |  [optional]


<a name="CodiceContestoPagamentoEnum"></a>
## Enum: CodiceContestoPagamentoEnum
Name | Value
---- | -----
CCP_TMP_PSPPA | &quot;CCP_TMP_PSPPA&quot;
N_A | &quot;N/A&quot;


<a name="CodiceEsitoSingoloPagamentoEnum"></a>
## Enum: CodiceEsitoSingoloPagamentoEnum
Name | Value
---- | -----
DECORR_PARZ_TERMINI | &quot;DECORR_PARZ_TERMINI&quot;
DECORR_TERMINI | &quot;DECORR_TERMINI&quot;
PAG_ESEGUITO | &quot;PAG_ESEGUITO&quot;
PAG_NON_ESEGUITO | &quot;PAG_NON_ESEGUITO&quot;
PAG_PARZ_ESEGUITO | &quot;PAG_PARZ_ESEGUITO&quot;


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


<a name="EsitoRiconciliazioneEnum"></a>
## Enum: EsitoRiconciliazioneEnum
Name | Value
---- | -----
ERR_DEBITO_DATI_NON_CONGRUENTI | &quot;ERR_DEBITO_DATI_NON_CONGRUENTI&quot;
ERR_DEBITO_NON_TROVATO | &quot;ERR_DEBITO_NON_TROVATO&quot;
ERR_RPT_DATI_NON_CONGRUENTI | &quot;ERR_RPT_DATI_NON_CONGRUENTI&quot;
ERR_RPT_NON_TROVATO | &quot;ERR_RPT_NON_TROVATO&quot;
OK_DEBITO_RICONCILIATO | &quot;OK_DEBITO_RICONCILIATO&quot;
WARN_DEBITO_IMPORTO_NON_PAGATO | &quot;WARN_DEBITO_IMPORTO_NON_PAGATO&quot;
WARN_DEBITO_IMPORTO_PAGATO_NON_CONGRUENTE | &quot;WARN_DEBITO_IMPORTO_PAGATO_NON_CONGRUENTE&quot;




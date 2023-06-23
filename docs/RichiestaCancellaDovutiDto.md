
# RichiestaCancellaDovutiDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**codiceIPA** | **String** | Codice IPA identificativo dell’ente | 
**codiceMotivoEliminazione** | [**CodiceMotivoEliminazioneEnum**](#CodiceMotivoEliminazioneEnum) |  |  [optional]
**codiceServizio** | **String** | Codice del servizio client del sistema JPPA. Il servizio deve essere censito fra quelli abilitati per il codice IPA specificato nella richiesta | 
**descrizioneMotivoEliminazione** | **String** | Descrizione motivo eliminazione |  [optional]
**numeroAvviso** | [**NumeroAvvisoDto**](NumeroAvvisoDto.md) |  |  [optional]


<a name="CodiceMotivoEliminazioneEnum"></a>
## Enum: CodiceMotivoEliminazioneEnum
Name | Value
---- | -----
ALTRO | &quot;ALTRO&quot;
ATTIVAZIONE | &quot;ATTIVAZIONE&quot;
ATTIVAZIONE_RIAPERTURA_TERMINI | &quot;ATTIVAZIONE_RIAPERTURA_TERMINI&quot;
DISATTIVAZIONE | &quot;DISATTIVAZIONE&quot;
ELIMINAZIONE | &quot;ELIMINAZIONE&quot;
ELIMINAZIONE_DEBITO | &quot;ELIMINAZIONE_DEBITO&quot;
IMPORTO_ATTUALIZZATO | &quot;IMPORTO_ATTUALIZZATO&quot;
MODIFICA_CAUSALE | &quot;MODIFICA_CAUSALE&quot;
MODIFICA_CONTRIBUENTE | &quot;MODIFICA_CONTRIBUENTE&quot;
MODIFICA_DATE_SCADENZA | &quot;MODIFICA_DATE_SCADENZA&quot;
MODIFICA_DETTAGLI_IMPORTO | &quot;MODIFICA_DETTAGLI_IMPORTO&quot;
MODIFICA_IMPORTO | &quot;MODIFICA_IMPORTO&quot;
PAGAMENTO_ESTERNO | &quot;PAGAMENTO_ESTERNO&quot;
SOSTITUZIONE | &quot;SOSTITUZIONE&quot;




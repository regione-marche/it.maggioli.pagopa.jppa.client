
# RichiestaModificaDovutiDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**codiceIPA** | **String** | Codice IPA identificativo dell’ente |  [optional]
**codiceServizio** | **String** | Codice del servizio chiamante |  [optional]
**dovutoDto** | [**DovutoDto**](DovutoDto.md) |  |  [optional]
**operazione** | [**OperazioneEnum**](#OperazioneEnum) | Indica quale parte dell&#39;oggetto va modificato, e per ciascun caso verrà verificato che il campo che si intende modificare sia presente e valido, in caso contrario verrà ritornato un errore, l’operazione ALL esegue tutti i controlli delle precedenti operazioni |  [optional]


<a name="OperazioneEnum"></a>
## Enum: OperazioneEnum
Name | Value
---- | -----
ALL | &quot;ALL&quot;
MODIFICA_ANNO_COMPETENZA | &quot;MODIFICA_ANNO_COMPETENZA&quot;
MODIFICA_CAUSALE_DEBITO | &quot;MODIFICA_CAUSALE_DEBITO&quot;
MODIFICA_CONTRIBUENTE_DEBITO | &quot;MODIFICA_CONTRIBUENTE_DEBITO&quot;
MODIFICA_DETTAGLI_IMPORTO_DEBITO | &quot;MODIFICA_DETTAGLI_IMPORTO_DEBITO&quot;
MODIFICA_IMPORTO_DEBITO | &quot;MODIFICA_IMPORTO_DEBITO&quot;
MODIFICA_SCADENZA_DEBITO | &quot;MODIFICA_SCADENZA_DEBITO&quot;




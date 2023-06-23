
# InfoSingoloPagamentoDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**chiaveDebito** | [**ChiaveDebitoDto**](ChiaveDebitoDto.md) |  |  [optional]
**dettagliImporto** | [**List&lt;DettaglioImportoDto&gt;**](DettaglioImportoDto.md) |  |  [optional]
**esitoVersamentoSingolo** | [**EsitoVersamentoSingoloEnum**](#EsitoVersamentoSingoloEnum) |  |  [optional]
**importoSingoloPagato** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**importoSingoloRichiesta** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**progressivoVersamentoSingolo** | **Integer** | Posizione del versamento singolo nella richiesta di pagamento. Presente solo se non sono stati riportati tutti i versamenti (per esempio per informazioni specifiche su un debito) |  [optional]
**testoAllegato** | **String** |  |  [optional]
**tipoAllegato** | **String** |  |  [optional]


<a name="EsitoVersamentoSingoloEnum"></a>
## Enum: EsitoVersamentoSingoloEnum
Name | Value
---- | -----
CONCLUSO_ESEGUITO | &quot;CONCLUSO_ESEGUITO&quot;
CONCLUSO_ESEGUITO_PARZIALMENTE | &quot;CONCLUSO_ESEGUITO_PARZIALMENTE&quot;
CONCLUSO_NON_ESEGUITO | &quot;CONCLUSO_NON_ESEGUITO&quot;
CONCLUSO_NON_ESEGUITO_DECORRENZA | &quot;CONCLUSO_NON_ESEGUITO_DECORRENZA&quot;
CONCLUSO_NON_ESEGUITO_DECORRENZA_PARZIALE | &quot;CONCLUSO_NON_ESEGUITO_DECORRENZA_PARZIALE&quot;
NON_CONCLUSO | &quot;NON_CONCLUSO&quot;
RIFIUTATA | &quot;RIFIUTATA&quot;




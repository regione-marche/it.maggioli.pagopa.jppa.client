
# InfoPagamentoTelematicoDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**codiceContestoPagamento** | [**CodiceContestoPagamentoEnum**](#CodiceContestoPagamentoEnum) |  |  [optional]
**dataAccredito** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**dataPagamento** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**datiDebitore** | [**DatiDebitoreDto**](DatiDebitoreDto.md) |  |  [optional]
**datiVersante** | [**DatiVersanteDto**](DatiVersanteDto.md) |  |  [optional]
**esitoRichiestaPagamento** | [**EsitoRichiestaPagamentoEnum**](#EsitoRichiestaPagamentoEnum) |  |  [optional]
**flussoRicevuta** | **String** |  |  [optional]
**identificativoDominio** | **String** |  |  [optional]
**identificativoUnivocoVersamento** | **String** | Identificativo Univoco Versamento, attribuito dall&#39;Ente Creditore ad ogni operazione di incasso e che non può essere associato nel tempo ad alcun altro incasso emesso dal medesimo Ente Creditore, max 25 caratteri | 
**importoTotalePagato** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**importoTotaleRichiesta** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**infoVersamentoSingolo** | [**List&lt;InfoSingoloPagamentoDto&gt;**](InfoSingoloPagamentoDto.md) |  |  [optional]
**numeroAvviso** | **String** | Numero avviso, max 18 caratteri |  [optional]
**numeroVersamentiSingoli** | **Integer** |  | 
**statoTecnicoPagamento** | [**StatoTecnicoPagamentoEnum**](#StatoTecnicoPagamentoEnum) |  |  [optional]
**testoOriginaleRicevuta** | **String** |  |  [optional]
**tipoVersamento** | [**TipoVersamentoEnum**](#TipoVersamentoEnum) |  |  [optional]


<a name="CodiceContestoPagamentoEnum"></a>
## Enum: CodiceContestoPagamentoEnum
Name | Value
---- | -----
CCP_TMP_PSPPA | &quot;CCP_TMP_PSPPA&quot;
N_A | &quot;N/A&quot;


<a name="EsitoRichiestaPagamentoEnum"></a>
## Enum: EsitoRichiestaPagamentoEnum
Name | Value
---- | -----
CONCLUSO_ESEGUITO | &quot;CONCLUSO_ESEGUITO&quot;
CONCLUSO_ESEGUITO_PARZIALMENTE | &quot;CONCLUSO_ESEGUITO_PARZIALMENTE&quot;
CONCLUSO_NON_ESEGUITO | &quot;CONCLUSO_NON_ESEGUITO&quot;
CONCLUSO_NON_ESEGUITO_DECORRENZA | &quot;CONCLUSO_NON_ESEGUITO_DECORRENZA&quot;
CONCLUSO_NON_ESEGUITO_DECORRENZA_PARZIALE | &quot;CONCLUSO_NON_ESEGUITO_DECORRENZA_PARZIALE&quot;
NON_CONCLUSO | &quot;NON_CONCLUSO&quot;
RIFIUTATA | &quot;RIFIUTATA&quot;


<a name="StatoTecnicoPagamentoEnum"></a>
## Enum: StatoTecnicoPagamentoEnum
Name | Value
---- | -----
COMPLETATO | &quot;COMPLETATO&quot;
CONTABILIZZATO | &quot;CONTABILIZZATO&quot;
INVIATO | &quot;INVIATO&quot;
NOTIFICATO | &quot;NOTIFICATO&quot;
RIFIUTATO | &quot;RIFIUTATO&quot;


<a name="TipoVersamentoEnum"></a>
## Enum: TipoVersamentoEnum
Name | Value
---- | -----
AD | &quot;AD&quot;
BBT | &quot;BBT&quot;
BP | &quot;BP&quot;
CP | &quot;CP&quot;
INDETERMINATO | &quot;INDETERMINATO&quot;
OBEP | &quot;OBEP&quot;
PO | &quot;PO&quot;




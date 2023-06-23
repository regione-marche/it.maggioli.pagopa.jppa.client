
# SospesoRiconciliatoDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**codiceBicBancaDiRiversamento** | **String** | Codice BIC del PSP che ha effettuato il riversamento |  [optional]
**codiceIdentificativoUnivocoMittente** | **String** | Codice del PSP che ha effettuato il riversamento, può essere il codice fiscale o la partita IVA |  [optional]
**dataOraFlusso** | [**OffsetDateTime**](OffsetDateTime.md) | Indica la data e ora di creazione del flusso |  [optional]
**dataRegolamento** | [**OffsetDateTime**](OffsetDateTime.md) | Indica la data di esecuzione dell’operazione di trasferimento fondi con la quale viene regolato contabilmente il riversamento delle somme incassate |  [optional]
**identificativoFlusso** | **String** | Identificativo legato alla generazione e trasmissione del flusso di riversamento. Deve essere univoco nell’ambito dell’anno di riferimento delle operazioni di pagamento cui si riferisce il flusso |  [optional]
**identificativoSospeso** | [**IdentificativoSospesoDto**](IdentificativoSospesoDto.md) |  |  [optional]
**identificativoUnivocoRegolamento** | **String** | Riferimento assegnato dal prestatore di servizi di pagamento all’operazione di trasferimento fondi con la quale viene regolato contabilmente il riversamento delle somme incassate ovvero l’accumulo dei bonifici disposti dai clienti (TRN) |  [optional]
**importoTotalePagamentiRendicontati** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**numeroTotalePagamentiRendicontati** | **Integer** |  |  [optional]
**pagamentiSingoli** | [**List&lt;PagamentoSingoloDto&gt;**](PagamentoSingoloDto.md) |  | 
**tipoIdentificativoUnivocoMittente** | [**TipoIdentificativoUnivocoMittenteEnum**](#TipoIdentificativoUnivocoMittenteEnum) | Tipologia del PSP che ha effettuato il riversamento |  [optional]


<a name="TipoIdentificativoUnivocoMittenteEnum"></a>
## Enum: TipoIdentificativoUnivocoMittenteEnum
Name | Value
---- | -----
A_CODICE_ABI | &quot;A &#x3D; codice ABI&quot;
B_CODICE_BIC | &quot;B &#x3D; codice BIC&quot;
G_PERSONA_GIURIDICA | &quot;G &#x3D; persona giuridica&quot;




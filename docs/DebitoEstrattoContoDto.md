
# DebitoEstrattoContoDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**base64RT** | **String** |  |  [optional]
**causalePagamento** | **String** |  |  [optional]
**codiceDiTassonomia** | **String** |  |  [optional]
**codiceIpaEnte** | **String** |  |  [optional]
**codiceServizio** | **String** |  |  [optional]
**codiceTipoDebito** | **String** |  |  [optional]
**dataPagamento** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**dataScadenzaPagamento** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**descrizioneTassonomia** | **String** |  |  [optional]
**iDeb** | **String** |  |  [optional]
**iPosDeb** | **String** |  |  [optional]
**identificativoUnivocoVersamento** | **String** |  |  [optional]
**importoDebito** | **Double** |  |  [optional]
**modalitaPagamento** | [**ModalitaPagamentoEnum**](#ModalitaPagamentoEnum) |  |  [optional]
**numeroAvviso** | **String** |  |  [optional]
**pagato** | **Boolean** |  |  [optional]
**statoPagamento** | [**StatoPagamentoEnum**](#StatoPagamentoEnum) |  |  [optional]


<a name="ModalitaPagamentoEnum"></a>
## Enum: ModalitaPagamentoEnum
Name | Value
---- | -----
MOD1 | &quot;MOD1&quot;
MOD3 | &quot;MOD3&quot;


<a name="StatoPagamentoEnum"></a>
## Enum: StatoPagamentoEnum
Name | Value
---- | -----
COMPLETATO | &quot;COMPLETATO&quot;
CONTABILIZZATO | &quot;CONTABILIZZATO&quot;
INVIATO | &quot;INVIATO&quot;
NOTIFICATO | &quot;NOTIFICATO&quot;
RIFIUTATO | &quot;RIFIUTATO&quot;




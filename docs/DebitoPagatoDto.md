
# DebitoPagatoDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**chiaviDebito** | [**ChiaveDebitoDto**](ChiaveDebitoDto.md) |  |  [optional]
**identificativoUnivocoVersamento** | **String** | Identificativo Univoco Versamento, attribuito dall&#39;Ente Creditore ad ogni operazione di incasso e che non può essere associato nel tempo ad alcun altro incasso emesso dal medesimo Ente Creditore, max 25 caratteri | 
**modalitaPagamento** | [**ModalitaPagamentoEnum**](#ModalitaPagamentoEnum) |  |  [optional]
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
CONTABILIZZATO | &quot;CONTABILIZZATO&quot;
NOTIFICATO | &quot;NOTIFICATO&quot;




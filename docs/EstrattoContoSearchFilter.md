
# EstrattoContoSearchFilter

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**codiceDiTassonomia** | **String** | Filtro sul codice di tassonomia |  [optional]
**codiceFiscaleDebitore** | **String** | Filtro sul codice fiscale del debitore |  [optional]
**codiceIpa** | **String** | Filtro sull&#39;ente |  [optional]
**codiceTipoDebito** | **String** | Filtro sul codice tipo debito |  [optional]
**dataDiPagamento** | [**DateInterval**](DateInterval.md) | Finestra di date entro la quale il debito è stato pagato |  [optional]
**dataDiScadenza** | [**DateInterval**](DateInterval.md) | Finestra di date entro la quale il debito scade |  [optional]
**elementiInPagina** | **Integer** | Numero di elementi all&#39;interno della pagina |  [optional]
**pagamento** | [**PagamentoEnum**](#PagamentoEnum) | Filtro sullo stato del pagamento. 0 &#x3D; Tutti i debiti (nessun filtro applicato) / 1 &#x3D; Solo i debiti pagati / 2 &#x3D; Solo i debiti non pagati |  [optional]
**pagina** | **Integer** | Numero della pagina richiesta |  [optional]


<a name="PagamentoEnum"></a>
## Enum: PagamentoEnum
Name | Value
---- | -----
NUMBER_0 | 0
NUMBER_1 | 1
NUMBER_2 | 2




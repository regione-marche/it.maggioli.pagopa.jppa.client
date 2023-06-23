
# CriteriRicercaDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**adataFineValidita** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**adataInizioValidita** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**adataInserimento** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**adataLimitePagabilita** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**codiceIpa** | **String** | Codice IPA identificativo dell’ente |  [optional]
**codiceTipoDebito** | **String** | Codice che identifica il tipo debito da ricercare | 
**contribuente** | [**ContribuenteDebitoDto**](ContribuenteDebitoDto.md) | Tipo complesso che racchiude le info principali sul soggetto debitore | 
**daDataFineValidita** | [**OffsetDateTime**](OffsetDateTime.md) | Data che descrive l’inizio del periodo di fine validità dei debiti ricercati |  [optional]
**daDataInizioValidita** | [**OffsetDateTime**](OffsetDateTime.md) | Data che descrive l’inizio del periodo di inizio validità dei debiti ricercati |  [optional]
**daDataInserimento** | [**OffsetDateTime**](OffsetDateTime.md) | Data che descrive l’inizio del periodo in cui i debiti sono stati inseriti |  [optional]
**daDataLimitePagabilita** | [**OffsetDateTime**](OffsetDateTime.md) | Data che descrive l’inizio del periodo di limite pagabilità dei debiti ricercati |  [optional]




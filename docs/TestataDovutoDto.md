
# TestataDovutoDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**datiContribuente** | [**ContribuenteDto**](ContribuenteDto.md) |  |  [optional]
**dettaglioPosizione** | **String** | Dettaglio in formato testuale della posizione debitoria di riferimento di questo debito, inteso per poter essere leggibile ed esplicativo. Potrebbe avere i riferimenti ad una contravvenzione o esplicitare una descrizione testuale che accompagna un debito generato da un determinato documento contabile, max 1000 caratteri | 
**idPos** | **String** | Identificativo della posizione debitoria. Questo identificativo permette ai vari servizi di poter inserire lo stesso debito in modalità differenti e mantenere un comportamento congruo da parte di jcg_pagopa, max 256 caratteri | 




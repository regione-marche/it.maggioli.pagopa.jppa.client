
# RichiestaInfoRiconciliazioneDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**codiceIpaBeneficiario** | **String** | Codice IPA identificativo dell&#39;ente beneficiario | 
**listaIdentificativoFlusso** | **List&lt;String&gt;** |  |  [optional]
**listaSospesi** | [**List&lt;IdentificativoSospesoDto&gt;**](IdentificativoSospesoDto.md) |  |  [optional]
**operazione** | [**OperazioneEnum**](#OperazioneEnum) |  |  [optional]


<a name="OperazioneEnum"></a>
## Enum: OperazioneEnum
Name | Value
---- | -----
IDENTIFICATIVO_FLUSSO | &quot;PER_IDENTIFICATIVO_FLUSSO&quot;
SOSPESI | &quot;PER_SOSPESI&quot;




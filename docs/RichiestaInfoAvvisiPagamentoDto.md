
# RichiestaInfoAvvisiPagamentoDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**codIpaRichiedente** | **String** | Indice dei domicili digitali della Pubblica Amministrazione e dei Gestori di Pubblici Servizi, necessario per permettere a JPPA di caricare le configurazioni per la corretta gestione delle informazioni richieste o inviate | 
**codiceServizio** | [**CodiceServizioEnum**](#CodiceServizioEnum) | Codice del servizio client del sistema JPPA. Il servizio deve essere censito fra quelli abilitati per il codice IPA specificato nella richiesta | 
**criteriRicercaDto** | [**CriteriRicercaDto**](CriteriRicercaDto.md) | Tipo complesso che racchiude i criteri di ricerca utilizzabili da questo servizio | 
**pagati** | **Boolean** |  |  [optional]
**rendicontati** | **Boolean** | Solo uno tra rendicontati e riconciliati può essere true. L&#39;altro deve essere o null o valorizzato a false, pena ricevere un errore durante la chiamata al servizio |  [optional]
**riconciliati** | **Boolean** | Solo uno tra rendicontati e riconciliati può essere true. L&#39;altro deve essere o null o valorizzato a false, pena ricevere un errore durante la chiamata al servizio |  [optional]


<a name="CodiceServizioEnum"></a>
## Enum: CodiceServizioEnum
Name | Value
---- | -----
ABI | &quot;ABI&quot;
ADVANCEDSYSTEMS | &quot;ADVANCEDSYSTEMS&quot;
AFFITTIICCS | &quot;AFFITTIICCS&quot;
AFT | &quot;AFT&quot;
ALBM | &quot;ALBM&quot;
ANTHESI | &quot;ANTHESI&quot;
APK | &quot;APK&quot;
APPNET | &quot;APPNET&quot;
APPNETWEB | &quot;APPNETWEB&quot;
ARTEMEDIA | &quot;ARTEMEDIA&quot;
ASILO | &quot;ASILO&quot;
ASL | &quot;ASL&quot;
BERENICE | &quot;BERENICE&quot;
CANZIANI | &quot;CANZIANI&quot;
CCS | &quot;CCS&quot;
CCUP | &quot;CCUP&quot;
CEC | &quot;CEC&quot;
CEDEPP | &quot;CEDEPP&quot;
CEDEPP_CIM | &quot;CEDEPP.CIM&quot;
CENTRIESTIVI | &quot;CENTRIESTIVI&quot;
CIE | &quot;CIE&quot;
CIMITEROWEB | &quot;CIMITEROWEB&quot;
CITYMAT | &quot;CITYMAT&quot;
CITYWARE | &quot;CITYWARE&quot;
CMAT | &quot;CMAT&quot;
CMCC | &quot;CMCC&quot;
CMENSA | &quot;CMENSA&quot;
COATTIVATOSAP | &quot;COATTIVATOSAP&quot;
CONCILIA | &quot;CONCILIA&quot;
CONCILIA_NUOVO | &quot;CONCILIA.NUOVO&quot;
CONCILIA_RONCO | &quot;CONCILIA.RONCO&quot;
CONCILIAAG | &quot;CONCILIAAG&quot;
CONCILIAAV | &quot;CONCILIAAV&quot;
CONCILIABORGO | &quot;CONCILIABORGO&quot;
CONCILIACAVEDINE | &quot;CONCILIACAVEDINE&quot;
CONCILIACEMBRA | &quot;CONCILIACEMBRA&quot;
CONCILIADIMARO | &quot;CONCILIADIMARO&quot;
CONCILIAFIEMME | &quot;CONCILIAFIEMME&quot;
CONCILIAMALE | &quot;CONCILIAMALE&quot;
CONCILIAMEZZANA | &quot;CONCILIAMEZZANA&quot;
CONCILIAMEZZO | &quot;CONCILIAMEZZO&quot;
CONCILIAMORI | &quot;CONCILIAMORI&quot;
CONCILIAPAGANELLA | &quot;CONCILIAPAGANELLA&quot;
CONCILIAPEIO | &quot;CONCILIAPEIO&quot;
CONCILIAPERGINE | &quot;CONCILIAPERGINE&quot;
CONCILIAPRIMIERO | &quot;CONCILIAPRIMIERO&quot;
CONCILIAROVERETO | &quot;CONCILIAROVERETO&quot;
CONCILIATRENTO | &quot;CONCILIATRENTO&quot;
CONCILIAVALLE | &quot;CONCILIAVALLE&quot;
CONCIM | &quot;CONCIM&quot;
CONCIMI | &quot;CONCIMI&quot;
CPM | &quot;CPM&quot;
CPS | &quot;CPS&quot;
CSAD | &quot;CSAD&quot;
CSRC | &quot;CSRC&quot;
CTRASP | &quot;CTRASP&quot;
CUP | &quot;CUP&quot;
CUPPUBB | &quot;CUPPUBB&quot;
DATAGRAPH | &quot;DATAGRAPH&quot;
DI | &quot;DI&quot;
DIRACCESSOATTI | &quot;DIRACCESSOATTI&quot;
DIRISTR | &quot;DIRISTR&quot;
DIRITTISEGRETERIASUAP | &quot;DIRITTISEGRETERIASUAP&quot;
DOGRE | &quot;DOGRE&quot;
DOGREMERCATI | &quot;DOGREMERCATI&quot;
DOGREPUBB | &quot;DOGREPUBB&quot;
DONACOD | &quot;DONACOD&quot;
DRV | &quot;DRV&quot;
DSEG | &quot;DSEG&quot;
DSS | &quot;DSS&quot;
DSU | &quot;DSU&quot;
EDLPRI | &quot;EDLPRI&quot;
ESED | &quot;ESED&quot;
ETP | &quot;ETP&quot;
FINTEL | &quot;FINTEL&quot;
FLUSSIRAVDA | &quot;FLUSSIRAVDA&quot;
GERIS | &quot;GERIS&quot;
GIES | &quot;GIES&quot;
GISCO | &quot;GISCO&quot;
GISWEB | &quot;GISWEB&quot;
GLOBO | &quot;GLOBO&quot;
ICARO | &quot;ICARO&quot;
ICCS | &quot;ICCS&quot;
ICCSCREDSCUOLA | &quot;ICCSCREDSCUOLA&quot;
ICCSINGRESSO | &quot;ICCSINGRESSO&quot;
ICCSMENSA | &quot;ICCSMENSA&quot;
ICCSMENSANIDO | &quot;ICCSMENSANIDO&quot;
ICCSNIDO | &quot;ICCSNIDO&quot;
ICCSNIDOSCUOLA | &quot;ICCSNIDOSCUOLA&quot;
ICCSPOSTSCUOLA | &quot;ICCSPOSTSCUOLA&quot;
ICCSPRESCUOLA | &quot;ICCSPRESCUOLA&quot;
ICCSTRASPORTO | &quot;ICCSTRASPORTO&quot;
ICCSTRASPORTOSCUOLA | &quot;ICCSTRASPORTOSCUOLA&quot;
ICTGLOBALSERVICE | &quot;ICTGLOBALSERVICE&quot;
IDS_ESED | &quot;IDS.ESED&quot;
INCLOUD | &quot;INCLOUD&quot;
INFTRENTINA | &quot;INFTRENTINA&quot;
INSOFT | &quot;INSOFT&quot;
INVA | &quot;INVA&quot;
ISO | &quot;ISO&quot;
ITALSOFT | &quot;ITALSOFT&quot;
IVO | &quot;IVO&quot;
JCITY_GOV | &quot;JCITY.GOV&quot;
JCITY_GOVMOD3 | &quot;JCITY.GOVMOD3&quot;
JDEMOS | &quot;JDEMOS&quot;
JSERFIN | &quot;JSERFIN&quot;
JTRIB | &quot;JTRIB&quot;
JTRIB_GENAZZANO | &quot;JTRIB.GENAZZANO&quot;
JTRIB_MI | &quot;JTRIB.MI&quot;
JTRIB_MT | &quot;JTRIB.MT&quot;
JTRIB_POLI | &quot;JTRIB.POLI&quot;
JTRIB_PREGNANA | &quot;JTRIB.PREGNANA&quot;
JTRIB_ROIATE | &quot;JTRIB.ROIATE&quot;
JTRIB08 | &quot;JTRIB08&quot;
JTRIB16 | &quot;JTRIB16&quot;
JTRIB51 | &quot;JTRIB51&quot;
JTRIB53 | &quot;JTRIB53&quot;
JTRIB70 | &quot;JTRIB70&quot;
JTRIBATTESI | &quot;JTRIBATTESI&quot;
JTRIBCONTRPRIV | &quot;JTRIBCONTRPRIV&quot;
JTRIBDEPCAUZ | &quot;JTRIBDEPCAUZ&quot;
JTRIBDIRSEGRURB | &quot;JTRIBDIRSEGRURB&quot;
JTRIBDISTRGAS | &quot;JTRIBDISTRGAS&quot;
JTRIBLEGNAME | &quot;JTRIBLEGNAME&quot;
JTRIBMT | &quot;JTRIBMT&quot;
JTRIBRIMBAFF | &quot;JTRIBRIMBAFF&quot;
JTRIBRIMBASSIC | &quot;JTRIBRIMBASSIC&quot;
JTRIBSANZURBAN | &quot;JTRIBSANZURBAN&quot;
JTRIBUSOTERRENI | &quot;JTRIBUSOTERRENI&quot;
JTRIBVOTIVA | &quot;JTRIBVOTIVA&quot;
LABCONSULENZE | &quot;LABCONSULENZE&quot;
LEONARDO_WEB | &quot;LEONARDO.WEB&quot;
LOC | &quot;LOC&quot;
MEGASP | &quot;MEGASP&quot;
MEN | &quot;MEN&quot;
MENSAICCS | &quot;MENSAICCS&quot;
MICRODISEGNO | &quot;MICRODISEGNO&quot;
MUL | &quot;MUL&quot;
MULTESILFI | &quot;MULTESILFI&quot;
MUNICIPIA | &quot;MUNICIPIA&quot;
MUNICIPIUM | &quot;MUNICIPIUM&quot;
NIDOICCS | &quot;NIDOICCS&quot;
NOVA | &quot;NOVA&quot;
OCI | &quot;OCI&quot;
ONERIURBPRIM | &quot;ONERIURBPRIM&quot;
PAGAMENTISPONTANEI | &quot;PAGAMENTISPONTANEI&quot;
PAGAMENTO_SPONTANEI_PAGONET | &quot;PAGAMENTO.SPONTANEI.PAGONET&quot;
PAGONET | &quot;PAGONET&quot;
PASTI | &quot;PASTI&quot;
PAY_MANAGER | &quot;PAY.MANAGER&quot;
PAY_MANAGERMT | &quot;PAY.MANAGERMT&quot;
PES | &quot;PES&quot;
PGSOFT | &quot;PGSOFT&quot;
PNITALIA | &quot;PNITALIA&quot;
PR013TT1 | &quot;PR013TT1&quot;
PREPOSTSCUOLA | &quot;PREPOSTSCUOLA&quot;
PROGEL | &quot;PROGEL&quot;
PROJECT | &quot;PROJECT&quot;
PROJECTATS | &quot;PROJECTATS&quot;
PROVENTICONCESSIONISPAZIAREE | &quot;PROVENTICONCESSIONISPAZIAREE&quot;
RASIL | &quot;RASIL&quot;
RIFIU | &quot;RIFIU&quot;
RIS | &quot;RIS&quot;
RTESTESE | &quot;RTESTESE&quot;
SAD | &quot;SAD&quot;
SANZPOLAMM | &quot;SANZPOLAMM&quot;
SANZURB | &quot;SANZURB&quot;
SAPIDATA | &quot;SAPIDATA&quot;
SAPIDATABASSA | &quot;SAPIDATABASSA&quot;
SCM | &quot;SCM&quot;
SIDERA | &quot;SIDERA&quot;
SIEL | &quot;SIEL&quot;
SIKUEL | &quot;SIKUEL&quot;
SIPAL | &quot;SIPAL&quot;
SOFTECH | &quot;SOFTECH&quot;
SOGERT | &quot;SOGERT&quot;
SOLO1 | &quot;SOLO1&quot;
SSC | &quot;SSC&quot;
STARCH | &quot;STARCH&quot;
STARI | &quot;STARI&quot;
SUA | &quot;SUA&quot;
SUE | &quot;SUE&quot;
TARI | &quot;TARI&quot;
TEFA | &quot;TEFA&quot;
TELEASSISTENZA | &quot;TELEASSISTENZA&quot;
TESEO7 | &quot;TESEO7&quot;
TINN | &quot;TINN&quot;
TOSAPSOGERT | &quot;TOSAPSOGERT&quot;
TOVAGLIERI | &quot;TOVAGLIERI&quot;
TRASPORTOICCS | &quot;TRASPORTOICCS&quot;
TRASPORTOSCOLASTICO | &quot;TRASPORTOSCOLASTICO&quot;
TRI | &quot;TRI&quot;
TV9 | &quot;TV9&quot;
UDS | &quot;UDS&quot;
URBPRI | &quot;URBPRI&quot;
URBSEC | &quot;URBSEC&quot;
VERBATEL | &quot;VERBATEL&quot;
VERBCDS | &quot;VERBCDS&quot;
VOTIVE | &quot;VOTIVE&quot;
ZTL | &quot;ZTL&quot;




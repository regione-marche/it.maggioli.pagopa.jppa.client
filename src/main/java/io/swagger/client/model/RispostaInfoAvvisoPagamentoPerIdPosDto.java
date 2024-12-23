/*
 * API Gateway Pagamenti
 * Set API REST PagoPA
 *
 * OpenAPI spec version: 1.0
 * Contact: pagamenti.produzione@maggioli.it
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.AvvisoPagamentoDto;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * RispostaInfoAvvisoPagamentoPerIdPosDto
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-06-23T07:57:29.055Z")
public class RispostaInfoAvvisoPagamentoPerIdPosDto {
  @SerializedName("avvisiPamaneto")
  private List<AvvisoPagamentoDto> avvisiPamaneto = null;

  @SerializedName("codIpaRichiedente")
  private String codIpaRichiedente = null;

  /**
   * Codice del servizio client del sistema JPPA. Il servizio deve essere censito fra quelli abilitati per il codice IPA specificato nella richiesta
   */
  @JsonAdapter(CodiceServizioEnum.Adapter.class)
  public enum CodiceServizioEnum {
    ABI("ABI"),
    
    ADVANCEDSYSTEMS("ADVANCEDSYSTEMS"),
    
    AFFITTIICCS("AFFITTIICCS"),
    
    AFT("AFT"),
    
    ALBM("ALBM"),
    
    ANTHESI("ANTHESI"),
    
    APK("APK"),
    
    APPNET("APPNET"),
    
    APPNETWEB("APPNETWEB"),
    
    ARTEMEDIA("ARTEMEDIA"),
    
    ASILO("ASILO"),
    
    ASL("ASL"),
    
    BERENICE("BERENICE"),
    
    CANZIANI("CANZIANI"),
    
    CCS("CCS"),
    
    CCUP("CCUP"),
    
    CEC("CEC"),
    
    CEDEPP("CEDEPP"),
    
    CEDEPP_CIM("CEDEPP.CIM"),
    
    CENTRIESTIVI("CENTRIESTIVI"),
    
    CIE("CIE"),
    
    CIMITEROWEB("CIMITEROWEB"),
    
    CITYMAT("CITYMAT"),
    
    CITYWARE("CITYWARE"),
    
    CMAT("CMAT"),
    
    CMCC("CMCC"),
    
    CMENSA("CMENSA"),
    
    COATTIVATOSAP("COATTIVATOSAP"),
    
    CONCILIA("CONCILIA"),
    
    CONCILIA_NUOVO("CONCILIA.NUOVO"),
    
    CONCILIA_RONCO("CONCILIA.RONCO"),
    
    CONCILIAAG("CONCILIAAG"),
    
    CONCILIAAV("CONCILIAAV"),
    
    CONCILIABORGO("CONCILIABORGO"),
    
    CONCILIACAVEDINE("CONCILIACAVEDINE"),
    
    CONCILIACEMBRA("CONCILIACEMBRA"),
    
    CONCILIADIMARO("CONCILIADIMARO"),
    
    CONCILIAFIEMME("CONCILIAFIEMME"),
    
    CONCILIAMALE("CONCILIAMALE"),
    
    CONCILIAMEZZANA("CONCILIAMEZZANA"),
    
    CONCILIAMEZZO("CONCILIAMEZZO"),
    
    CONCILIAMORI("CONCILIAMORI"),
    
    CONCILIAPAGANELLA("CONCILIAPAGANELLA"),
    
    CONCILIAPEIO("CONCILIAPEIO"),
    
    CONCILIAPERGINE("CONCILIAPERGINE"),
    
    CONCILIAPRIMIERO("CONCILIAPRIMIERO"),
    
    CONCILIAROVERETO("CONCILIAROVERETO"),
    
    CONCILIATRENTO("CONCILIATRENTO"),
    
    CONCILIAVALLE("CONCILIAVALLE"),
    
    CONCIM("CONCIM"),
    
    CONCIMI("CONCIMI"),
    
    CPM("CPM"),
    
    CPS("CPS"),
    
    CSAD("CSAD"),
    
    CSRC("CSRC"),
    
    CTRASP("CTRASP"),
    
    CUP("CUP"),
    
    CUPPUBB("CUPPUBB"),
    
    DATAGRAPH("DATAGRAPH"),
    
    DI("DI"),
    
    DIRACCESSOATTI("DIRACCESSOATTI"),
    
    DIRISTR("DIRISTR"),
    
    DIRITTISEGRETERIASUAP("DIRITTISEGRETERIASUAP"),
    
    DOGRE("DOGRE"),
    
    DOGREMERCATI("DOGREMERCATI"),
    
    DOGREPUBB("DOGREPUBB"),
    
    DONACOD("DONACOD"),
    
    DRV("DRV"),
    
    DSEG("DSEG"),
    
    DSS("DSS"),
    
    DSU("DSU"),
    
    EDLPRI("EDLPRI"),
    
    ESED("ESED"),
    
    ETP("ETP"),
    
    FINTEL("FINTEL"),
    
    FLUSSIRAVDA("FLUSSIRAVDA"),
    
    GERIS("GERIS"),
    
    GIES("GIES"),
    
    GISCO("GISCO"),
    
    GISWEB("GISWEB"),
    
    GLOBO("GLOBO"),
    
    ICARO("ICARO"),
    
    ICCS("ICCS"),
    
    ICCSCREDSCUOLA("ICCSCREDSCUOLA"),
    
    ICCSINGRESSO("ICCSINGRESSO"),
    
    ICCSMENSA("ICCSMENSA"),
    
    ICCSMENSANIDO("ICCSMENSANIDO"),
    
    ICCSNIDO("ICCSNIDO"),
    
    ICCSNIDOSCUOLA("ICCSNIDOSCUOLA"),
    
    ICCSPOSTSCUOLA("ICCSPOSTSCUOLA"),
    
    ICCSPRESCUOLA("ICCSPRESCUOLA"),
    
    ICCSTRASPORTO("ICCSTRASPORTO"),
    
    ICCSTRASPORTOSCUOLA("ICCSTRASPORTOSCUOLA"),
    
    ICTGLOBALSERVICE("ICTGLOBALSERVICE"),
    
    IDS_ESED("IDS.ESED"),
    
    INCLOUD("INCLOUD"),
    
    INFTRENTINA("INFTRENTINA"),
    
    INSOFT("INSOFT"),
    
    INVA("INVA"),
    
    ISO("ISO"),
    
    ITALSOFT("ITALSOFT"),
    
    IVO("IVO"),
    
    JCITY_GOV("JCITY.GOV"),
    
    JCITY_GOVMOD3("JCITY.GOVMOD3"),
    
    JDEMOS("JDEMOS"),
    
    JSERFIN("JSERFIN"),
    
    JTRIB("JTRIB"),
    
    JTRIB_GENAZZANO("JTRIB.GENAZZANO"),
    
    JTRIB_MI("JTRIB.MI"),
    
    JTRIB_MT("JTRIB.MT"),
    
    JTRIB_POLI("JTRIB.POLI"),
    
    JTRIB_PREGNANA("JTRIB.PREGNANA"),
    
    JTRIB_ROIATE("JTRIB.ROIATE"),
    
    JTRIB08("JTRIB08"),
    
    JTRIB16("JTRIB16"),
    
    JTRIB51("JTRIB51"),
    
    JTRIB53("JTRIB53"),
    
    JTRIB70("JTRIB70"),
    
    JTRIBATTESI("JTRIBATTESI"),
    
    JTRIBCONTRPRIV("JTRIBCONTRPRIV"),
    
    JTRIBDEPCAUZ("JTRIBDEPCAUZ"),
    
    JTRIBDIRSEGRURB("JTRIBDIRSEGRURB"),
    
    JTRIBDISTRGAS("JTRIBDISTRGAS"),
    
    JTRIBLEGNAME("JTRIBLEGNAME"),
    
    JTRIBMT("JTRIBMT"),
    
    JTRIBRIMBAFF("JTRIBRIMBAFF"),
    
    JTRIBRIMBASSIC("JTRIBRIMBASSIC"),
    
    JTRIBSANZURBAN("JTRIBSANZURBAN"),
    
    JTRIBUSOTERRENI("JTRIBUSOTERRENI"),
    
    JTRIBVOTIVA("JTRIBVOTIVA"),
    
    LABCONSULENZE("LABCONSULENZE"),
    
    LEONARDO_WEB("LEONARDO.WEB"),
    
    LOC("LOC"),
    
    MEGASP("MEGASP"),
    
    MEN("MEN"),
    
    MENSAICCS("MENSAICCS"),
    
    MICRODISEGNO("MICRODISEGNO"),
    
    MUL("MUL"),
    
    MULTESILFI("MULTESILFI"),
    
    MUNICIPIA("MUNICIPIA"),
    
    MUNICIPIUM("MUNICIPIUM"),
    
    NIDOICCS("NIDOICCS"),
    
    NOVA("NOVA"),
    
    OCI("OCI"),
    
    ONERIURBPRIM("ONERIURBPRIM"),
    
    PAGAMENTISPONTANEI("PAGAMENTISPONTANEI"),
    
    PAGAMENTO_SPONTANEI_PAGONET("PAGAMENTO.SPONTANEI.PAGONET"),
    
    PAGONET("PAGONET"),
    
    PASTI("PASTI"),
    
    PAY_MANAGER("PAY.MANAGER"),
    
    PAY_MANAGERMT("PAY.MANAGERMT"),
    
    PES("PES"),
    
    PGSOFT("PGSOFT"),
    
    PNITALIA("PNITALIA"),
    
    PR013TT1("PR013TT1"),
    
    PREPOSTSCUOLA("PREPOSTSCUOLA"),
    
    PROGEL("PROGEL"),
    
    PROJECT("PROJECT"),
    
    PROJECTATS("PROJECTATS"),
    
    PROVENTICONCESSIONISPAZIAREE("PROVENTICONCESSIONISPAZIAREE"),
    
    RASIL("RASIL"),
    
    RIFIU("RIFIU"),
    
    RIS("RIS"),
    
    RTESTESE("RTESTESE"),
    
    SAD("SAD"),
    
    SANZPOLAMM("SANZPOLAMM"),
    
    SANZURB("SANZURB"),
    
    SAPIDATA("SAPIDATA"),
    
    SAPIDATABASSA("SAPIDATABASSA"),
    
    SCM("SCM"),
    
    SIDERA("SIDERA"),
    
    SIEL("SIEL"),
    
    SIKUEL("SIKUEL"),
    
    SIPAL("SIPAL"),
    
    SOFTECH("SOFTECH"),
    
    SOGERT("SOGERT"),
    
    SOLO1("SOLO1"),
    
    SSC("SSC"),
    
    STARCH("STARCH"),
    
    STARI("STARI"),
    
    SUA("SUA"),
    
    SUE("SUE"),
    
    TARI("TARI"),
    
    TEFA("TEFA"),
    
    TELEASSISTENZA("TELEASSISTENZA"),
    
    TESEO7("TESEO7"),
    
    TINN("TINN"),
    
    TOSAPSOGERT("TOSAPSOGERT"),
    
    TOVAGLIERI("TOVAGLIERI"),
    
    TRASPORTOICCS("TRASPORTOICCS"),
    
    TRASPORTOSCOLASTICO("TRASPORTOSCOLASTICO"),
    
    TRI("TRI"),
    
    TV9("TV9"),
    
    UDS("UDS"),
    
    URBPRI("URBPRI"),
    
    URBSEC("URBSEC"),
    
    VERBATEL("VERBATEL"),
    
    VERBCDS("VERBCDS"),
    
    VOTIVE("VOTIVE"),
    
    ZTL("ZTL");

    private String value;

    CodiceServizioEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CodiceServizioEnum fromValue(String text) {
      for (CodiceServizioEnum b : CodiceServizioEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<CodiceServizioEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CodiceServizioEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CodiceServizioEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return CodiceServizioEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("codiceServizio")
  private CodiceServizioEnum codiceServizio = null;

  public RispostaInfoAvvisoPagamentoPerIdPosDto avvisiPamaneto(List<AvvisoPagamentoDto> avvisiPamaneto) {
    this.avvisiPamaneto = avvisiPamaneto;
    return this;
  }

  public RispostaInfoAvvisoPagamentoPerIdPosDto addAvvisiPamanetoItem(AvvisoPagamentoDto avvisiPamanetoItem) {
    if (this.avvisiPamaneto == null) {
      this.avvisiPamaneto = new ArrayList<AvvisoPagamentoDto>();
    }
    this.avvisiPamaneto.add(avvisiPamanetoItem);
    return this;
  }

   /**
   * Get avvisiPamaneto
   * @return avvisiPamaneto
  **/
  @ApiModelProperty(value = "")
  public List<AvvisoPagamentoDto> getAvvisiPamaneto() {
    return avvisiPamaneto;
  }

  public void setAvvisiPamaneto(List<AvvisoPagamentoDto> avvisiPamaneto) {
    this.avvisiPamaneto = avvisiPamaneto;
  }

  public RispostaInfoAvvisoPagamentoPerIdPosDto codIpaRichiedente(String codIpaRichiedente) {
    this.codIpaRichiedente = codIpaRichiedente;
    return this;
  }

   /**
   * Indice dei domicili digitali della Pubblica Amministrazione e dei Gestori di Pubblici Servizi, necessario per permettere a JPPA di caricare le configurazioni per la corretta gestione delle informazioni richieste o inviate
   * @return codIpaRichiedente
  **/
  @ApiModelProperty(example = "EntTest1", required = true, value = "Indice dei domicili digitali della Pubblica Amministrazione e dei Gestori di Pubblici Servizi, necessario per permettere a JPPA di caricare le configurazioni per la corretta gestione delle informazioni richieste o inviate")
  public String getCodIpaRichiedente() {
    return codIpaRichiedente;
  }

  public void setCodIpaRichiedente(String codIpaRichiedente) {
    this.codIpaRichiedente = codIpaRichiedente;
  }

  public RispostaInfoAvvisoPagamentoPerIdPosDto codiceServizio(CodiceServizioEnum codiceServizio) {
    this.codiceServizio = codiceServizio;
    return this;
  }

   /**
   * Codice del servizio client del sistema JPPA. Il servizio deve essere censito fra quelli abilitati per il codice IPA specificato nella richiesta
   * @return codiceServizio
  **/
  @ApiModelProperty(example = "JTRIB", required = true, value = "Codice del servizio client del sistema JPPA. Il servizio deve essere censito fra quelli abilitati per il codice IPA specificato nella richiesta")
  public CodiceServizioEnum getCodiceServizio() {
    return codiceServizio;
  }

  public void setCodiceServizio(CodiceServizioEnum codiceServizio) {
    this.codiceServizio = codiceServizio;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RispostaInfoAvvisoPagamentoPerIdPosDto rispostaInfoAvvisoPagamentoPerIdPosDto = (RispostaInfoAvvisoPagamentoPerIdPosDto) o;
    return Objects.equals(this.avvisiPamaneto, rispostaInfoAvvisoPagamentoPerIdPosDto.avvisiPamaneto) &&
        Objects.equals(this.codIpaRichiedente, rispostaInfoAvvisoPagamentoPerIdPosDto.codIpaRichiedente) &&
        Objects.equals(this.codiceServizio, rispostaInfoAvvisoPagamentoPerIdPosDto.codiceServizio);
  }

  @Override
  public int hashCode() {
    return Objects.hash(avvisiPamaneto, codIpaRichiedente, codiceServizio);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RispostaInfoAvvisoPagamentoPerIdPosDto {\n");
    
    sb.append("    avvisiPamaneto: ").append(toIndentedString(avvisiPamaneto)).append("\n");
    sb.append("    codIpaRichiedente: ").append(toIndentedString(codIpaRichiedente)).append("\n");
    sb.append("    codiceServizio: ").append(toIndentedString(codiceServizio)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}


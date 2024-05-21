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

import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.threeten.bp.OffsetDateTime;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import io.swagger.annotations.ApiModelProperty;

/**
 * DettaglioDovutoDto
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-06-23T07:57:29.055Z")

public class DettaglioDovutoDto {

	public DettaglioDovutoDto() {
		super();
	}

	public DettaglioDovutoDto(String causaleDebito, String codiceIpaCreditore, String codiceLotto,
			String codiceTipoDebito, OffsetDateTime dataFineValidita, OffsetDateTime dataInizioValidita,
			OffsetDateTime dataLimitePagabilita, List<DatoAccertamentoDto> datiAccertamento, String gruppo,
			String idDeb, Double importoDebito, BigDecimal importoSpeseNotifica, MarcaDaBolloDto marcaDaBollo,
			Integer ordinamento, List<ParametroDebitoDto> parametriDebito,
			SpeseNotificaDaAttualizzareEnum speseNotificaDaAttualizzare) {
		super();
		this.causaleDebito = causaleDebito;
		this.codiceIpaCreditore = codiceIpaCreditore;
		this.codiceLotto = codiceLotto;
		this.codiceTipoDebito = codiceTipoDebito;
		this.dataFineValidita = dataFineValidita;
		this.dataInizioValidita = dataInizioValidita;
		this.dataLimitePagabilita = dataLimitePagabilita;
		this.datiAccertamento = datiAccertamento;
		this.gruppo = gruppo;
		this.idDeb = idDeb;
		this.importoDebito = importoDebito;
		this.importoSpeseNotifica = importoSpeseNotifica;
		this.marcaDaBollo = marcaDaBollo;
		this.ordinamento = ordinamento;
		this.parametriDebito = parametriDebito;
		this.speseNotificaDaAttualizzare = speseNotificaDaAttualizzare;
	}

@SerializedName("causaleDebito")
  private String causaleDebito = null;

  @SerializedName("codiceIpaCreditore")
  private String codiceIpaCreditore = null;

  @SerializedName("codiceLotto")
  private String codiceLotto = null;

  /**
   * Codice che raggruppa tutte le parametrizzazioni semanticamente omogeneo di debiti. Identifica tipicamente un tributo o più in generale un onere che l’utente finale ha maturato nei confronti della pubblica amministrazione, max 1000 caratteri
   */
  @JsonAdapter(CodiceTipoDebitoEnum.Adapter.class)
  public enum CodiceTipoDebitoEnum {	  
    CASE_POPOLARI_AFFITTO("CASE_POPOLARI_AFFITTO"),
    
    CIMITERI_SERVIZO("CIMITERI_SERVIZO"),
    
    CIMITERI_VOTIVA("CIMITERI_VOTIVA"),
    
    DEMANIO_CANONE("DEMANIO_CANONE"),
    
    ISTRUTTORIA_SPESE("ISTRUTTORIA_SPESE"),
    
    MENSA("MENSA"),
    
    MULTE("MULTE"),
    
    ONERI("ONERI"),
    
    SAD("SAD"),
    
    SALA_COMUNALE("SALA_COMUNALE"),
    
    SCUOLA_MATERNA_ISCRIZIONE("SCUOLA_MATERNA_ISCRIZIONE"),
    
    SCUOLA_NIDO_RETTA("SCUOLA_NIDO_RETTA"),
    
    SCUOLA_PRE_POST_ORARIO("SCUOLA_PRE_POST_ORARIO"),
    
    SERVIZI("SERVIZI"),
    
    SPORT_PALESTRA("SPORT_PALESTRA"),
    
    SPORT_PISTA("SPORT_PISTA"),
    
    SPORT_STRUTTURA("SPORT_STRUTTURA"),
    
    STABILE_AFFITTO("STABILE_AFFITTO"),
    
    SUAP_ONERI("SUAP_ONERI"),
    
    SUE_ONERI("SUE_ONERI"),
    
    VACANZA_CLIMATICA("VACANZA_CLIMATICA"),
    
    VACANZA_ESTIVO("VACANZA_ESTIVO"),
    
    VERBATEL_RILASCIO("VERBATEL_RILASCIO"),
    
    ZTL_RESIDENTE("ZTL_RESIDENTE"),
    
    ZTL_TEMPORANEA("ZTL_TEMPORANEA"),
    
    TARI("TARI"),
    
    TAR("TAR"),
    
    AVV("AVV"),
    
    AAA("AAA"),
    
    PGP("PGP"),
    
    BOL("BOL");
  
    private String value;

    CodiceTipoDebitoEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CodiceTipoDebitoEnum fromValue(String text) {
      for (CodiceTipoDebitoEnum b : CodiceTipoDebitoEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<CodiceTipoDebitoEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CodiceTipoDebitoEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CodiceTipoDebitoEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return CodiceTipoDebitoEnum.fromValue(String.valueOf(value));
      }
    }
  }

//  @SerializedName("codiceTipoDebito")
//  private CodiceTipoDebitoEnum codiceTipoDebito = null;

  private String codiceTipoDebito = null;

  @SerializedName("dataFineValidita")
  private OffsetDateTime dataFineValidita = null;

  @SerializedName("dataInizioValidita")
  private OffsetDateTime dataInizioValidita = null;

  @SerializedName("dataLimitePagabilita")
  private OffsetDateTime dataLimitePagabilita = null;

  @SerializedName("datiAccertamento")
  private List<DatoAccertamentoDto> datiAccertamento = null;

  @SerializedName("gruppo")
  private String gruppo = null;

  @SerializedName("idDeb")
  private String idDeb = null;

  @SerializedName("importoDebito")
  private Double importoDebito = null;

  @SerializedName("importoSpeseNotifica")
  private BigDecimal importoSpeseNotifica = null;

  @SerializedName("marcaDaBollo")
  private MarcaDaBolloDto marcaDaBollo = null;

  @SerializedName("ordinamento")
  private Integer ordinamento = null;

  @SerializedName("parametriDebito")
  private List<ParametroDebitoDto> parametriDebito = null;

  /**
   * flag che indica se le spese notifica sono da attualizzare
   */
  @JsonAdapter(SpeseNotificaDaAttualizzareEnum.Adapter.class)
  public enum SpeseNotificaDaAttualizzareEnum {
    OFF("ATTUALIZZAZIONE_OFF"),
    
    ON("ATTUALIZZAZIONE_ON");

    private String value;

    SpeseNotificaDaAttualizzareEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SpeseNotificaDaAttualizzareEnum fromValue(String text) {
      for (SpeseNotificaDaAttualizzareEnum b : SpeseNotificaDaAttualizzareEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<SpeseNotificaDaAttualizzareEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SpeseNotificaDaAttualizzareEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SpeseNotificaDaAttualizzareEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return SpeseNotificaDaAttualizzareEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("speseNotificaDaAttualizzare")
  private SpeseNotificaDaAttualizzareEnum speseNotificaDaAttualizzare = null;

  public DettaglioDovutoDto causaleDebito(String causaleDebito) {
    this.causaleDebito = causaleDebito;
    return this;
  }

   /**
   * La causale del debito che viene inviata ad AGID, max 140 caratteri
   * @return causaleDebito
  **/
  @ApiModelProperty(example = "Multa", required = true, value = "La causale del debito che viene inviata ad AGID, max 140 caratteri")
  public String getCausaleDebito() {
    return causaleDebito;
  }

  public void setCausaleDebito(String causaleDebito) {
    this.causaleDebito = causaleDebito;
  }

  public DettaglioDovutoDto codiceIpaCreditore(String codiceIpaCreditore) {
    this.codiceIpaCreditore = codiceIpaCreditore;
    return this;
  }

   /**
   * Codice IPA identificativo dell’ente creditore
   * @return codiceIpaCreditore
  **/
  @ApiModelProperty(example = "EntTest1", value = "Codice IPA identificativo dell’ente creditore")
  public String getCodiceIpaCreditore() {
    return codiceIpaCreditore;
  }

  public void setCodiceIpaCreditore(String codiceIpaCreditore) {
    this.codiceIpaCreditore = codiceIpaCreditore;
  }

  public DettaglioDovutoDto codiceLotto(String codiceLotto) {
    this.codiceLotto = codiceLotto;
    return this;
  }

   /**
   * Alfanumerico per l&#39;identificazione di debiti aggregati per affinità ed importanza per l&#39;ente, nato esplicitamente per le Poste, max 200 caratteri
   * @return codiceLotto
  **/
  @ApiModelProperty(example = "lotto478324", required = true, value = "Alfanumerico per l'identificazione di debiti aggregati per affinità ed importanza per l'ente, nato esplicitamente per le Poste, max 200 caratteri")
  public String getCodiceLotto() {
    return codiceLotto;
  }

  public void setCodiceLotto(String codiceLotto) {
    this.codiceLotto = codiceLotto;
  }

//  public DettaglioDovutoDto codiceTipoDebito(CodiceTipoDebitoEnum codiceTipoDebito) {
//    this.codiceTipoDebito = codiceTipoDebito;
//    return this;
//  }

  /**
   * Codice che raggruppa tutte le parametrizzazioni semanticamente omogeneo di debiti. Identifica tipicamente un tributo o più in generale un onere che l’utente finale ha maturato nei confronti della pubblica amministrazione, max 1000 caratteri
   * @return codiceTipoDebito
   **/
  public DettaglioDovutoDto codiceTipoDebito(String codiceTipoDebito) {
    this.codiceTipoDebito = codiceTipoDebito;
    return this;
  }


//  @ApiModelProperty(example = "MULTE", required = true, value = "Codice che raggruppa tutte le parametrizzazioni semanticamente omogeneo di debiti. Identifica tipicamente un tributo o più in generale un onere che l’utente finale ha maturato nei confronti della pubblica amministrazione, max 1000 caratteri")
//  public CodiceTipoDebitoEnum getCodiceTipoDebito() {
//    return codiceTipoDebito;
//  }
//
//  public void setCodiceTipoDebito(CodiceTipoDebitoEnum codiceTipoDebito) {
//    this.codiceTipoDebito = codiceTipoDebito;
//  }

  public void setCodiceTipoDebito(String codiceTipoDebito) {
    this.codiceTipoDebito = codiceTipoDebito;
  }

  public String getCodiceTipoDebito() {
    return codiceTipoDebito;
  }
  public DettaglioDovutoDto dataFineValidita(OffsetDateTime dataFineValidita) {
    this.dataFineValidita = dataFineValidita;
    return this;
  }

   /**
   * Data di fine validità del debito
   * @return dataFineValidita
  **/
  @ApiModelProperty(example = "2024-03-09T13:51:40.996Z", value = "Data di fine validità del debito")
  public OffsetDateTime getDataFineValidita() {
    return dataFineValidita;
  }

  public void setDataFineValidita(OffsetDateTime dataFineValidita) {
    this.dataFineValidita = dataFineValidita;
  }

  public DettaglioDovutoDto dataInizioValidita(OffsetDateTime dataInizioValidita) {
    this.dataInizioValidita = dataInizioValidita;
    return this;
  }

   /**
   * Data di inizio validità del debito
   * @return dataInizioValidita
  **/
  @ApiModelProperty(example = "2023-03-09T13:51:40.996Z", required = true, value = "Data di inizio validità del debito")
  public OffsetDateTime getDataInizioValidita() {
    return dataInizioValidita;
  }

  public void setDataInizioValidita(OffsetDateTime dataInizioValidita) {
    this.dataInizioValidita = dataInizioValidita;
  }

  public DettaglioDovutoDto dataLimitePagabilita(OffsetDateTime dataLimitePagabilita) {
    this.dataLimitePagabilita = dataLimitePagabilita;
    return this;
  }

   /**
   * Indica la data limite di pagabilità nel caso in cui la data di fine validità ricada in una data in cui non sia possibile effettuare il pagamento. Se non impostato la data limite di pagabilità sarà impostata uguale alla data di fine validità
   * @return dataLimitePagabilita
  **/
  @ApiModelProperty(example = "2024-03-09T13:51:40.996Z", value = "Indica la data limite di pagabilità nel caso in cui la data di fine validità ricada in una data in cui non sia possibile effettuare il pagamento. Se non impostato la data limite di pagabilità sarà impostata uguale alla data di fine validità")
  public OffsetDateTime getDataLimitePagabilita() {
    return dataLimitePagabilita;
  }

  public void setDataLimitePagabilita(OffsetDateTime dataLimitePagabilita) {
    this.dataLimitePagabilita = dataLimitePagabilita;
  }

  public DettaglioDovutoDto datiAccertamento(List<DatoAccertamentoDto> datiAccertamento) {
    this.datiAccertamento = datiAccertamento;
    return this;
  }

  public DettaglioDovutoDto addDatiAccertamentoItem(DatoAccertamentoDto datiAccertamentoItem) {
    if (this.datiAccertamento == null) {
      this.datiAccertamento = new ArrayList<DatoAccertamentoDto>();
    }
    this.datiAccertamento.add(datiAccertamentoItem);
    return this;
  }

   /**
   * Get datiAccertamento
   * @return datiAccertamento
  **/
  @ApiModelProperty(value = "")
  public List<DatoAccertamentoDto> getDatiAccertamento() {
    return datiAccertamento;
  }

  public void setDatiAccertamento(List<DatoAccertamentoDto> datiAccertamento) {
    this.datiAccertamento = datiAccertamento;
  }

  public DettaglioDovutoDto gruppo(String gruppo) {
    this.gruppo = gruppo;
    return this;
  }

   /**
   * Identifica una opzione di pagamento per la relativa posizione debitoria
   * @return gruppo
  **/
  @ApiModelProperty(example = "1", required = true, value = "Identifica una opzione di pagamento per la relativa posizione debitoria")
  public String getGruppo() {
    return gruppo;
  }

  public void setGruppo(String gruppo) {
    this.gruppo = gruppo;
  }

  public DettaglioDovutoDto idDeb(String idDeb) {
    this.idDeb = idDeb;
    return this;
  }

   /**
   * Identificativo del debito, è univoco nello scope della posizione debitoria, max 256 caratteri
   * @return idDeb
  **/
  @ApiModelProperty(example = "80874", required = true, value = "Identificativo del debito, è univoco nello scope della posizione debitoria, max 256 caratteri")
  public String getIdDeb() {
    return idDeb;
  }

  public void setIdDeb(String idDeb) {
    this.idDeb = idDeb;
  }

  public DettaglioDovutoDto importoDebito(Double importoDebito) {
    this.importoDebito = importoDebito;
    return this;
  }

   /**
   * Importo con due cifre decimali, massimo valore previsto 999999999.99
   * @return importoDebito
  **/
  @ApiModelProperty(example = "59.99", required = true, value = "Importo con due cifre decimali, massimo valore previsto 999999999.99")
  public Double getImportoDebito() {
    return importoDebito;
  }

  public void setImportoDebito(Double importoDebito) {
    this.importoDebito = importoDebito;
  }

  public DettaglioDovutoDto importoSpeseNotifica(BigDecimal importoSpeseNotifica) {
    this.importoSpeseNotifica = importoSpeseNotifica;
    return this;
  }

   /**
   * Importo spese notifica con due cifre decimali
   * @return importoSpeseNotifica
  **/
  @ApiModelProperty(example = "59.99", value = "Importo spese notifica con due cifre decimali")
  public BigDecimal getImportoSpeseNotifica() {
    return importoSpeseNotifica;
  }

  public void setImportoSpeseNotifica(BigDecimal importoSpeseNotifica) {
    this.importoSpeseNotifica = importoSpeseNotifica;
  }

  public DettaglioDovutoDto marcaDaBollo(MarcaDaBolloDto marcaDaBollo) {
    this.marcaDaBollo = marcaDaBollo;
    return this;
  }

   /**
   * Get marcaDaBollo
   * @return marcaDaBollo
  **/
  @ApiModelProperty(value = "")
  public MarcaDaBolloDto getMarcaDaBollo() {
    return marcaDaBollo;
  }

  public void setMarcaDaBollo(MarcaDaBolloDto marcaDaBollo) {
    this.marcaDaBollo = marcaDaBollo;
  }

  public DettaglioDovutoDto ordinamento(Integer ordinamento) {
    this.ordinamento = ordinamento;
    return this;
  }

   /**
   * Indica l&#39;ordinamento del debito all&#39;interno del gruppo
   * @return ordinamento
  **/
  @ApiModelProperty(example = "12", required = true, value = "Indica l'ordinamento del debito all'interno del gruppo")
  public Integer getOrdinamento() {
    return ordinamento;
  }

  public void setOrdinamento(Integer ordinamento) {
    this.ordinamento = ordinamento;
  }

  public DettaglioDovutoDto parametriDebito(List<ParametroDebitoDto> parametriDebito) {
    this.parametriDebito = parametriDebito;
    return this;
  }

  public DettaglioDovutoDto addParametriDebitoItem(ParametroDebitoDto parametriDebitoItem) {
    if (this.parametriDebito == null) {
      this.parametriDebito = new ArrayList<ParametroDebitoDto>();
    }
    this.parametriDebito.add(parametriDebitoItem);
    return this;
  }

   /**
   * Get parametriDebito
   * @return parametriDebito
  **/
  @ApiModelProperty(value = "")
  public List<ParametroDebitoDto> getParametriDebito() {
    return parametriDebito;
  }

  public void setParametriDebito(List<ParametroDebitoDto> parametriDebito) {
    this.parametriDebito = parametriDebito;
  }

  public DettaglioDovutoDto speseNotificaDaAttualizzare(SpeseNotificaDaAttualizzareEnum speseNotificaDaAttualizzare) {
    this.speseNotificaDaAttualizzare = speseNotificaDaAttualizzare;
    return this;
  }

   /**
   * flag che indica se le spese notifica sono da attualizzare
   * @return speseNotificaDaAttualizzare
  **/
  @ApiModelProperty(value = "flag che indica se le spese notifica sono da attualizzare")
  public SpeseNotificaDaAttualizzareEnum getSpeseNotificaDaAttualizzare() {
    return speseNotificaDaAttualizzare;
  }

  public void setSpeseNotificaDaAttualizzare(SpeseNotificaDaAttualizzareEnum speseNotificaDaAttualizzare) {
    this.speseNotificaDaAttualizzare = speseNotificaDaAttualizzare;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DettaglioDovutoDto dettaglioDovutoDto = (DettaglioDovutoDto) o;
    return Objects.equals(this.causaleDebito, dettaglioDovutoDto.causaleDebito) &&
        Objects.equals(this.codiceIpaCreditore, dettaglioDovutoDto.codiceIpaCreditore) &&
        Objects.equals(this.codiceLotto, dettaglioDovutoDto.codiceLotto) &&
        Objects.equals(this.codiceTipoDebito, dettaglioDovutoDto.codiceTipoDebito) &&
        Objects.equals(this.dataFineValidita, dettaglioDovutoDto.dataFineValidita) &&
        Objects.equals(this.dataInizioValidita, dettaglioDovutoDto.dataInizioValidita) &&
        Objects.equals(this.dataLimitePagabilita, dettaglioDovutoDto.dataLimitePagabilita) &&
        Objects.equals(this.datiAccertamento, dettaglioDovutoDto.datiAccertamento) &&
        Objects.equals(this.gruppo, dettaglioDovutoDto.gruppo) &&
        Objects.equals(this.idDeb, dettaglioDovutoDto.idDeb) &&
        Objects.equals(this.importoDebito, dettaglioDovutoDto.importoDebito) &&
        Objects.equals(this.importoSpeseNotifica, dettaglioDovutoDto.importoSpeseNotifica) &&
        Objects.equals(this.marcaDaBollo, dettaglioDovutoDto.marcaDaBollo) &&
        Objects.equals(this.ordinamento, dettaglioDovutoDto.ordinamento) &&
        Objects.equals(this.parametriDebito, dettaglioDovutoDto.parametriDebito) &&
        Objects.equals(this.speseNotificaDaAttualizzare, dettaglioDovutoDto.speseNotificaDaAttualizzare);
  }

  @Override
  public int hashCode() {
    return Objects.hash(causaleDebito, codiceIpaCreditore, codiceLotto, codiceTipoDebito, dataFineValidita, dataInizioValidita, dataLimitePagabilita, datiAccertamento, gruppo, idDeb, importoDebito, importoSpeseNotifica, marcaDaBollo, ordinamento, parametriDebito, speseNotificaDaAttualizzare);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DettaglioDovutoDto {\n");
    
    sb.append("    causaleDebito: ").append(toIndentedString(causaleDebito)).append("\n");
    sb.append("    codiceIpaCreditore: ").append(toIndentedString(codiceIpaCreditore)).append("\n");
    sb.append("    codiceLotto: ").append(toIndentedString(codiceLotto)).append("\n");
    sb.append("    codiceTipoDebito: ").append(toIndentedString(codiceTipoDebito)).append("\n");
    sb.append("    dataFineValidita: ").append(toIndentedString(dataFineValidita)).append("\n");
    sb.append("    dataInizioValidita: ").append(toIndentedString(dataInizioValidita)).append("\n");
    sb.append("    dataLimitePagabilita: ").append(toIndentedString(dataLimitePagabilita)).append("\n");
    sb.append("    datiAccertamento: ").append(toIndentedString(datiAccertamento)).append("\n");
    sb.append("    gruppo: ").append(toIndentedString(gruppo)).append("\n");
    sb.append("    idDeb: ").append(toIndentedString(idDeb)).append("\n");
    sb.append("    importoDebito: ").append(toIndentedString(importoDebito)).append("\n");
    sb.append("    importoSpeseNotifica: ").append(toIndentedString(importoSpeseNotifica)).append("\n");
    sb.append("    marcaDaBollo: ").append(toIndentedString(marcaDaBollo)).append("\n");
    sb.append("    ordinamento: ").append(toIndentedString(ordinamento)).append("\n");
    sb.append("    parametriDebito: ").append(toIndentedString(parametriDebito)).append("\n");
    sb.append("    speseNotificaDaAttualizzare: ").append(toIndentedString(speseNotificaDaAttualizzare)).append("\n");
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


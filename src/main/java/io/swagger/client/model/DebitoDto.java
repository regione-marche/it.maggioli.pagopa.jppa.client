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
import io.swagger.client.model.ContribuenteDto;
import io.swagger.client.model.DatoAccertamentoDto;
import io.swagger.client.model.MarcaDaBolloDto;
import io.swagger.client.model.ParametroDebitoDto;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;

/**
 * DebitoDto
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-06-23T07:57:29.055Z")
public class DebitoDto {
  @SerializedName("attivaDebito")
  private Boolean attivaDebito = null;

  /**
   * Gets or Sets causaAggStato
   */
  @JsonAdapter(CausaAggStatoEnum.Adapter.class)
  public enum CausaAggStatoEnum {
    ALTRO("ALTRO"),
    
    ATTIVAZIONE("ATTIVAZIONE"),
    
    ATTIVAZIONE_RIAPERTURA_TERMINI("ATTIVAZIONE_RIAPERTURA_TERMINI"),
    
    DISATTIVAZIONE("DISATTIVAZIONE"),
    
    ELIMINAZIONE("ELIMINAZIONE"),
    
    ELIMINAZIONE_DA_CRUSCOTTO("ELIMINAZIONE_DA_CRUSCOTTO"),
    
    ELIMINAZIONE_DEBITO("ELIMINAZIONE_DEBITO"),
    
    IMPORTO_ATTUALIZZATO("IMPORTO_ATTUALIZZATO"),
    
    MODIFICA_CAUSALE("MODIFICA_CAUSALE"),
    
    MODIFICA_CONTRIBUENTE("MODIFICA_CONTRIBUENTE"),
    
    MODIFICA_DATE_SCADENZA("MODIFICA_DATE_SCADENZA"),
    
    MODIFICA_DETTAGLI_IMPORTO("MODIFICA_DETTAGLI_IMPORTO"),
    
    MODIFICA_IMPORTO("MODIFICA_IMPORTO"),
    
    PAGAMENTO_ESTERNO("PAGAMENTO_ESTERNO"),
    
    SOSTITUZIONE("SOSTITUZIONE");

    private String value;

    CausaAggStatoEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CausaAggStatoEnum fromValue(String text) {
      for (CausaAggStatoEnum b : CausaAggStatoEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<CausaAggStatoEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CausaAggStatoEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CausaAggStatoEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return CausaAggStatoEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("causaAggStato")
  private CausaAggStatoEnum causaAggStato = null;

  @SerializedName("causaleDebito")
  private String causaleDebito = null;

  @SerializedName("codIpaCreditore")
  private String codIpaCreditore = null;

  @SerializedName("codIpaRichiedente")
  private String codIpaRichiedente = null;

  @SerializedName("codiceLotto")
  private String codiceLotto = null;

  @SerializedName("codiceServizio")
  private String codiceServizio = null;

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
    
    ZTL_TEMPORANEA("ZTL_TEMPORANEA");

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

  @SerializedName("codiceTipoDebito")
  private CodiceTipoDebitoEnum codiceTipoDebito = null;

  @SerializedName("contribuenteDto")
  private ContribuenteDto contribuenteDto = null;

  @SerializedName("dataFineValidita")
  private OffsetDateTime dataFineValidita = null;

  @SerializedName("dataInizioValidita")
  private OffsetDateTime dataInizioValidita = null;

  @SerializedName("dataLimitePagabilita")
  private OffsetDateTime dataLimitePagabilita = null;

  @SerializedName("datiAccertamento")
  private List<DatoAccertamentoDto> datiAccertamento = null;

  @SerializedName("dettaglioPosizione")
  private String dettaglioPosizione = null;

  @SerializedName("gruppo")
  private String gruppo = null;

  @SerializedName("idDebitoBO")
  private String idDebitoBO = null;

  @SerializedName("idPosizioneBO")
  private String idPosizioneBO = null;

  @SerializedName("identUnivocoVersamento")
  private String identUnivocoVersamento = null;

  @SerializedName("importoDebito")
  private Double importoDebito = null;

  @SerializedName("importoSpeseNotifica")
  private BigDecimal importoSpeseNotifica = null;

  @SerializedName("marcaDaBollo")
  private MarcaDaBolloDto marcaDaBollo = null;

  @SerializedName("numeroAvviso")
  private String numeroAvviso = null;

  @SerializedName("ordinamento")
  private Integer ordinamento = null;

  @SerializedName("parametriDebito")
  private List<ParametroDebitoDto> parametriDebito = null;

  /**
   * Gets or Sets partnerTecnologico
   */
  @JsonAdapter(PartnerTecnologicoEnum.Adapter.class)
  public enum PartnerTecnologicoEnum {
    ESTERNO("ESTERNO"),
    
    MAGGIOLI("MAGGIOLI");

    private String value;

    PartnerTecnologicoEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PartnerTecnologicoEnum fromValue(String text) {
      for (PartnerTecnologicoEnum b : PartnerTecnologicoEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<PartnerTecnologicoEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PartnerTecnologicoEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PartnerTecnologicoEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return PartnerTecnologicoEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("partnerTecnologico")
  private PartnerTecnologicoEnum partnerTecnologico = null;

  /**
   * flag attualizzazione spese notifica
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

  /**
   * Questa costante serve per permettere la sincronizzazione di un debitoin in locale rispetto al suo stato sul PDP
   */
  @JsonAdapter(StatoSincronizzazionePdpEnum.Adapter.class)
  public enum StatoSincronizzazionePdpEnum {
    NON_SINCRONIZZABILE("NON_SINCRONIZZABILE"),
    
    SINCRONIZZABILE("SINCRONIZZABILE");

    private String value;

    StatoSincronizzazionePdpEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatoSincronizzazionePdpEnum fromValue(String text) {
      for (StatoSincronizzazionePdpEnum b : StatoSincronizzazionePdpEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<StatoSincronizzazionePdpEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatoSincronizzazionePdpEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatoSincronizzazionePdpEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StatoSincronizzazionePdpEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("statoSincronizzazionePdp")
  private StatoSincronizzazionePdpEnum statoSincronizzazionePdp = null;

  @SerializedName("versioneNumeroAvviso")
  private Integer versioneNumeroAvviso = null;

  public DebitoDto attivaDebito(Boolean attivaDebito) {
    this.attivaDebito = attivaDebito;
    return this;
  }

   /**
   * Di default il debito viene creato attivo
   * @return attivaDebito
  **/
  @ApiModelProperty(example = "true", value = "Di default il debito viene creato attivo")
  public Boolean isAttivaDebito() {
    return attivaDebito;
  }

  public void setAttivaDebito(Boolean attivaDebito) {
    this.attivaDebito = attivaDebito;
  }

  public DebitoDto causaAggStato(CausaAggStatoEnum causaAggStato) {
    this.causaAggStato = causaAggStato;
    return this;
  }

   /**
   * Get causaAggStato
   * @return causaAggStato
  **/
  @ApiModelProperty(value = "")
  public CausaAggStatoEnum getCausaAggStato() {
    return causaAggStato;
  }

  public void setCausaAggStato(CausaAggStatoEnum causaAggStato) {
    this.causaAggStato = causaAggStato;
  }

  public DebitoDto causaleDebito(String causaleDebito) {
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

  public DebitoDto codIpaCreditore(String codIpaCreditore) {
    this.codIpaCreditore = codIpaCreditore;
    return this;
  }

   /**
   * Codice IPA identificativo dell’ente creditore
   * @return codIpaCreditore
  **/
  @ApiModelProperty(example = "EntTest1", value = "Codice IPA identificativo dell’ente creditore")
  public String getCodIpaCreditore() {
    return codIpaCreditore;
  }

  public void setCodIpaCreditore(String codIpaCreditore) {
    this.codIpaCreditore = codIpaCreditore;
  }

  public DebitoDto codIpaRichiedente(String codIpaRichiedente) {
    this.codIpaRichiedente = codIpaRichiedente;
    return this;
  }

   /**
   * Codice IPA identificativo dell’ente richiedente
   * @return codIpaRichiedente
  **/
  @ApiModelProperty(example = "EntTest1", value = "Codice IPA identificativo dell’ente richiedente")
  public String getCodIpaRichiedente() {
    return codIpaRichiedente;
  }

  public void setCodIpaRichiedente(String codIpaRichiedente) {
    this.codIpaRichiedente = codIpaRichiedente;
  }

  public DebitoDto codiceLotto(String codiceLotto) {
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

  public DebitoDto codiceServizio(String codiceServizio) {
    this.codiceServizio = codiceServizio;
    return this;
  }

   /**
   * Codice del servizio chiamante
   * @return codiceServizio
  **/
  @ApiModelProperty(example = "JTRIB", value = "Codice del servizio chiamante")
  public String getCodiceServizio() {
    return codiceServizio;
  }

  public void setCodiceServizio(String codiceServizio) {
    this.codiceServizio = codiceServizio;
  }

  public DebitoDto codiceTipoDebito(CodiceTipoDebitoEnum codiceTipoDebito) {
    this.codiceTipoDebito = codiceTipoDebito;
    return this;
  }

   /**
   * Codice che raggruppa tutte le parametrizzazioni semanticamente omogeneo di debiti. Identifica tipicamente un tributo o più in generale un onere che l’utente finale ha maturato nei confronti della pubblica amministrazione, max 1000 caratteri
   * @return codiceTipoDebito
  **/
  @ApiModelProperty(example = "MULTE", required = true, value = "Codice che raggruppa tutte le parametrizzazioni semanticamente omogeneo di debiti. Identifica tipicamente un tributo o più in generale un onere che l’utente finale ha maturato nei confronti della pubblica amministrazione, max 1000 caratteri")
  public CodiceTipoDebitoEnum getCodiceTipoDebito() {
    return codiceTipoDebito;
  }

  public void setCodiceTipoDebito(CodiceTipoDebitoEnum codiceTipoDebito) {
    this.codiceTipoDebito = codiceTipoDebito;
  }

  public DebitoDto contribuenteDto(ContribuenteDto contribuenteDto) {
    this.contribuenteDto = contribuenteDto;
    return this;
  }

   /**
   * Get contribuenteDto
   * @return contribuenteDto
  **/
  @ApiModelProperty(required = true, value = "")
  public ContribuenteDto getContribuenteDto() {
    return contribuenteDto;
  }

  public void setContribuenteDto(ContribuenteDto contribuenteDto) {
    this.contribuenteDto = contribuenteDto;
  }

  public DebitoDto dataFineValidita(OffsetDateTime dataFineValidita) {
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

  public DebitoDto dataInizioValidita(OffsetDateTime dataInizioValidita) {
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

  public DebitoDto dataLimitePagabilita(OffsetDateTime dataLimitePagabilita) {
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

  public DebitoDto datiAccertamento(List<DatoAccertamentoDto> datiAccertamento) {
    this.datiAccertamento = datiAccertamento;
    return this;
  }

  public DebitoDto addDatiAccertamentoItem(DatoAccertamentoDto datiAccertamentoItem) {
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

  public DebitoDto dettaglioPosizione(String dettaglioPosizione) {
    this.dettaglioPosizione = dettaglioPosizione;
    return this;
  }

   /**
   * Dettaglio in formato testuale della posizione debitoria di riferimento di questo debito, inteso per poter essere leggibile ed esplicativo. Potrebbe avere i riferimenti ad una contravvenzione o esplicitare una descrizione testuale che accompagna un debito generato da un determinato documento contabile, max 1000 caratteri
   * @return dettaglioPosizione
  **/
  @ApiModelProperty(example = "Multa per eccesso di velocità", required = true, value = "Dettaglio in formato testuale della posizione debitoria di riferimento di questo debito, inteso per poter essere leggibile ed esplicativo. Potrebbe avere i riferimenti ad una contravvenzione o esplicitare una descrizione testuale che accompagna un debito generato da un determinato documento contabile, max 1000 caratteri")
  public String getDettaglioPosizione() {
    return dettaglioPosizione;
  }

  public void setDettaglioPosizione(String dettaglioPosizione) {
    this.dettaglioPosizione = dettaglioPosizione;
  }

  public DebitoDto gruppo(String gruppo) {
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

  public DebitoDto idDebitoBO(String idDebitoBO) {
    this.idDebitoBO = idDebitoBO;
    return this;
  }

   /**
   * Identificativo del debito, è univoco nello scope della posizione debitoria, max 256 caratteri
   * @return idDebitoBO
  **/
  @ApiModelProperty(example = "1234", required = true, value = "Identificativo del debito, è univoco nello scope della posizione debitoria, max 256 caratteri")
  public String getIdDebitoBO() {
    return idDebitoBO;
  }

  public void setIdDebitoBO(String idDebitoBO) {
    this.idDebitoBO = idDebitoBO;
  }

  public DebitoDto idPosizioneBO(String idPosizioneBO) {
    this.idPosizioneBO = idPosizioneBO;
    return this;
  }

   /**
   * Identificativo della posizione debitoria. Questo identificativo permette ai vari servizi di poter inserire lo stesso debito in modalità differenti e mantenere un comportamento congruo da parte di jcg_pagopa, max 256 caratteri
   * @return idPosizioneBO
  **/
  @ApiModelProperty(example = "20230416_012", required = true, value = "Identificativo della posizione debitoria. Questo identificativo permette ai vari servizi di poter inserire lo stesso debito in modalità differenti e mantenere un comportamento congruo da parte di jcg_pagopa, max 256 caratteri")
  public String getIdPosizioneBO() {
    return idPosizioneBO;
  }

  public void setIdPosizioneBO(String idPosizioneBO) {
    this.idPosizioneBO = idPosizioneBO;
  }

  public DebitoDto identUnivocoVersamento(String identUnivocoVersamento) {
    this.identUnivocoVersamento = identUnivocoVersamento;
    return this;
  }

   /**
   * Get identUnivocoVersamento
   * @return identUnivocoVersamento
  **/
  @ApiModelProperty(example = "IdentificativoUnivocoVersamente", value = "")
  public String getIdentUnivocoVersamento() {
    return identUnivocoVersamento;
  }

  public void setIdentUnivocoVersamento(String identUnivocoVersamento) {
    this.identUnivocoVersamento = identUnivocoVersamento;
  }

  public DebitoDto importoDebito(Double importoDebito) {
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

  public DebitoDto importoSpeseNotifica(BigDecimal importoSpeseNotifica) {
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

  public DebitoDto marcaDaBollo(MarcaDaBolloDto marcaDaBollo) {
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

  public DebitoDto numeroAvviso(String numeroAvviso) {
    this.numeroAvviso = numeroAvviso;
    return this;
  }

   /**
   * Numero avviso, max 18 caratteri
   * @return numeroAvviso
  **/
  @ApiModelProperty(example = "004040000002146431", value = "Numero avviso, max 18 caratteri")
  public String getNumeroAvviso() {
    return numeroAvviso;
  }

  public void setNumeroAvviso(String numeroAvviso) {
    this.numeroAvviso = numeroAvviso;
  }

  public DebitoDto ordinamento(Integer ordinamento) {
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

  public DebitoDto parametriDebito(List<ParametroDebitoDto> parametriDebito) {
    this.parametriDebito = parametriDebito;
    return this;
  }

  public DebitoDto addParametriDebitoItem(ParametroDebitoDto parametriDebitoItem) {
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

  public DebitoDto partnerTecnologico(PartnerTecnologicoEnum partnerTecnologico) {
    this.partnerTecnologico = partnerTecnologico;
    return this;
  }

   /**
   * Get partnerTecnologico
   * @return partnerTecnologico
  **/
  @ApiModelProperty(example = "MAGGIOLI", value = "")
  public PartnerTecnologicoEnum getPartnerTecnologico() {
    return partnerTecnologico;
  }

  public void setPartnerTecnologico(PartnerTecnologicoEnum partnerTecnologico) {
    this.partnerTecnologico = partnerTecnologico;
  }

  public DebitoDto speseNotificaDaAttualizzare(SpeseNotificaDaAttualizzareEnum speseNotificaDaAttualizzare) {
    this.speseNotificaDaAttualizzare = speseNotificaDaAttualizzare;
    return this;
  }

   /**
   * flag attualizzazione spese notifica
   * @return speseNotificaDaAttualizzare
  **/
  @ApiModelProperty(example = "ATTUALIZZAZIONE_ON", value = "flag attualizzazione spese notifica")
  public SpeseNotificaDaAttualizzareEnum getSpeseNotificaDaAttualizzare() {
    return speseNotificaDaAttualizzare;
  }

  public void setSpeseNotificaDaAttualizzare(SpeseNotificaDaAttualizzareEnum speseNotificaDaAttualizzare) {
    this.speseNotificaDaAttualizzare = speseNotificaDaAttualizzare;
  }

  public DebitoDto statoSincronizzazionePdp(StatoSincronizzazionePdpEnum statoSincronizzazionePdp) {
    this.statoSincronizzazionePdp = statoSincronizzazionePdp;
    return this;
  }

   /**
   * Questa costante serve per permettere la sincronizzazione di un debitoin in locale rispetto al suo stato sul PDP
   * @return statoSincronizzazionePdp
  **/
  @ApiModelProperty(example = "NON_SINCRONIZZABILE", value = "Questa costante serve per permettere la sincronizzazione di un debitoin in locale rispetto al suo stato sul PDP")
  public StatoSincronizzazionePdpEnum getStatoSincronizzazionePdp() {
    return statoSincronizzazionePdp;
  }

  public void setStatoSincronizzazionePdp(StatoSincronizzazionePdpEnum statoSincronizzazionePdp) {
    this.statoSincronizzazionePdp = statoSincronizzazionePdp;
  }

  public DebitoDto versioneNumeroAvviso(Integer versioneNumeroAvviso) {
    this.versioneNumeroAvviso = versioneNumeroAvviso;
    return this;
  }

   /**
   * Get versioneNumeroAvviso
   * @return versioneNumeroAvviso
  **/
  @ApiModelProperty(example = "1", value = "")
  public Integer getVersioneNumeroAvviso() {
    return versioneNumeroAvviso;
  }

  public void setVersioneNumeroAvviso(Integer versioneNumeroAvviso) {
    this.versioneNumeroAvviso = versioneNumeroAvviso;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DebitoDto debitoDto = (DebitoDto) o;
    return Objects.equals(this.attivaDebito, debitoDto.attivaDebito) &&
        Objects.equals(this.causaAggStato, debitoDto.causaAggStato) &&
        Objects.equals(this.causaleDebito, debitoDto.causaleDebito) &&
        Objects.equals(this.codIpaCreditore, debitoDto.codIpaCreditore) &&
        Objects.equals(this.codIpaRichiedente, debitoDto.codIpaRichiedente) &&
        Objects.equals(this.codiceLotto, debitoDto.codiceLotto) &&
        Objects.equals(this.codiceServizio, debitoDto.codiceServizio) &&
        Objects.equals(this.codiceTipoDebito, debitoDto.codiceTipoDebito) &&
        Objects.equals(this.contribuenteDto, debitoDto.contribuenteDto) &&
        Objects.equals(this.dataFineValidita, debitoDto.dataFineValidita) &&
        Objects.equals(this.dataInizioValidita, debitoDto.dataInizioValidita) &&
        Objects.equals(this.dataLimitePagabilita, debitoDto.dataLimitePagabilita) &&
        Objects.equals(this.datiAccertamento, debitoDto.datiAccertamento) &&
        Objects.equals(this.dettaglioPosizione, debitoDto.dettaglioPosizione) &&
        Objects.equals(this.gruppo, debitoDto.gruppo) &&
        Objects.equals(this.idDebitoBO, debitoDto.idDebitoBO) &&
        Objects.equals(this.idPosizioneBO, debitoDto.idPosizioneBO) &&
        Objects.equals(this.identUnivocoVersamento, debitoDto.identUnivocoVersamento) &&
        Objects.equals(this.importoDebito, debitoDto.importoDebito) &&
        Objects.equals(this.importoSpeseNotifica, debitoDto.importoSpeseNotifica) &&
        Objects.equals(this.marcaDaBollo, debitoDto.marcaDaBollo) &&
        Objects.equals(this.numeroAvviso, debitoDto.numeroAvviso) &&
        Objects.equals(this.ordinamento, debitoDto.ordinamento) &&
        Objects.equals(this.parametriDebito, debitoDto.parametriDebito) &&
        Objects.equals(this.partnerTecnologico, debitoDto.partnerTecnologico) &&
        Objects.equals(this.speseNotificaDaAttualizzare, debitoDto.speseNotificaDaAttualizzare) &&
        Objects.equals(this.statoSincronizzazionePdp, debitoDto.statoSincronizzazionePdp) &&
        Objects.equals(this.versioneNumeroAvviso, debitoDto.versioneNumeroAvviso);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attivaDebito, causaAggStato, causaleDebito, codIpaCreditore, codIpaRichiedente, codiceLotto, codiceServizio, codiceTipoDebito, contribuenteDto, dataFineValidita, dataInizioValidita, dataLimitePagabilita, datiAccertamento, dettaglioPosizione, gruppo, idDebitoBO, idPosizioneBO, identUnivocoVersamento, importoDebito, importoSpeseNotifica, marcaDaBollo, numeroAvviso, ordinamento, parametriDebito, partnerTecnologico, speseNotificaDaAttualizzare, statoSincronizzazionePdp, versioneNumeroAvviso);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DebitoDto {\n");
    
    sb.append("    attivaDebito: ").append(toIndentedString(attivaDebito)).append("\n");
    sb.append("    causaAggStato: ").append(toIndentedString(causaAggStato)).append("\n");
    sb.append("    causaleDebito: ").append(toIndentedString(causaleDebito)).append("\n");
    sb.append("    codIpaCreditore: ").append(toIndentedString(codIpaCreditore)).append("\n");
    sb.append("    codIpaRichiedente: ").append(toIndentedString(codIpaRichiedente)).append("\n");
    sb.append("    codiceLotto: ").append(toIndentedString(codiceLotto)).append("\n");
    sb.append("    codiceServizio: ").append(toIndentedString(codiceServizio)).append("\n");
    sb.append("    codiceTipoDebito: ").append(toIndentedString(codiceTipoDebito)).append("\n");
    sb.append("    contribuenteDto: ").append(toIndentedString(contribuenteDto)).append("\n");
    sb.append("    dataFineValidita: ").append(toIndentedString(dataFineValidita)).append("\n");
    sb.append("    dataInizioValidita: ").append(toIndentedString(dataInizioValidita)).append("\n");
    sb.append("    dataLimitePagabilita: ").append(toIndentedString(dataLimitePagabilita)).append("\n");
    sb.append("    datiAccertamento: ").append(toIndentedString(datiAccertamento)).append("\n");
    sb.append("    dettaglioPosizione: ").append(toIndentedString(dettaglioPosizione)).append("\n");
    sb.append("    gruppo: ").append(toIndentedString(gruppo)).append("\n");
    sb.append("    idDebitoBO: ").append(toIndentedString(idDebitoBO)).append("\n");
    sb.append("    idPosizioneBO: ").append(toIndentedString(idPosizioneBO)).append("\n");
    sb.append("    identUnivocoVersamento: ").append(toIndentedString(identUnivocoVersamento)).append("\n");
    sb.append("    importoDebito: ").append(toIndentedString(importoDebito)).append("\n");
    sb.append("    importoSpeseNotifica: ").append(toIndentedString(importoSpeseNotifica)).append("\n");
    sb.append("    marcaDaBollo: ").append(toIndentedString(marcaDaBollo)).append("\n");
    sb.append("    numeroAvviso: ").append(toIndentedString(numeroAvviso)).append("\n");
    sb.append("    ordinamento: ").append(toIndentedString(ordinamento)).append("\n");
    sb.append("    parametriDebito: ").append(toIndentedString(parametriDebito)).append("\n");
    sb.append("    partnerTecnologico: ").append(toIndentedString(partnerTecnologico)).append("\n");
    sb.append("    speseNotificaDaAttualizzare: ").append(toIndentedString(speseNotificaDaAttualizzare)).append("\n");
    sb.append("    statoSincronizzazionePdp: ").append(toIndentedString(statoSincronizzazionePdp)).append("\n");
    sb.append("    versioneNumeroAvviso: ").append(toIndentedString(versioneNumeroAvviso)).append("\n");
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


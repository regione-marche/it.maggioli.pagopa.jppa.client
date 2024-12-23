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
import io.swagger.client.model.NumeroAvvisoDto;
import java.io.IOException;

/**
 * RichiestaCancellaDovutiDto
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-06-23T07:57:29.055Z")
public class RichiestaCancellaDovutiDto {
  @SerializedName("codiceIPA")
  private String codiceIPA = null;

  /**
   * Gets or Sets codiceMotivoEliminazione
   */
  @JsonAdapter(CodiceMotivoEliminazioneEnum.Adapter.class)
  public enum CodiceMotivoEliminazioneEnum {
    ALTRO("ALTRO"),
    
    ATTIVAZIONE("ATTIVAZIONE"),
    
    ATTIVAZIONE_RIAPERTURA_TERMINI("ATTIVAZIONE_RIAPERTURA_TERMINI"),
    
    DISATTIVAZIONE("DISATTIVAZIONE"),
    
    ELIMINAZIONE("ELIMINAZIONE"),
    
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

    CodiceMotivoEliminazioneEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CodiceMotivoEliminazioneEnum fromValue(String text) {
      for (CodiceMotivoEliminazioneEnum b : CodiceMotivoEliminazioneEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<CodiceMotivoEliminazioneEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CodiceMotivoEliminazioneEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CodiceMotivoEliminazioneEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return CodiceMotivoEliminazioneEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("codiceMotivoEliminazione")
  private CodiceMotivoEliminazioneEnum codiceMotivoEliminazione = null;

  @SerializedName("codiceServizio")
  private String codiceServizio = null;

  @SerializedName("descrizioneMotivoEliminazione")
  private String descrizioneMotivoEliminazione = null;

  @SerializedName("numeroAvviso")
  private NumeroAvvisoDto numeroAvviso = null;

  public RichiestaCancellaDovutiDto codiceIPA(String codiceIPA) {
    this.codiceIPA = codiceIPA;
    return this;
  }

   /**
   * Codice IPA identificativo dell’ente
   * @return codiceIPA
  **/
  @ApiModelProperty(example = "EntTest1", required = true, value = "Codice IPA identificativo dell’ente")
  public String getCodiceIPA() {
    return codiceIPA;
  }

  public void setCodiceIPA(String codiceIPA) {
    this.codiceIPA = codiceIPA;
  }

  public RichiestaCancellaDovutiDto codiceMotivoEliminazione(CodiceMotivoEliminazioneEnum codiceMotivoEliminazione) {
    this.codiceMotivoEliminazione = codiceMotivoEliminazione;
    return this;
  }

   /**
   * Get codiceMotivoEliminazione
   * @return codiceMotivoEliminazione
  **/
  @ApiModelProperty(example = "MODIFICA_IMPORTO", value = "")
  public CodiceMotivoEliminazioneEnum getCodiceMotivoEliminazione() {
    return codiceMotivoEliminazione;
  }

  public void setCodiceMotivoEliminazione(CodiceMotivoEliminazioneEnum codiceMotivoEliminazione) {
    this.codiceMotivoEliminazione = codiceMotivoEliminazione;
  }

  public RichiestaCancellaDovutiDto codiceServizio(String codiceServizio) {
    this.codiceServizio = codiceServizio;
    return this;
  }

   /**
   * Codice del servizio client del sistema JPPA. Il servizio deve essere censito fra quelli abilitati per il codice IPA specificato nella richiesta
   * @return codiceServizio
  **/
  @ApiModelProperty(example = "JTRIB", required = true, value = "Codice del servizio client del sistema JPPA. Il servizio deve essere censito fra quelli abilitati per il codice IPA specificato nella richiesta")
  public String getCodiceServizio() {
    return codiceServizio;
  }

  public void setCodiceServizio(String codiceServizio) {
    this.codiceServizio = codiceServizio;
  }

  public RichiestaCancellaDovutiDto descrizioneMotivoEliminazione(String descrizioneMotivoEliminazione) {
    this.descrizioneMotivoEliminazione = descrizioneMotivoEliminazione;
    return this;
  }

   /**
   * Descrizione motivo eliminazione
   * @return descrizioneMotivoEliminazione
  **/
  @ApiModelProperty(example = "Errato importo", value = "Descrizione motivo eliminazione")
  public String getDescrizioneMotivoEliminazione() {
    return descrizioneMotivoEliminazione;
  }

  public void setDescrizioneMotivoEliminazione(String descrizioneMotivoEliminazione) {
    this.descrizioneMotivoEliminazione = descrizioneMotivoEliminazione;
  }

  public RichiestaCancellaDovutiDto numeroAvviso(NumeroAvvisoDto numeroAvviso) {
    this.numeroAvviso = numeroAvviso;
    return this;
  }

   /**
   * Get numeroAvviso
   * @return numeroAvviso
  **/
  @ApiModelProperty(value = "")
  public NumeroAvvisoDto getNumeroAvviso() {
    return numeroAvviso;
  }

  public void setNumeroAvviso(NumeroAvvisoDto numeroAvviso) {
    this.numeroAvviso = numeroAvviso;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RichiestaCancellaDovutiDto richiestaCancellaDovutiDto = (RichiestaCancellaDovutiDto) o;
    return Objects.equals(this.codiceIPA, richiestaCancellaDovutiDto.codiceIPA) &&
        Objects.equals(this.codiceMotivoEliminazione, richiestaCancellaDovutiDto.codiceMotivoEliminazione) &&
        Objects.equals(this.codiceServizio, richiestaCancellaDovutiDto.codiceServizio) &&
        Objects.equals(this.descrizioneMotivoEliminazione, richiestaCancellaDovutiDto.descrizioneMotivoEliminazione) &&
        Objects.equals(this.numeroAvviso, richiestaCancellaDovutiDto.numeroAvviso);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codiceIPA, codiceMotivoEliminazione, codiceServizio, descrizioneMotivoEliminazione, numeroAvviso);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RichiestaCancellaDovutiDto {\n");
    
    sb.append("    codiceIPA: ").append(toIndentedString(codiceIPA)).append("\n");
    sb.append("    codiceMotivoEliminazione: ").append(toIndentedString(codiceMotivoEliminazione)).append("\n");
    sb.append("    codiceServizio: ").append(toIndentedString(codiceServizio)).append("\n");
    sb.append("    descrizioneMotivoEliminazione: ").append(toIndentedString(descrizioneMotivoEliminazione)).append("\n");
    sb.append("    numeroAvviso: ").append(toIndentedString(numeroAvviso)).append("\n");
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


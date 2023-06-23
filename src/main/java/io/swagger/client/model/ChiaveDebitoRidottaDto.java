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
import java.io.IOException;

/**
 * ChiaveDebitoRidottaDto
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-06-23T07:57:29.055Z")
public class ChiaveDebitoRidottaDto {
  @SerializedName("codEnteCreditore")
  private String codEnteCreditore = null;

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

  @SerializedName("iPos")
  private String iPos = null;

  public ChiaveDebitoRidottaDto codEnteCreditore(String codEnteCreditore) {
    this.codEnteCreditore = codEnteCreditore;
    return this;
  }

   /**
   * Get codEnteCreditore
   * @return codEnteCreditore
  **/
  @ApiModelProperty(value = "")
  public String getCodEnteCreditore() {
    return codEnteCreditore;
  }

  public void setCodEnteCreditore(String codEnteCreditore) {
    this.codEnteCreditore = codEnteCreditore;
  }

  public ChiaveDebitoRidottaDto codiceTipoDebito(CodiceTipoDebitoEnum codiceTipoDebito) {
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

  public ChiaveDebitoRidottaDto iPos(String iPos) {
    this.iPos = iPos;
    return this;
  }

   /**
   * Identificativo univoco della posizione debitoria generato dal servizio chiamante, max 256 caratteri
   * @return iPos
  **/
  @ApiModelProperty(example = "4567", required = true, value = "Identificativo univoco della posizione debitoria generato dal servizio chiamante, max 256 caratteri")
  public String getIPos() {
    return iPos;
  }

  public void setIPos(String iPos) {
    this.iPos = iPos;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChiaveDebitoRidottaDto chiaveDebitoRidottaDto = (ChiaveDebitoRidottaDto) o;
    return Objects.equals(this.codEnteCreditore, chiaveDebitoRidottaDto.codEnteCreditore) &&
        Objects.equals(this.codiceTipoDebito, chiaveDebitoRidottaDto.codiceTipoDebito) &&
        Objects.equals(this.iPos, chiaveDebitoRidottaDto.iPos);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codEnteCreditore, codiceTipoDebito, iPos);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChiaveDebitoRidottaDto {\n");
    
    sb.append("    codEnteCreditore: ").append(toIndentedString(codEnteCreditore)).append("\n");
    sb.append("    codiceTipoDebito: ").append(toIndentedString(codiceTipoDebito)).append("\n");
    sb.append("    iPos: ").append(toIndentedString(iPos)).append("\n");
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


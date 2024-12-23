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
 * EsitoDto
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-06-23T07:57:29.055Z")
public class EsitoDto {
  /**
   * Gets or Sets esito
   */
  @JsonAdapter(EsitoEnum.Adapter.class)
  public enum EsitoEnum {
    CON_SCARTI("CON_SCARTI"),
    
    ERROR("Error"),
    
    OK("OK"),
    
    OK_2("Ok");

    private String value;

    EsitoEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static EsitoEnum fromValue(String text) {
      for (EsitoEnum b : EsitoEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<EsitoEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final EsitoEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public EsitoEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return EsitoEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("esito")
  private EsitoEnum esito = null;

  @SerializedName("messaggio")
  private String messaggio = null;

  public EsitoDto esito(EsitoEnum esito) {
    this.esito = esito;
    return this;
  }

   /**
   * Get esito
   * @return esito
  **/
  @ApiModelProperty(example = "Error", value = "")
  public EsitoEnum getEsito() {
    return esito;
  }

  public void setEsito(EsitoEnum esito) {
    this.esito = esito;
  }

  public EsitoDto messaggio(String messaggio) {
    this.messaggio = messaggio;
    return this;
  }

   /**
   * Get messaggio
   * @return messaggio
  **/
  @ApiModelProperty(value = "")
  public String getMessaggio() {
    return messaggio;
  }

  public void setMessaggio(String messaggio) {
    this.messaggio = messaggio;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EsitoDto esitoDto = (EsitoDto) o;
    return Objects.equals(this.esito, esitoDto.esito) &&
        Objects.equals(this.messaggio, esitoDto.messaggio);
  }

  @Override
  public int hashCode() {
    return Objects.hash(esito, messaggio);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EsitoDto {\n");
    
    sb.append("    esito: ").append(toIndentedString(esito)).append("\n");
    sb.append("    messaggio: ").append(toIndentedString(messaggio)).append("\n");
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


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
 * ListaTerminaliPOSDto
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-06-23T07:57:29.055Z")
public class ListaTerminaliPOSDto {
  /**
   * Gets or Sets contestoPos
   */
  @JsonAdapter(ContestoPosEnum.Adapter.class)
  public enum ContestoPosEnum {
    CONCILIA("CONCILIA"),
    
    JCITYGOV("JCITYGOV"),
    
    JDEMOS("JDEMOS"),
    
    JTRIB("JTRIB");

    private String value;

    ContestoPosEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ContestoPosEnum fromValue(String text) {
      for (ContestoPosEnum b : ContestoPosEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ContestoPosEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ContestoPosEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ContestoPosEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ContestoPosEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("contestoPos")
  private ContestoPosEnum contestoPos = null;

  @SerializedName("descrizionePos")
  private String descrizionePos = null;

  @SerializedName("idPos")
  private String idPos = null;

  public ListaTerminaliPOSDto contestoPos(ContestoPosEnum contestoPos) {
    this.contestoPos = contestoPos;
    return this;
  }

   /**
   * Get contestoPos
   * @return contestoPos
  **/
  @ApiModelProperty(example = "JCITYGOV", value = "")
  public ContestoPosEnum getContestoPos() {
    return contestoPos;
  }

  public void setContestoPos(ContestoPosEnum contestoPos) {
    this.contestoPos = contestoPos;
  }

  public ListaTerminaliPOSDto descrizionePos(String descrizionePos) {
    this.descrizionePos = descrizionePos;
    return this;
  }

   /**
   * Get descrizionePos
   * @return descrizionePos
  **/
  @ApiModelProperty(example = "POS MAGGIOLI (postazione di TEST)", value = "")
  public String getDescrizionePos() {
    return descrizionePos;
  }

  public void setDescrizionePos(String descrizionePos) {
    this.descrizionePos = descrizionePos;
  }

  public ListaTerminaliPOSDto idPos(String idPos) {
    this.idPos = idPos;
    return this;
  }

   /**
   * Identificativo univoco della posizione debitoria generato dal servizio chiamante, max 256 caratteri
   * @return idPos
  **/
  @ApiModelProperty(example = "4567", required = true, value = "Identificativo univoco della posizione debitoria generato dal servizio chiamante, max 256 caratteri")
  public String getIdPos() {
    return idPos;
  }

  public void setIdPos(String idPos) {
    this.idPos = idPos;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListaTerminaliPOSDto listaTerminaliPOSDto = (ListaTerminaliPOSDto) o;
    return Objects.equals(this.contestoPos, listaTerminaliPOSDto.contestoPos) &&
        Objects.equals(this.descrizionePos, listaTerminaliPOSDto.descrizionePos) &&
        Objects.equals(this.idPos, listaTerminaliPOSDto.idPos);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contestoPos, descrizionePos, idPos);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListaTerminaliPOSDto {\n");
    
    sb.append("    contestoPos: ").append(toIndentedString(contestoPos)).append("\n");
    sb.append("    descrizionePos: ").append(toIndentedString(descrizionePos)).append("\n");
    sb.append("    idPos: ").append(toIndentedString(idPos)).append("\n");
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


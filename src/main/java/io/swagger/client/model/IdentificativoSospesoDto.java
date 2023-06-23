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
 * Identificativo del sospeso come da giornale di cassa estratto da tesoreria ed importato sul sistema di riconciliazione di PayServicePagoPA
 */
@ApiModel(description = "Identificativo del sospeso come da giornale di cassa estratto da tesoreria ed importato sul sistema di riconciliazione di PayServicePagoPA")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-06-23T07:57:29.055Z")
public class IdentificativoSospesoDto {
  @SerializedName("annoSospeso")
  private String annoSospeso = null;

  @SerializedName("numeroSospeso")
  private String numeroSospeso = null;

  public IdentificativoSospesoDto annoSospeso(String annoSospeso) {
    this.annoSospeso = annoSospeso;
    return this;
  }

   /**
   * Get annoSospeso
   * @return annoSospeso
  **/
  @ApiModelProperty(example = "2018", value = "")
  public String getAnnoSospeso() {
    return annoSospeso;
  }

  public void setAnnoSospeso(String annoSospeso) {
    this.annoSospeso = annoSospeso;
  }

  public IdentificativoSospesoDto numeroSospeso(String numeroSospeso) {
    this.numeroSospeso = numeroSospeso;
    return this;
  }

   /**
   * Get numeroSospeso
   * @return numeroSospeso
  **/
  @ApiModelProperty(example = "4736", value = "")
  public String getNumeroSospeso() {
    return numeroSospeso;
  }

  public void setNumeroSospeso(String numeroSospeso) {
    this.numeroSospeso = numeroSospeso;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IdentificativoSospesoDto identificativoSospesoDto = (IdentificativoSospesoDto) o;
    return Objects.equals(this.annoSospeso, identificativoSospesoDto.annoSospeso) &&
        Objects.equals(this.numeroSospeso, identificativoSospesoDto.numeroSospeso);
  }

  @Override
  public int hashCode() {
    return Objects.hash(annoSospeso, numeroSospeso);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdentificativoSospesoDto {\n");
    
    sb.append("    annoSospeso: ").append(toIndentedString(annoSospeso)).append("\n");
    sb.append("    numeroSospeso: ").append(toIndentedString(numeroSospeso)).append("\n");
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

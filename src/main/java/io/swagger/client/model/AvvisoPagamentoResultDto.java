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
import io.swagger.client.model.ChiaveDebitoDto;
import io.swagger.client.model.EsitoDto;
import io.swagger.client.model.NumeroAvvisoDto;
import java.io.IOException;

/**
 * AvvisoPagamentoResultDto
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-06-23T07:57:29.055Z")
public class AvvisoPagamentoResultDto {
  @SerializedName("chiaveDebitoDto")
  private ChiaveDebitoDto chiaveDebitoDto = null;

  @SerializedName("esito")
  private EsitoDto esito = null;

  @SerializedName("numeroAvvisoDto")
  private NumeroAvvisoDto numeroAvvisoDto = null;

  public AvvisoPagamentoResultDto chiaveDebitoDto(ChiaveDebitoDto chiaveDebitoDto) {
    this.chiaveDebitoDto = chiaveDebitoDto;
    return this;
  }

   /**
   * Get chiaveDebitoDto
   * @return chiaveDebitoDto
  **/
  @ApiModelProperty(value = "")
  public ChiaveDebitoDto getChiaveDebitoDto() {
    return chiaveDebitoDto;
  }

  public void setChiaveDebitoDto(ChiaveDebitoDto chiaveDebitoDto) {
    this.chiaveDebitoDto = chiaveDebitoDto;
  }

  public AvvisoPagamentoResultDto esito(EsitoDto esito) {
    this.esito = esito;
    return this;
  }

   /**
   * Get esito
   * @return esito
  **/
  @ApiModelProperty(value = "")
  public EsitoDto getEsito() {
    return esito;
  }

  public void setEsito(EsitoDto esito) {
    this.esito = esito;
  }

  public AvvisoPagamentoResultDto numeroAvvisoDto(NumeroAvvisoDto numeroAvvisoDto) {
    this.numeroAvvisoDto = numeroAvvisoDto;
    return this;
  }

   /**
   * Get numeroAvvisoDto
   * @return numeroAvvisoDto
  **/
  @ApiModelProperty(value = "")
  public NumeroAvvisoDto getNumeroAvvisoDto() {
    return numeroAvvisoDto;
  }

  public void setNumeroAvvisoDto(NumeroAvvisoDto numeroAvvisoDto) {
    this.numeroAvvisoDto = numeroAvvisoDto;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AvvisoPagamentoResultDto avvisoPagamentoResultDto = (AvvisoPagamentoResultDto) o;
    return Objects.equals(this.chiaveDebitoDto, avvisoPagamentoResultDto.chiaveDebitoDto) &&
        Objects.equals(this.esito, avvisoPagamentoResultDto.esito) &&
        Objects.equals(this.numeroAvvisoDto, avvisoPagamentoResultDto.numeroAvvisoDto);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chiaveDebitoDto, esito, numeroAvvisoDto);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AvvisoPagamentoResultDto {\n");
    
    sb.append("    chiaveDebitoDto: ").append(toIndentedString(chiaveDebitoDto)).append("\n");
    sb.append("    esito: ").append(toIndentedString(esito)).append("\n");
    sb.append("    numeroAvvisoDto: ").append(toIndentedString(numeroAvvisoDto)).append("\n");
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

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

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModelProperty;

/**
 * TestataDovutoDto
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-06-23T07:57:29.055Z")
public class TestataDovutoDto {
  @SerializedName("datiContribuente")
  private ContribuenteDto datiContribuente = null;

  @SerializedName("dettaglioPosizione")
  private String dettaglioPosizione = null;

  @SerializedName("idPos")
  private String idPos = null;

  public TestataDovutoDto datiContribuente(ContribuenteDto datiContribuente) {
    this.datiContribuente = datiContribuente;
    return this;
  }
  
	public TestataDovutoDto() {
		super();
	}

	public TestataDovutoDto(ContribuenteDto datiContribuente, String dettaglioPosizione, String idPos) {
		super();
		this.datiContribuente = datiContribuente;
		this.dettaglioPosizione = dettaglioPosizione;
		this.idPos = idPos;
	}

/**
   * Get datiContribuente
   * @return datiContribuente
  **/
  @ApiModelProperty(value = "")
  public ContribuenteDto getDatiContribuente() {
    return datiContribuente;
  }

  public void setDatiContribuente(ContribuenteDto datiContribuente) {
    this.datiContribuente = datiContribuente;
  }

  public TestataDovutoDto dettaglioPosizione(String dettaglioPosizione) {
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

  public TestataDovutoDto idPos(String idPos) {
    this.idPos = idPos;
    return this;
  }

   /**
   * Identificativo della posizione debitoria. Questo identificativo permette ai vari servizi di poter inserire lo stesso debito in modalità differenti e mantenere un comportamento congruo da parte di jcg_pagopa, max 256 caratteri
   * @return idPos
  **/
  @ApiModelProperty(example = "20230416_012", required = true, value = "Identificativo della posizione debitoria. Questo identificativo permette ai vari servizi di poter inserire lo stesso debito in modalità differenti e mantenere un comportamento congruo da parte di jcg_pagopa, max 256 caratteri")
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
    TestataDovutoDto testataDovutoDto = (TestataDovutoDto) o;
    return Objects.equals(this.datiContribuente, testataDovutoDto.datiContribuente) &&
        Objects.equals(this.dettaglioPosizione, testataDovutoDto.dettaglioPosizione) &&
        Objects.equals(this.idPos, testataDovutoDto.idPos);
  }

  @Override
  public int hashCode() {
    return Objects.hash(datiContribuente, dettaglioPosizione, idPos);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TestataDovutoDto {\n");
    
    sb.append("    datiContribuente: ").append(toIndentedString(datiContribuente)).append("\n");
    sb.append("    dettaglioPosizione: ").append(toIndentedString(dettaglioPosizione)).append("\n");
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


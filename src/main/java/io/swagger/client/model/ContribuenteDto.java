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
 * Anagrafica del soggetto contribuente
 */
@ApiModel(description = "Anagrafica del soggetto contribuente")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-06-23T07:57:29.055Z")
public class ContribuenteDto {
  @SerializedName("cap")
  private String cap = null;

  @SerializedName("civico")
  private String civico = null;

  @SerializedName("codiceIdentificativoUnivoco")
  private String codiceIdentificativoUnivoco = null;

  @SerializedName("cognome")
  private String cognome = null;

  @SerializedName("email")
  private String email = null;

  @SerializedName("indirizzo")
  private String indirizzo = null;

  @SerializedName("localita")
  private String localita = null;

  @SerializedName("nazione")
  private String nazione = null;

  @SerializedName("nome")
  private String nome = null;

  @SerializedName("provincia")
  private String provincia = null;

  @SerializedName("ragioneSociale")
  private String ragioneSociale = null;

  /**
   * Gets or Sets tipoIdentificativoUnivoco
   */
  @JsonAdapter(TipoIdentificativoUnivocoEnum.Adapter.class)
  public enum TipoIdentificativoUnivocoEnum {
    FIS("IDENT_PERSONA_FIS"),
    
    GIURID("IDENT_PERSONA_GIURID");

    private String value;

    TipoIdentificativoUnivocoEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TipoIdentificativoUnivocoEnum fromValue(String text) {
      for (TipoIdentificativoUnivocoEnum b : TipoIdentificativoUnivocoEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TipoIdentificativoUnivocoEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TipoIdentificativoUnivocoEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TipoIdentificativoUnivocoEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TipoIdentificativoUnivocoEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("tipoIdentificativoUnivoco")
  private TipoIdentificativoUnivocoEnum tipoIdentificativoUnivoco = null;

  public ContribuenteDto cap(String cap) {
    this.cap = cap;
    return this;
  }

   /**
   * Get cap
   * @return cap
  **/
  @ApiModelProperty(example = "25020", value = "")
  public String getCap() {
    return cap;
  }

  public void setCap(String cap) {
    this.cap = cap;
  }

  public ContribuenteDto civico(String civico) {
    this.civico = civico;
    return this;
  }

   /**
   * Get civico
   * @return civico
  **/
  @ApiModelProperty(example = "41", value = "")
  public String getCivico() {
    return civico;
  }

  public void setCivico(String civico) {
    this.civico = civico;
  }

  public ContribuenteDto codiceIdentificativoUnivoco(String codiceIdentificativoUnivoco) {
    this.codiceIdentificativoUnivoco = codiceIdentificativoUnivoco;
    return this;
  }

   /**
   * Get codiceIdentificativoUnivoco
   * @return codiceIdentificativoUnivoco
  **/
  @ApiModelProperty(example = "MRCRSS97A27F471S", value = "")
  public String getCodiceIdentificativoUnivoco() {
    return codiceIdentificativoUnivoco;
  }

  public void setCodiceIdentificativoUnivoco(String codiceIdentificativoUnivoco) {
    this.codiceIdentificativoUnivoco = codiceIdentificativoUnivoco;
  }

  public ContribuenteDto cognome(String cognome) {
    this.cognome = cognome;
    return this;
  }

   /**
   * Get cognome
   * @return cognome
  **/
  @ApiModelProperty(example = "Rossi", value = "")
  public String getCognome() {
    return cognome;
  }

  public void setCognome(String cognome) {
    this.cognome = cognome;
  }

  public ContribuenteDto email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @ApiModelProperty(example = "marcorossi@gmail.com", value = "")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public ContribuenteDto indirizzo(String indirizzo) {
    this.indirizzo = indirizzo;
    return this;
  }

   /**
   * Get indirizzo
   * @return indirizzo
  **/
  @ApiModelProperty(example = "Via Domossola", value = "")
  public String getIndirizzo() {
    return indirizzo;
  }

  public void setIndirizzo(String indirizzo) {
    this.indirizzo = indirizzo;
  }

  public ContribuenteDto localita(String localita) {
    this.localita = localita;
    return this;
  }

   /**
   * Get localita
   * @return localita
  **/
  @ApiModelProperty(example = "Azzano Mella", value = "")
  public String getLocalita() {
    return localita;
  }

  public void setLocalita(String localita) {
    this.localita = localita;
  }

  public ContribuenteDto nazione(String nazione) {
    this.nazione = nazione;
    return this;
  }

   /**
   * Get nazione
   * @return nazione
  **/
  @ApiModelProperty(example = "IT", value = "")
  public String getNazione() {
    return nazione;
  }

  public void setNazione(String nazione) {
    this.nazione = nazione;
  }

  public ContribuenteDto nome(String nome) {
    this.nome = nome;
    return this;
  }

   /**
   * Get nome
   * @return nome
  **/
  @ApiModelProperty(example = "Marco", value = "")
  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public ContribuenteDto provincia(String provincia) {
    this.provincia = provincia;
    return this;
  }

   /**
   * Get provincia
   * @return provincia
  **/
  @ApiModelProperty(example = "BS", value = "")
  public String getProvincia() {
    return provincia;
  }

  public void setProvincia(String provincia) {
    this.provincia = provincia;
  }

  public ContribuenteDto ragioneSociale(String ragioneSociale) {
    this.ragioneSociale = ragioneSociale;
    return this;
  }

   /**
   * Get ragioneSociale
   * @return ragioneSociale
  **/
  @ApiModelProperty(example = "S.a.s.", value = "")
  public String getRagioneSociale() {
    return ragioneSociale;
  }

  public void setRagioneSociale(String ragioneSociale) {
    this.ragioneSociale = ragioneSociale;
  }

  public ContribuenteDto tipoIdentificativoUnivoco(TipoIdentificativoUnivocoEnum tipoIdentificativoUnivoco) {
    this.tipoIdentificativoUnivoco = tipoIdentificativoUnivoco;
    return this;
  }

   /**
   * Get tipoIdentificativoUnivoco
   * @return tipoIdentificativoUnivoco
  **/
  @ApiModelProperty(example = "F", value = "")
  public TipoIdentificativoUnivocoEnum getTipoIdentificativoUnivoco() {
    return tipoIdentificativoUnivoco;
  }

  public void setTipoIdentificativoUnivoco(TipoIdentificativoUnivocoEnum tipoIdentificativoUnivoco) {
    this.tipoIdentificativoUnivoco = tipoIdentificativoUnivoco;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContribuenteDto contribuenteDto = (ContribuenteDto) o;
    return Objects.equals(this.cap, contribuenteDto.cap) &&
        Objects.equals(this.civico, contribuenteDto.civico) &&
        Objects.equals(this.codiceIdentificativoUnivoco, contribuenteDto.codiceIdentificativoUnivoco) &&
        Objects.equals(this.cognome, contribuenteDto.cognome) &&
        Objects.equals(this.email, contribuenteDto.email) &&
        Objects.equals(this.indirizzo, contribuenteDto.indirizzo) &&
        Objects.equals(this.localita, contribuenteDto.localita) &&
        Objects.equals(this.nazione, contribuenteDto.nazione) &&
        Objects.equals(this.nome, contribuenteDto.nome) &&
        Objects.equals(this.provincia, contribuenteDto.provincia) &&
        Objects.equals(this.ragioneSociale, contribuenteDto.ragioneSociale) &&
        Objects.equals(this.tipoIdentificativoUnivoco, contribuenteDto.tipoIdentificativoUnivoco);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cap, civico, codiceIdentificativoUnivoco, cognome, email, indirizzo, localita, nazione, nome, provincia, ragioneSociale, tipoIdentificativoUnivoco);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContribuenteDto {\n");
    
    sb.append("    cap: ").append(toIndentedString(cap)).append("\n");
    sb.append("    civico: ").append(toIndentedString(civico)).append("\n");
    sb.append("    codiceIdentificativoUnivoco: ").append(toIndentedString(codiceIdentificativoUnivoco)).append("\n");
    sb.append("    cognome: ").append(toIndentedString(cognome)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    indirizzo: ").append(toIndentedString(indirizzo)).append("\n");
    sb.append("    localita: ").append(toIndentedString(localita)).append("\n");
    sb.append("    nazione: ").append(toIndentedString(nazione)).append("\n");
    sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
    sb.append("    provincia: ").append(toIndentedString(provincia)).append("\n");
    sb.append("    ragioneSociale: ").append(toIndentedString(ragioneSociale)).append("\n");
    sb.append("    tipoIdentificativoUnivoco: ").append(toIndentedString(tipoIdentificativoUnivoco)).append("\n");
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


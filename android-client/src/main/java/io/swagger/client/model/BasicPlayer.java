package io.swagger.client.model;

import io.swagger.client.model.PlayerVideo;
import java.util.*;
import java.util.Date;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * 队员
 **/
@ApiModel(description = "队员")
public class BasicPlayer  {
  
  @SerializedName("birthday")
  private Date birthday = null;
  @SerializedName("englishName")
  private String englishName = null;
  @SerializedName("country")
  private String country = null;
  @SerializedName("introuceUrl")
  private String introuceUrl = null;
  @SerializedName("recordUrl")
  private String recordUrl = null;
  @SerializedName("weight")
  private String weight = null;
  @SerializedName("avatar")
  private String avatar = null;
  @SerializedName("playerVideos")
  private List<PlayerVideo> playerVideos = null;
  @SerializedName("birthplace")
  private String birthplace = null;
  @SerializedName("name")
  private String name = null;
  @SerializedName("matchUrl")
  private String matchUrl = null;
  @SerializedName("id")
  private String id = null;
  @SerializedName("height")
  private String height = null;

  /**
   * 出生地  中国北京
   **/
  @ApiModelProperty(value = "出生地  中国北京")
  public Date getBirthday() {
    return birthday;
  }
  public void setBirthday(Date birthday) {
    this.birthday = birthday;
  }

  /**
   * 
   **/
  @ApiModelProperty(value = "")
  public String getEnglishName() {
    return englishName;
  }
  public void setEnglishName(String englishName) {
    this.englishName = englishName;
  }

  /**
   * 国家： 中国
   **/
  @ApiModelProperty(value = "国家： 中国")
  public String getCountry() {
    return country;
  }
  public void setCountry(String country) {
    this.country = country;
  }

  /**
   * 国家： 中国
   **/
  @ApiModelProperty(value = "国家： 中国")
  public String getIntrouceUrl() {
    return introuceUrl;
  }
  public void setIntrouceUrl(String introuceUrl) {
    this.introuceUrl = introuceUrl;
  }

  /**
   * 国家： 中国
   **/
  @ApiModelProperty(value = "国家： 中国")
  public String getRecordUrl() {
    return recordUrl;
  }
  public void setRecordUrl(String recordUrl) {
    this.recordUrl = recordUrl;
  }

  /**
   * 体重
   **/
  @ApiModelProperty(value = "体重")
  public String getWeight() {
    return weight;
  }
  public void setWeight(String weight) {
    this.weight = weight;
  }

  /**
   * 头像地址
   **/
  @ApiModelProperty(value = "头像地址")
  public String getAvatar() {
    return avatar;
  }
  public void setAvatar(String avatar) {
    this.avatar = avatar;
  }

  /**
   * 球员视频
   **/
  @ApiModelProperty(value = "球员视频")
  public List<PlayerVideo> getPlayerVideos() {
    return playerVideos;
  }
  public void setPlayerVideos(List<PlayerVideo> playerVideos) {
    this.playerVideos = playerVideos;
  }

  /**
   * 出生地  中国北京
   **/
  @ApiModelProperty(value = "出生地  中国北京")
  public String getBirthplace() {
    return birthplace;
  }
  public void setBirthplace(String birthplace) {
    this.birthplace = birthplace;
  }

  /**
   * 名字：李铁
   **/
  @ApiModelProperty(value = "名字：李铁")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * 国家： 中国
   **/
  @ApiModelProperty(value = "国家： 中国")
  public String getMatchUrl() {
    return matchUrl;
  }
  public void setMatchUrl(String matchUrl) {
    this.matchUrl = matchUrl;
  }

  /**
   * id
   **/
  @ApiModelProperty(value = "id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * 身高
   **/
  @ApiModelProperty(value = "身高")
  public String getHeight() {
    return height;
  }
  public void setHeight(String height) {
    this.height = height;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BasicPlayer basicPlayer = (BasicPlayer) o;
    return (birthday == null ? basicPlayer.birthday == null : birthday.equals(basicPlayer.birthday)) &&
        (englishName == null ? basicPlayer.englishName == null : englishName.equals(basicPlayer.englishName)) &&
        (country == null ? basicPlayer.country == null : country.equals(basicPlayer.country)) &&
        (introuceUrl == null ? basicPlayer.introuceUrl == null : introuceUrl.equals(basicPlayer.introuceUrl)) &&
        (recordUrl == null ? basicPlayer.recordUrl == null : recordUrl.equals(basicPlayer.recordUrl)) &&
        (weight == null ? basicPlayer.weight == null : weight.equals(basicPlayer.weight)) &&
        (avatar == null ? basicPlayer.avatar == null : avatar.equals(basicPlayer.avatar)) &&
        (playerVideos == null ? basicPlayer.playerVideos == null : playerVideos.equals(basicPlayer.playerVideos)) &&
        (birthplace == null ? basicPlayer.birthplace == null : birthplace.equals(basicPlayer.birthplace)) &&
        (name == null ? basicPlayer.name == null : name.equals(basicPlayer.name)) &&
        (matchUrl == null ? basicPlayer.matchUrl == null : matchUrl.equals(basicPlayer.matchUrl)) &&
        (id == null ? basicPlayer.id == null : id.equals(basicPlayer.id)) &&
        (height == null ? basicPlayer.height == null : height.equals(basicPlayer.height));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (birthday == null ? 0: birthday.hashCode());
    result = 31 * result + (englishName == null ? 0: englishName.hashCode());
    result = 31 * result + (country == null ? 0: country.hashCode());
    result = 31 * result + (introuceUrl == null ? 0: introuceUrl.hashCode());
    result = 31 * result + (recordUrl == null ? 0: recordUrl.hashCode());
    result = 31 * result + (weight == null ? 0: weight.hashCode());
    result = 31 * result + (avatar == null ? 0: avatar.hashCode());
    result = 31 * result + (playerVideos == null ? 0: playerVideos.hashCode());
    result = 31 * result + (birthplace == null ? 0: birthplace.hashCode());
    result = 31 * result + (name == null ? 0: name.hashCode());
    result = 31 * result + (matchUrl == null ? 0: matchUrl.hashCode());
    result = 31 * result + (id == null ? 0: id.hashCode());
    result = 31 * result + (height == null ? 0: height.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class BasicPlayer {\n");
    
    sb.append("  birthday: ").append(birthday).append("\n");
    sb.append("  englishName: ").append(englishName).append("\n");
    sb.append("  country: ").append(country).append("\n");
    sb.append("  introuceUrl: ").append(introuceUrl).append("\n");
    sb.append("  recordUrl: ").append(recordUrl).append("\n");
    sb.append("  weight: ").append(weight).append("\n");
    sb.append("  avatar: ").append(avatar).append("\n");
    sb.append("  playerVideos: ").append(playerVideos).append("\n");
    sb.append("  birthplace: ").append(birthplace).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  matchUrl: ").append(matchUrl).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  height: ").append(height).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

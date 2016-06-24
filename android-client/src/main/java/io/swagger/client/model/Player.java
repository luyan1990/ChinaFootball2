package io.swagger.client.model;

import io.swagger.client.model.PlayerNationalMatch;
import io.swagger.client.model.PlayerNationalRecord;
import io.swagger.client.model.PlayerVideo;
import io.swagger.client.model.TeamInfo;
import java.util.*;
import java.util.Date;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * 队员
 **/
@ApiModel(description = "队员")
public class Player  {
  
  @SerializedName("birthday")
  private Date birthday = null;
  @SerializedName("englishName")
  private String englishName = null;
  @SerializedName("country")
  private String country = null;
  @SerializedName("career")
  private List<TeamInfo> career = null;
  @SerializedName("weight")
  private String weight = null;
  @SerializedName("avatar")
  private String avatar = null;
  @SerializedName("matches")
  private List<PlayerNationalMatch> matches = null;
  @SerializedName("playerVideos")
  private List<PlayerVideo> playerVideos = null;
  @SerializedName("selectedNum")
  private String selectedNum = null;
  @SerializedName("birthplace")
  private String birthplace = null;
  @SerializedName("record")
  private PlayerNationalRecord record = null;
  @SerializedName("nationTeam")
  private TeamInfo nationTeam = null;
  @SerializedName("name")
  private String name = null;
  @SerializedName("club")
  private TeamInfo club = null;
  @SerializedName("id")
  private Long id = null;
  @SerializedName("position")
  private String position = null;
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
   * 名字：李铁
   **/
  @ApiModelProperty(value = "名字：李铁")
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
   * 职业生涯
   **/
  @ApiModelProperty(value = "职业生涯")
  public List<TeamInfo> getCareer() {
    return career;
  }
  public void setCareer(List<TeamInfo> career) {
    this.career = career;
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
   * 参加过的国家队比赛
   **/
  @ApiModelProperty(value = "参加过的国家队比赛")
  public List<PlayerNationalMatch> getMatches() {
    return matches;
  }
  public void setMatches(List<PlayerNationalMatch> matches) {
    this.matches = matches;
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
   * 国家队入选次数
   **/
  @ApiModelProperty(value = "国家队入选次数")
  public String getSelectedNum() {
    return selectedNum;
  }
  public void setSelectedNum(String selectedNum) {
    this.selectedNum = selectedNum;
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
   **/
  @ApiModelProperty(value = "")
  public PlayerNationalRecord getRecord() {
    return record;
  }
  public void setRecord(PlayerNationalRecord record) {
    this.record = record;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public TeamInfo getNationTeam() {
    return nationTeam;
  }
  public void setNationTeam(TeamInfo nationTeam) {
    this.nationTeam = nationTeam;
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
   **/
  @ApiModelProperty(value = "")
  public TeamInfo getClub() {
    return club;
  }
  public void setClub(TeamInfo club) {
    this.club = club;
  }

  /**
   * id
   **/
  @ApiModelProperty(value = "id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  /**
   * 位置：前锋
   **/
  @ApiModelProperty(value = "位置：前锋")
  public String getPosition() {
    return position;
  }
  public void setPosition(String position) {
    this.position = position;
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
    Player player = (Player) o;
    return (birthday == null ? player.birthday == null : birthday.equals(player.birthday)) &&
        (englishName == null ? player.englishName == null : englishName.equals(player.englishName)) &&
        (country == null ? player.country == null : country.equals(player.country)) &&
        (career == null ? player.career == null : career.equals(player.career)) &&
        (weight == null ? player.weight == null : weight.equals(player.weight)) &&
        (avatar == null ? player.avatar == null : avatar.equals(player.avatar)) &&
        (matches == null ? player.matches == null : matches.equals(player.matches)) &&
        (playerVideos == null ? player.playerVideos == null : playerVideos.equals(player.playerVideos)) &&
        (selectedNum == null ? player.selectedNum == null : selectedNum.equals(player.selectedNum)) &&
        (birthplace == null ? player.birthplace == null : birthplace.equals(player.birthplace)) &&
        (record == null ? player.record == null : record.equals(player.record)) &&
        (nationTeam == null ? player.nationTeam == null : nationTeam.equals(player.nationTeam)) &&
        (name == null ? player.name == null : name.equals(player.name)) &&
        (club == null ? player.club == null : club.equals(player.club)) &&
        (id == null ? player.id == null : id.equals(player.id)) &&
        (position == null ? player.position == null : position.equals(player.position)) &&
        (height == null ? player.height == null : height.equals(player.height));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (birthday == null ? 0: birthday.hashCode());
    result = 31 * result + (englishName == null ? 0: englishName.hashCode());
    result = 31 * result + (country == null ? 0: country.hashCode());
    result = 31 * result + (career == null ? 0: career.hashCode());
    result = 31 * result + (weight == null ? 0: weight.hashCode());
    result = 31 * result + (avatar == null ? 0: avatar.hashCode());
    result = 31 * result + (matches == null ? 0: matches.hashCode());
    result = 31 * result + (playerVideos == null ? 0: playerVideos.hashCode());
    result = 31 * result + (selectedNum == null ? 0: selectedNum.hashCode());
    result = 31 * result + (birthplace == null ? 0: birthplace.hashCode());
    result = 31 * result + (record == null ? 0: record.hashCode());
    result = 31 * result + (nationTeam == null ? 0: nationTeam.hashCode());
    result = 31 * result + (name == null ? 0: name.hashCode());
    result = 31 * result + (club == null ? 0: club.hashCode());
    result = 31 * result + (id == null ? 0: id.hashCode());
    result = 31 * result + (position == null ? 0: position.hashCode());
    result = 31 * result + (height == null ? 0: height.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Player {\n");
    
    sb.append("  birthday: ").append(birthday).append("\n");
    sb.append("  englishName: ").append(englishName).append("\n");
    sb.append("  country: ").append(country).append("\n");
    sb.append("  career: ").append(career).append("\n");
    sb.append("  weight: ").append(weight).append("\n");
    sb.append("  avatar: ").append(avatar).append("\n");
    sb.append("  matches: ").append(matches).append("\n");
    sb.append("  playerVideos: ").append(playerVideos).append("\n");
    sb.append("  selectedNum: ").append(selectedNum).append("\n");
    sb.append("  birthplace: ").append(birthplace).append("\n");
    sb.append("  record: ").append(record).append("\n");
    sb.append("  nationTeam: ").append(nationTeam).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  club: ").append(club).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  position: ").append(position).append("\n");
    sb.append("  height: ").append(height).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

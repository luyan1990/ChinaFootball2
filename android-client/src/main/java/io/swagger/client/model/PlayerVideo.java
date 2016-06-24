package io.swagger.client.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * 球员视频
 **/
@ApiModel(description = "球员视频")
public class PlayerVideo  {
  
  @SerializedName("playerName")
  private String playerName = null;
  @SerializedName("id")
  private Long id = null;
  @SerializedName("title")
  private String title = null;
  @SerializedName("url")
  private String url = null;
  @SerializedName("playerId")
  private Long playerId = null;

  /**
   * 名字：李铁
   **/
  @ApiModelProperty(value = "名字：李铁")
  public String getPlayerName() {
    return playerName;
  }
  public void setPlayerName(String playerName) {
    this.playerName = playerName;
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
   * 视频标题
   **/
  @ApiModelProperty(value = "视频标题")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }

  /**
   * 视频地址
   **/
  @ApiModelProperty(value = "视频地址")
  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }

  /**
   * 球员id
   **/
  @ApiModelProperty(value = "球员id")
  public Long getPlayerId() {
    return playerId;
  }
  public void setPlayerId(Long playerId) {
    this.playerId = playerId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlayerVideo playerVideo = (PlayerVideo) o;
    return (playerName == null ? playerVideo.playerName == null : playerName.equals(playerVideo.playerName)) &&
        (id == null ? playerVideo.id == null : id.equals(playerVideo.id)) &&
        (title == null ? playerVideo.title == null : title.equals(playerVideo.title)) &&
        (url == null ? playerVideo.url == null : url.equals(playerVideo.url)) &&
        (playerId == null ? playerVideo.playerId == null : playerId.equals(playerVideo.playerId));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (playerName == null ? 0: playerName.hashCode());
    result = 31 * result + (id == null ? 0: id.hashCode());
    result = 31 * result + (title == null ? 0: title.hashCode());
    result = 31 * result + (url == null ? 0: url.hashCode());
    result = 31 * result + (playerId == null ? 0: playerId.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlayerVideo {\n");
    
    sb.append("  playerName: ").append(playerName).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  title: ").append(title).append("\n");
    sb.append("  url: ").append(url).append("\n");
    sb.append("  playerId: ").append(playerId).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

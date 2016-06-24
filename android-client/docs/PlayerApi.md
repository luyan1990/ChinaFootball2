# PlayerApi

All URIs are relative to *http://api.c-f.com:8000/football*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addPlayer**](PlayerApi.md#addPlayer) | **POST** /games/players | 新增球员
[**getBasicPlayer**](PlayerApi.md#getBasicPlayer) | **GET** /games/players/{playerId}/basic | 获得球员基础信息
[**getNationalPlayer**](PlayerApi.md#getNationalPlayer) | **GET** /games/players/national | 查看国家队下的所有球员
[**getPlayer**](PlayerApi.md#getPlayer) | **GET** /games/players/{playerId} | 获得球员信息
[**getPlayerByTeamCategory**](PlayerApi.md#getPlayerByTeamCategory) | **GET** /games/players/teamcategory/{teamCategoryId} | 查看球队分类下的所有球员
[**getPlayerIntroduce**](PlayerApi.md#getPlayerIntroduce) | **GET** /games/players/{playerId}/introduce | 获得球员个人介绍
[**getPlayerNationMatches**](PlayerApi.md#getPlayerNationMatches) | **GET** /games/players/{playerId}/nationMatches | 获得球员比赛信息
[**getPlayerNationRecords**](PlayerApi.md#getPlayerNationRecords) | **GET** /games/players/{playerId}/nationRecords | 获得球员比赛统计信息


<a name="addPlayer"></a>
# **addPlayer**
> Player addPlayer(key, player)

新增球员

球员的新增

### Example
```java
// Import classes:
//import io.swagger.client.api.PlayerApi;

PlayerApi apiInstance = new PlayerApi();
String key = "visitor"; // String | key
Player player = new Player(); // Player | 球员
try {
    Player result = apiInstance.addPlayer(key, player);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlayerApi#addPlayer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **key** | **String**| key | [default to visitor]
 **player** | [**Player**](Player.md)| 球员 |

### Return type

[**Player**](Player.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getBasicPlayer"></a>
# **getBasicPlayer**
> BasicPlayer getBasicPlayer(key, playerId)

获得球员基础信息

查看球员基础信息

### Example
```java
// Import classes:
//import io.swagger.client.api.PlayerApi;

PlayerApi apiInstance = new PlayerApi();
String key = "visitor"; // String | key
Long playerId = 789L; // Long | 球员Id
try {
    BasicPlayer result = apiInstance.getBasicPlayer(key, playerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlayerApi#getBasicPlayer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **key** | **String**| key | [default to visitor]
 **playerId** | **Long**| 球员Id |

### Return type

[**BasicPlayer**](BasicPlayer.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getNationalPlayer"></a>
# **getNationalPlayer**
> List&lt;PlayerCategoryTop&gt; getNationalPlayer(key)

查看国家队下的所有球员

查看国家队下的所有球员

### Example
```java
// Import classes:
//import io.swagger.client.api.PlayerApi;

PlayerApi apiInstance = new PlayerApi();
String key = "visitor"; // String | key
try {
    List<PlayerCategoryTop> result = apiInstance.getNationalPlayer(key);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlayerApi#getNationalPlayer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **key** | **String**| key | [default to visitor]

### Return type

[**List&lt;PlayerCategoryTop&gt;**](PlayerCategoryTop.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPlayer"></a>
# **getPlayer**
> Player getPlayer(key, playerId)

获得球员信息

查看球员信息

### Example
```java
// Import classes:
//import io.swagger.client.api.PlayerApi;

PlayerApi apiInstance = new PlayerApi();
String key = "visitor"; // String | key
Long playerId = 789L; // Long | 球员Id
try {
    Player result = apiInstance.getPlayer(key, playerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlayerApi#getPlayer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **key** | **String**| key | [default to visitor]
 **playerId** | **Long**| 球员Id |

### Return type

[**Player**](Player.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPlayerByTeamCategory"></a>
# **getPlayerByTeamCategory**
> List&lt;Player&gt; getPlayerByTeamCategory(key, teamCategoryId)

查看球队分类下的所有球员

查看球队分类下的所有球员

### Example
```java
// Import classes:
//import io.swagger.client.api.PlayerApi;

PlayerApi apiInstance = new PlayerApi();
String key = "visitor"; // String | key
Long teamCategoryId = 789L; // Long | 球队分类的Id
try {
    List<Player> result = apiInstance.getPlayerByTeamCategory(key, teamCategoryId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlayerApi#getPlayerByTeamCategory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **key** | **String**| key | [default to visitor]
 **teamCategoryId** | **Long**| 球队分类的Id |

### Return type

[**List&lt;Player&gt;**](Player.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPlayerIntroduce"></a>
# **getPlayerIntroduce**
> String getPlayerIntroduce(key, playerId)

获得球员个人介绍

获得球员个人介绍

### Example
```java
// Import classes:
//import io.swagger.client.api.PlayerApi;

PlayerApi apiInstance = new PlayerApi();
String key = "visitor"; // String | key
Long playerId = 789L; // Long | 球员Id
try {
    String result = apiInstance.getPlayerIntroduce(key, playerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlayerApi#getPlayerIntroduce");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **key** | **String**| key | [default to visitor]
 **playerId** | **Long**| 球员Id |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPlayerNationMatches"></a>
# **getPlayerNationMatches**
> List&lt;PlayerNationalMatch&gt; getPlayerNationMatches(key, playerId)

获得球员比赛信息

获得球员比赛信息

### Example
```java
// Import classes:
//import io.swagger.client.api.PlayerApi;

PlayerApi apiInstance = new PlayerApi();
String key = "visitor"; // String | key
Long playerId = 789L; // Long | 球员Id
try {
    List<PlayerNationalMatch> result = apiInstance.getPlayerNationMatches(key, playerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlayerApi#getPlayerNationMatches");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **key** | **String**| key | [default to visitor]
 **playerId** | **Long**| 球员Id |

### Return type

[**List&lt;PlayerNationalMatch&gt;**](PlayerNationalMatch.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPlayerNationRecords"></a>
# **getPlayerNationRecords**
> PlayerNationalRecord getPlayerNationRecords(key, playerId)

获得球员比赛统计信息

获得球员比赛统计信息

### Example
```java
// Import classes:
//import io.swagger.client.api.PlayerApi;

PlayerApi apiInstance = new PlayerApi();
String key = "visitor"; // String | key
Long playerId = 789L; // Long | 球员Id
try {
    PlayerNationalRecord result = apiInstance.getPlayerNationRecords(key, playerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlayerApi#getPlayerNationRecords");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **key** | **String**| key | [default to visitor]
 **playerId** | **Long**| 球员Id |

### Return type

[**PlayerNationalRecord**](PlayerNationalRecord.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


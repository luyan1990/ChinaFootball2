# TeamApi

All URIs are relative to *http://api.c-f.com:8000/football*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getTeam**](TeamApi.md#getTeam) | **GET** /games/teams/{teamId} | 查询一只球队


<a name="getTeam"></a>
# **getTeam**
> Team getTeam(key, teamId)

查询一只球队

查询一只球队

### Example
```java
// Import classes:
//import io.swagger.client.api.TeamApi;

TeamApi apiInstance = new TeamApi();
String key = "visitor"; // String | key
Long teamId = 789L; // Long | 队伍Id
try {
    Team result = apiInstance.getTeam(key, teamId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TeamApi#getTeam");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **key** | **String**| key | [default to visitor]
 **teamId** | **Long**| 队伍Id |

### Return type

[**Team**](Team.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


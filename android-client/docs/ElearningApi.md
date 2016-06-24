# ElearningApi

All URIs are relative to *http://api.c-f.com:8000/football*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getElearningQuizCategoriesTree**](ElearningApi.md#getElearningQuizCategoriesTree) | **GET** /elearning/quiz_categories | 获取elearning测试类目
[**getElearningQuizPageList**](ElearningApi.md#getElearningQuizPageList) | **GET** /elearning/quiz_categories/{categoryId}/pages | 随机获取测试分类下的单篇列表
[**getElearningQuizSubCategories**](ElearningApi.md#getElearningQuizSubCategories) | **GET** /elearning/quiz_categories/{categoryId}/subCats | 获取elearning测试类目下的单级子分类列表
[**getElearningTrainingCategoriesTree**](ElearningApi.md#getElearningTrainingCategoriesTree) | **GET** /elearning/training_categories | 获取elearning培训类目
[**getElearningTrainingPageList**](ElearningApi.md#getElearningTrainingPageList) | **GET** /elearning/training_categories/{categoryId}/pages | 分页获取培训分类下的单篇列表
[**getElearningTrainingSubCategories**](ElearningApi.md#getElearningTrainingSubCategories) | **GET** /elearning/training_categories/{categoryId}/subCats | 获取elearning培训类目下的单级子分类列表
[**getElearningVideoDetail**](ElearningApi.md#getElearningVideoDetail) | **GET** /elearning/videos/{videoId} | 获取单个视频详细信息


<a name="getElearningQuizCategoriesTree"></a>
# **getElearningQuizCategoriesTree**
> List&lt;ElearningQuizCategory&gt; getElearningQuizCategoriesTree()

获取elearning测试类目

获取elearning测试类目

### Example
```java
// Import classes:
//import io.swagger.client.api.ElearningApi;

ElearningApi apiInstance = new ElearningApi();
try {
    List<ElearningQuizCategory> result = apiInstance.getElearningQuizCategoriesTree();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ElearningApi#getElearningQuizCategoriesTree");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;ElearningQuizCategory&gt;**](ElearningQuizCategory.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getElearningQuizPageList"></a>
# **getElearningQuizPageList**
> List&lt;ElearningPage&gt; getElearningQuizPageList(categoryId)

随机获取测试分类下的单篇列表

随机获取测试分类下的单篇列表

### Example
```java
// Import classes:
//import io.swagger.client.api.ElearningApi;

ElearningApi apiInstance = new ElearningApi();
String categoryId = "categoryId_example"; // String | elearning测试类目Id
try {
    List<ElearningPage> result = apiInstance.getElearningQuizPageList(categoryId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ElearningApi#getElearningQuizPageList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **categoryId** | **String**| elearning测试类目Id |

### Return type

[**List&lt;ElearningPage&gt;**](ElearningPage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getElearningQuizSubCategories"></a>
# **getElearningQuizSubCategories**
> List&lt;ElearningQuizCategory&gt; getElearningQuizSubCategories(categoryId)

获取elearning测试类目下的单级子分类列表

获取elearning测试类目下的单级子分类列表

### Example
```java
// Import classes:
//import io.swagger.client.api.ElearningApi;

ElearningApi apiInstance = new ElearningApi();
String categoryId = "categoryId_example"; // String | elearning测试类目Id
try {
    List<ElearningQuizCategory> result = apiInstance.getElearningQuizSubCategories(categoryId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ElearningApi#getElearningQuizSubCategories");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **categoryId** | **String**| elearning测试类目Id |

### Return type

[**List&lt;ElearningQuizCategory&gt;**](ElearningQuizCategory.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getElearningTrainingCategoriesTree"></a>
# **getElearningTrainingCategoriesTree**
> List&lt;ElearningTrainingCategory&gt; getElearningTrainingCategoriesTree()

获取elearning培训类目

获取elearning培训类目

### Example
```java
// Import classes:
//import io.swagger.client.api.ElearningApi;

ElearningApi apiInstance = new ElearningApi();
try {
    List<ElearningTrainingCategory> result = apiInstance.getElearningTrainingCategoriesTree();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ElearningApi#getElearningTrainingCategoriesTree");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;ElearningTrainingCategory&gt;**](ElearningTrainingCategory.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getElearningTrainingPageList"></a>
# **getElearningTrainingPageList**
> List&lt;ElearningPage&gt; getElearningTrainingPageList(categoryId, start, limit)

分页获取培训分类下的单篇列表

分页获取培训分类下的单篇列表

### Example
```java
// Import classes:
//import io.swagger.client.api.ElearningApi;

ElearningApi apiInstance = new ElearningApi();
String categoryId = "categoryId_example"; // String | elearning培训类目Id
Integer start = 56; // Integer | 跳过的单篇数量，不传返回第一页
Integer limit = 56; // Integer | 每页显示的单篇数量，默认值20
try {
    List<ElearningPage> result = apiInstance.getElearningTrainingPageList(categoryId, start, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ElearningApi#getElearningTrainingPageList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **categoryId** | **String**| elearning培训类目Id |
 **start** | **Integer**| 跳过的单篇数量，不传返回第一页 | [optional]
 **limit** | **Integer**| 每页显示的单篇数量，默认值20 | [optional]

### Return type

[**List&lt;ElearningPage&gt;**](ElearningPage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getElearningTrainingSubCategories"></a>
# **getElearningTrainingSubCategories**
> List&lt;ElearningTrainingCategory&gt; getElearningTrainingSubCategories(categoryId)

获取elearning培训类目下的单级子分类列表

获取elearning培训类目下的单级子分类列表

### Example
```java
// Import classes:
//import io.swagger.client.api.ElearningApi;

ElearningApi apiInstance = new ElearningApi();
String categoryId = "categoryId_example"; // String | elearning培训类目Id
try {
    List<ElearningTrainingCategory> result = apiInstance.getElearningTrainingSubCategories(categoryId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ElearningApi#getElearningTrainingSubCategories");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **categoryId** | **String**| elearning培训类目Id |

### Return type

[**List&lt;ElearningTrainingCategory&gt;**](ElearningTrainingCategory.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getElearningVideoDetail"></a>
# **getElearningVideoDetail**
> ElearningVideo getElearningVideoDetail(videoId)

获取单个视频详细信息

获取单个视频详细信息

### Example
```java
// Import classes:
//import io.swagger.client.api.ElearningApi;

ElearningApi apiInstance = new ElearningApi();
String videoId = "videoId_example"; // String | elearning视频的ID
try {
    ElearningVideo result = apiInstance.getElearningVideoDetail(videoId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ElearningApi#getElearningVideoDetail");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **videoId** | **String**| elearning视频的ID |

### Return type

[**ElearningVideo**](ElearningVideo.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


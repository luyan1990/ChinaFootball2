package io.swagger.client.api;

import io.swagger.client.ApiInvoker;
import io.swagger.client.ApiException;
import io.swagger.client.Pair;

import io.swagger.client.model.*;

import java.util.*;

import com.android.volley.Response;
import com.android.volley.VolleyError;

import io.swagger.client.model.ElearningQuizCategory;
import io.swagger.client.model.ElearningPage;
import io.swagger.client.model.ElearningTrainingCategory;
import io.swagger.client.model.ElearningVideo;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

public class ElearningApi {
  String basePath = "http://api.c-f.com:8000/football";
  ApiInvoker apiInvoker = ApiInvoker.getInstance();

  public void addHeader(String key, String value) {
    getInvoker().addDefaultHeader(key, value);
  }

  public ApiInvoker getInvoker() {
    return apiInvoker;
  }

  public void setBasePath(String basePath) {
    this.basePath = basePath;
  }

  public String getBasePath() {
    return basePath;
  }

  /**
  * 获取elearning测试类目
  * 获取elearning测试类目
   * @return List<ElearningQuizCategory>
  */
  public List<ElearningQuizCategory> getElearningQuizCategoriesTree () throws TimeoutException, ExecutionException, InterruptedException, ApiException {
     Object postBody = null;
  

  // create path and map variables
  String path = "/elearning/quiz_categories".replaceAll("\\{format\\}","json");

  // query params
  List<Pair> queryParams = new ArrayList<Pair>();
      // header params
      Map<String, String> headerParams = new HashMap<String, String>();
      // form params
      Map<String, String> formParams = new HashMap<String, String>();



      String[] contentTypes = {
  "application/json"
      };
      String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

      if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
  

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
      } else {
      // normal form params
        }

      String[] authNames = new String[] {  };

      try {
        String localVarResponse = apiInvoker.invokeAPI (basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames);
        if(localVarResponse != null){
           return (List<ElearningQuizCategory>) ApiInvoker.deserialize(localVarResponse, "array", ElearningQuizCategory.class);
        } else {
           return null;
        }
      } catch (ApiException ex) {
         throw ex;
      } catch (InterruptedException ex) {
         throw ex;
      } catch (ExecutionException ex) {
         if(ex.getCause() instanceof VolleyError) {
	    VolleyError volleyError = (VolleyError)ex.getCause();
	    if (volleyError.networkResponse != null) {
	       throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
	    }
         }
         throw ex;
      } catch (TimeoutException ex) {
         throw ex;
      }
  }

      /**
   * 获取elearning测试类目
   * 获取elearning测试类目

  */
  public void getElearningQuizCategoriesTree (final Response.Listener<List<ElearningQuizCategory>> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

  

    // create path and map variables
    String path = "/elearning/quiz_categories".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();



    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

      String[] authNames = new String[] {  };

    try {
      apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((List<ElearningQuizCategory>) ApiInvoker.deserialize(localVarResponse,  "array", ElearningQuizCategory.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
  /**
  * 随机获取测试分类下的单篇列表
  * 随机获取测试分类下的单篇列表
   * @param categoryId elearning测试类目Id
   * @return List<ElearningPage>
  */
  public List<ElearningPage> getElearningQuizPageList (String categoryId) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
     Object postBody = null;
  
      // verify the required parameter 'categoryId' is set
      if (categoryId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'categoryId' when calling getElearningQuizPageList",
      new ApiException(400, "Missing the required parameter 'categoryId' when calling getElearningQuizPageList"));
      }
  

  // create path and map variables
  String path = "/elearning/quiz_categories/{categoryId}/pages".replaceAll("\\{format\\}","json").replaceAll("\\{" + "categoryId" + "\\}", apiInvoker.escapeString(categoryId.toString()));

  // query params
  List<Pair> queryParams = new ArrayList<Pair>();
      // header params
      Map<String, String> headerParams = new HashMap<String, String>();
      // form params
      Map<String, String> formParams = new HashMap<String, String>();



      String[] contentTypes = {
  "application/json"
      };
      String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

      if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
  

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
      } else {
      // normal form params
        }

      String[] authNames = new String[] {  };

      try {
        String localVarResponse = apiInvoker.invokeAPI (basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames);
        if(localVarResponse != null){
           return (List<ElearningPage>) ApiInvoker.deserialize(localVarResponse, "array", ElearningPage.class);
        } else {
           return null;
        }
      } catch (ApiException ex) {
         throw ex;
      } catch (InterruptedException ex) {
         throw ex;
      } catch (ExecutionException ex) {
         if(ex.getCause() instanceof VolleyError) {
	    VolleyError volleyError = (VolleyError)ex.getCause();
	    if (volleyError.networkResponse != null) {
	       throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
	    }
         }
         throw ex;
      } catch (TimeoutException ex) {
         throw ex;
      }
  }

      /**
   * 随机获取测试分类下的单篇列表
   * 随机获取测试分类下的单篇列表
   * @param categoryId elearning测试类目Id
  */
  public void getElearningQuizPageList (String categoryId, final Response.Listener<List<ElearningPage>> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

  
    // verify the required parameter 'categoryId' is set
    if (categoryId == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'categoryId' when calling getElearningQuizPageList",
         new ApiException(400, "Missing the required parameter 'categoryId' when calling getElearningQuizPageList"));
    }
    

    // create path and map variables
    String path = "/elearning/quiz_categories/{categoryId}/pages".replaceAll("\\{format\\}","json").replaceAll("\\{" + "categoryId" + "\\}", apiInvoker.escapeString(categoryId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();



    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

      String[] authNames = new String[] {  };

    try {
      apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((List<ElearningPage>) ApiInvoker.deserialize(localVarResponse,  "array", ElearningPage.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
  /**
  * 获取elearning测试类目下的单级子分类列表
  * 获取elearning测试类目下的单级子分类列表
   * @param categoryId elearning测试类目Id
   * @return List<ElearningQuizCategory>
  */
  public List<ElearningQuizCategory> getElearningQuizSubCategories (String categoryId) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
     Object postBody = null;
  
      // verify the required parameter 'categoryId' is set
      if (categoryId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'categoryId' when calling getElearningQuizSubCategories",
      new ApiException(400, "Missing the required parameter 'categoryId' when calling getElearningQuizSubCategories"));
      }
  

  // create path and map variables
  String path = "/elearning/quiz_categories/{categoryId}/subCats".replaceAll("\\{format\\}","json").replaceAll("\\{" + "categoryId" + "\\}", apiInvoker.escapeString(categoryId.toString()));

  // query params
  List<Pair> queryParams = new ArrayList<Pair>();
      // header params
      Map<String, String> headerParams = new HashMap<String, String>();
      // form params
      Map<String, String> formParams = new HashMap<String, String>();



      String[] contentTypes = {
  "application/json"
      };
      String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

      if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
  

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
      } else {
      // normal form params
        }

      String[] authNames = new String[] {  };

      try {
        String localVarResponse = apiInvoker.invokeAPI (basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames);
        if(localVarResponse != null){
           return (List<ElearningQuizCategory>) ApiInvoker.deserialize(localVarResponse, "array", ElearningQuizCategory.class);
        } else {
           return null;
        }
      } catch (ApiException ex) {
         throw ex;
      } catch (InterruptedException ex) {
         throw ex;
      } catch (ExecutionException ex) {
         if(ex.getCause() instanceof VolleyError) {
	    VolleyError volleyError = (VolleyError)ex.getCause();
	    if (volleyError.networkResponse != null) {
	       throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
	    }
         }
         throw ex;
      } catch (TimeoutException ex) {
         throw ex;
      }
  }

      /**
   * 获取elearning测试类目下的单级子分类列表
   * 获取elearning测试类目下的单级子分类列表
   * @param categoryId elearning测试类目Id
  */
  public void getElearningQuizSubCategories (String categoryId, final Response.Listener<List<ElearningQuizCategory>> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

  
    // verify the required parameter 'categoryId' is set
    if (categoryId == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'categoryId' when calling getElearningQuizSubCategories",
         new ApiException(400, "Missing the required parameter 'categoryId' when calling getElearningQuizSubCategories"));
    }
    

    // create path and map variables
    String path = "/elearning/quiz_categories/{categoryId}/subCats".replaceAll("\\{format\\}","json").replaceAll("\\{" + "categoryId" + "\\}", apiInvoker.escapeString(categoryId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();



    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

      String[] authNames = new String[] {  };

    try {
      apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((List<ElearningQuizCategory>) ApiInvoker.deserialize(localVarResponse,  "array", ElearningQuizCategory.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
  /**
  * 获取elearning培训类目
  * 获取elearning培训类目
   * @return List<ElearningTrainingCategory>
  */
  public List<ElearningTrainingCategory> getElearningTrainingCategoriesTree () throws TimeoutException, ExecutionException, InterruptedException, ApiException {
     Object postBody = null;
  

  // create path and map variables
  String path = "/elearning/training_categories".replaceAll("\\{format\\}","json");

  // query params
  List<Pair> queryParams = new ArrayList<Pair>();
      // header params
      Map<String, String> headerParams = new HashMap<String, String>();
      // form params
      Map<String, String> formParams = new HashMap<String, String>();



      String[] contentTypes = {
  "application/json"
      };
      String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

      if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
  

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
      } else {
      // normal form params
        }

      String[] authNames = new String[] {  };

      try {
        String localVarResponse = apiInvoker.invokeAPI (basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames);
        if(localVarResponse != null){
           return (List<ElearningTrainingCategory>) ApiInvoker.deserialize(localVarResponse, "array", ElearningTrainingCategory.class);
        } else {
           return null;
        }
      } catch (ApiException ex) {
         throw ex;
      } catch (InterruptedException ex) {
         throw ex;
      } catch (ExecutionException ex) {
         if(ex.getCause() instanceof VolleyError) {
	    VolleyError volleyError = (VolleyError)ex.getCause();
	    if (volleyError.networkResponse != null) {
	       throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
	    }
         }
         throw ex;
      } catch (TimeoutException ex) {
         throw ex;
      }
  }

      /**
   * 获取elearning培训类目
   * 获取elearning培训类目

  */
  public void getElearningTrainingCategoriesTree (final Response.Listener<List<ElearningTrainingCategory>> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

  

    // create path and map variables
    String path = "/elearning/training_categories".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();



    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

      String[] authNames = new String[] {  };

    try {
      apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((List<ElearningTrainingCategory>) ApiInvoker.deserialize(localVarResponse,  "array", ElearningTrainingCategory.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
  /**
  * 分页获取培训分类下的单篇列表
  * 分页获取培训分类下的单篇列表
   * @param categoryId elearning培训类目Id
   * @param start 跳过的单篇数量，不传返回第一页
   * @param limit 每页显示的单篇数量，默认值20
   * @return List<ElearningPage>
  */
  public List<ElearningPage> getElearningTrainingPageList (String categoryId, Integer start, Integer limit) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
     Object postBody = null;
  
      // verify the required parameter 'categoryId' is set
      if (categoryId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'categoryId' when calling getElearningTrainingPageList",
      new ApiException(400, "Missing the required parameter 'categoryId' when calling getElearningTrainingPageList"));
      }
  

  // create path and map variables
  String path = "/elearning/training_categories/{categoryId}/pages".replaceAll("\\{format\\}","json").replaceAll("\\{" + "categoryId" + "\\}", apiInvoker.escapeString(categoryId.toString()));

  // query params
  List<Pair> queryParams = new ArrayList<Pair>();
      // header params
      Map<String, String> headerParams = new HashMap<String, String>();
      // form params
      Map<String, String> formParams = new HashMap<String, String>();

          queryParams.addAll(ApiInvoker.parameterToPairs("", "start", start));
          queryParams.addAll(ApiInvoker.parameterToPairs("", "limit", limit));


      String[] contentTypes = {
  "application/json"
      };
      String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

      if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
  

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
      } else {
      // normal form params
        }

      String[] authNames = new String[] {  };

      try {
        String localVarResponse = apiInvoker.invokeAPI (basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames);
        if(localVarResponse != null){
           return (List<ElearningPage>) ApiInvoker.deserialize(localVarResponse, "array", ElearningPage.class);
        } else {
           return null;
        }
      } catch (ApiException ex) {
         throw ex;
      } catch (InterruptedException ex) {
         throw ex;
      } catch (ExecutionException ex) {
         if(ex.getCause() instanceof VolleyError) {
	    VolleyError volleyError = (VolleyError)ex.getCause();
	    if (volleyError.networkResponse != null) {
	       throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
	    }
         }
         throw ex;
      } catch (TimeoutException ex) {
         throw ex;
      }
  }

      /**
   * 分页获取培训分类下的单篇列表
   * 分页获取培训分类下的单篇列表
   * @param categoryId elearning培训类目Id   * @param start 跳过的单篇数量，不传返回第一页   * @param limit 每页显示的单篇数量，默认值20
  */
  public void getElearningTrainingPageList (String categoryId, Integer start, Integer limit, final Response.Listener<List<ElearningPage>> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

  
    // verify the required parameter 'categoryId' is set
    if (categoryId == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'categoryId' when calling getElearningTrainingPageList",
         new ApiException(400, "Missing the required parameter 'categoryId' when calling getElearningTrainingPageList"));
    }
    

    // create path and map variables
    String path = "/elearning/training_categories/{categoryId}/pages".replaceAll("\\{format\\}","json").replaceAll("\\{" + "categoryId" + "\\}", apiInvoker.escapeString(categoryId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    queryParams.addAll(ApiInvoker.parameterToPairs("", "start", start));
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limit", limit));


    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

      String[] authNames = new String[] {  };

    try {
      apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((List<ElearningPage>) ApiInvoker.deserialize(localVarResponse,  "array", ElearningPage.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
  /**
  * 获取elearning培训类目下的单级子分类列表
  * 获取elearning培训类目下的单级子分类列表
   * @param categoryId elearning培训类目Id
   * @return List<ElearningTrainingCategory>
  */
  public List<ElearningTrainingCategory> getElearningTrainingSubCategories (String categoryId) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
     Object postBody = null;
  
      // verify the required parameter 'categoryId' is set
      if (categoryId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'categoryId' when calling getElearningTrainingSubCategories",
      new ApiException(400, "Missing the required parameter 'categoryId' when calling getElearningTrainingSubCategories"));
      }
  

  // create path and map variables
  String path = "/elearning/training_categories/{categoryId}/subCats".replaceAll("\\{format\\}","json").replaceAll("\\{" + "categoryId" + "\\}", apiInvoker.escapeString(categoryId.toString()));

  // query params
  List<Pair> queryParams = new ArrayList<Pair>();
      // header params
      Map<String, String> headerParams = new HashMap<String, String>();
      // form params
      Map<String, String> formParams = new HashMap<String, String>();



      String[] contentTypes = {
  "application/json"
      };
      String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

      if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
  

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
      } else {
      // normal form params
        }

      String[] authNames = new String[] {  };

      try {
        String localVarResponse = apiInvoker.invokeAPI (basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames);
        if(localVarResponse != null){
           return (List<ElearningTrainingCategory>) ApiInvoker.deserialize(localVarResponse, "array", ElearningTrainingCategory.class);
        } else {
           return null;
        }
      } catch (ApiException ex) {
         throw ex;
      } catch (InterruptedException ex) {
         throw ex;
      } catch (ExecutionException ex) {
         if(ex.getCause() instanceof VolleyError) {
	    VolleyError volleyError = (VolleyError)ex.getCause();
	    if (volleyError.networkResponse != null) {
	       throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
	    }
         }
         throw ex;
      } catch (TimeoutException ex) {
         throw ex;
      }
  }

      /**
   * 获取elearning培训类目下的单级子分类列表
   * 获取elearning培训类目下的单级子分类列表
   * @param categoryId elearning培训类目Id
  */
  public void getElearningTrainingSubCategories (String categoryId, final Response.Listener<List<ElearningTrainingCategory>> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

  
    // verify the required parameter 'categoryId' is set
    if (categoryId == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'categoryId' when calling getElearningTrainingSubCategories",
         new ApiException(400, "Missing the required parameter 'categoryId' when calling getElearningTrainingSubCategories"));
    }
    

    // create path and map variables
    String path = "/elearning/training_categories/{categoryId}/subCats".replaceAll("\\{format\\}","json").replaceAll("\\{" + "categoryId" + "\\}", apiInvoker.escapeString(categoryId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();



    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

      String[] authNames = new String[] {  };

    try {
      apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((List<ElearningTrainingCategory>) ApiInvoker.deserialize(localVarResponse,  "array", ElearningTrainingCategory.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
  /**
  * 获取单个视频详细信息
  * 获取单个视频详细信息
   * @param videoId elearning视频的ID
   * @return ElearningVideo
  */
  public ElearningVideo getElearningVideoDetail (String videoId) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
     Object postBody = null;
  
      // verify the required parameter 'videoId' is set
      if (videoId == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'videoId' when calling getElearningVideoDetail",
      new ApiException(400, "Missing the required parameter 'videoId' when calling getElearningVideoDetail"));
      }
  

  // create path and map variables
  String path = "/elearning/videos/{videoId}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "videoId" + "\\}", apiInvoker.escapeString(videoId.toString()));

  // query params
  List<Pair> queryParams = new ArrayList<Pair>();
      // header params
      Map<String, String> headerParams = new HashMap<String, String>();
      // form params
      Map<String, String> formParams = new HashMap<String, String>();



      String[] contentTypes = {
  "application/json"
      };
      String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

      if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
  

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
      } else {
      // normal form params
        }

      String[] authNames = new String[] {  };

      try {
        String localVarResponse = apiInvoker.invokeAPI (basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames);
        if(localVarResponse != null){
           return (ElearningVideo) ApiInvoker.deserialize(localVarResponse, "", ElearningVideo.class);
        } else {
           return null;
        }
      } catch (ApiException ex) {
         throw ex;
      } catch (InterruptedException ex) {
         throw ex;
      } catch (ExecutionException ex) {
         if(ex.getCause() instanceof VolleyError) {
	    VolleyError volleyError = (VolleyError)ex.getCause();
	    if (volleyError.networkResponse != null) {
	       throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
	    }
         }
         throw ex;
      } catch (TimeoutException ex) {
         throw ex;
      }
  }

      /**
   * 获取单个视频详细信息
   * 获取单个视频详细信息
   * @param videoId elearning视频的ID
  */
  public void getElearningVideoDetail (String videoId, final Response.Listener<ElearningVideo> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = null;

  
    // verify the required parameter 'videoId' is set
    if (videoId == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'videoId' when calling getElearningVideoDetail",
         new ApiException(400, "Missing the required parameter 'videoId' when calling getElearningVideoDetail"));
    }
    

    // create path and map variables
    String path = "/elearning/videos/{videoId}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "videoId" + "\\}", apiInvoker.escapeString(videoId.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();



    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

      String[] authNames = new String[] {  };

    try {
      apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
            try {
              responseListener.onResponse((ElearningVideo) ApiInvoker.deserialize(localVarResponse,  "", ElearningVideo.class));
            } catch (ApiException exception) {
               errorListener.onErrorResponse(new VolleyError(exception));
            }
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
}

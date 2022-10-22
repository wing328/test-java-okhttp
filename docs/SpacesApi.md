# SpacesApi

All URIs are relative to *https://api.twitter.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**findSpaceById**](SpacesApi.md#findSpaceById) | **GET** /2/spaces/{id} | Space lookup by Space ID |
| [**findSpacesByCreatorIds**](SpacesApi.md#findSpacesByCreatorIds) | **GET** /2/spaces/by/creator_ids | Space lookup by their creators |
| [**findSpacesByIds**](SpacesApi.md#findSpacesByIds) | **GET** /2/spaces | Space lookup up Space IDs |
| [**searchSpaces**](SpacesApi.md#searchSpaces) | **GET** /2/spaces/search | Search for Spaces |
| [**spaceBuyers**](SpacesApi.md#spaceBuyers) | **GET** /2/spaces/{id}/buyers | Retrieve the list of Users who purchased a ticket to the given space |
| [**spaceTweets**](SpacesApi.md#spaceTweets) | **GET** /2/spaces/{id}/tweets | Retrieve Tweets from a Space. |


<a name="findSpaceById"></a>
# **findSpaceById**
> Get2SpacesIdResponse findSpaceById(id, spaceFields, expansions, userFields, topicFields)

Space lookup by Space ID

Returns a variety of information about the Space specified by the requested ID

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SpacesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.twitter.com");
    
    // Configure HTTP bearer authorization: BearerToken
    HttpBearerAuth BearerToken = (HttpBearerAuth) defaultClient.getAuthentication("BearerToken");
    BearerToken.setBearerToken("BEARER TOKEN");

    // Configure OAuth2 access token for authorization: OAuth2UserToken
    OAuth OAuth2UserToken = (OAuth) defaultClient.getAuthentication("OAuth2UserToken");
    OAuth2UserToken.setAccessToken("YOUR ACCESS TOKEN");

    SpacesApi apiInstance = new SpacesApi(defaultClient);
    String id = "1SLjjRYNejbKM"; // String | The ID of the Space to be retrieved.
    Set<String> spaceFields = Arrays.asList(); // Set<String> | A comma separated list of Space fields to display.
    Set<String> expansions = Arrays.asList(); // Set<String> | A comma separated list of fields to expand.
    Set<String> userFields = Arrays.asList(); // Set<String> | A comma separated list of User fields to display.
    Set<String> topicFields = Arrays.asList(); // Set<String> | A comma separated list of Topic fields to display.
    try {
      Get2SpacesIdResponse result = apiInstance.findSpaceById(id, spaceFields, expansions, userFields, topicFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SpacesApi#findSpaceById");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| The ID of the Space to be retrieved. | |
| **spaceFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Space fields to display. | [optional] [enum: created_at, creator_id, ended_at, host_ids, id, invited_user_ids, is_ticketed, lang, participant_count, scheduled_start, speaker_ids, started_at, state, subscriber_count, title, topic_ids, updated_at] |
| **expansions** | [**Set&lt;String&gt;**](String.md)| A comma separated list of fields to expand. | [optional] [enum: creator_id, host_ids, invited_user_ids, speaker_ids, topic_ids] |
| **userFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of User fields to display. | [optional] [enum: created_at, description, entities, id, location, name, pinned_tweet_id, profile_image_url, protected, public_metrics, url, username, verified, withheld] |
| **topicFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Topic fields to display. | [optional] [enum: description, id, name] |

### Return type

[**Get2SpacesIdResponse**](Get2SpacesIdResponse.md)

### Authorization

[BearerToken](../README.md#BearerToken), [OAuth2UserToken](../README.md#OAuth2UserToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **0** | The request has failed. |  -  |

<a name="findSpacesByCreatorIds"></a>
# **findSpacesByCreatorIds**
> Get2SpacesByCreatorIdsResponse findSpacesByCreatorIds(userIds, spaceFields, expansions, userFields, topicFields)

Space lookup by their creators

Returns a variety of information about the Spaces created by the provided User IDs

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SpacesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.twitter.com");
    
    // Configure HTTP bearer authorization: BearerToken
    HttpBearerAuth BearerToken = (HttpBearerAuth) defaultClient.getAuthentication("BearerToken");
    BearerToken.setBearerToken("BEARER TOKEN");

    // Configure OAuth2 access token for authorization: OAuth2UserToken
    OAuth OAuth2UserToken = (OAuth) defaultClient.getAuthentication("OAuth2UserToken");
    OAuth2UserToken.setAccessToken("YOUR ACCESS TOKEN");

    SpacesApi apiInstance = new SpacesApi(defaultClient);
    List<String> userIds = Arrays.asList(); // List<String> | The IDs of Users to search through.
    Set<String> spaceFields = Arrays.asList(); // Set<String> | A comma separated list of Space fields to display.
    Set<String> expansions = Arrays.asList(); // Set<String> | A comma separated list of fields to expand.
    Set<String> userFields = Arrays.asList(); // Set<String> | A comma separated list of User fields to display.
    Set<String> topicFields = Arrays.asList(); // Set<String> | A comma separated list of Topic fields to display.
    try {
      Get2SpacesByCreatorIdsResponse result = apiInstance.findSpacesByCreatorIds(userIds, spaceFields, expansions, userFields, topicFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SpacesApi#findSpacesByCreatorIds");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **userIds** | [**List&lt;String&gt;**](String.md)| The IDs of Users to search through. | |
| **spaceFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Space fields to display. | [optional] [enum: created_at, creator_id, ended_at, host_ids, id, invited_user_ids, is_ticketed, lang, participant_count, scheduled_start, speaker_ids, started_at, state, subscriber_count, title, topic_ids, updated_at] |
| **expansions** | [**Set&lt;String&gt;**](String.md)| A comma separated list of fields to expand. | [optional] [enum: creator_id, host_ids, invited_user_ids, speaker_ids, topic_ids] |
| **userFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of User fields to display. | [optional] [enum: created_at, description, entities, id, location, name, pinned_tweet_id, profile_image_url, protected, public_metrics, url, username, verified, withheld] |
| **topicFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Topic fields to display. | [optional] [enum: description, id, name] |

### Return type

[**Get2SpacesByCreatorIdsResponse**](Get2SpacesByCreatorIdsResponse.md)

### Authorization

[BearerToken](../README.md#BearerToken), [OAuth2UserToken](../README.md#OAuth2UserToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **0** | The request has failed. |  -  |

<a name="findSpacesByIds"></a>
# **findSpacesByIds**
> Get2SpacesResponse findSpacesByIds(ids, spaceFields, expansions, userFields, topicFields)

Space lookup up Space IDs

Returns a variety of information about the Spaces specified by the requested IDs

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SpacesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.twitter.com");
    
    // Configure HTTP bearer authorization: BearerToken
    HttpBearerAuth BearerToken = (HttpBearerAuth) defaultClient.getAuthentication("BearerToken");
    BearerToken.setBearerToken("BEARER TOKEN");

    // Configure OAuth2 access token for authorization: OAuth2UserToken
    OAuth OAuth2UserToken = (OAuth) defaultClient.getAuthentication("OAuth2UserToken");
    OAuth2UserToken.setAccessToken("YOUR ACCESS TOKEN");

    SpacesApi apiInstance = new SpacesApi(defaultClient);
    List<String> ids = Arrays.asList(); // List<String> | The list of Space IDs to return.
    Set<String> spaceFields = Arrays.asList(); // Set<String> | A comma separated list of Space fields to display.
    Set<String> expansions = Arrays.asList(); // Set<String> | A comma separated list of fields to expand.
    Set<String> userFields = Arrays.asList(); // Set<String> | A comma separated list of User fields to display.
    Set<String> topicFields = Arrays.asList(); // Set<String> | A comma separated list of Topic fields to display.
    try {
      Get2SpacesResponse result = apiInstance.findSpacesByIds(ids, spaceFields, expansions, userFields, topicFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SpacesApi#findSpacesByIds");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ids** | [**List&lt;String&gt;**](String.md)| The list of Space IDs to return. | |
| **spaceFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Space fields to display. | [optional] [enum: created_at, creator_id, ended_at, host_ids, id, invited_user_ids, is_ticketed, lang, participant_count, scheduled_start, speaker_ids, started_at, state, subscriber_count, title, topic_ids, updated_at] |
| **expansions** | [**Set&lt;String&gt;**](String.md)| A comma separated list of fields to expand. | [optional] [enum: creator_id, host_ids, invited_user_ids, speaker_ids, topic_ids] |
| **userFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of User fields to display. | [optional] [enum: created_at, description, entities, id, location, name, pinned_tweet_id, profile_image_url, protected, public_metrics, url, username, verified, withheld] |
| **topicFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Topic fields to display. | [optional] [enum: description, id, name] |

### Return type

[**Get2SpacesResponse**](Get2SpacesResponse.md)

### Authorization

[BearerToken](../README.md#BearerToken), [OAuth2UserToken](../README.md#OAuth2UserToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **0** | The request has failed. |  -  |

<a name="searchSpaces"></a>
# **searchSpaces**
> Get2SpacesSearchResponse searchSpaces(query, state, maxResults, spaceFields, expansions, userFields, topicFields)

Search for Spaces

Returns Spaces that match the provided query.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SpacesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.twitter.com");
    
    // Configure HTTP bearer authorization: BearerToken
    HttpBearerAuth BearerToken = (HttpBearerAuth) defaultClient.getAuthentication("BearerToken");
    BearerToken.setBearerToken("BEARER TOKEN");

    // Configure OAuth2 access token for authorization: OAuth2UserToken
    OAuth OAuth2UserToken = (OAuth) defaultClient.getAuthentication("OAuth2UserToken");
    OAuth2UserToken.setAccessToken("YOUR ACCESS TOKEN");

    SpacesApi apiInstance = new SpacesApi(defaultClient);
    String query = "crypto"; // String | The search query.
    String state = "live"; // String | The state of Spaces to search for.
    Integer maxResults = 100; // Integer | The number of results to return.
    Set<String> spaceFields = Arrays.asList(); // Set<String> | A comma separated list of Space fields to display.
    Set<String> expansions = Arrays.asList(); // Set<String> | A comma separated list of fields to expand.
    Set<String> userFields = Arrays.asList(); // Set<String> | A comma separated list of User fields to display.
    Set<String> topicFields = Arrays.asList(); // Set<String> | A comma separated list of Topic fields to display.
    try {
      Get2SpacesSearchResponse result = apiInstance.searchSpaces(query, state, maxResults, spaceFields, expansions, userFields, topicFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SpacesApi#searchSpaces");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **query** | **String**| The search query. | |
| **state** | **String**| The state of Spaces to search for. | [optional] [default to all] [enum: live, scheduled, all] |
| **maxResults** | **Integer**| The number of results to return. | [optional] [default to 100] |
| **spaceFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Space fields to display. | [optional] [enum: created_at, creator_id, ended_at, host_ids, id, invited_user_ids, is_ticketed, lang, participant_count, scheduled_start, speaker_ids, started_at, state, subscriber_count, title, topic_ids, updated_at] |
| **expansions** | [**Set&lt;String&gt;**](String.md)| A comma separated list of fields to expand. | [optional] [enum: creator_id, host_ids, invited_user_ids, speaker_ids, topic_ids] |
| **userFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of User fields to display. | [optional] [enum: created_at, description, entities, id, location, name, pinned_tweet_id, profile_image_url, protected, public_metrics, url, username, verified, withheld] |
| **topicFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Topic fields to display. | [optional] [enum: description, id, name] |

### Return type

[**Get2SpacesSearchResponse**](Get2SpacesSearchResponse.md)

### Authorization

[BearerToken](../README.md#BearerToken), [OAuth2UserToken](../README.md#OAuth2UserToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **0** | The request has failed. |  -  |

<a name="spaceBuyers"></a>
# **spaceBuyers**
> Get2SpacesIdBuyersResponse spaceBuyers(id, paginationToken, maxResults, userFields, expansions, tweetFields)

Retrieve the list of Users who purchased a ticket to the given space

Retrieves the list of Users who purchased a ticket to the given space

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SpacesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.twitter.com");
    
    // Configure OAuth2 access token for authorization: OAuth2UserToken
    OAuth OAuth2UserToken = (OAuth) defaultClient.getAuthentication("OAuth2UserToken");
    OAuth2UserToken.setAccessToken("YOUR ACCESS TOKEN");

    SpacesApi apiInstance = new SpacesApi(defaultClient);
    String id = "1SLjjRYNejbKM"; // String | The ID of the Space to be retrieved.
    String paginationToken = "paginationToken_example"; // String | This parameter is used to get a specified 'page' of results.
    Integer maxResults = 100; // Integer | The maximum number of results.
    Set<String> userFields = Arrays.asList(); // Set<String> | A comma separated list of User fields to display.
    Set<String> expansions = Arrays.asList(); // Set<String> | A comma separated list of fields to expand.
    Set<String> tweetFields = Arrays.asList(); // Set<String> | A comma separated list of Tweet fields to display.
    try {
      Get2SpacesIdBuyersResponse result = apiInstance.spaceBuyers(id, paginationToken, maxResults, userFields, expansions, tweetFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SpacesApi#spaceBuyers");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| The ID of the Space to be retrieved. | |
| **paginationToken** | **String**| This parameter is used to get a specified &#39;page&#39; of results. | [optional] |
| **maxResults** | **Integer**| The maximum number of results. | [optional] [default to 100] |
| **userFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of User fields to display. | [optional] [enum: created_at, description, entities, id, location, name, pinned_tweet_id, profile_image_url, protected, public_metrics, url, username, verified, withheld] |
| **expansions** | [**Set&lt;String&gt;**](String.md)| A comma separated list of fields to expand. | [optional] [enum: pinned_tweet_id] |
| **tweetFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Tweet fields to display. | [optional] [enum: attachments, author_id, context_annotations, conversation_id, created_at, edit_controls, edit_history_tweet_ids, entities, geo, id, in_reply_to_user_id, lang, non_public_metrics, organic_metrics, possibly_sensitive, promoted_metrics, public_metrics, referenced_tweets, reply_settings, source, text, withheld] |

### Return type

[**Get2SpacesIdBuyersResponse**](Get2SpacesIdBuyersResponse.md)

### Authorization

[OAuth2UserToken](../README.md#OAuth2UserToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **0** | The request has failed. |  -  |

<a name="spaceTweets"></a>
# **spaceTweets**
> Get2SpacesIdTweetsResponse spaceTweets(id, maxResults, tweetFields, expansions, mediaFields, pollFields, userFields, placeFields)

Retrieve Tweets from a Space.

Retrieves Tweets shared in the specified Space.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SpacesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.twitter.com");
    
    // Configure HTTP bearer authorization: BearerToken
    HttpBearerAuth BearerToken = (HttpBearerAuth) defaultClient.getAuthentication("BearerToken");
    BearerToken.setBearerToken("BEARER TOKEN");

    // Configure OAuth2 access token for authorization: OAuth2UserToken
    OAuth OAuth2UserToken = (OAuth) defaultClient.getAuthentication("OAuth2UserToken");
    OAuth2UserToken.setAccessToken("YOUR ACCESS TOKEN");

    SpacesApi apiInstance = new SpacesApi(defaultClient);
    String id = "1SLjjRYNejbKM"; // String | The ID of the Space to be retrieved.
    Integer maxResults = 100; // Integer | The number of Tweets to fetch from the provided space. If not provided, the value will default to the maximum of 100.
    Set<String> tweetFields = Arrays.asList(); // Set<String> | A comma separated list of Tweet fields to display.
    Set<String> expansions = Arrays.asList(); // Set<String> | A comma separated list of fields to expand.
    Set<String> mediaFields = Arrays.asList(); // Set<String> | A comma separated list of Media fields to display.
    Set<String> pollFields = Arrays.asList(); // Set<String> | A comma separated list of Poll fields to display.
    Set<String> userFields = Arrays.asList(); // Set<String> | A comma separated list of User fields to display.
    Set<String> placeFields = Arrays.asList(); // Set<String> | A comma separated list of Place fields to display.
    try {
      Get2SpacesIdTweetsResponse result = apiInstance.spaceTweets(id, maxResults, tweetFields, expansions, mediaFields, pollFields, userFields, placeFields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SpacesApi#spaceTweets");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| The ID of the Space to be retrieved. | |
| **maxResults** | **Integer**| The number of Tweets to fetch from the provided space. If not provided, the value will default to the maximum of 100. | [optional] [default to 100] |
| **tweetFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Tweet fields to display. | [optional] [enum: attachments, author_id, context_annotations, conversation_id, created_at, edit_controls, edit_history_tweet_ids, entities, geo, id, in_reply_to_user_id, lang, non_public_metrics, organic_metrics, possibly_sensitive, promoted_metrics, public_metrics, referenced_tweets, reply_settings, source, text, withheld] |
| **expansions** | [**Set&lt;String&gt;**](String.md)| A comma separated list of fields to expand. | [optional] [enum: attachments.media_keys, attachments.poll_ids, author_id, edit_history_tweet_ids, entities.mentions.username, geo.place_id, in_reply_to_user_id, referenced_tweets.id, referenced_tweets.id.author_id] |
| **mediaFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Media fields to display. | [optional] [enum: alt_text, duration_ms, height, media_key, non_public_metrics, organic_metrics, preview_image_url, promoted_metrics, public_metrics, type, url, variants, width] |
| **pollFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Poll fields to display. | [optional] [enum: duration_minutes, end_datetime, id, options, voting_status] |
| **userFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of User fields to display. | [optional] [enum: created_at, description, entities, id, location, name, pinned_tweet_id, profile_image_url, protected, public_metrics, url, username, verified, withheld] |
| **placeFields** | [**Set&lt;String&gt;**](String.md)| A comma separated list of Place fields to display. | [optional] [enum: contained_within, country, country_code, full_name, geo, id, name, place_type] |

### Return type

[**Get2SpacesIdTweetsResponse**](Get2SpacesIdTweetsResponse.md)

### Authorization

[BearerToken](../README.md#BearerToken), [OAuth2UserToken](../README.md#OAuth2UserToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **0** | The request has failed. |  -  |


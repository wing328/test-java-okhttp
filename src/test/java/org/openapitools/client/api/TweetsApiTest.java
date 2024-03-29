/*
 * Twitter API v2
 * Twitter API v2 available endpoints
 *
 * The version of the OpenAPI document: 2.54
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.model.AddOrDeleteRulesRequest;
import org.openapitools.client.model.AddOrDeleteRulesResponse;
import org.openapitools.client.model.Error;
import org.openapitools.client.model.FilteredStreamingTweetResponse;
import org.openapitools.client.model.Get2ListsIdTweetsResponse;
import org.openapitools.client.model.Get2SpacesIdBuyersResponse;
import org.openapitools.client.model.Get2SpacesIdTweetsResponse;
import org.openapitools.client.model.Get2TweetsCountsAllResponse;
import org.openapitools.client.model.Get2TweetsCountsRecentResponse;
import org.openapitools.client.model.Get2TweetsIdQuoteTweetsResponse;
import org.openapitools.client.model.Get2TweetsIdResponse;
import org.openapitools.client.model.Get2TweetsResponse;
import org.openapitools.client.model.Get2TweetsSample10StreamResponse;
import org.openapitools.client.model.Get2TweetsSearchAllResponse;
import org.openapitools.client.model.Get2TweetsSearchRecentResponse;
import org.openapitools.client.model.Get2UsersIdLikedTweetsResponse;
import org.openapitools.client.model.Get2UsersIdMentionsResponse;
import org.openapitools.client.model.Get2UsersIdTimelinesReverseChronologicalResponse;
import org.openapitools.client.model.Get2UsersIdTweetsResponse;
import java.time.OffsetDateTime;
import org.openapitools.client.model.Problem;
import org.openapitools.client.model.RulesLookupResponse;
import java.util.Set;
import org.openapitools.client.model.StreamingTweetResponse;
import org.openapitools.client.model.TweetCreateRequest;
import org.openapitools.client.model.TweetCreateResponse;
import org.openapitools.client.model.TweetDeleteResponse;
import org.openapitools.client.model.TweetHideRequest;
import org.openapitools.client.model.TweetHideResponse;
import org.openapitools.client.model.UsersLikesCreateRequest;
import org.openapitools.client.model.UsersLikesCreateResponse;
import org.openapitools.client.model.UsersLikesDeleteResponse;
import org.openapitools.client.model.UsersRetweetsCreateRequest;
import org.openapitools.client.model.UsersRetweetsCreateResponse;
import org.openapitools.client.model.UsersRetweetsDeleteResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TweetsApi
 */
@Disabled
public class TweetsApiTest {

    private final TweetsApi api = new TweetsApi();

    /**
     * Add/Delete rules
     *
     * Add or delete rules from a User&#39;s active rule set. Users can provide unique, optionally tagged rules to add. Users can delete their entire rule set or a subset specified by rule ids or values.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addOrDeleteRulesTest() throws ApiException {
        AddOrDeleteRulesRequest addOrDeleteRulesRequest = null;
        Boolean dryRun = null;
        AddOrDeleteRulesResponse response = api.addOrDeleteRules(addOrDeleteRulesRequest, dryRun);
        // TODO: test validations
    }

    /**
     * Creation of a Tweet
     *
     * Causes the User to create a Tweet under the authorized account.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createTweetTest() throws ApiException {
        TweetCreateRequest tweetCreateRequest = null;
        TweetCreateResponse response = api.createTweet(tweetCreateRequest);
        // TODO: test validations
    }

    /**
     * Tweet delete by Tweet ID
     *
     * Delete specified Tweet (in the path) by ID.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteTweetByIdTest() throws ApiException {
        String id = null;
        TweetDeleteResponse response = api.deleteTweetById(id);
        // TODO: test validations
    }

    /**
     * Tweet lookup by Tweet ID
     *
     * Returns a variety of information about the Tweet specified by the requested ID.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void findTweetByIdTest() throws ApiException {
        String id = null;
        Set<String> tweetFields = null;
        Set<String> expansions = null;
        Set<String> mediaFields = null;
        Set<String> pollFields = null;
        Set<String> userFields = null;
        Set<String> placeFields = null;
        Get2TweetsIdResponse response = api.findTweetById(id, tweetFields, expansions, mediaFields, pollFields, userFields, placeFields);
        // TODO: test validations
    }

    /**
     * Tweet lookup by Tweet IDs
     *
     * Returns a variety of information about the Tweet specified by the requested ID.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void findTweetsByIdTest() throws ApiException {
        List<String> ids = null;
        Set<String> tweetFields = null;
        Set<String> expansions = null;
        Set<String> mediaFields = null;
        Set<String> pollFields = null;
        Set<String> userFields = null;
        Set<String> placeFields = null;
        Get2TweetsResponse response = api.findTweetsById(ids, tweetFields, expansions, mediaFields, pollFields, userFields, placeFields);
        // TODO: test validations
    }

    /**
     * Retrieve Tweets that quote a Tweet.
     *
     * Returns a variety of information about each Tweet that quotes the Tweet specified by the requested ID.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void findTweetsThatQuoteATweetTest() throws ApiException {
        String id = null;
        Integer maxResults = null;
        String paginationToken = null;
        Set<String> exclude = null;
        Set<String> tweetFields = null;
        Set<String> expansions = null;
        Set<String> mediaFields = null;
        Set<String> pollFields = null;
        Set<String> userFields = null;
        Set<String> placeFields = null;
        Get2TweetsIdQuoteTweetsResponse response = api.findTweetsThatQuoteATweet(id, maxResults, paginationToken, exclude, tweetFields, expansions, mediaFields, pollFields, userFields, placeFields);
        // TODO: test validations
    }

    /**
     * Rules lookup
     *
     * Returns rules from a User&#39;s active rule set. Users can fetch all of their rules or a subset, specified by the provided rule ids.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getRulesTest() throws ApiException {
        List<String> ids = null;
        Integer maxResults = null;
        String paginationToken = null;
        RulesLookupResponse response = api.getRules(ids, maxResults, paginationToken);
        // TODO: test validations
    }

    /**
     * Firehose stream
     *
     * Streams 100% of public Tweets.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getTweetsFirehoseStreamTest() throws ApiException {
        Integer partition = null;
        Integer backfillMinutes = null;
        OffsetDateTime startTime = null;
        OffsetDateTime endTime = null;
        Set<String> tweetFields = null;
        Set<String> expansions = null;
        Set<String> mediaFields = null;
        Set<String> pollFields = null;
        Set<String> userFields = null;
        Set<String> placeFields = null;
        StreamingTweetResponse response = api.getTweetsFirehoseStream(partition, backfillMinutes, startTime, endTime, tweetFields, expansions, mediaFields, pollFields, userFields, placeFields);
        // TODO: test validations
    }

    /**
     * Sample 10% stream
     *
     * Streams a deterministic 10% of public Tweets.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getTweetsSample10StreamTest() throws ApiException {
        Integer partition = null;
        Integer backfillMinutes = null;
        OffsetDateTime startTime = null;
        OffsetDateTime endTime = null;
        Set<String> tweetFields = null;
        Set<String> expansions = null;
        Set<String> mediaFields = null;
        Set<String> pollFields = null;
        Set<String> userFields = null;
        Set<String> placeFields = null;
        Get2TweetsSample10StreamResponse response = api.getTweetsSample10Stream(partition, backfillMinutes, startTime, endTime, tweetFields, expansions, mediaFields, pollFields, userFields, placeFields);
        // TODO: test validations
    }

    /**
     * Hide replies
     *
     * Hides or unhides a reply to an owned conversation.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void hideReplyByIdTest() throws ApiException {
        String tweetId = null;
        TweetHideRequest tweetHideRequest = null;
        TweetHideResponse response = api.hideReplyById(tweetId, tweetHideRequest);
        // TODO: test validations
    }

    /**
     * List Tweets timeline by List ID.
     *
     * Returns a list of Tweets associated with the provided List ID.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listsIdTweetsTest() throws ApiException {
        String id = null;
        Integer maxResults = null;
        String paginationToken = null;
        Set<String> tweetFields = null;
        Set<String> expansions = null;
        Set<String> mediaFields = null;
        Set<String> pollFields = null;
        Set<String> userFields = null;
        Set<String> placeFields = null;
        Get2ListsIdTweetsResponse response = api.listsIdTweets(id, maxResults, paginationToken, tweetFields, expansions, mediaFields, pollFields, userFields, placeFields);
        // TODO: test validations
    }

    /**
     * Sample stream
     *
     * Streams a deterministic 1% of public Tweets.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void sampleStreamTest() throws ApiException {
        Integer backfillMinutes = null;
        Set<String> tweetFields = null;
        Set<String> expansions = null;
        Set<String> mediaFields = null;
        Set<String> pollFields = null;
        Set<String> userFields = null;
        Set<String> placeFields = null;
        StreamingTweetResponse response = api.sampleStream(backfillMinutes, tweetFields, expansions, mediaFields, pollFields, userFields, placeFields);
        // TODO: test validations
    }

    /**
     * Filtered stream
     *
     * Streams Tweets matching the stream&#39;s active rule set.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void searchStreamTest() throws ApiException {
        Integer backfillMinutes = null;
        OffsetDateTime startTime = null;
        OffsetDateTime endTime = null;
        Set<String> tweetFields = null;
        Set<String> expansions = null;
        Set<String> mediaFields = null;
        Set<String> pollFields = null;
        Set<String> userFields = null;
        Set<String> placeFields = null;
        FilteredStreamingTweetResponse response = api.searchStream(backfillMinutes, startTime, endTime, tweetFields, expansions, mediaFields, pollFields, userFields, placeFields);
        // TODO: test validations
    }

    /**
     * Retrieve the list of Users who purchased a ticket to the given space
     *
     * Retrieves the list of Users who purchased a ticket to the given space
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void spaceBuyersTest() throws ApiException {
        String id = null;
        String paginationToken = null;
        Integer maxResults = null;
        Set<String> userFields = null;
        Set<String> expansions = null;
        Set<String> tweetFields = null;
        Get2SpacesIdBuyersResponse response = api.spaceBuyers(id, paginationToken, maxResults, userFields, expansions, tweetFields);
        // TODO: test validations
    }

    /**
     * Retrieve Tweets from a Space.
     *
     * Retrieves Tweets shared in the specified Space.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void spaceTweetsTest() throws ApiException {
        String id = null;
        Integer maxResults = null;
        Set<String> tweetFields = null;
        Set<String> expansions = null;
        Set<String> mediaFields = null;
        Set<String> pollFields = null;
        Set<String> userFields = null;
        Set<String> placeFields = null;
        Get2SpacesIdTweetsResponse response = api.spaceTweets(id, maxResults, tweetFields, expansions, mediaFields, pollFields, userFields, placeFields);
        // TODO: test validations
    }

    /**
     * Full archive search counts
     *
     * Returns Tweet Counts that match a search query.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void tweetCountsFullArchiveSearchTest() throws ApiException {
        String query = null;
        OffsetDateTime startTime = null;
        OffsetDateTime endTime = null;
        String sinceId = null;
        String untilId = null;
        String nextToken = null;
        String paginationToken = null;
        String granularity = null;
        Set<String> searchCountFields = null;
        Get2TweetsCountsAllResponse response = api.tweetCountsFullArchiveSearch(query, startTime, endTime, sinceId, untilId, nextToken, paginationToken, granularity, searchCountFields);
        // TODO: test validations
    }

    /**
     * Recent search counts
     *
     * Returns Tweet Counts from the last 7 days that match a search query.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void tweetCountsRecentSearchTest() throws ApiException {
        String query = null;
        OffsetDateTime startTime = null;
        OffsetDateTime endTime = null;
        String sinceId = null;
        String untilId = null;
        String nextToken = null;
        String paginationToken = null;
        String granularity = null;
        Set<String> searchCountFields = null;
        Get2TweetsCountsRecentResponse response = api.tweetCountsRecentSearch(query, startTime, endTime, sinceId, untilId, nextToken, paginationToken, granularity, searchCountFields);
        // TODO: test validations
    }

    /**
     * Full-archive search
     *
     * Returns Tweets that match a search query.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void tweetsFullarchiveSearchTest() throws ApiException {
        String query = null;
        OffsetDateTime startTime = null;
        OffsetDateTime endTime = null;
        String sinceId = null;
        String untilId = null;
        Integer maxResults = null;
        String nextToken = null;
        String paginationToken = null;
        String sortOrder = null;
        Set<String> tweetFields = null;
        Set<String> expansions = null;
        Set<String> mediaFields = null;
        Set<String> pollFields = null;
        Set<String> userFields = null;
        Set<String> placeFields = null;
        Get2TweetsSearchAllResponse response = api.tweetsFullarchiveSearch(query, startTime, endTime, sinceId, untilId, maxResults, nextToken, paginationToken, sortOrder, tweetFields, expansions, mediaFields, pollFields, userFields, placeFields);
        // TODO: test validations
    }

    /**
     * Recent search
     *
     * Returns Tweets from the last 7 days that match a search query.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void tweetsRecentSearchTest() throws ApiException {
        String query = null;
        OffsetDateTime startTime = null;
        OffsetDateTime endTime = null;
        String sinceId = null;
        String untilId = null;
        Integer maxResults = null;
        String nextToken = null;
        String paginationToken = null;
        String sortOrder = null;
        Set<String> tweetFields = null;
        Set<String> expansions = null;
        Set<String> mediaFields = null;
        Set<String> pollFields = null;
        Set<String> userFields = null;
        Set<String> placeFields = null;
        Get2TweetsSearchRecentResponse response = api.tweetsRecentSearch(query, startTime, endTime, sinceId, untilId, maxResults, nextToken, paginationToken, sortOrder, tweetFields, expansions, mediaFields, pollFields, userFields, placeFields);
        // TODO: test validations
    }

    /**
     * Causes the User (in the path) to like the specified Tweet
     *
     * Causes the User (in the path) to like the specified Tweet. The User in the path must match the User context authorizing the request.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void usersIdLikeTest() throws ApiException {
        String id = null;
        UsersLikesCreateRequest usersLikesCreateRequest = null;
        UsersLikesCreateResponse response = api.usersIdLike(id, usersLikesCreateRequest);
        // TODO: test validations
    }

    /**
     * Returns Tweet objects liked by the provided User ID
     *
     * Returns a list of Tweets liked by the provided User ID
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void usersIdLikedTweetsTest() throws ApiException {
        String id = null;
        Integer maxResults = null;
        String paginationToken = null;
        Set<String> tweetFields = null;
        Set<String> expansions = null;
        Set<String> mediaFields = null;
        Set<String> pollFields = null;
        Set<String> userFields = null;
        Set<String> placeFields = null;
        Get2UsersIdLikedTweetsResponse response = api.usersIdLikedTweets(id, maxResults, paginationToken, tweetFields, expansions, mediaFields, pollFields, userFields, placeFields);
        // TODO: test validations
    }

    /**
     * User mention timeline by User ID
     *
     * Returns Tweet objects that mention username associated to the provided User ID
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void usersIdMentionsTest() throws ApiException {
        String id = null;
        String sinceId = null;
        String untilId = null;
        Integer maxResults = null;
        String paginationToken = null;
        OffsetDateTime startTime = null;
        OffsetDateTime endTime = null;
        Set<String> tweetFields = null;
        Set<String> expansions = null;
        Set<String> mediaFields = null;
        Set<String> pollFields = null;
        Set<String> userFields = null;
        Set<String> placeFields = null;
        Get2UsersIdMentionsResponse response = api.usersIdMentions(id, sinceId, untilId, maxResults, paginationToken, startTime, endTime, tweetFields, expansions, mediaFields, pollFields, userFields, placeFields);
        // TODO: test validations
    }

    /**
     * Causes the User (in the path) to retweet the specified Tweet.
     *
     * Causes the User (in the path) to retweet the specified Tweet. The User in the path must match the User context authorizing the request.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void usersIdRetweetsTest() throws ApiException {
        String id = null;
        UsersRetweetsCreateRequest usersRetweetsCreateRequest = null;
        UsersRetweetsCreateResponse response = api.usersIdRetweets(id, usersRetweetsCreateRequest);
        // TODO: test validations
    }

    /**
     * User home timeline by User ID
     *
     * Returns Tweet objects that appears in the provided User ID&#39;s home timeline
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void usersIdTimelineTest() throws ApiException {
        String id = null;
        String sinceId = null;
        String untilId = null;
        Integer maxResults = null;
        String paginationToken = null;
        Set<String> exclude = null;
        OffsetDateTime startTime = null;
        OffsetDateTime endTime = null;
        Set<String> tweetFields = null;
        Set<String> expansions = null;
        Set<String> mediaFields = null;
        Set<String> pollFields = null;
        Set<String> userFields = null;
        Set<String> placeFields = null;
        Get2UsersIdTimelinesReverseChronologicalResponse response = api.usersIdTimeline(id, sinceId, untilId, maxResults, paginationToken, exclude, startTime, endTime, tweetFields, expansions, mediaFields, pollFields, userFields, placeFields);
        // TODO: test validations
    }

    /**
     * User Tweets timeline by User ID
     *
     * Returns a list of Tweets authored by the provided User ID
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void usersIdTweetsTest() throws ApiException {
        String id = null;
        String sinceId = null;
        String untilId = null;
        Integer maxResults = null;
        String paginationToken = null;
        Set<String> exclude = null;
        OffsetDateTime startTime = null;
        OffsetDateTime endTime = null;
        Set<String> tweetFields = null;
        Set<String> expansions = null;
        Set<String> mediaFields = null;
        Set<String> pollFields = null;
        Set<String> userFields = null;
        Set<String> placeFields = null;
        Get2UsersIdTweetsResponse response = api.usersIdTweets(id, sinceId, untilId, maxResults, paginationToken, exclude, startTime, endTime, tweetFields, expansions, mediaFields, pollFields, userFields, placeFields);
        // TODO: test validations
    }

    /**
     * Causes the User (in the path) to unlike the specified Tweet
     *
     * Causes the User (in the path) to unlike the specified Tweet. The User must match the User context authorizing the request
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void usersIdUnlikeTest() throws ApiException {
        String id = null;
        String tweetId = null;
        UsersLikesDeleteResponse response = api.usersIdUnlike(id, tweetId);
        // TODO: test validations
    }

    /**
     * Causes the User (in the path) to unretweet the specified Tweet
     *
     * Causes the User (in the path) to unretweet the specified Tweet. The User must match the User context authorizing the request
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void usersIdUnretweetsTest() throws ApiException {
        String id = null;
        String sourceTweetId = null;
        UsersRetweetsDeleteResponse response = api.usersIdUnretweets(id, sourceTweetId);
        // TODO: test validations
    }

}

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
import org.openapitools.client.model.CreateComplianceJobRequest;
import org.openapitools.client.model.CreateComplianceJobResponse;
import org.openapitools.client.model.Error;
import org.openapitools.client.model.Get2ComplianceJobsIdResponse;
import org.openapitools.client.model.Get2ComplianceJobsResponse;
import java.time.OffsetDateTime;
import org.openapitools.client.model.Problem;
import java.util.Set;
import org.openapitools.client.model.TweetComplianceStreamResponse;
import org.openapitools.client.model.TweetLabelStreamResponse;
import org.openapitools.client.model.UserComplianceStreamResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ComplianceApi
 */
@Disabled
public class ComplianceApiTest {

    private final ComplianceApi api = new ComplianceApi();

    /**
     * Create compliance job
     *
     * Creates a compliance for the given job type
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createBatchComplianceJobTest() throws ApiException {
        CreateComplianceJobRequest createComplianceJobRequest = null;
        CreateComplianceJobResponse response = api.createBatchComplianceJob(createComplianceJobRequest);
        // TODO: test validations
    }

    /**
     * Get Compliance Job
     *
     * Returns a single Compliance Job by ID
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getBatchComplianceJobTest() throws ApiException {
        String id = null;
        Set<String> complianceJobFields = null;
        Get2ComplianceJobsIdResponse response = api.getBatchComplianceJob(id, complianceJobFields);
        // TODO: test validations
    }

    /**
     * Tweets Compliance stream
     *
     * Streams 100% of compliance data for Tweets
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getTweetsComplianceStreamTest() throws ApiException {
        Integer partition = null;
        Integer backfillMinutes = null;
        OffsetDateTime startTime = null;
        OffsetDateTime endTime = null;
        TweetComplianceStreamResponse response = api.getTweetsComplianceStream(partition, backfillMinutes, startTime, endTime);
        // TODO: test validations
    }

    /**
     * Tweets Label stream
     *
     * Streams 100% of labeling events applied to Tweets
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getTweetsLabelStreamTest() throws ApiException {
        Integer backfillMinutes = null;
        OffsetDateTime startTime = null;
        OffsetDateTime endTime = null;
        TweetLabelStreamResponse response = api.getTweetsLabelStream(backfillMinutes, startTime, endTime);
        // TODO: test validations
    }

    /**
     * Users Compliance stream
     *
     * Streams 100% of compliance data for Users
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getUsersComplianceStreamTest() throws ApiException {
        Integer partition = null;
        Integer backfillMinutes = null;
        OffsetDateTime startTime = null;
        OffsetDateTime endTime = null;
        UserComplianceStreamResponse response = api.getUsersComplianceStream(partition, backfillMinutes, startTime, endTime);
        // TODO: test validations
    }

    /**
     * List Compliance Jobs
     *
     * Returns recent Compliance Jobs for a given job type and optional job status
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listBatchComplianceJobsTest() throws ApiException {
        String type = null;
        String status = null;
        Set<String> complianceJobFields = null;
        Get2ComplianceJobsResponse response = api.listBatchComplianceJobs(type, status, complianceJobFields);
        // TODO: test validations
    }

}
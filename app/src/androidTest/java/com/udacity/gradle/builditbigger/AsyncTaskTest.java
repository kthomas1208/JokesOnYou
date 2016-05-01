package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.test.AndroidTestCase;

import org.mockito.Mock;

import java.util.concurrent.TimeUnit;

/**
 * Connected Test to check functionality of the AsyncTaskTest
 */
public class AsyncTaskTest extends AndroidTestCase {

    EndpointsAsyncTask mTask;
    String mResult;
    @Mock
    Context mMockContext;

    public AsyncTaskTest() {}

    @Override
    protected void setUp() throws Exception {
        super.setUp();

        mResult = null;
        mTask = new EndpointsAsyncTask() {
            @Override
            protected void onPostExecute(String result) {
                // Do nothing. Don't launch activity.
            }
        };
    }

    public void testAsyncTask() {
        try {
            mTask.execute(mMockContext);
            mResult = mTask.get(30, TimeUnit.SECONDS);
            assertNotNull(mResult);
        } catch (Exception e){
            fail("Test timed out");
        }
    }
}
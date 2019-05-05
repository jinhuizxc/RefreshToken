package com.example.refreshtoken.net;


public class RetrofitHelper {

    private static IdeaApiService mIdeaApiService;

    public static IdeaApiService getApiService() {
        if (mIdeaApiService == null)
            mIdeaApiService = IdeaApi.getApiService(IdeaApiService.class, Constants.API_SERVER_URL);
        return mIdeaApiService;
    }
}

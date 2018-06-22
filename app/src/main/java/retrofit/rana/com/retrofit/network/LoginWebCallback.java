package retrofit.rana.com.retrofit.network;

import android.util.Log;

import org.jetbrains.annotations.Nullable;

import retrofit.rana.com.retrofit.core.network.NetWorkResponseCallBack;
import retrofit2.Call;
import retrofit2.Response;

public class LoginWebCallback extends NetWorkResponseCallBack<UserSessions> {

    @Override
    public void onFailure(@Nullable Call<UserSessions> call, @Nullable Throwable t) {
        super.onFailure(call, t);
    }

    @Override
    public void onResponse(@Nullable Call<UserSessions> call, @Nullable Response<UserSessions> response) {
        super.onResponse(call, response);

        Log.v("Response info is ","--->"+response.body().getToken());
    }
}

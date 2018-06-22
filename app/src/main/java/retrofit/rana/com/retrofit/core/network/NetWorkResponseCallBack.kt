package retrofit.rana.com.retrofit.core.network

import android.util.Log
import retrofit.rana.com.retrofit.network.UserSessions
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

abstract class NetWorkResponseCallBack<T>: Callback<T> {

    override fun onFailure(call: Call<T>?, t: Throwable?) {
        // let's plan for the failure case model
    }

    override fun onResponse(call: Call<T>?, response: Response<T>?) {


        Log.v("Response info is ","---> TESTING"+response!!.errorBody());
        if(response!!.isSuccessful){

            Log.v("Response info is ","--->"+response.body());

        }
    }
}
package retrofit.rana.com.retrofit.network;

import java.util.HashMap;

import okhttp3.ResponseBody;
import retrofit.rana.com.retrofit.home.modle.UserLoginDetails;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;

/**
 * Created by Rana Prathap on 3/15/2018.
 */

public interface ApiInterface {
    @Headers("Content-Type: application/json")
    @POST("/api/login")
    Call<UserSessions> loginUser(@Header("Content-Type") String content_type,@Body HashMap<String,Object> loginDetails);

}

package retrofit.rana.com.retrofit.network;

import retrofit2.Call;
import retrofit2.http.POST;

/**
 * Created by Rana Prathap on 3/15/2018.
 */

public interface ApiInterface {
    @POST("/api/login")
    Call<UserSessions> loginUser();
}

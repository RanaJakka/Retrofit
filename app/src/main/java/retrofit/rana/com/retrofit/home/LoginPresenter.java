package retrofit.rana.com.retrofit.home;

import java.util.HashMap;

import okhttp3.ResponseBody;
import retrofit.rana.com.retrofit.core.network.NetWorkResponseCallBack;
import retrofit.rana.com.retrofit.home.modle.UserLoginDetails;
import retrofit.rana.com.retrofit.network.ApiInterface;
import retrofit.rana.com.retrofit.network.DataRepository;
import retrofit.rana.com.retrofit.network.LoginWebCallback;
import retrofit.rana.com.retrofit.network.NetworkApiClient;
import retrofit.rana.com.retrofit.network.UserSessions;
import retrofit2.Retrofit;

/**
 * Created by Rana Prathap on 3/29/2018.
 */

public class LoginPresenter implements LoginContractor.Presenter {
    LoginContractor.View loginView;
    DataRepository dataRepositoryInfo;

    LoginPresenter(LoginContractor.View loginView){
        this.loginView=loginView;
       // this.dataRepositoryInfo=dataRepository;

    }


    @Override
    public boolean checkValidEmail(String emailId) {
        return false;
    }

    @Override
    public boolean checkValidPassword(String password) {
        return false;
    }

    @Override
    public void doLogin(UserLoginDetails usreLoginDetails) {
        // here where network call calls.
        loginView.showProgress(true);
        HashMap<String,Object>params=new HashMap<>();
        params.put("email","RANA@klaven");
        params.put("password","JAKKA");
        NetworkApiClient.getNetworkClient().create(ApiInterface.class).loginUser("application/json", params).enqueue(new LoginWebCallback() {
        });



    }


    @Override
    public String getUserSessions() {
        return null;
    }
}

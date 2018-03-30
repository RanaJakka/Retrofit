package retrofit.rana.com.retrofit.home;

import retrofit.rana.com.retrofit.LoginContractor;
import retrofit.rana.com.retrofit.network.DataRepository;

/**
 * Created by Rana Prathap on 3/29/2018.
 */

public class LoginPresenter implements LoginContractor.Presenter {
    LoginContractor.View loginView;
    DataRepository dataRepositoryInfo;

    LoginPresenter(LoginContractor.View loginView,DataRepository dataRepository){
        this.loginView=loginView;
        this.dataRepositoryInfo=dataRepository;

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
    public void doLogin(String email, String password) {

    }

    @Override
    public String getUserSessions() {
        return null;
    }
}

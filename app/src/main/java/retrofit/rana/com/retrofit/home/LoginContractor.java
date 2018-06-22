package retrofit.rana.com.retrofit.home;

import retrofit.rana.com.retrofit.home.modle.UserLoginDetails;
import retrofit.rana.com.retrofit.network.DataRepository;
import retrofit.rana.com.retrofit.network.EnvironmentConstants;

import static retrofit.rana.com.retrofit.network.EnvironmentConstants.*;

/**
 * Created by Rana Prathap on 3/15/2018.
 */

public interface LoginContractor {

    public interface View
    {
        void showProgress(boolean showFlag);
        void ShowErrorDialog(String error);
        void emailError(String emailError);
        void passWordError(String passwordError);
        void onSuccessLogin();
        void onFailureLogin();
        boolean saveUserSession(String userSession);
        boolean checkLocalLogin(String UserSession);

    }

    public interface Presenter
    {

        boolean checkValidEmail(String emailId);
        boolean checkValidPassword(String password);
        void doLogin(UserLoginDetails usreLoginDetails);
        String getUserSessions();


    }
}

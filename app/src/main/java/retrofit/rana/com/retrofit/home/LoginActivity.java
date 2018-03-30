package retrofit.rana.com.retrofit.home;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;

import retrofit.rana.com.retrofit.LoginContractor;
import retrofit.rana.com.retrofit.R;

/**
 * Created by Rana Prathap on 3/29/2018.
 */

public class LoginActivity extends AppCompatActivity implements LoginContractor.View {
    EditText loginEditUser,loginEditPassword;
    Button loginButtonLogin;
    LoginPresenter loginPresenter;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        loginEditUser=findViewById(R.id.loginEditUser);
        loginEditPassword=findViewById(R.id.loginEditPassword);
        loginButtonLogin=findViewById(R.id.loginButtonLogin);
        loginPresenter=new LoginPresenter();


    }

    @Override
    public void showProgress(boolean showFlag) {

    }

    @Override
    public void ShowErrorDialog(String error) {

    }

    @Override
    public void emailError(String emailError) {

    }

    @Override
    public void passWordError(String passwordError) {

    }

    @Override
    public void onSuccessLogin() {

    }

    @Override
    public void onFailureLogin() {

    }

    @Override
    public boolean saveUserSession(String userSession) {
        return false;
    }

    @Override
    public boolean checkLocalLogin(String UserSession) {
        return false;
    }
}

package retrofit.rana.com.retrofit.home;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;

import retrofit.rana.com.retrofit.R;
import retrofit.rana.com.retrofit.home.modle.UserLoginDetails;

/**
 * Created by Rana Prathap on 3/29/2018.
 */

public class LoginActivity extends AppCompatActivity implements LoginContractor.View {
    EditText loginEditUser,loginEditPassword;
    Button loginButtonLogin;
    LoginPresenter loginPresenter;
    ProgressBar loadingBar;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);
        loginEditUser=findViewById(R.id.loginEditUser);
        loginEditPassword=findViewById(R.id.loginEditPassword);
        loginButtonLogin=findViewById(R.id.loginButtonLogin);
        loginPresenter=new LoginPresenter(this);
        loadingBar=findViewById(R.id.progress_bar_status);

        loginButtonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                UserLoginDetails userLoginDetails=new UserLoginDetails();
                userLoginDetails.setEmail("peter@klaven");
                userLoginDetails.setPassword("cityslicka");
                loginPresenter.doLogin(new UserLoginDetails());
            }
        });



    }

    @Override
    public void showProgress(boolean showFlag) {
        if(showFlag)
            loadingBar.setVisibility(View.VISIBLE);
        else
            loadingBar.setVisibility(View.GONE);

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

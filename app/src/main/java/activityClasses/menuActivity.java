package activityClasses;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageInstaller;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.media.tv.TvInputService;
import android.os.Bundle;
import android.service.textservice.SpellCheckerService;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.application.R;

/**
 * Created by Kiran on 17-12-2015.
 */
public class menuActivity extends Activity implements View.OnClickListener {
    RelativeLayout rlProfile, rlChangPassword, rlAbout;
    Button bvLogout;
    TextView text1, tvUserName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_menuitems);
        WindowManager.LayoutParams params = getWindow().getAttributes();
        params.height = ViewGroup.LayoutParams.MATCH_PARENT;
        this.getWindow().setAttributes(params);
        this.getWindow().setGravity(Gravity.RIGHT);
        this.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        init();
        onClickListener();
    }

    private void onClickListener() {
        rlProfile.setOnClickListener(this);
        rlChangPassword.setOnClickListener(this);
        rlAbout.setOnClickListener(this);
        bvLogout.setOnClickListener(this);
    }

    private void init() {
        rlProfile = (RelativeLayout) findViewById(R.id.rl_profile);
        rlAbout = (RelativeLayout) findViewById(R.id.rl_about);
        rlChangPassword = (RelativeLayout) findViewById(R.id.rl_change_password);
        bvLogout = (Button) findViewById(R.id.bv_logout);
        text1 = (TextView) findViewById(R.id.tv_profile);
        tvUserName = (TextView) findViewById(R.id.tv_user_name);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.rl_profile:
                Toast.makeText(getApplicationContext(), "profile you clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.rl_change_password:
                Toast.makeText(getApplicationContext(), "change password you clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.rl_about:
                Toast.makeText(getApplicationContext(), "about you clicked", Toast.LENGTH_SHORT).show(); break;
            case R.id.bv_logout:
                Toast.makeText(getApplicationContext(), "values should be clear", Toast.LENGTH_SHORT).show();


//                startActivity(new Intent(getApplicationContext(),my.class).setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP));
                break;
        }

    }

}


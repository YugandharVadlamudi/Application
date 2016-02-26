package activityClasses;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.application.R;

/**
 * Created by Kiran on 17-12-2015.
 */
public class HomeActivity extends Activity  implements View.OnClickListener{
    ImageView imageView;
    RelativeLayout rv;
    Dialog dialog;
    RelativeLayout rlProfile,rlChangPassword,rlAbout;

TextView tv_profile,tv_change_password,tv_about;
    Button bv_logout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slide_menu);
        init();
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                menuOnclickAttach();
            }
        });
    }

    private void menuOnclickAttach() {
        dialog = new Dialog(HomeActivity.this);
        dialog.requestWindowFeature(dialog.getWindow().FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.activity_menuitems);
        dialog.setCancelable(true);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.getWindow().setGravity(Gravity.RIGHT);
        dialog.getWindow().getAttributes().windowAnimations = R.style.dialog_animation;
        dialog.getWindow().getAttributes().height = ViewGroup.LayoutParams.MATCH_PARENT;
        dialog.show();
        dialogInitilization();

    }

    private void dialogInitilization() {
        rlProfile=(RelativeLayout)dialog.findViewById(R.id.rl_profile);
        rlAbout=(RelativeLayout)dialog.findViewById(R.id.rl_about);
        rlChangPassword=(RelativeLayout)dialog.findViewById(R.id.rl_change_password);
        bv_logout=(Button)dialog.findViewById(R.id.bv_logout);
        rlProfile.setOnClickListener(this);
        rlAbout.setOnClickListener(this);
        rlChangPassword.setOnClickListener(this);
        bv_logout.setOnClickListener(this);

    }
    //region Description
    private void init() {
        imageView = (ImageView) findViewById(R.id.iv_menu);
    }
    //endregion

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.rl_profile:
//                startActivity(new Intent(getApplicationContext(),profile.class));
                        Toast.makeText(getApplicationContext(), "profile you clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.rl_change_password:
//                startActivity(new Intent(getApplicationContext(),changepassword.class));
                Toast.makeText(getApplicationContext(),"change password you clicked",Toast.LENGTH_SHORT).show();
                break;
            case R.id.rl_about:
//                startActivity(new Intent(getApplicationContext(),About.class));
                Toast.makeText(getApplicationContext(),"about you clicked",Toast.LENGTH_SHORT).show();
                break;
            case R.id.bv_logout:
//                startActivity(new Intent(getApplicationContext(),signActivity.class));
                Toast.makeText(getApplicationContext(),"values should be clear",Toast.LENGTH_SHORT).show();
                break;
        }
    }
}

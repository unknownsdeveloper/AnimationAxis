package ankit.developer.unknowns.animationaxis;

import android.animation.ObjectAnimator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    Button btnX, btnY;
    RelativeLayout wrapper;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnX = (Button) findViewById(R.id.btnX);
        btnY = (Button) findViewById(R.id.btnY);
        imageView = (ImageView) findViewById(R.id.imageView);
        wrapper = (RelativeLayout) findViewById(R.id.wrapper);

        btnX.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int screenWidth = wrapper.getWidth();
                int targetX = screenWidth - imageView.getWidth();
                ObjectAnimator anim = ObjectAnimator.ofFloat(imageView, "x", 0, targetX).setDuration(300);
                anim.start();
            }
        });


        btnY.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int screenHeight = wrapper.getHeight();
                int targetY = screenHeight - imageView.getHeight();
                ObjectAnimator anim = ObjectAnimator.ofFloat(imageView, "y", 0, targetY).setDuration(300);
                anim.start();
            }
        });

    }
}

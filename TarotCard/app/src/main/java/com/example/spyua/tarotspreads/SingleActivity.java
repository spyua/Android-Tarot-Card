package com.example.spyua.tarotspreads;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

/**
 * Created by spyua on 2016/9/9.
 */
public class SingleActivity extends Activity {
    Button btn_shuffle,btn_draw;
    ImageView tarlot_img;
    TextView result_txt;
    final int draw_switch_on=0;
    final int draw_swtich_off=1;
    int draw_switch;
    private int[] image;
    private String[] imgText;
    Toast toast;
    View toastView;
    private int inverse_positive;
    final int positive=0;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.single_layout);
        init();


        btn_draw.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                btn_draw.setEnabled(false);
                if(draw_switch==draw_switch_on){
                    draw_switch=draw_swtich_off;
                    final ProgressDialog progressDialog = new ProgressDialog(SingleActivity.this,
                            R.style.StyledDialog2);
                    progressDialog.setIndeterminate(true);
                    progressDialog.setMessage("Drawing.........");
                    progressDialog.show();
                    draw_card();
                    new Handler().postDelayed(
                            new Runnable() {
                                public void run() {
                                    progressDialog.dismiss();
                                    card_display();

                                }
                            }, 3000);
                }
                else{
                    toast = Toast.makeText(SingleActivity.this,"Pls Shuffle",Toast.LENGTH_SHORT);
                    toastView = toast.getView();
                    toastView.setBackgroundResource(R.drawable.toast_message_style);
                    toast.show();
                }
                btn_draw.setEnabled(true);
            }
        });
        btn_shuffle.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {

                btn_shuffle.setEnabled(false);
                final ProgressDialog progressDialog = new ProgressDialog(SingleActivity.this,
                        R.style.StyledDialog2);
                progressDialog.setIndeterminate(true);
                progressDialog.setMessage("Shuffling.........");
                progressDialog.show();
                draw_switch=draw_switch_on;
                card_position_recorver();
                shuffle();
                shuffle();
                new Handler().postDelayed(
                        new Runnable() {
                            public void run() {
                                progressDialog.dismiss();
                                toast = Toast.makeText(SingleActivity.this,"Finish",Toast.LENGTH_SHORT);
                                toastView = toast.getView();
                                toastView.setBackgroundResource(R.drawable.toast_message_style);
                                toast.show();
                            }
                        }, 3000);
                btn_shuffle.setEnabled(true);
            }
        });
    }
    private void card_display(){
        if(inverse_positive==positive){
            tarlot_img.setImageResource(image[0]);
            result_txt.setText(imgText[0]);
        }
        else{
            tarlot_img.setImageResource(image[0]);
            tarlot_img.setRotation(180);
            result_txt.setText(imgText[0]);
        }
    }

    private void card_position_recorver(){
        tarlot_img.setRotation(0);
        tarlot_img.setImageResource(R.drawable.tarot_back0);
        result_txt.setText("");
    }

    //取牌
    private void draw_card(){
                //正反
                Random rand = new Random();
                int n1 = rand.nextInt(1000)%2;
                inverse_positive=n1;
    }

    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if ((keyCode == KeyEvent.KEYCODE_BACK)) {
            releaseBitmap();
            System.gc();
            finish();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }

    public void releaseBitmap() {
        if (tarlot_img != null) {
            tarlot_img.destroyDrawingCache();
            tarlot_img = null;

        }
    }

    private void init(){
        btn_draw=(Button)findViewById(R.id.btn_draw);
        btn_shuffle=(Button)findViewById(R.id.btn_shullf);
        tarlot_img=(ImageView)findViewById(R.id.tarlot_img1);
        result_txt=(TextView)findViewById(R.id.result_txt);
        TarlotCardsSetting tarlotinit= new TarlotCardsSetting();
        image=tarlotinit.image_set();
        imgText=tarlotinit.string_set();
        tarlot_img.setImageResource(R.drawable.tarot_back0);
        draw_switch=draw_swtich_off;
    }

    private void shuffle(){
        for(int i=0;i<78;i++) {
            Random rand = new Random();
            int n1 = rand.nextInt(78); //0-77 Random generator
            Random rand2 = new Random();
            int n2 = rand2.nextInt(78); //0-245 Random generator

            int temp=image[n1];
            image[n1]= image[n2];
            image[n2]=temp;
            String string_temp= null;
            string_temp=imgText[n1];
            imgText[n1]=imgText[n2];
            imgText[n2]=string_temp;
        }

    }
}

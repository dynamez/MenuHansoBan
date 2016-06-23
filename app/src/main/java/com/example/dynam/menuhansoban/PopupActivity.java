package com.example.dynam.menuhansoban;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.media.audiofx.BassBoost;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.VideoView;

public class PopupActivity extends AppCompatActivity {
//MyMediaController videoController;
String idValue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.newpopup);
        Bundle b = getIntent().getExtras();

        TextView description = (TextView) findViewById(R.id.description);
        TextView name = (TextView) findViewById(R.id.name);
        TextView precio = (TextView) findViewById(R.id.precio);
        ImageView foto = (ImageView) findViewById(R.id.foto);
        TextView koreano = (TextView)findViewById(R.id.koreano);
        String foto2 = b.getString("foto");
        final VideoView video = (VideoView) findViewById(R.id.video);
        description.setText(b.getString("description"));
        name.setText(b.getString("name"));
        koreano.setText(b.getString("koreano"));
        precio.setText(b.getString("precio"));
        String idValue = b.getString("id");
        ImageView boton1 = (ImageView)findViewById(R.id.boton1);

        boton1.setOnClickListener(onClickListener);
        // name.setText(holder.item_text1.getText());
        // description.setText(holder.item_text2.getText());
        // precio.setText(holder.item_text4.getText());

        foto.setImageResource(getResources().getIdentifier(
                "com.example.dynam.menuhansoban:drawable/" +foto2+"_popup"
                , null, null));
        Uri path = Uri.parse("android.resource://com.example.dynam.menuhansoban/"
                + R.raw.producto3);
        //AMPLIACIÓN
        video.setVideoURI(path);
        final MyMediaController videoController = new MyMediaController(this, (FrameLayout) findViewById(R.id.controllerAnchor));
        videoController.setMediaPlayer(video);
        videoController.setAnchorView(video);
        videoController.setPadding(0, 0, 0, 150);
        video.setMediaController(videoController);

        video.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {


            @Override
            public void onPrepared(MediaPlayer mp) {
                video.start();

                FrameLayout controllerAnchor = (FrameLayout) findViewById(R.id.controllerAnchor);
                videoController.setAnchorView(controllerAnchor);
                videoController.show(0);
            }


        });
        // video.start();
    }
    private View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent;
            switch (v.getId()){
                case R.id.boton1:
                    Integer pos;
                    pos = (Integer) v.getTag();
                    //carro(v, pos, holder);

                    //intent = new Intent(PopupActivity.class, CarritoActivity.class).putExtra("id",idValue);
                   // String id = (String) holder.id.getText();
                    //intent.putExtra("id", id);
                   // startActivity(intent);
                    break;
                default:
                    break;
            }
        }
    };
    public class MyMediaController extends MediaController
    {
        private FrameLayout anchorView;

        public MyMediaController(Context context, AttributeSet attrs) {
            super(context, attrs);
        }

        public MyMediaController(Context context, boolean useFastForward) {
            super(context, useFastForward);
        }

        public MyMediaController(Context context) {
            super(context);
        }

        public MyMediaController(Context context, FrameLayout anchorView)
        {
            super(context);
            this.anchorView = anchorView;
        }

        @Override
        protected void onSizeChanged(int xNew, int yNew, int xOld, int yOld)
        {
            super.onSizeChanged(xNew, yNew, xOld, yOld);

            RelativeLayout.LayoutParams lp = (RelativeLayout.LayoutParams) anchorView.getLayoutParams();
            lp.setMargins(0, 0, 0, yNew);

            anchorView.setLayoutParams(lp);
            anchorView.requestLayout();
        }
        @Override
        public void show(int timeout) {
            super.show(0);
        }

    }
}

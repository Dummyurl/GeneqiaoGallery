package com.cocomeng.geneqiaogallery;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.cocomeng.library.GalleryFinal;
import com.cocomeng.library.model.PhotoInfo;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    public static final int REQUEST_CODE_GALLERY = 4;
    private GalleryFinal.OnHanlderResultCallback onHanlderResultCallback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        onHanlderResultCallback = new GalleryFinal.OnHanlderResultCallback() {
            @Override
            public void onHanlderSuccess(int reqeustCode, List<PhotoInfo> resultList) {

            }

            @Override
            public void onHanlderFailure(int requestCode, String errorMsg) {

            }
        };
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GalleryFinal.openGalleryMuti(REQUEST_CODE_GALLERY, 9, onHanlderResultCallback, true);
            }
        });
    }
}

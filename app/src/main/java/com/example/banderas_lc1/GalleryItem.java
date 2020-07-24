package com.example.banderas_lc1;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

import com.mindorks.placeholderview.Animation;
import com.mindorks.placeholderview.annotations.Animate;
import com.mindorks.placeholderview.annotations.Layout;
import com.mindorks.placeholderview.annotations.NonReusable;
import com.mindorks.placeholderview.annotations.Resolve;
import com.mindorks.placeholderview.annotations.View;

@Animate(Animation.CARD_LEFT_IN_DESC)
@NonReusable
@Layout(R.layout.activity_item_big)
public class GalleryItem {
    @View(R.id.imageView)
    public ImageView imageView;

    public Drawable mDrawable;

    public GalleryItem(Drawable drawable) {
        mDrawable = drawable;
    }

    @Resolve
    private void onResolved() {
        imageView.setImageDrawable(mDrawable);
    }
}

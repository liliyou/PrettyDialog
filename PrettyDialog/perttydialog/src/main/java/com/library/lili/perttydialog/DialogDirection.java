package com.library.lili.perttydialog;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.Window;
import android.widget.TextView;



/**
 * Created by lili on 15/4/21.
 */
public class DialogDirection extends Dialog {

    /**
     * How to use
     *
     * DialogDirection dialogDirection = new DialogDirection(mContext,mContext.getString(R.string.new_credit_direction));
     * dialogDirection.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
     * dialogDirection.show();
     */


    private Context mContext;
    private TextView txtContent;
    private String getString;

    public DialogDirection(Context mContext, String getString) {
        super(mContext);
        this.mContext = mContext;
        this.getString = getString;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.view_dialog_direction);
        initView();
    }

    private void initView() {
        txtContent=(TextView)findViewById(R.id.txtContent);
        txtContent.setText(getString);

    }


}
package mao.bw.com.maojiaxiang20190624;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.List;

import mao.bw.com.maojiaxiang20190624.bean.GoodsBean;
import mao.bw.com.maojiaxiang20190624.core.DataCall;
import mao.bw.com.maojiaxiang20190624.presenter.Presenter;

public class MainActivity extends AppCompatActivity implements DataCall<List<GoodsBean>> {
    private RecyclerView recycle_view;
    private EditText edit_text;
    private Button btn_sou;
    private Presenter presenter;
    private MyAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recycle_view = findViewById(R.id.recycle_view);
        edit_text = findViewById(R.id.edit_text);
        btn_sou = findViewById(R.id.btn_sou);
        GridLayoutManager gridLayoutManager =new GridLayoutManager(this,2);
        recycle_view.setLayoutManager(gridLayoutManager);
        presenter = new Presenter(this);
        myAdapter = new MyAdapter(this);
        recycle_view.setAdapter(myAdapter);
        btn_sou.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = edit_text.getText().toString();
                presenter.requestData(s);
            }
        });
    }

    @Override
    public void success(List<GoodsBean> result, Object... args) {
        myAdapter.addAll(result);
        myAdapter.notifyDataSetChanged();
    }

    @Override
    public void fail(List<GoodsBean> data, Object... args) {

    }
}

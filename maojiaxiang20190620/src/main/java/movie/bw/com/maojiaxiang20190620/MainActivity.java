package movie.bw.com.maojiaxiang20190620;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.List;

import movie.bw.com.maojiaxiang20190620.adapter.MyAdapter;
import movie.bw.com.maojiaxiang20190620.bean.MovieBean;
import movie.bw.com.maojiaxiang20190620.core.DataCall;
import movie.bw.com.maojiaxiang20190620.presenter.MoviePresenter;

public class MainActivity extends AppCompatActivity implements DataCall<List<MovieBean>> {
    private RecyclerView recyclerView;
    private MoviePresenter moviePresenter;
    private MyAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycler_View);
        GridLayoutManager gridLayoutManager =new GridLayoutManager(this,2);
        recyclerView.setLayoutManager(gridLayoutManager);
        moviePresenter = new MoviePresenter(this);
        moviePresenter.requestData();
        myAdapter = new MyAdapter(this);
        recyclerView.setAdapter(myAdapter);
    }

    @Override
    public void onSuccess(List<MovieBean> result, Object... args) {
        myAdapter.addAll(result);
        myAdapter.notifyDataSetChanged();
    }

    @Override
    public void fail(List<MovieBean> data, Object... args) {

    }
}

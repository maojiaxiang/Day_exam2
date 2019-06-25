package mao.bw.com.maojiaxiang20190610;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.List;

import mao.bw.com.maojiaxiang20190610.adapter.MovieAdapter;
import mao.bw.com.maojiaxiang20190610.bean.MovieBean;
import mao.bw.com.maojiaxiang20190610.bean.Result;
import mao.bw.com.maojiaxiang20190610.core.DataCall;
import recycler.coverflow.RecyclerCoverFlow;

public class MainActivity extends AppCompatActivity implements DataCall<List<MovieBean>> {
    private RecyclerView recyclerView;
    private MoviePresenter moviePresenter;
    private MovieAdapter movieAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycle_view);

        moviePresenter = new MoviePresenter(this);
        moviePresenter.requestData();
        GridLayoutManager gridLayoutManager =new GridLayoutManager(this,2);
        recyclerView.setLayoutManager(gridLayoutManager);
        movieAdapter = new MovieAdapter(this);
        recyclerView.setAdapter(movieAdapter);
    }

    @Override
    public void onSuccess(List<MovieBean> result, Object... args) {
        movieAdapter.addAll(result);
        movieAdapter.notifyDataSetChanged();
    }

    @Override
    public void fail(Result result, Object... args) {

    }
}

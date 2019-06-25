package mao.bw.com.day_exam;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.List;

import mao.bw.com.day_exam.adapter.MovieAdapter;
import mao.bw.com.day_exam.bean.MovieBean;
import mao.bw.com.day_exam.bean.Result;
import mao.bw.com.day_exam.core.DataCall;
import mao.bw.com.day_exam.presenter.MoviePresenter;

public class MainActivity extends AppCompatActivity implements DataCall<List<MovieBean>> {
    private RecyclerView recycler_View;
    private MoviePresenter moviePresenter;
    private MovieAdapter movieAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recycler_View = findViewById(R.id.recycler_View);
        GridLayoutManager gridLayoutManager =new GridLayoutManager(this,2);
        recycler_View.setLayoutManager(gridLayoutManager);
        moviePresenter = new MoviePresenter(this);
        moviePresenter.requestData();
        movieAdapter = new MovieAdapter(this);
        recycler_View.setAdapter(movieAdapter);
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

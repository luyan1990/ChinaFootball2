package com.l99.chinafootball.fragment;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.l99.chinafootball.R;
import com.l99.chinafootball.base.BaseFragment;
import com.l99.chinafootball.base.BasePage;
import com.l99.chinafootball.page.CoachListPage;
import com.l99.chinafootball.page.CompetitionPage;
import com.l99.chinafootball.page.MediaListPage;
import com.l99.chinafootball.page.MenPage;
import com.l99.chinafootball.page.QuizCategoryPage;
import com.l99.chinafootball.page.RefeerListPage;
import com.l99.chinafootball.page.TrainingCategoryPage;
import com.l99.chinafootball.page.WomenPage;
import com.l99.chinafootball.utils.LogUtil;

import java.util.ArrayList;
import java.util.List;

import io.swagger.client.model.Menu;

/**
 * Created by lifeix-101 on 2016/6/22.
 */
public class ContentFragment extends BaseFragment {

    private FrameLayout content;
    /**
     * 各个页面的集合
     */
    private ArrayList<BasePage> basePages;

    private List<Menu> menuList;

    @Override
    public View initView() {
        LogUtil.e("ContentFragment初始化页面");
        View view = View.inflate(context, R.layout.content_fragment,null);
        content = (FrameLayout) view.findViewById(R.id.fl_content_fragment);
        TextView textView = new TextView(context);
        textView.setText("首页页面");
        //首页 新闻页
        content.addView(textView);
        return view;
    }

    @Override
    public void initData() {
        super.initData();
        LogUtil.e("ContentFragment初始化数据");

    }


    public void switchPager(int selectPosition) {
        LogUtil.e("ContentFragment选择页面");
        content.removeAllViews();
        switch (selectPosition){
            case 0:
                //12强赛
                content.addView(new CompetitionPage(context).rootView);
                break;
            case 1:
                //资讯
                content.addView(new MediaListPage(context).rootView);
                break;
            case 2:
                //裁判员
                content.addView(new CoachListPage(context).rootView);
                break;
            case 3:
                //教练员
                content.addView(new RefeerListPage(context).rootView);
                break;
            case 4:
                //中国男足
                content.addView(new MenPage(context).rootView);
                break;
            case 5:
                //中国女足
                content.addView(new WomenPage(context).rootView);
                break;
            case 6:
                //规则培训
                content.addView(new TrainingCategoryPage(context).rootView);
                break;
            case 7:
                //规则测试
                content.addView(new QuizCategoryPage(context).rootView);
                break;

        }

    }
}

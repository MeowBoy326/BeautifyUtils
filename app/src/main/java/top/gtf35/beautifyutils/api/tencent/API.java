package top.gtf35.beautifyutils.api.tencent;

import android.text.TextUtils;

import com.google.gson.Gson;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;
import top.gtf35.beautifyutils.api.tencent.entity.search.SearchBean;
import top.gtf35.beautifyutils.utils.krlog.LogUtils;

public class API {

    public void search(String keyword){
        if (TextUtils.isEmpty(keyword))return;
        StringBuilder url = new StringBuilder("https://c.y.qq.com/soso/fcgi-bin/client_search_cp");
        url.append("?");
        url.append("format=json&");
        url.append("p=1&");
        url.append("n=30&");
        url.append("w=" + keyword + "&");
        url.append("aggr=1&");
        url.append("lossless=1&");
        url.append("cr=1&");
        url.append("new_json=1&");
        String get = url.toString();
        LogUtils.d("调用QQ音乐搜索接口，GET，Url=" + get);
        HttpUtils.sendGetRequest(get, new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                LogUtils.e("调用QQ音乐搜索接口, sendGetRequest, onFailure: " + e.toString());
                e.printStackTrace();
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                String json = response.body().string();
                LogUtils.json(json);
                SearchBean search = new Gson().fromJson(json, SearchBean.class);
            }
        });
    }
}

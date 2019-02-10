package top.gtf35.beautifyutils.api.netease;

/*
* API文档：https://api.imjad.cn/cloudmusic.md
* */

import android.text.TextUtils;

import okhttp3.FormBody;

public class API {

    public void search(String keyword){
        if (TextUtils.isEmpty(keyword))return;
        String url = "http://music.163.com/api/cloudsearch/pc";
        FormBody.Builder fromBody = new FormBody.Builder();
        fromBody.add("s", keyword);
        fromBody.add("type", "1");
        fromBody.add("limit", "30");
        fromBody.add("total", "true");
        fromBody.add("offset", "0");
    }

}

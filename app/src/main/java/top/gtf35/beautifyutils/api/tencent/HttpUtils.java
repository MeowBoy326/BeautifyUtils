package top.gtf35.beautifyutils.api.tencent;

import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;

public class HttpUtils {
    public static void sendGetRequest(String address, okhttp3.Callback callback) {
        OkHttpClient client = new OkHttpClient.Builder()
                .build();
        Request request = new Request.Builder()
                .header("Referer","http://y.qq.com")
                .addHeader("User-Agent", "QQ%E9%9F%B3%E4%B9%90/54409 CFNetwork/901.1 Darwin/17.6.0 (x86_64)")
                .addHeader("Accept", "*/*")
                .addHeader("Accept-Language","zh-CN,zh;q=0.8,gl;q=0.6,zh-TW;q=0.4")
                .addHeader("Connection", "keep-alive")
                .addHeader("Content-Type", "application/x-www-form-urlencoded")
                .addHeader("Cookie","pgv_pvi=22038528; pgv_si=s3156287488; pgv_pvid=5535248600; yplayer_open=1; ts_last=y.qq.com/portal/player.html; ts_uid=4847550686; yq_index=0; qqmusic_fromtag=66; player_exist=1")
                .url(address)
                .build();
        client.newCall(request).enqueue(callback);
    }

    public static void sendPostRequest(String address, FormBody formBody, okhttp3.Callback callback) {
        OkHttpClient client = new OkHttpClient.Builder()
                .build();
        Request request = new Request.Builder()
                .header("Referer","http://y.qq.com")
                .addHeader("User-Agent", "QQ%E9%9F%B3%E4%B9%90/54409 CFNetwork/901.1 Darwin/17.6.0 (x86_64)")
                .addHeader("Accept", "*/*")
                .addHeader("Accept-Language","zh-CN,zh;q=0.8,gl;q=0.6,zh-TW;q=0.4")
                .addHeader("Connection", "keep-alive")
                .addHeader("Content-Type", "application/x-www-form-urlencoded")
                .addHeader("Cookie","pgv_pvi=22038528; pgv_si=s3156287488; pgv_pvid=5535248600; yplayer_open=1; ts_last=y.qq.com/portal/player.html; ts_uid=4847550686; yq_index=0; qqmusic_fromtag=66; player_exist=1")
                .url(address)
                .post(formBody)
                .build();
        client.newCall(request).enqueue(callback);
    }
}

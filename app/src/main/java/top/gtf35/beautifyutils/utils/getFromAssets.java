package top.gtf35.beautifyutils.utils;

import android.content.Context;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;

import java.io.InputStream;

/**
 * 作者：gtf35 on 19-2-9 19:46
 * 邮箱：gtfdeyouxiang@gmail.com
 * getStringFromAssets类，用于从assets的指定文件中获取资源
 */
public class getFromAssets {

    private static String rootFolder = "";

    /*
     * 方法：getString
     * 说明：静态方法
     * 参数：context:application的context即可
     * 参数：filepath:文件路径，比如assets下a目录下的log.txt文件就写成a/log.txt，如果直接在assets根目录下，直接传文件名即可
     * 返回值：文件的字符串，若###开头即为出错
     * */
    public static String getString(Context context, String filepath){
        filepath = rootFolder + filepath;
        /*先占坑，如果下阶段异常了的话，就不会对这个变量进行覆盖，就会原样输出*/
        String text = "###unknow wrong";
        try {
            InputStream is = context.getAssets().open(filepath);
            int lenght = is.available();
            byte[]  buffer = new byte[lenght];
            is.read(buffer);
            text = new String(buffer, "utf8");
        }catch (Exception e){
            /*出错了，把text覆盖成错误原因*/
            StringBuilder t = new StringBuilder("###");
            t.append(e.getMessage());
            /*在log打印出来*/
            e.printStackTrace();
            LogUtils.d(e.toString());
            text = t.toString();
        }
        LogUtils.d("getStringFromAssets: return:" + text);
        return text.toString();
    }


    /*
     * 方法：getBitmap
     * 说明：静态方法
     * 参数：context:application的context即可
     * 参数：filepath:文件路径，比如assets下a目录下的log.txt文件就写成a/log.txt，如果直接在assets根目录下，直接传文件名即可
     * 返回值：Bitmap对象，注意检查是否为空
     * */
    public static Bitmap getBitmap(Context context, String filepath){
        filepath = rootFolder + filepath;
        Bitmap image = null;
        try {
            InputStream is = context.getAssets().open(filepath);
            image = BitmapFactory.decodeStream(is);
        }catch (Exception e){
            /*在log打印出来*/
            e.printStackTrace();
            LogUtils.d(e.toString());
        }
        LogUtils.d("getBitmapFromAssets");
        return image;
    }


    /*
     * 方法：getLayout
     * 说明：静态方法，注意这个布局必须是编译过的
     * 参数：context:application的context即可
     * 参数：filepath:文件路径，比如assets下a目录下的log.txt文件就写成a/log.txt，如果直接在assets根目录下，直接传文件名即可
     * 返回值：View对象，注意检查是否为空
     * */
    public static View getBuildLayout(Context context, String filepath){
        filepath = "assets/" + rootFolder + filepath;
        try {
            InputStream is = context.getAssets().open(filepath);
            XmlResourceParser parser = context.getAssets().openXmlResourceParser(filepath);
            return ((LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE)).inflate(parser, null);
        }catch (Exception e){
            /*在log打印出来*/
            e.printStackTrace();
            LogUtils.d(e.toString());
            return null;
        }
    }


}

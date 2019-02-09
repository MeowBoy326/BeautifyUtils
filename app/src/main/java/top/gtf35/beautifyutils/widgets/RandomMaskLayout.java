package top.gtf35.beautifyutils.widgets;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;

import top.gtf35.beautifyutils.utils.LogUtils;
import top.gtf35.beautifyutils.utils.getFromAssets;

/**
 * 作者：gtf35 on 19-2-9 19:16
 * 邮箱：gtfdeyouxiang@gmail.com
 */
public class RandomMaskLayout extends FrameLayout {

    private Context mContext;//上下文
    private String mSettingsJson;//配置json
    private String mResPath = "RandomMaskLayout/";//配置资源路径
    private String mSettingsJsonFileName = "settings.json";//配置json的文件名

    public RandomMaskLayout(Context context) {
        super(context);
        initBaseInfo(context);
    }

    public RandomMaskLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
        initBaseInfo(context);
    }

    public RandomMaskLayout(Context context,AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initBaseInfo(context);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public RandomMaskLayout(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    /*初始化基础全局变量*/
    private void initBaseInfo(Context context){
        /*强制ondraw回调*/
        setWillNotDraw(false);
        mContext = context;//把concent获取一份作为全局变量，方便调用
        mSettingsJson = getFromAssets.getString(mContext, mResPath + mSettingsJsonFileName);
        LogUtils.d("初始化基础全局变量ok");
    }

    /*解析配置文件，随机获取一张图片*/
    private Bitmap getOneOfBitmap(){
        LogUtils.d("开始解析配置文件，随机获取一张图片");
        ArrayList<String> picList = new ArrayList<>();
        try {
            JSONArray jsonArray = new JSONArray(mSettingsJson);
            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject jsonObject = jsonArray.getJSONObject(i);
                if (jsonObject != null) {
                    String imagePath = jsonObject.optString("ImageName");
                    picList.add(imagePath);
                }
            }
            int size = picList.size();
            LogUtils.d("RandomMaskLayout==>getOneOfBitmap: 资源列表：" + picList.toString() + " 深度：" + size);
            /*生成在数组大小与1之间的随机数（1<=n<=size)*/
            int n = 1 + (int)(Math.random() * (size-1+1));
            /*生成对应的数组索引*/
            int num = n - 1;
            /*获取数组里的图片文件名*/
            Bitmap pic = getFromAssets.getBitmap(mContext,mResPath + picList.get(num));
            LogUtils.d("解析配置文件，随机获取一张图片完成");
            return pic;
        } catch (Exception e){
            e.printStackTrace();
            LogUtils.e(e.toString());
            return null;
        }
    }

    /*检查全局基础变量*/
    private boolean checkBaseInfo(){
        LogUtils.d("开始检查全局基础变量：mContext");
        if (mContext == null) return false;
        LogUtils.d("开始检查全局基础变量：mSettingsJson == null");
        if (mSettingsJson == null) return false;
        LogUtils.d("开始检查全局基础变量：mSettingsJson isEmpty");
        if (TextUtils.isEmpty(mSettingsJson)) return false;
        LogUtils.d("开始检查全局基础变量：mSettingsJson.startsWith(\"###\")");
        if (mSettingsJson.startsWith("###")) return false;
        LogUtils.d("检查全局基础变量完成");
        return true;
    }


    /*在dispatchDraw里绘制子view*/
    @Override
    protected void dispatchDraw(Canvas canvas) {
        LogUtils.d("dispatchDraw回调被调用");
        super.dispatchDraw(canvas);
        String tag = "RandomMaskLayout==> dispatchDraw: ";
        if (!checkBaseInfo()) {
            LogUtils.d(tag + "基础数据校验不通过");
            return;
        }
        Bitmap pic = getOneOfBitmap();
        if (pic == null){
            LogUtils.d(tag + "bitmap = null");
            return;
        }
        LogUtils.d(tag + "准备画图");
        /*画布高*/
        int height = canvas.getHeight();
        /*画布宽*/
        int width = canvas.getWidth();
        /*图片高*/
        int picHeight = pic.getHeight();
        /*图片宽*/
        int picWidth = pic.getWidth();
        /*图片的显示部分*/
        Rect src = new Rect(0, 0, picWidth, picHeight);
        /*画布上允许的绘制区域*/
        Rect dst = new Rect(0, 0, width, height);
        /*绘制图片*/
        canvas.drawBitmap(pic,src,dst, new Paint());
        LogUtils.d("画图完成");
    }

    /*
    * 在ondraw里回执主体
    * */
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        LogUtils.d("ondraw回调被调用");
    }
}

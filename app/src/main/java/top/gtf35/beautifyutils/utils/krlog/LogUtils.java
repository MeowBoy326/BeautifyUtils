package top.gtf35.beautifyutils.utils.krlog;

/*
* ####简单的打印
* LogUtils.d("hello,word");
* LogUtils.e("hello,word");
* LogUtils.d("%d个小蜜蜂", 4);//打印统配符
*
* ####打印json
* LogUtils.json("{\"person\":{\"name\":\"小蜜蜂\",\"sex\":\"男\",\"age\":\"18\"}}");
*
* ####打印map
* Map<String,String> map = new HashMap<>();
* map.put("你好","我很好");
* map.put("我好", "你很好");
* LogUtils.object(map);
*
* ####打印对象
* Person person = new Person();
* person.setAge(10);
* person.setSex(true);
* person.setName("lily");
* person.setSays("hello man");
* LogUtils.object(person);
*
* ####打印List
* List<Person> list = new ArrayList<>();
* list.add(person);
* LogUtils.object(list);
*
* ####取消打印 推荐在自己的applicatoin类里面添加
* LogUtils.configAllowLog = false;
* */



/**
 * Created by kyosky on 15/11/16.
 */
public class LogUtils {

    /**
     * 是否允许输出log
     */
    public static boolean configAllowLog = true;

    private static Logger logger;

    static {
        logger = new Logger();
    }

    public static void d(String message,Object... args){
        logger.d(SystemUtil.getStackTrace(),message,args);
    }

    public static void e(String message,Object... args){
        logger.e(SystemUtil.getStackTrace(),message,args);
    }

    public static void i(String message,Object... args){
        logger.i(SystemUtil.getStackTrace(),message,args);
    }

    public static void a(String message,Object... args){
        logger.a(SystemUtil.getStackTrace(),message,args);
    }

    public static void w(String message,Object... args){
        logger.w(SystemUtil.getStackTrace(),message,args);
    }

    public static void v(String message,Object... args){
        logger.v(SystemUtil.getStackTrace(),message,args);
    }

    /**
     * 打印json
     * @param json
     */
    public static void json(String json){
        logger.json(SystemUtil.getStackTrace(),json);
    }

    /**
     * 打印对象(支持Collection,Map)
     * @param object
     */
    public static void object(Object object){
        logger.object(SystemUtil.getStackTrace(),object);
    }


}